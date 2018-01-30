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

  stop();
  
elif light == 'green':

  go();
````
There are a couple of things I want you to notice about the code.

* **First**, notice how every comparison begins with `if` or `elif`.  `elif` means 'else if'.  There is also an `else`.  All conditional structures begin at `if` and follow zero or more `elif`s and at most 1 `else`.  The way to start a conditional statement is `(if|elif|else) [condition]:`.

* **Second**, more about conditions.  Condtions either are true or false -- there is no inbetween.  Most conditionals you will use in this class are comparisons between two like objects.  For example, is 1 > 2?  Is 9 > 0?

For reference, here is a diagram to refresh your memory:

a > b - a is *greater than* b

a < b - a is *less than* b

a <= b - a is *less than or equal* to b

