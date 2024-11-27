# Chapter 2 - Operators

## Objectives for this chapter:
    Handling date, time, text, numeric & boolean values
    Use primitive wrapper classes including Math API, parentheses, type promotion, 
    and casting to evaluate arithmetic and boolean expressions

---

### What is an operator?
A Java operator is a symbol that can be applied to a set of variables, values, or literals that returns a result.
The term operand refers to the value or variable the operator is being applied to.

Example:

    var c = a + b;

In the above example, the "=" & "+" symbols are operators and the "a" * "b" symbols are the operands. "c" is the result.

### Types of operators
Java supports three types of operators; unary, binary and ternary operators. These types of operators can be applied to 
one, two or three operands respectively *for the exam, you need to know a specific subset of Java operators, how to apply them,
and the order in which they should be applied*

### Operator precedence
Java operators are not all evaluated left-to-right. Some are evaluated right-to-left.
For instance in the following example the operators are evaluated from right-to-left:
[Go to code](./src/main/java/org/example/OperatorPrecedence.java)

    int cookies = 4;
    double reward = 3 + 2 * --cookies;
    System.out.print("Zoo animal recieves: "+reward+" reward points");

Java tends to follow the order of operations found in mathematics.

Unless overridden by parentheses, Java follows the order of operation listed in the next table:

# Operator Table

| Operator                        | Symbols and examples                                                      | Evaluation    |
|---------------------------------|---------------------------------------------------------------------------|---------------|
| Post-unary operators            | expression++, expression--                                                | Left-to-right |
| Pre-unary operators             | ++expression, --expression                                                | Left-to-right |
| Other unary operators           | -, !, ~, +, (type)                                                        | Right-to-left |
| Cast                            | (type)reference                                                           | Right-to-left |
| Multiplication/division/modulus | *, /, %                                                                   | Left-to-right |
| Addition/subtraction            | +, -                                                                      | Left-to-right |
| Shift operators                 | <<, >>, >>>                                                               | Left-to-right |
| Relational operators            | <, >, <=, >=, instanceof                                                  | Left-to-right |
| Equal to/not equal to           | ==, !=                                                                    | Left-to-right |
| Logical AND                     | &                                                                         | Left-to-right |
| Logical exclusive OR            | ^                                                                         | Left-to-right |
| Logical inclusive OR            | &#124;                                                                    | Left-to-right |
| Conditional AND                 | &&                                                                        | Left-to-right |
| Conditional OR                  | &#124;&#124;                                                              | Left-to-right |
| Ternary operators               | x ? y : z                                                                 | Right-to-left |
| Assignment operators            | <code> =, +=, -=, *=, /=, %=,<br> &=, ^=, &#124;=, <<=, >>=, >>>= </code> | Right-to-left |
| Arrow operator                  | ->                                                                        | Right-to-left |

The arrow operator (->) is sometimes referred to as the arrow function or lambda operator and is a binary operator that represents a relationship between two operands.

### Applying Unary Operators
By definition a unary operator is one that requires exactly one operand, or variable, to function.
They ofter perform simple tasks, such as increasing a numeric variable by one or negating a boolean value.

[Try them out](./src/main/java/org/example/ApplyingUnaryOperators.java)

| Operator           | Examples  | Description                                                                                                                                 |
|--------------------|-----------|---------------------------------------------------------------------------------------------------------------------------------------------|
| Logical complement | !a        | Inverts a boolean's logical value                                                                                                           |
| Bitwise complement | ~b        | Inverts all 0s and 1s in a number                                                                                                           |
| Plus               | +c        | Indicates a number is positive <br> although numbers are assumed to be positive<br> in Java unless accompanied by a negative unary operator |
| Negation or minus  | -d        | Indicates a literal number is negative or negates an expression                                                                             |
| Increment          | ++e, f++  | Increments a value by 1                                                                                                                     |
| Decrement          | --g, h--  | Decrements a value by 1                                                                                                                     |
| Cast               | (String)i | Casts a value to a specific type                                                                                                            |


