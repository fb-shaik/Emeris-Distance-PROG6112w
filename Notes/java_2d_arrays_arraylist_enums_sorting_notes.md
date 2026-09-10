# Java — Arrays, ArrayList, Enums & Basic Sorting

These notes cover four related topics:

1. **2D Arrays** — storing data in rows and columns
2. **ArrayList** — storing a flexible list of objects
3. **Enums** — representing a fixed set of named values
4. **Sorting Algorithms** — Bubble Sort and Insertion Sort

---

# Part 1 — 2D Arrays

## 1. What is a 2D Array?

A normal array stores values in one line:

```java
int[] marks = {70, 80, 90};
```

Visual:

```text
Index:   0   1   2
       +---+---+---+
Value: |70 |80 |90 |
       +---+---+---+
```

A **2D array** stores values using **rows and columns**.

Think of a table:

```text
        Column
          0   1   2

Row 0    10  20  30
Row 1    40  50  60
Row 2    70  80  90
```

A 2D array is essentially an **array of arrays**.

---

## 2. Creating a 2D Array

```java
int[][] numbers = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};
```

The first `[]` represents the row.

The second `[]` represents the column.

```text
numbers[row][column]
```

---

## 3. Accessing Values

Given:

```java
int[][] numbers = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};
```

Access:

```java
System.out.println(numbers[0][0]);
```

Output:

```text
10
```

Another example:

```java
System.out.println(numbers[1][2]);
```

Output:

```text
60
```

Why?

```text
numbers[1][2]

row 1    → {40, 50, 60}
column 2 → 60
```

Remember that indexes start at:

```text
0
```

---

## 4. Changing a Value

```java
numbers[1][1] = 100;
```

Before:

```text
40  50  60
```

After:

```text
40 100  60
```

---

## 5. Creating an Empty 2D Array

```java
int[][] marks = new int[3][4];
```

This creates:

```text
3 rows
4 columns
```

Visual:

```text
0 0 0 0
0 0 0 0
0 0 0 0
```

Because the default value for `int` is `0`.

---

## 6. Looping Through a 2D Array

Because there are rows and columns, we normally use a **nested loop**.

```java
int[][] numbers = {
    {10, 20, 30},
    {40, 50, 60},
    {70, 80, 90}
};

for (int row = 0; row < numbers.length; row++) {

    for (int col = 0;
         col < numbers[row].length;
         col++) {

        System.out.print(numbers[row][col] + " ");
    }

    System.out.println();
}
```

Output:

```text
10 20 30
40 50 60
70 80 90
```

### Important

```java
numbers.length
```

gives the number of **rows**.

```java
numbers[row].length
```

gives the number of **columns in that row**.

---

## 7. Enhanced `for` Loop with 2D Arrays

You can also write:

```java
for (int[] row : numbers) {

    for (int value : row) {

        System.out.print(value + " ");
    }

    System.out.println();
}
```

Read it as:

```text
for each row in numbers
    for each value in that row
        print the value
```

---

## 8. Practical 2D Array Example

Suppose three students have marks for three tests:

```java
int[][] marks = {
    {80, 75, 90},
    {60, 70, 65},
    {95, 88, 92}
};
```

Visual:

```text
          Test 1   Test 2   Test 3

Student 0   80       75       90
Student 1   60       70       65
Student 2   95       88       92
```

Get Student 2's Test 3 mark:

```java
System.out.println(marks[2][2]);
```

Output:

```text
92
```

---

# Part 2 — ArrayList

## 9. Why Do We Need `ArrayList`?

A normal array has a **fixed size**.

```java
String[] names = new String[3];
```

It can hold only three elements.

An `ArrayList` can **grow and shrink** while the program runs.

```java
ArrayList<String> names = new ArrayList<>();
```

---

## 10. Importing `ArrayList`

Before using it:

```java
import java.util.ArrayList;
```

Example:

```java
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names =
            new ArrayList<>();
    }
}
```

---

## 11. Adding Elements

Use:

```java
add()
```

Example:

```java
ArrayList<String> names = new ArrayList<>();

names.add("John");
names.add("Sarah");
names.add("Peter");
```

The list now contains:

```text
[John, Sarah, Peter]
```

Indexes:

```text
0 → John
1 → Sarah
2 → Peter
```

---

## 12. Getting an Element

Arrays use:

```java
names[0]
```

`ArrayList` uses:

```java
names.get(0)
```

Example:

```java
System.out.println(names.get(1));
```

Output:

```text
Sarah
```

---

## 13. Changing an Element

Use:

```java
set()
```

Example:

```java
names.set(1, "Mary");
```

Before:

```text
[John, Sarah, Peter]
```

After:

```text
[John, Mary, Peter]
```

---

## 14. Removing an Element

Use:

```java
remove()
```

Example:

```java
names.remove(1);
```

Before:

```text
[John, Mary, Peter]
```

After:

```text
[John, Peter]
```

---

## 15. Getting the Size

For an array:

```java
array.length
```

For an `ArrayList`:

```java
list.size()
```

Example:

```java
System.out.println(names.size());
```

---

## 16. Looping Through an ArrayList

Using a normal loop:

```java
for (int i = 0; i < names.size(); i++) {

    System.out.println(names.get(i));
}
```

Using an enhanced `for` loop:

```java
for (String name : names) {

    System.out.println(name);
}
```

---

## 17. Useful ArrayList Methods

| Method | Purpose |
|---|---|
| `add(value)` | Add an element |
| `get(index)` | Get an element |
| `set(index, value)` | Replace an element |
| `remove(index)` | Remove an element |
| `size()` | Number of elements |
| `contains(value)` | Check whether value exists |
| `clear()` | Remove all elements |
| `isEmpty()` | Check whether list is empty |

Example:

```java
if (names.contains("John")) {
    System.out.println("John was found.");
}
```

---

## 18. Array vs ArrayList

| Array | ArrayList |
|---|---|
| Fixed size | Dynamic size |
| Uses `[]` | Uses methods |
| `array.length` | `list.size()` |
| `array[i]` | `list.get(i)` |
| Can directly store primitives | Stores objects/reference types |

Example array:

```java
int[] numbers = {10, 20, 30};
```

Example `ArrayList`:

```java
ArrayList<Integer> numbers =
    new ArrayList<>();
```

Notice:

```java
Integer
```

instead of:

```java
int
```

`ArrayList` uses object types such as:

```text
Integer
Double
Character
Boolean
String
```

---

# Part 3 — Enums

## 19. What is an Enum?

An **enum** represents a fixed set of named values.

Suppose an order can only have these statuses:

```text
PENDING
PROCESSING
SHIPPED
DELIVERED
```

Instead of using random strings:

```java
String status = "shipped";
```

we can create:

```java
enum OrderStatus {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED
}
```

---

## 20. Using an Enum

```java
OrderStatus status = OrderStatus.SHIPPED;
```

Then:

```java
System.out.println(status);
```

Output:

```text
SHIPPED
```

---

## 21. Why Not Just Use Strings?

With strings:

```java
String status = "shiped";
```

Java accepts the spelling mistake.

But:

```java
OrderStatus status = OrderStatus.SHIPED;
```

does not compile if `SHIPED` does not exist.

Enums therefore make code:

```text
safer
clearer
easier to maintain
```

---

## 22. Enum with `switch`

Enums work very well with `switch`.

```java
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
```

Example:

```java
Day today = Day.SATURDAY;

switch (today) {

    case SATURDAY:
    case SUNDAY:
        System.out.println("Weekend");
        break;

    default:
        System.out.println("Weekday");
}
```

---

## 23. Looping Through Enum Values

Use:

```java
values()
```

Example:

```java
for (Day day : Day.values()) {

    System.out.println(day);
}
```

Output:

```text
MONDAY
TUESDAY
WEDNESDAY
THURSDAY
FRIDAY
SATURDAY
SUNDAY
```

---

## 24. Practical Enum Example

```java
enum Priority {
    LOW,
    MEDIUM,
    HIGH
}
```

Use it in a class:

```java
class Task {

    String title;
    Priority priority;

    Task(String title, Priority priority) {
        this.title = title;
        this.priority = priority;
    }
}
```

Create an object:

```java
Task task =
    new Task("Study Java", Priority.HIGH);
```

This is much clearer than:

```java
new Task("Study Java", "hgh");
```

---

# Part 4 — Why Sorting Matters

## 25. What is Sorting?

Sorting means arranging data into an order.

Unsorted:

```text
5  2  8  1  4
```

Ascending:

```text
1  2  4  5  8
```

Descending:

```text
8  5  4  2  1
```

Java already provides built-in sorting tools, but learning basic sorting algorithms helps you understand:

```text
loops
comparisons
swapping
algorithm design
efficiency
```

We will study:

```text
Bubble Sort
Insertion Sort
```

---

# Part 5 — Bubble Sort

## 26. Bubble Sort Idea

Bubble Sort repeatedly compares **neighbouring elements**.

If they are in the wrong order, swap them.

Start:

```text
5  3  8  2
```

Compare:

```text
5 and 3
```

Since:

```text
5 > 3
```

swap them:

```text
3  5  8  2
```

Next compare:

```text
5 and 8
```

No swap:

```text
3  5  8  2
```

Next:

```text
8 and 2
```

Swap:

```text
3  5  2  8
```

After one pass, the largest value has moved toward the end.

---

## 27. Bubble Sort Code

```java
int[] numbers = {5, 3, 8, 2};

for (int i = 0; i < numbers.length - 1; i++) {

    for (int j = 0;
         j < numbers.length - 1 - i;
         j++) {

        if (numbers[j] > numbers[j + 1]) {

            int temp = numbers[j];

            numbers[j] = numbers[j + 1];

            numbers[j + 1] = temp;
        }
    }
}
```

Print the result:

```java
for (int number : numbers) {
    System.out.print(number + " ");
}
```

Output:

```text
2 3 5 8
```

---

## 28. Understanding the Swap

Suppose:

```text
a = 5
b = 3
```

We cannot simply do:

```java
a = b;
b = a;
```

because the original `a` is lost.

Use a temporary variable:

```java
int temp = a;
a = b;
b = temp;
```

Visual:

```text
Before:

a = 5
b = 3

temp = a   → temp = 5
a = b      → a = 3
b = temp   → b = 5

After:

a = 3
b = 5
```

---

## 29. Bubble Sort Passes

Example:

```text
5  3  8  2
```

Pass 1:

```text
3  5  2  8
```

Pass 2:

```text
3  2  5  8
```

Pass 3:

```text
2  3  5  8
```

Sorted.

---

## 30. Improved Bubble Sort

If no swaps happen during a pass, the array is already sorted.

```java
for (int i = 0; i < numbers.length - 1; i++) {

    boolean swapped = false;

    for (int j = 0;
         j < numbers.length - 1 - i;
         j++) {

        if (numbers[j] > numbers[j + 1]) {

            int temp = numbers[j];
            numbers[j] = numbers[j + 1];
            numbers[j + 1] = temp;

            swapped = true;
        }
    }

    if (!swapped) {
        break;
    }
}
```

---

# Part 6 — Insertion Sort

## 31. Insertion Sort Idea

Insertion Sort builds a sorted section of the array one item at a time.

Think about arranging playing cards in your hand.

Suppose:

```text
5  3  8  2
```

Start with:

```text
[5] 3 8 2
```

Take `3`.

Compare it with `5`.

Move `5` right and insert `3`:

```text
[3 5] 8 2
```

Take `8`:

```text
[3 5 8] 2
```

Take `2`.

Move larger values right:

```text
3 5 8 8
3 5 5 8
3 3 5 8
```

Insert `2`:

```text
2 3 5 8
```

---

## 32. Insertion Sort Code

```java
int[] numbers = {5, 3, 8, 2};

for (int i = 1; i < numbers.length; i++) {

    int current = numbers[i];

    int j = i - 1;

    while (j >= 0 &&
           numbers[j] > current) {

        numbers[j + 1] = numbers[j];

        j--;
    }

    numbers[j + 1] = current;
}
```

Output:

```text
2 3 5 8
```

---

## 33. Understanding Insertion Sort Variables

In:

```java
int current = numbers[i];
int j = i - 1;
```

`current` is the value we want to insert.

`j` moves backwards through the already-sorted section.

Example:

```text
[3 5 8] 2
         ^
       current
```

The algorithm asks:

```text
Is 8 > 2? → yes → move 8 right
Is 5 > 2? → yes → move 5 right
Is 3 > 2? → yes → move 3 right
```

Then insert `2`.

---

# Part 7 — Bubble Sort vs Insertion Sort

## 34. Main Difference

### Bubble Sort

```text
Compare neighbours
       ↓
Swap if necessary
       ↓
Repeat many passes
```

### Insertion Sort

```text
Take next value
       ↓
Move larger values right
       ↓
Insert value into correct position
```

Comparison:

| Bubble Sort | Insertion Sort |
|---|---|
| Compares neighbouring values | Builds a sorted section |
| Uses many swaps | Often shifts values |
| Very easy to understand | Slightly more complex |
| Usually inefficient on large data | Good for small/nearly sorted data |
| Typical worst case: O(n²) | Typical worst case: O(n²) |

For learning, focus first on understanding the **steps**, not memorising Big-O notation.

---

# Part 8 — Sorting an ArrayList

## 35. Built-In Sorting

In real Java programs, you normally do **not** manually write Bubble Sort just to sort ordinary data.

For an `ArrayList`, you can use:

```java
import java.util.ArrayList;
import java.util.Collections;
```

Example:

```java
ArrayList<Integer> numbers =
    new ArrayList<>();

numbers.add(50);
numbers.add(10);
numbers.add(30);
numbers.add(20);

Collections.sort(numbers);

System.out.println(numbers);
```

Output:

```text
[10, 20, 30, 50]
```

Bubble Sort and Insertion Sort are still important because they teach how sorting algorithms work internally.

---

# Part 9 — Putting the Topics Together

## 36. Student Marks Example

We can use a 2D array for marks:

```java
int[][] marks = {
    {80, 75, 90},
    {60, 70, 65},
    {95, 88, 92}
};
```

An `ArrayList` for student names:

```java
ArrayList<String> students =
    new ArrayList<>();

students.add("Sam");
students.add("John");
students.add("Aisha");
```

And an enum for performance:

```java
enum Performance {
    POOR,
    AVERAGE,
    GOOD,
    EXCELLENT
}
```

These structures solve different problems:

```text
2D Array
   ↓
table-like data

ArrayList
   ↓
flexible collection

Enum
   ↓
fixed set of valid choices

Sorting algorithm
   ↓
rearrange data into an order
```

---

# Part 10 — Common Mistakes

## 37. 2D Array Index Mistake

Wrong:

```java
int[][] numbers = {
    {1, 2},
    {3, 4}
};

System.out.println(numbers[2][0]);
```

Valid row indexes are:

```text
0
1
```

Trying row `2` causes:

```text
ArrayIndexOutOfBoundsException
```

---

## 38. ArrayList `length` Mistake

Wrong:

```java
names.length
```

Correct:

```java
names.size()
```

Remember:

```text
Array      → length
String     → length()
ArrayList  → size()
```

---

## 39. ArrayList Access Mistake

Wrong:

```java
names[0]
```

Correct:

```java
names.get(0)
```

---

## 40. Enum Spelling Mistake

Given:

```java
enum Status {
    OPEN,
    CLOSED
}
```

Correct:

```java
Status status = Status.OPEN;
```

Incorrect:

```java
Status status = Status.Open;
```

Enum constants are case-sensitive.

---

## 41. Bubble Sort Boundary Mistake

When comparing:

```java
numbers[j]
```

with:

```java
numbers[j + 1]
```

make sure `j + 1` does not go outside the array.

That is why we use:

```java
j < numbers.length - 1 - i
```

rather than:

```java
j < numbers.length
```

---

# Part 11 — Quick Practice

## Practice 1

What does this access?

```java
int[][] values = {
    {10, 20},
    {30, 40}
};

System.out.println(values[1][0]);
```

**Answer:**

```text
30
```

---

## Practice 2

How many rows?

```java
int[][] values = {
    {1, 2, 3},
    {4, 5, 6}
};
```

**Answer:**

```text
2
```

---

## Practice 3

Which method adds something to an `ArrayList`?

```text
A. insert()
B. push()
C. add()
D. append()
```

**Answer:** `C. add()`

---

## Practice 4

Fill in the blank:

```java
ArrayList<String> names =
    new ArrayList<>();

names._____("Sam");
```

**Answer:**

```java
add
```

---

## Practice 5

What should be used when the valid values are fixed?

For example:

```text
LOW
MEDIUM
HIGH
```

**Answer:** An `enum`.

---

## Practice 6

Which algorithm repeatedly compares neighbouring elements?

```text
A. Insertion Sort
B. Bubble Sort
```

**Answer:** `B. Bubble Sort`

---

## Practice 7

Which algorithm builds a sorted section one value at a time?

```text
A. Bubble Sort
B. Insertion Sort
```

**Answer:** `B. Insertion Sort`

---

# Part 12 — Mini Exercises

## Exercise 1 — 2D Array

Create:

```java
int[][] temperatures = {
    {20, 22, 24},
    {18, 21, 23},
    {25, 27, 29}
};
```

Then:

1. Print `21`.
2. Change `29` to `30`.
3. Print every value using nested loops.

---

## Exercise 2 — ArrayList

Create an `ArrayList<String>` containing:

```text
Java
Python
C++
```

Then:

1. Add `"JavaScript"`.
2. Print the second item.
3. Replace `"C++"` with `"C#"`.
4. Remove `"Python"`.
5. Print the final list.

---

## Exercise 3 — Enum

Create:

```java
enum TrafficLight {
    RED,
    YELLOW,
    GREEN
}
```

Use a `switch` to print:

```text
RED    → Stop
YELLOW → Prepare
GREEN  → Go
```

---

## Exercise 4 — Bubble Sort

Sort:

```java
int[] numbers = {9, 4, 7, 2, 1};
```

using Bubble Sort.

Expected result:

```text
1 2 4 7 9
```

---

## Exercise 5 — Insertion Sort

Sort:

```java
int[] numbers = {6, 3, 8, 4, 2};
```

using Insertion Sort.

Expected result:

```text
2 3 4 6 8
```

---

# Part 13 — Cheat Sheet

## 2D Array

```java
int[][] numbers = {
    {1, 2},
    {3, 4}
};
```

Access:

```java
numbers[row][column]
```

Loop:

```java
for (int row = 0;
     row < numbers.length;
     row++) {

    for (int col = 0;
         col < numbers[row].length;
         col++) {

        System.out.println(
            numbers[row][col]
        );
    }
}
```

---

## ArrayList

```java
import java.util.ArrayList;

ArrayList<String> names =
    new ArrayList<>();
```

Common operations:

```java
names.add("Sam");
names.get(0);
names.set(0, "John");
names.remove(0);
names.size();
names.contains("Sam");
```

---

## Enum

```java
enum Level {
    LOW,
    MEDIUM,
    HIGH
}
```

Use:

```java
Level level = Level.HIGH;
```

---

## Bubble Sort

```java
for (int i = 0;
     i < numbers.length - 1;
     i++) {

    for (int j = 0;
         j < numbers.length - 1 - i;
         j++) {

        if (numbers[j] > numbers[j + 1]) {

            int temp = numbers[j];
            numbers[j] = numbers[j + 1];
            numbers[j + 1] = temp;
        }
    }
}
```

---

## Insertion Sort

```java
for (int i = 1;
     i < numbers.length;
     i++) {

    int current = numbers[i];

    int j = i - 1;

    while (j >= 0 &&
           numbers[j] > current) {

        numbers[j + 1] = numbers[j];

        j--;
    }

    numbers[j + 1] = current;
}
```

---

# Final Memory Guide

```text
2D Array
   =
rows + columns
   =
array[row][column]
```

```text
ArrayList
   =
dynamic collection
   =
add(), get(), set(), remove(), size()
```

```text
Enum
   =
fixed set of named values
```

```text
Bubble Sort
   =
compare neighbours + swap
```

```text
Insertion Sort
   =
take next value + insert into sorted section
```

## One-Line Summary

**Use a 2D array for table-like data, an `ArrayList` for a flexible collection, an `enum` for fixed choices, and sorting algorithms to arrange data into order.**
