# PROG6112 Exam Cheatsheet & Reference Repository

* **Author:** Sachin Mahabeer
* **GitHub Username:** `SMahabeer07`
* **Repository:** [PROG6112_Test](https://github.com/SMahabeer07/PROG6112_Test.git)

## Assessment Rules & Instructions

1. **Referencing Previous Work & Personal GitHub:** This is an open-book assessment. You may refer to your own GitHub repositories, previous projects, and semester work as reference materials.
2. **Use of AI Tools:** **Strictly prohibited.** All work must be completed independently without AI assistance.
3. **Virtual Machine (VM):** Use of the provided VM is recommended as all software is pre-installed and technical support is available. If using a personal device, you are responsible for resolving local installation issues.
4. **Referencing & Harvard Anglia Attribution:** Acknowledge all external resources, code snippets, and documentation using **Harvard Anglia** referencing style and include code attribution comments in your code.
5. **Cheat Sheets:** Organise your cheat sheets in a GitHub repository rather than separate loose files for easy access.
6. **Submission Requirements:** You must submit your final work to **both ARC and GitHub**.

## Code Attribution Template (Harvard Anglia)

In your code you can add this above a snippet that you use from this repo. You can change it as you see fit. Examples include: This code was adapted from, inspired by etc. As long as you include thee acknowledgement, my GitHub username and the repo link as well as the repo name you should be fine. For further referencing you can use w3Schools or GeeksforGeeks and follow the same principle including date accessed, link, author etc.:

```java
/*
 * Adapted from: Mahabeer, S., 2026. PROG6112_Test
 * Available at: https://github.com/SMahabeer07/PROG6112_Test.git
 * [Accessed 18 November 2026].
 */
```

## Java Logic, OOP & File Handling Cheatsheet

### 1. Core OOP Concepts

#### Encapsulation & Constants
```java
public class SurfSales {
    private static final int SALES_TARGET = 400; // Constant
    private int[][] salesData; // Private field

    public SurfSales(int[][] salesData) {
        this.salesData = salesData;
    }

    public int[][] getProductSales() {
        return this.salesData;
    }
}
```

#### Inheritance & Polymorphism (`extends`, `super`, `@Override`)
```java
public class BaseSale {
    protected double amount;

    public BaseSale(double amount) {
        this.amount = amount;
    }

    public double calculateFinalAmount() {
        return amount;
    }
}

public class DiscountedSale extends BaseSale {
    private double discountRate;

    public DiscountedSale(double amount, double discountRate) {
        super(amount); // Calls parent constructor
        this.discountRate = discountRate;
    }

    @Override
    public double calculateFinalAmount() {
        return amount - (amount * discountRate);
    }
}
```

#### Abstraction (Interfaces)
```java
public interface ISurfSales {
    int[][] GetProductSales();
    int GetTotalSales();
    int GetSalesOverTarget();
    int GetSalesUnderTarget();
    int GetYearsProcessed();
    double GetAverageSales();
}

public class SurfSales implements ISurfSales {
    @Override
    public int GetYearsProcessed() {
        return salesData.length; // Dynamic row count
    }
    // Implement remaining interface methods...
}
```

### 2. Two-Dimensional Arrays (Processing & Thresholds)

```java
int total = 0;
int count = 0;
int overTarget = 0;
int underTarget = 0;
int highest = sales[0][0];
int lowest = sales[0][0];

for (int row = 0; row < sales.length; row++) {
    for (int col = 0; col < sales[row].length; col++) {
        int current = sales[row][col];
        total += current;
        count++;

        if (current > SALES_TARGET) overTarget++;
        else underTarget++;

        if (current > highest) highest = current;
        if (current < lowest) lowest = current;
    }
}

// Rounding average to nearest whole number
long roundedAverage = Math.round((double) total / count);
```

### 3. File Handling (`BufferedWriter` & `BufferedReader`)

#### Writing to a File (`BufferedWriter`)
```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public void saveSalesLog(String reportText) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("sales_log.txt"))) {
        bw.write("SALES LOG");
        bw.newLine();
        bw.write("********************");
        bw.newLine();
        bw.write(reportText);
        bw.newLine();
        bw.write("********************");
    } catch (IOException e) {
        System.out.println("File write error: " + e.getMessage());
    }
}
```

#### Reading from a File (`BufferedReader`)
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public void readSalesLog() {
    try (BufferedReader br = new BufferedReader(new FileReader("sales_log.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        System.out.println("File read error: " + e.getMessage());
    }
}
```

### 4. JUnit 5 Unit Testing

```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SurfSalesTest {

    @Test
    public void GetSalesOverTarget_ReturnsNumberOfSales() {
        int[][] testData = {
            {520, 380, 150},
            {610, 340, 210},
            {450, 290, 200}
        };
        SurfSales surfSales = new SurfSales(testData);
        
        int expected = 3;
        int actual = surfSales.GetSalesOverTarget();
        
        assertEquals(expected, actual);
    }
}
```
