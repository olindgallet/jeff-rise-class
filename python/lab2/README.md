**Understanding Conditional Statements**

Hello, for today's lab you will be familiarizing yourself with conditional statements.  Conditional statements are used to take action depending if a statement is true or false.

For example, consider a stoplight.  What should a car normally do if the driver sees a red light?  What about a green light?

In the driver's head:
```
if light is red

  then stop
  
else if light is green

  then go
```
Now here's the code in Python:
```
if light == 'red':

  print('Stop!');
  
elif light == 'green':

  print('Go!');
````
There are a couple of things I want you to notice about the code.

* **First**, notice how every comparison begins with `if` or `elif`.  `elif` means 'else if'.  There is also an `else`.  All conditional structures begin at `if` and follow zero or more `elif`s and at most 1 `else`.  The way to start a conditional statement is `(if|elif|else) [condition]:`.

* **Second**, more about conditions.  Condtions either are true or false -- there is no inbetween.  Most conditionals you will use in this class are comparisons between two like objects.  For example, is 1 > 2?  Is 9 > 0?

For reference, here is a diagram to refresh your memory:

a > b - a is *greater than* b

a < b - a is *less than* b

a <= b - a is *less than or equal* to b

a >= b - a is *greater than or equal* to b

a == b - a is *equal to b* (note this is different in programming since one = means assigning a value to a variable

* **Third**, note that the condition ends with a colon (or : ).  The colon means that every line that's tabbed over following this condition will execute if the condition is true.  Every line that needs to be executed if the statement is true is tabbed over.

Try it out!
1.  Log into C9.
2.  Go to your Python workspace.
3.  From the terminal, type in `mkdir conditionals`
4.  Then type in `cd conditionals`.
5.  Then type in `touch conditional.py`.
6.  Then type in `c9 open conditional.py`.
7.  Type in the following:
```
import random;
number = random.randint(0, 6);
print(number);
```

There's a lot going on here.  First, `import random` means that you're taking some already-written code and including it into yours.  This already-written code, or library, is something programmers write to save time on future projects.  In this case, random is a library for random-number generation.

Now that the library is imported, you can start using its code.  `random.randint` takes in two numbers and returns a number greater than the first number and less than or equal to the second number.  The code will print out a number between 1 and 6.

Save your code (ctrl+s) then go to the command line, type `python3 conditional.py`, then press Enter.  Repeat it a few times by pressing up and press Enter and see if you can get different numbers.

So now that the computer can roll a die for you, what can you do with it?

8.  Go back to `conditional.py`.  After the lines you typed, start your conditional structure as follows:
```
if number % 2 == 0:
    print("It is even");
else:
    print("It is odd");
```
The `%` symbol in Python means modulo, or the remainder.  It divides the first number by the second number and gives the remainder.  In the code, you are taking the value of the die rolled, dividing it by 2, and getting either2 1 or 0.  Check out this chart:

**2 % 2** = 0

**3 % 2** = 1

**4 % 2** = 0

**5 % 2** = 1

**6 % 2** = 0

*and so on. . .do you see the pattern?*

That's right, odd numbers have a remainder of 1.  Even numbers have a remainder of 0.

