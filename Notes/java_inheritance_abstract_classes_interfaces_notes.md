# Java OOP — Inheritance, Abstract Classes & Interfaces

## 1. What is Inheritance?

**Inheritance** allows one class to reuse fields and methods from another class.

Think of:

```text
Animal
  |
  +-- Dog
  +-- Cat
```

`Dog` and `Cat` are types of `Animal`.

In Java, use the keyword:

```java
extends
```

---

## 2. Basic Inheritance

### Parent class

```java
class Animal {

    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}
```

### Child class

```java
class Dog extends Animal {

    void bark() {
        System.out.println("Woof!");
    }
}
```

### Using the classes

```java
public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.name = "Buddy";

        dog.eat();
        dog.bark();
    }
}
```

Output:

```text
Buddy is eating.
Woof!
```

`Dog` inherited:

```java
name
eat()
```

from `Animal`.

It also has its own method:

```java
bark()
```

---

## 3. Parent and Child Terminology

These terms mean the same thing:

| Parent | Child |
|---|---|
| Parent class | Child class |
| Superclass | Subclass |
| Base class | Derived class |

Example:

```java
class Animal {
}

class Dog extends Animal {
}
```

Here:

```text
Animal = parent / superclass
Dog    = child / subclass
```

---

## 4. The `extends` Keyword

The basic syntax is:

```java
class Child extends Parent {

}
```

Example:

```java
class Person {

    void speak() {
        System.out.println("Person is speaking.");
    }
}

class Student extends Person {

    void study() {
        System.out.println("Student is studying.");
    }
}
```

A `Student` can use both:

```java
Student student = new Student();

student.speak();
student.study();
```

---

## 5. Method Overriding

A child class can provide its **own version** of an inherited method.

Parent:

```java
class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}
```

Child:

```java
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}
```

Another child:

```java
class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
```

Usage:

```java
Dog dog = new Dog();
Cat cat = new Cat();

dog.makeSound();
cat.makeSound();
```

Output:

```text
Woof!
Meow!
```

### Key idea

```text
Inheritance = receive behaviour

Overriding = replace/customize behaviour
```

Use:

```java
@Override
```

when overriding methods. It helps the compiler detect mistakes.

---

## 6. The `super` Keyword

`super` refers to the parent class.

Example:

```java
class Animal {

    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {

        super.makeSound();

        System.out.println("Woof!");
    }
}
```

Output:

```text
Animal sound
Woof!
```

So:

```java
super.makeSound();
```

calls the parent's version.

---

## 7. Constructors and `super()`

A child constructor can call the parent constructor.

```java
class Person {

    String name;

    Person(String name) {
        this.name = name;
    }
}
```

Child:

```java
class Student extends Person {

    int studentNumber;

    Student(String name, int studentNumber) {

        super(name);

        this.studentNumber = studentNumber;
    }
}
```

Usage:

```java
Student student =
    new Student("Sam", 101);
```

Remember:

```text
super(...) = call parent constructor
this(...)  = call another constructor in the same class
```

---

# Abstract Classes

## 8. What is an Abstract Class?

An **abstract class** is a class designed mainly to be inherited from.

Use:

```java
abstract
```

Example:

```java
abstract class Animal {

}
```

You **cannot normally create an object directly** from an abstract class.

Wrong:

```java
Animal animal = new Animal();
```

Instead:

```java
Dog dog = new Dog();
```

where `Dog` extends `Animal`.

---

## 9. Why Use an Abstract Class?

Suppose every animal should have a name and an `eat()` method, but different animals make different sounds.

```java
abstract class Animal {

    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }

    abstract void makeSound();
}
```

The abstract class contains:

```text
normal field
normal method
abstract method
```

This is allowed.

---

## 10. Abstract Methods

An **abstract method** has no method body.

```java
abstract void makeSound();
```

Notice:

```text
No { }
Ends with ;
```

A child class must implement it unless that child is also abstract.

```java
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}
```

Another child:

```java
class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
```

---

## 11. Complete Abstract-Class Example

```java
abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    abstract void makeSound();
}
```

Dog:

```java
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}
```

Cat:

```java
class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
```

Main:

```java
public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Luna");

        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();
    }
}
```

Output:

```text
Buddy is eating.
Woof!
Luna is eating.
Meow!
```

---

## 12. Abstract Class Rules

An abstract class:

- uses the `abstract` keyword;
- cannot be instantiated directly;
- can have constructors;
- can have fields;
- can have normal methods;
- can have abstract methods;
- can have no abstract methods at all;
- can be extended by another class.

Example:

```java
abstract class Vehicle {

    int speed;

    void stop() {
        speed = 0;
    }

    abstract void move();
}
```

---

# Interfaces

## 13. What is an Interface?

An **interface** defines a contract that classes can agree to follow.

Example idea:

```text
Flyable
   |
   +-- Bird
   +-- Airplane
```

Both a bird and an airplane can fly, even though they are very different objects.

An interface can describe that capability.

```java
interface Flyable {

    void fly();
}
```

---

## 14. Implementing an Interface

Use:

```java
implements
```

Example:

```java
interface Flyable {

    void fly();
}
```

Class:

```java
class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}
```

Usage:

```java
Bird bird = new Bird();

bird.fly();
```

Output:

```text
Bird is flying.
```

---

## 15. Interface Methods

A simple interface method:

```java
interface Printable {

    void print();
}
```

is implicitly:

```java
public abstract void print();
```

Therefore an implementing class must provide the method as `public`:

```java
class Report implements Printable {

    @Override
    public void print() {
        System.out.println("Printing report...");
    }
}
```

---

## 16. Multiple Interfaces

Java does not allow a class to extend multiple classes.

This is not allowed:

```java
class C extends A, B {
}
```

But a class **can implement multiple interfaces**.

```java
interface Flyable {

    void fly();
}
```

```java
interface Swimmable {

    void swim();
}
```

A duck can do both:

```java
class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}
```

Usage:

```java
Duck duck = new Duck();

duck.fly();
duck.swim();
```

---

# Combining Abstract Classes and Interfaces

## 17. Using `extends` and `implements` Together

A class can extend one class and implement one or more interfaces.

```java
abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
}
```

Interface:

```java
interface Swimmable {

    void swim();
}
```

Child:

```java
class Duck extends Animal implements Swimmable {

    Duck(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Quack!");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}
```

Usage:

```java
Duck duck = new Duck("Donald");

duck.makeSound();
duck.swim();
```

---

# Polymorphism

## 18. Parent Reference, Child Object

Inheritance allows this:

```java
Animal animal = new Dog("Buddy");
```

Read it as:

```text
Reference type = Animal
Actual object  = Dog
```

Then:

```java
animal.makeSound();
```

runs the `Dog` implementation:

```text
Woof!
```

This is **polymorphism**.

---

## 19. Interface Polymorphism

You can also use an interface as the reference type.

```java
Flyable object = new Bird();
```

Then:

```java
object.fly();
```

This is useful because your code can work with anything that follows the `Flyable` contract.

Example:

```java
static void makeItFly(Flyable object) {
    object.fly();
}
```

Now:

```java
makeItFly(new Bird());
makeItFly(new Airplane());
```

can work if both classes implement `Flyable`.

---

# Abstract Class vs Interface

## 20. Main Difference

An abstract class is useful when related classes share **state and behaviour**.

An interface is useful when classes share a **capability or contract**.

| Abstract Class | Interface |
|---|---|
| `abstract class Animal` | `interface Flyable` |
| Child uses `extends` | Class uses `implements` |
| Can have instance fields | Mainly defines a contract |
| Can have constructors | No normal instance constructors |
| Can have concrete methods | Can define abstract, default, static, and private methods |
| Class extends only one class | Class can implement multiple interfaces |

Simple memory trick:

```text
Abstract class:
"What IS this object?"

Dog IS an Animal.


Interface:
"What CAN this object do?"

Bird CAN Fly.
Airplane CAN Fly.
```

This is a useful beginner guideline rather than an absolute design rule.

---

# Common Mistakes

## 21. Forgetting `extends`

Wrong:

```java
class Dog {
}
```

if you expect `Dog` to inherit from `Animal`.

Correct:

```java
class Dog extends Animal {
}
```

---

## 22. Trying to Instantiate an Abstract Class

Wrong:

```java
Animal animal = new Animal();
```

when:

```java
abstract class Animal {
}
```

Instead create a concrete subclass:

```java
Animal animal = new Dog("Buddy");
```

---

## 23. Forgetting to Implement an Abstract Method

If:

```java
abstract class Animal {

    abstract void makeSound();
}
```

then:

```java
class Dog extends Animal {
}
```

will not compile unless `Dog` implements `makeSound()` or `Dog` itself is declared abstract.

Correct:

```java
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}
```

---

## 24. Forgetting `public` for an Interface Method

Interface:

```java
interface Flyable {

    void fly();
}
```

Wrong implementation:

```java
class Bird implements Flyable {

    void fly() {
        System.out.println("Flying");
    }
}
```

Correct:

```java
class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
```

The implementation cannot reduce the method's visibility.

---

# Quick Practice

## Practice 1

Which keyword creates inheritance between classes?

```text
A. implements
B. extends
C. inherit
D. super
```

**Answer:** `B. extends`

---

## Practice 2

Fill in the blank:

```java
class Dog ______ Animal {
}
```

**Answer:**

```java
extends
```

---

## Practice 3

Can you directly create an object from an abstract class?

```java
abstract class Vehicle {
}
```

**Answer:** No.

---

## Practice 4

Which keyword connects a class to an interface?

```text
A. extends
B. abstract
C. implements
D. interface
```

**Answer:** `C. implements`

---

## Practice 5

Complete the code:

```java
interface Playable {

    void play();
}

class Game __________ Playable {

    @Override
    public void play() {
        System.out.println("Playing...");
    }
}
```

**Answer:**

```java
implements
```

---

## Practice 6

What is missing?

```java
abstract class Shape {

    abstract double area();
}

class Square extends Shape {

}
```

**Answer:** `Square` must implement `area()` or be declared `abstract`.

Example:

```java
class Square extends Shape {

    double side = 5;

    @Override
    double area() {
        return side * side;
    }
}
```

---

# Mini Exercise

Create this structure:

```text
             Vehicle
                |
        ----------------
        |              |
       Car          Motorcycle

Drivable <--------- Car
```

Requirements:

1. Create an abstract class called `Vehicle`.
2. Give it a `brand` field.
3. Create an abstract method called `start()`.
4. Create a normal method called `stop()`.
5. Create `Car` and `Motorcycle` subclasses.
6. Override `start()` in both classes.
7. Create a `Drivable` interface with `drive()`.
8. Make `Car` implement `Drivable`.
9. Create the objects in `main()` and test their methods.

---

# Cheat Sheet

### Basic inheritance

```java
class Dog extends Animal {
}
```

### Override a method

```java
@Override
void makeSound() {
    System.out.println("Woof!");
}
```

### Call parent constructor

```java
super(name);
```

### Abstract class

```java
abstract class Animal {

    abstract void makeSound();

    void eat() {
        System.out.println("Eating...");
    }
}
```

### Interface

```java
interface Flyable {

    void fly();
}
```

### Implement interface

```java
class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
```

### Extend + implement

```java
class Duck extends Animal implements Flyable {

    @Override
    void makeSound() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }
}
```

---

# Final Memory Guide

```text
extends
    ↓
inherit from a class

@Override
    ↓
replace/customize inherited behaviour

super
    ↓
access parent constructor or behaviour

abstract class
    ↓
base class that may contain shared code
and unfinished methods

abstract method
    ↓
method with no body that subclasses
must implement

interface
    ↓
contract/capability

implements
    ↓
class agrees to follow an interface
```

## One-Line Summary

```text
Inheritance     = reuse and specialize a parent class
Abstract class  = shared base with optional unfinished behaviour
Abstract method = method subclasses must complete
Interface       = contract describing what a class can do
```
