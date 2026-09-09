# Day 2 - if-else and switch

## if-else

Gives the program the power to make decisions. If a condition is true, do 
one thing; if false, do another.

int age = 20;

if (age >= 18) {
    System.out.println("Eligible to vote");
} else {
    System.out.println("Not eligible");
}

- if (condition) -> the condition is checked, result comes as true/false
- if true -> the if block runs
- if false -> the else block runs
- both never run together, only one of them runs

Curly braces { } form a group - all lines inside run together.

## else if - when there are more options

int marks = 65;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 60) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}

Important: Java checks from top to bottom. As soon as one condition is 
found true, that block runs and all remaining else-if/else are skipped, 
even if they would have also been true. Only one block runs out of the 
whole chain.

Example with marks = 65:
- marks >= 90 -> false, skip
- marks >= 75 -> false, skip
- marks >= 60 -> true, this runs -> "Grade C" gets printed
- stops right here, the else is never even checked

## switch statement

Used when you need to check fixed values of a single variable (like a day, 
a grade).

int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}

- switch(day) -> the value of day is checked
- whichever case matches, execution starts from there
- break; -> exits the switch here, this is essential
- default -> runs if no case matches (like an else)

## Important - the missing break bug (fall-through)

If break; is not added after a case, Java does not stop after that case - 
it keeps executing the lines below it too, even if they don't match or 
even if it's the default.

Example: day = 3, and break; is removed from case 3:

case 3:
    System.out.println("Wednesday");
    // no break; here
default:
    System.out.println("Invalid day");

Output:
Wednesday
Invalid day

"Wednesday" printed because it matched, but since there was no break, the 
default also ran. That's why break; is needed at the end of every case, 
otherwise you get extra unwanted output.

## if-else vs switch - when to use which

- For checking a range (like age > 18, marks >= 60) -> use if-else
- For checking specific fixed values of one variable (like day, grade 
  letter) -> use switch
- switch cannot handle ranges