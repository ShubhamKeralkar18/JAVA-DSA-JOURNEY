# Day 1 - Variables, Data Types, Operators

## Variable

A variable is basically a named box in memory where you store a value.

int age = 20;

Breaking this down:
- int -> tells what type of value the box can hold
- age -> the name of the box (you pick this name)
- = -> means "store this value" (not "equal to" like in math)
- 20 -> the actual value going into the box

What's really happening: when this line runs, Java reserves a small space in memory, labels that space "age", and puts 20 in it. Whenever you use "age" anywhere after this, Java goes and picks up whatever value is currently sitting in that box.

The value inside can change, but the box (name) stays the same:
age = 25;

Now the box "age" holds 25 instead of 20. The old value is just gone, overwritten.

You can also change the value using itself:
age = age + 1;

This means: take whatever is currently in age, add 1 to it, then store the result back in age. So if age was 25, it becomes 26. This is a common pattern - reading a variable and updating it based on its own current value.

One more thing: a variable must be declared with a type before you use it. You can't just write age = 20; on its own the first time - Java needs to know upfront what type of data it should expect in that box (int, double, etc). That's why the first time you always write the type + name + value together.

## Data Types

int -> whole number         int age = 20;
double -> decimal number    double height = 5.8;
char -> a single letter     char grade = 'A';
boolean -> true/false       boolean isStudent = true;
String -> text              String name = "Shubham";

Rule: String goes in double quotes, char goes in single quotes and only 1 character.

## Type Conversion

int to double is easy, it auto-converts:
double price = 99;  // becomes 99.0, no error

double to int is not easy, it gives an error:
int price = 99.5;   // ERROR

To force it, you have to cast:
int price = (int) 99.5;  // now price = 99, the .5 gets cut off

## Operators

Math ones:
a + b  -> add
a - b  -> subtract
a * b  -> multiply
a / b  -> divide
a % b  -> remainder (what's left after dividing)

Comparison ones (result is always true/false):
a > b   -> is it greater
a < b   -> is it smaller
a == b  -> is it equal (different from =, don't mix these up)
a != b  -> is it not equal

## Important thing - Even/Odd

Do number % 2:
- 0 means even
- 1 means odd

This comes up a lot later in DSA.