# Day 06 - Advanced Patterns

## What I Learned

Today I practiced advanced patterns using nested loops.

I learned that a pattern can require more than one inner loop.

For example, one inner loop can print spaces and another inner loop can print stars.

---

# Pattern Logic

Before writing code for a pattern, I should identify:

1. Number of rows
2. Number of spaces
3. Number of stars/numbers
4. Whether the pattern is increasing or decreasing
5. Which loop controls each part

---

# Pattern 1 - Right Triangle

Output:

*
**
***
****
*****

The number of stars increases with every row.

Code:

```java
for (int i = 1; i <= 5; i++) {

    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }

    System.out.println();
}