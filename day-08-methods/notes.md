# Day 08 - Methods / Functions

## What is a Method?

A method is a block of code designed to perform a specific task.

Instead of writing the same code again and again, we can create a method and call it whenever required.

---

## Basic Syntax

static returnType methodName(parameters) {
    // code
}

Example:

static void sayHello() {
    System.out.println("Hello, Java!");
}

---

## Calling a Method

sayHello();

When this statement runs, the code inside sayHello() executes.

---

## Parameters

Parameters are values received by a method.

Example:

static int add(int a, int b) {
    return a + b;
}

Here:

a and b = parameters

Calling:

add(10, 20);

10 and 20 are arguments.

---

## Return Value

A method can return a value using return.

Example:

static int square(int number) {
    return number * number;
}

The return type is int because the method returns an integer.

---

## void

If a method does not return a value, we use void.

Example:

static void sayHello() {
    System.out.println("Hello, Java!");
}

---

## Boolean Method

A method can also return true or false.

Example:

static boolean isEven(int number) {
    return number % 2 == 0;
}

---

## Why Methods Are Useful

- Code reuse
- Cleaner programs
- Easier debugging
- Better organization
- Large problems can be divided into smaller tasks

---

## Important Terms

Method = Block of reusable code

Parameter = Variable received by method

Argument = Actual value passed to method

return = Sends a value back

void = Method returns nothing

---

## Day 08 Summary

Today we introduced methods/functions.

We learned:

1. Creating a method
2. Calling a method
3. Parameters
4. Arguments
5. Return values
6. void methods
7. Boolean methods