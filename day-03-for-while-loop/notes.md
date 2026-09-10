# Day 03 - For Loop and While Loop

## What I Learned

Today I learned about loops in Java.

Loops are used when we want to execute the same block of code multiple times.

---

## For Loop

A for loop is useful when we know how many times we want to repeat something.

### Syntax

for (initialization; condition; update) {
    // code
}

### Example

for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}

### Three Parts

1. Initialization
2. Condition
3. Update

Example:

int i = 1;    // initialization

i <= 10;      // condition

i++;          // update

---

## While Loop

A while loop runs as long as its condition is true.

### Syntax

while (condition) {
    // code
}

### Example

int i = 1;

while (i <= 10) {
    System.out.println(i);
    i++;
}

---

## For Loop vs While Loop

### For Loop

Used when the number of iterations is generally known.

Example:

for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}

### While Loop

Used when we want to continue running code while a condition remains true.

Example:

while (i <= 10) {
    System.out.println(i);
    i++;
}

---

## Important Concepts

- i++ increases the value by 1.
- i-- decreases the value by 1.
- % gives the remainder.
- Even numbers can be checked using number % 2 == 0.
- The loop stops when its condition becomes false.
- We must update the loop variable in a while loop to avoid an infinite loop.

---

## Practice Problems

1. Print numbers from 1 to 10 using for loop.
2. Print even numbers from 1 to 20.
3. Print numbers from 10 to 1 using while loop.
4. Find the sum of numbers from 1 to 10.
5. Print the multiplication table of 7.
6. Count from 1 to 5 using while loop.