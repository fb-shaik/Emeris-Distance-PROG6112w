# Java Swing GUI — NetBeans Drag-and-Drop & Event-Driven Programming

Beginner-friendly notes for building desktop GUIs with **Apache NetBeans GUI Builder**. The focus is on designing a `JFrame Form` visually and writing Java only for application logic and event handling.

## Contents

1. [GUI and the drag-and-drop workflow](#1-gui-and-the-drag-and-drop-workflow)
2. [Creating a JFrame Form](#2-creating-a-jframe-form)
3. [Components and naming conventions](#3-components-and-naming-conventions)
4. [Labels, text fields, and buttons](#4-labels-text-fields-and-buttons)
5. [Event-driven programming](#5-event-driven-programming)
6. [Example: greeting application](#6-example-greeting-application)
7. [Working with numbers](#7-working-with-numbers)
8. [Example: addition calculator](#8-example-addition-calculator)
9. [Clear and Exit buttons](#9-clear-and-exit-buttons)
10. [Checkboxes, radio buttons, and combo boxes](#10-checkboxes-radio-buttons-and-combo-boxes)
11. [Text areas and dialogs](#11-text-areas-and-dialogs)
12. [Example: student registration](#12-example-student-registration)
13. [Using ArrayList with a GUI](#13-using-arraylist-with-a-gui)
14. [Common mistakes](#14-common-mistakes)
15. [Practice questions and exercises](#15-practice-questions-and-exercises)
16. [Cheat sheet](#16-cheat-sheet)

---

## 1. GUI and the drag-and-drop workflow

**GUI** stands for **Graphical User Interface**. A GUI lets users interact with an application through windows, buttons, labels, text fields, and other controls rather than only through console input.

**Java Swing** is a Java library for creating desktop GUIs. In NetBeans, you can create Swing applications with the **GUI Builder**:

1. **Design View:** Drag components from the Palette onto a form.
2. **Properties:** Change displayed text, names, and other settings.
3. **Source View:** Write code that responds to user actions.

NetBeans generates most component setup and layout code. **You write the program's logic inside event handlers.**

## 2. Creating a JFrame Form

1. Open Apache NetBeans and create a Java project.
2. Right-click your project or source package.
3. Choose **New → JFrame Form** (in some versions: **New → Other → Swing GUI Forms → JFrame Form**).
4. Name the form `StudentForm` and click **Finish**.
5. Open **Design** view.

Important areas:

| Area | Purpose |
|---|---|
| Palette | Components available to drag onto the form |
| Design Area | Visual preview and arrangement of the form |
| Properties | Component settings such as `text`, `font`, and `model` |
| Source | Java code and generated event handlers |

A `JFrame` is the main window; a `JPanel` is a container that groups components.

## 3. Components and naming conventions

| Component | Purpose | Example variable name |
|---|---|---|
| `JLabel` | Displays text | `lblName` |
| `JTextField` | Accepts one line of text | `txtName` |
| `JButton` | Clickable action | `btnSubmit` |
| `JTextArea` | Multiple lines of text | `txtOutput` |
| `JCheckBox` | Independent on/off selection | `chkAgree` |
| `JRadioButton` | One option in a grouped selection | `rdoFullTime` |
| `JComboBox` | Drop-down selection | `cmbCourse` |
| `JPanel` | Groups components | `pnlDetails` |
| `JPasswordField` | Masked input | `pwdPassword` |

**Displayed text is not the same as the variable name.** A button may display **Submit** but be called `btnSubmit` in code.

To rename a component, right-click it in Design View and choose **Change Variable Name**. To change what the user sees, edit its `text` property.

## 4. Labels, text fields, and buttons

### JLabel

Drag **Label** from the Palette, change its `text` to `Student Name:`, and name it `lblName`.

```java
lblName.setText("Welcome");
```

### JTextField

Drag **Text Field**, name it `txtName`, and clear its default `text` property.

```java
String name = txtName.getText(); // Read input

txtName.setText("John");       // Set input

txtName.setText("");           // Clear input

txtName.setEditable(false);     // Prevent editing
```

`getText()` returns a **String**.

### JButton

Drag **Button**, set `text` to `Submit`, and name it `btnSubmit`. A button only performs your intended action after an event handler is connected.

## 5. Event-driven programming

**Event-driven programming** means code executes in response to an event, such as a button click or a selection change.

```text
User clicks button
       ↓
Action event occurs
       ↓
Registered listener receives event
       ↓
Event handler executes
       ↓
GUI displays updated result
```

### Creating an event handler in NetBeans

1. Open **Design** view.
2. Double-click a button, such as `btnSubmit`.
3. NetBeans opens or generates an `actionPerformed` method:

```java
private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {
    // Write button logic here
}
```

NetBeans normally registers the listener automatically in generated code. You **do not** need to add `addActionListener()` yourself for this standard workflow.

- **Event source:** The component, e.g. `btnSubmit`.
- **Event listener:** The object notified about the action.
- **Event handler:** The method containing the response, e.g. `btnSubmitActionPerformed()`.

## 6. Example: greeting application

### Drag these components onto the form

| Component | Variable name | Text |
|---|---|---|
| JLabel | `lblName` | `Enter Name:` |
| JTextField | `txtName` | *(empty)* |
| JButton | `btnGreet` | `Greet` |
| JLabel | `lblResult` | *(empty)* |

Double-click **Greet** and enter the following **inside the generated event handler**:

```java
private void btnGreetActionPerformed(java.awt.event.ActionEvent evt) {
    String name = txtName.getText();
    lblResult.setText("Hello " + name);
}
```

If the user enters `John`, clicking **Greet** displays `Hello John`.

**Pattern to remember:** Get input → process it → display output.

## 7. Working with numbers

Text fields return strings, even if the user types digits.

```java
int age = Integer.parseInt(txtAge.getText());

double price = Double.parseDouble(txtPrice.getText());

String result = String.valueOf(age);
```

| Conversion | Method |
|---|---|
| String → `int` | `Integer.parseInt()` |
| String → `double` | `Double.parseDouble()` |
| Number → String | `String.valueOf()` |

Invalid numeric text causes a `NumberFormatException`. Use `try`/`catch` for user-entered numbers.

## 8. Example: addition calculator

### Drag these components onto a `CalculatorForm`

| Component | Variable name | Text |
|---|---|---|
| JLabel | `lblNumber1` | `First Number:` |
| JTextField | `txtNumber1` | *(empty)* |
| JLabel | `lblNumber2` | `Second Number:` |
| JTextField | `txtNumber2` | *(empty)* |
| JButton | `btnAdd` | `Add` |
| JLabel | `lblResult` | `Result:` |

Double-click **Add** and write:

```java
private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        int num1 = Integer.parseInt(txtNumber1.getText());
        int num2 = Integer.parseInt(txtNumber2.getText());

        int total = num1 + num2;
        lblResult.setText("Result: " + total);
    } catch (NumberFormatException ex) {
        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Please enter valid integers."
        );
    }
}
```

**What happens:** Read both fields → convert strings to integers → add → update the result label.

## 9. Clear and Exit buttons

Add a button called `btnClear` with displayed text **Clear**:

```java
private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {
    txtNumber1.setText("");
    txtNumber2.setText("");
    lblResult.setText("Result:");
}
```

Add another button called `btnExit` with displayed text **Exit**:

```java
private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
    this.dispose();
}
```

`dispose()` closes the current window. The form's **defaultCloseOperation** can be set to `EXIT_ON_CLOSE` if closing the window should terminate the application.

## 10. Checkboxes, radio buttons, and combo boxes

### JCheckBox — independent selections

Drag **Check Box** components and name them `chkJava` and `chkPython`.

```java
String courses = "";

if (chkJava.isSelected()) {
    courses += "Java ";
}

if (chkPython.isSelected()) {
    courses += "Python ";
}

lblResult.setText(courses);
```

Multiple checkboxes can be selected at once.

### JRadioButton — one selection in a group

1. Drag two **Radio Button** components onto the form.
2. Name them `rdoFullTime` and `rdoPartTime`.
3. Drag a **ButtonGroup** from the Palette.
4. Set each radio button's `buttonGroup` property to that group.

```java
if (rdoFullTime.isSelected()) {
    lblResult.setText("Full-Time");
} else if (rdoPartTime.isSelected()) {
    lblResult.setText("Part-Time");
}
```

A `ButtonGroup` makes its radio buttons mutually exclusive. Choose a default selection in Properties if one is required.

### JComboBox — drop-down selection

1. Drag **Combo Box** onto the form and name it `cmbCourse`.
2. Open its `model` property in the Properties window.
3. Add items: `Java`, `Python`, `C++`, `JavaScript`.

```java
String course = cmbCourse.getSelectedItem().toString();
lblResult.setText("Selected course: " + course);
```

`getSelectedItem()` can return `null` if nothing is selected, so handle that possibility when the combo box permits an empty selection.

## 11. Text areas and dialogs

### JTextArea

Drag **Text Area** onto the form and name it `txtOutput`. NetBeans commonly places it inside a `JScrollPane`.

```java
txtOutput.setText("Welcome to Java");
txtOutput.append("\nAnother line");
txtOutput.setEditable(false);
```

`\n` starts a new line.

### JOptionPane

Dialogs are usually created in code, not dragged onto the form.

```java
import javax.swing.JOptionPane;
```

```java
JOptionPane.showMessageDialog(this, "Registration successful!");

String name = JOptionPane.showInputDialog(this, "Enter your name:");

int answer = JOptionPane.showConfirmDialog(this, "Do you want to exit?");

if (answer == JOptionPane.YES_OPTION) {
    this.dispose();
}
```

## 12. Example: student registration

### Design the form

| Component | Variable name | Text or items |
|---|---|---|
| JLabel | `lblName` | `Student Name:` |
| JTextField | `txtName` | *(empty)* |
| JLabel | `lblCourse` | `Course:` |
| JComboBox | `cmbCourse` | `Java`, `Python`, `C++` |
| JRadioButton | `rdoFullTime` | `Full-Time` |
| JRadioButton | `rdoPartTime` | `Part-Time` |
| JButton | `btnRegister` | `Register` |
| JButton | `btnClear` | `Clear` |
| JTextArea | `txtOutput` | *(empty)* |

Add both radio buttons to the same `ButtonGroup`.

Double-click **Register**:

```java
private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {
    String name = txtName.getText();
    String course = cmbCourse.getSelectedItem().toString();
    String studyType = "";

    if (rdoFullTime.isSelected()) {
        studyType = "Full-Time";
    } else if (rdoPartTime.isSelected()) {
        studyType = "Part-Time";
    }

    txtOutput.setText(
        "Student: " + name +
        "\nCourse: " + course +
        "\nStudy Type: " + studyType
    );
}
```

For a more robust form, check for a blank name and ensure a study type is selected before registering.

## 13. Using ArrayList with a GUI

An `ArrayList` can store entries across multiple button clicks.

### Form components

| Component | Variable name |
|---|---|
| JTextField | `txtName` |
| JButton | `btnAdd` |
| JButton | `btnShow` |
| JTextArea | `txtOutput` |

Add this import to your form's source file:

```java
import java.util.ArrayList;
```

Declare the list **inside the form class but outside the event methods**:

```java
private ArrayList<String> names = new ArrayList<>();
```

**Add button:**

```java
private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
    String name = txtName.getText();
    names.add(name);
    txtName.setText("");
}
```

**Show button:**

```java
private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {
    txtOutput.setText("");

    for (String name : names) {
        txtOutput.append(name + "\n");
    }
}
```

If the list were declared *inside* `btnAddActionPerformed()`, a new list would be created each time that handler ran.

## 14. Common mistakes

| Mistake | Correct approach |
|---|---|
| Using the displayed button text as a Java variable | Use the actual variable name, e.g. `btnSubmit` |
| Writing button logic outside a method | Write it inside the generated `actionPerformed()` handler |
| Manually editing generated `initComponents()` | Use Design View and Properties instead |
| Treating `getText()` as an integer | Convert with `Integer.parseInt()` or `Double.parseDouble()` |
| Not handling invalid numeric input | Use `try`/`catch` for `NumberFormatException` |
| Not grouping radio buttons | Assign them to a `ButtonGroup` |
| Declaring a persistent `ArrayList` inside an event handler | Declare it as a field in the form class |
| Forgetting to add components | Drag them onto the form in Design View |

**Important:** `initComponents()` is NetBeans-generated code. Do not edit the guarded generated section directly when following the drag-and-drop workflow.

## 15. Practice questions and exercises

### Quick questions

1. Which NetBeans view lets you drag components onto a form?
2. What happens when you double-click a `JButton` in Design View?
3. Which method reads text from a `JTextField`?
4. Which method changes the displayed text of a `JLabel`?
5. Which method checks whether a checkbox is selected?
6. Why do radio buttons need a `ButtonGroup`?
7. What does `Integer.parseInt()` do?
8. Where should you declare an `ArrayList` that must remember entries between clicks?

<details>
<summary>Answers</summary>

1. Design View.
2. NetBeans creates or opens its action-event handler.
3. `getText()`.
4. `setText()`.
5. `isSelected()`.
6. To make the choices mutually exclusive.
7. Converts a valid integer string into an `int`.
8. As a field in the form class, outside the event handlers.

</details>

### Exercise 1 — Greeting form

Create a `JFrame Form` with a name text field, a Greet button, and a result label. Display `Hello [name]` when the button is clicked.

### Exercise 2 — Marks calculator

Create a form with three mark fields and a Calculate button. Display the average:

```java
double average = (mark1 + mark2 + mark3) / 3.0;
```

### Exercise 3 — Course selection

Create a combo box with `Java`, `Python`, and `C++`. Display the selected course when Submit is clicked.

### Exercise 4 — Student list

Create a name field, Add button, Show Students button, and text area. Store names in an `ArrayList<String>` and display them with a loop.

## 16. Cheat sheet

| Task | Code |
|---|---|
| Read text field | `txtName.getText()` |
| Set text field | `txtName.setText("John")` |
| Clear text field | `txtName.setText("")` |
| Change label | `lblResult.setText("Done")` |
| Check checkbox | `chkAgree.isSelected()` |
| Check radio button | `rdoFullTime.isSelected()` |
| Get combo selection | `cmbCourse.getSelectedItem()` |
| Replace text area content | `txtOutput.setText("Hello")` |
| Append to text area | `txtOutput.append("Hello\n")` |
| Convert text to integer | `Integer.parseInt(txtNumber.getText())` |
| Convert text to double | `Double.parseDouble(txtNumber.getText())` |
| Close current window | `this.dispose()` |
| Show message | `JOptionPane.showMessageDialog(this, "Hello")` |

### The most important event-handler pattern

```java
private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {
    // 1. Get input
    String name = txtName.getText();

    // 2. Process input
    String message = "Hello " + name;

    // 3. Display output
    lblResult.setText(message);
}
```

### Final memory guide

```text
Design View    → Drag and drop GUI components
Properties     → Configure text, names, and options
Source View    → Write Java application logic
Event Handler  → Respond to user actions
getText()      → Read input
setText()      → Display or clear text
```

> **One-line summary:** In NetBeans drag-and-drop Swing programming, design the interface visually, configure the components, and write Java code inside generated event handlers to make the GUI interactive.
