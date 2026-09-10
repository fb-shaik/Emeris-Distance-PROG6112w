# Java Exception Handling — Concise Student Notes

## 1. What is an Exception?

An **exception** is a problem that occurs while a Java program is running.

Example:

```java
int result = 10 / 0;
```

This causes:

```text
ArithmeticException
```

Without handling, the program may stop.

---

## 2. `try` and `catch`

Use `try` for code that may fail.

Use `catch` to handle the error.

### Syntax

```java
try {
    // risky code
} catch (ExceptionType e) {
    // handle the error
}
```

### Example

```java
try {
    int result = 10 / 0;
    System.out.println(result);
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero.");
}
```

### Key idea

```text
try     → attempt the code
catch   → handle the problem
```

---

## 3. Common Java Exceptions

| Exception | Common Cause |
|---|---|
| `ArithmeticException` | Dividing an integer by zero |
| `NumberFormatException` | Converting invalid text to a number |
| `NullPointerException` | Using an object that is `null` |
| `ArrayIndexOutOfBoundsException` | Using an invalid array index |
| `IOException` | File or input/output problem |

---

## 4. `NumberFormatException`

Occurs when Java cannot convert text into a number.

```java
try {
    int number = Integer.parseInt("hello");
} catch (NumberFormatException e) {
    System.out.println("Invalid number.");
}
```

Valid:

```java
Integer.parseInt("25");
```

Invalid:

```java
Integer.parseInt("hello");
```

---

## 5. Multiple `catch` Blocks

A `try` block can handle different exceptions.

```java
try {
    int number = Integer.parseInt(input);
    int result = 100 / number;

} catch (NumberFormatException e) {
    System.out.println("Enter a valid number.");

} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero.");
}
```

Java runs the `catch` block that matches the exception.

---

## 6. `finally`

The `finally` block normally runs whether an exception happens or not.

```java
try {
    System.out.println("Trying...");
} catch (Exception e) {
    System.out.println("Error occurred.");
} finally {
    System.out.println("Finished.");
}
```

### Key idea

```text
finally → cleanup or code that should run at the end
```

---

## 7. `throw`

Use `throw` when **you want to create an exception yourself**.

```java
if (age < 0) {
    throw new IllegalArgumentException(
        "Age cannot be negative."
    );
}
```

Example method:

```java
static void checkAge(int age) {

    if (age < 0) {
        throw new IllegalArgumentException(
            "Age cannot be negative."
        );
    }
}
```

---

## 8. `throws`

Use `throws` in a method declaration to show that the method may pass an exception to the caller.

```java
static void validateScore(int score) throws Exception {

    if (score < 0 || score > 100) {
        throw new Exception(
            "Score must be between 0 and 100."
        );
    }
}
```

### Remember

```text
throw  → actually creates/raises an exception
throws → declares that a method may pass an exception
```

---

## 9. Example: Division Lesson

```java
try {

    int a = 10;
    int b = 0;

    int result = a / b;

    System.out.println(result);

} catch (ArithmeticException e) {

    System.out.println("Cannot divide by zero.");
}
```

Output:

```text
Cannot divide by zero.
```

---

## 10. Example: User Input

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
String input = scanner.nextLine();

try {

    int number = Integer.parseInt(input);

    System.out.println("You entered: " + number);

} catch (NumberFormatException e) {

    System.out.println("Please enter a valid integer.");
}
```

---

## 11. Example: Validating Age

```java
static void checkAge(int age) {

    if (age < 0) {
        throw new IllegalArgumentException(
            "Age cannot be negative."
        );
    }

    if (age > 150) {
        throw new IllegalArgumentException(
            "Age seems unrealistic."
        );
    }
}
```

Calling it:

```java
try {

    checkAge(-5);

} catch (IllegalArgumentException e) {

    System.out.println(e.getMessage());
}
```

Output:

```text
Age cannot be negative.
```

---

## 12. Exception Flow

```text
        try
         |
         v
   Run the code
         |
    Exception?
      /    \
    No      Yes
    |        |
continue   catch
             |
             v
          finally
```

---

## 13. Beginner Rules to Remember

1. Put risky code inside `try`.
2. Use `catch` to handle expected problems.
3. Catch the most specific exception you can.
4. Use `finally` for code that should run at the end.
5. Use `throw` to create an exception.
6. Use `throws` to declare that a method may pass an exception.
7. Do not leave `catch` blocks empty.
8. Do not use exceptions instead of normal `if` statements.

---

## 14. Quick Practice

### Practice 1

What exception occurs?

```java
int x = 20 / 0;
```

**Answer:** `ArithmeticException`

---

### Practice 2

What exception can occur?

```java
int age = Integer.parseInt("twenty");
```

**Answer:** `NumberFormatException`

---

### Practice 3

Fill in the missing keyword:

```java
_____ {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error");
}
```

**Answer:** `try`

---

### Practice 4

What is the difference?

```text
throw
throws
```

**Answer:**

- `throw` creates/raises an exception.
- `throws` declares that a method may pass an exception.

---

## 15. Cheat Sheet

```java
try {
    // risky code

} catch (SpecificException e) {
    // handle error

} finally {
    // runs at the end
}
```

```java
throw new IllegalArgumentException("Invalid value");
```

```java
void method() throws Exception {
    // code
}
```

### Final memory trick

```text
try      = try the code
catch    = handle the error
finally  = run at the end
throw    = raise an exception
throws   = declare an exception
```
