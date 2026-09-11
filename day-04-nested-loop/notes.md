# Day 04 - Nested Loops

## What I Learned

Today I learned about Nested Loops in Java.

A nested loop means having one loop inside another loop.

---

## Nested Loop

A nested loop contains:

- Outer loop
- Inner loop

The outer loop generally controls the rows.
The inner loop generally controls the work done inside each row.

### Basic Structure

for (initialization; condition; update) {

    for (initialization; condition; update) {
        // code
    }

}

---

## Outer Loop and Inner Loop

Example:

for (int i = 1; i <= 5; i++) {

    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }

    System.out.println();
}

Here:

- `i` controls the rows.
- `j` controls how many times something is printed in that row.
- The inner loop completes all its iterations for every one iteration of the outer loop.

---

## Important Concept

The number of times the inner loop runs can depend on the outer loop variable.

Example:

j <= i

When:

i = 1 → inner loop runs 1 time
i = 2 → inner loop runs 2 times
i = 3 → inner loop runs 3 times
i = 4 → inner loop runs 4 times
i = 5 → inner loop runs 5 times

---

## Output

The above program prints:

* 
* * 
* * * 
* * * * 
* * * * *

This creates a triangle pattern.

---

## print() vs println()

`System.out.print()` prints on the same line.

Example:

System.out.print("* ");

Output:

* * *

`System.out.println()` moves to the next line.

Example:

System.out.println();

It is useful after completing one row of a pattern.

---

## Key Learnings

- Nested loop = loop inside another loop.
- Outer loop can represent rows.
- Inner loop can represent columns/items in each row.
- Inner loop runs completely for every outer-loop iteration.
- The inner loop condition can depend on the outer loop variable.
- `print()` stays on the same line.
- `println()` moves to the next line.
- Nested loops are important for patterns, matrices and 2D arrays.

---

## Practice Problems

1. Print:
   ****
   ****
   ****
   ****
   ****

2. Print:
   12345
   12345
   12345
   12345

3. Print:
   1
   12
   123
   1234
   12345

4. Print:
   12345
   1234
   123
   12
   1