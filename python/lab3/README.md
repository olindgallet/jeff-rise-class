
**Understanding Lists and Repetition Part 1**

Hello, for today's lab this is what I want you to take away:
- ** A fundamental understanding of lists **
- ** The start of understanding repetition **
- ** How repetition can be used to work with lists **
- ** Consideration of the flow of a program **

So for this lab I'm going to put more coding because I want you to see the code in action.  I can keep talking about the code, but you won't be seeing it.  You won't be feeling the words escape your fingers and appear on the screen.  I stress that if you understand the code, you understand the quizzes.  

Now, lists.  Lists are a **data structure** that holds its items one after another.  Lists are important since they can hold related data such as usernames.  

Think of lists as cubbyholes, items one after another:

| ITEM 1 | ITEM 2 | ITEM 3 | ITEM 4 |

Note that lists are **finite**, meaning that they have a defined size.  A computer needs to know how much memory to make available for the these lists.  Note that lists can grow as big as the computer can allow.

This is how you make an empty list in Python:

```list = [];```

The '[]' symbols mean the beginning and the end of a list.  You can also make a list with elements as follows:

```list = ['a', 'b', 'c'];```

Realize this.  Elements can hold any type of data whether it be numbers, letters, etc.  As long as the data inside a list is of the same type, then it's ok.

Now look at this.  Suppose you want to add something to the end of a list.

```list = [];```
```list.append('end');```

```append``` adds the element to the end of the list.  In this case, the word `end` is added to this list.

Now get your C9 ready and your editor ready because I want you to type in this part:
```
import random;

numbers = [];

for i in range(0, 10):
    numbers.append(random.randint(1, 6));

print(numbers);
```

Save it and run it on the terminal.  What gets displayed?  **Also note, randint needs a 1 at the beginning because when I put 0, sometimes I get 0.  This is why I always stress testing your code.  I also messed up in telling you that a 0 needs to be there.**

What you have is a list of 10 numbers created from rolling a die 10 times.  You're seeing a new construct called the for loop here.  A for loop can be used to repeat things.  ```range``` makes a list of numbers from 0 to 9, or the first number to the second number - 1.  When the for loop runs, the loop will repeat for each element of that list.  In other words, the list will run for 0, 1, 2, 3 and so on until it ends at 9.

Save the program, run the program.  What shows up?

You have a list of random numbers now.  Here's something you can try with random numbers:

```
import random;

numbers = [];

for i in range(0, 10):
    numbers.append(random.randint(1, 6));

print(numbers);

for i in numbers:
    if i % 2 == 0:
        print('The number ' + str(i) + ' is even.');
    else: 
        print('The number ' + str(i) + ' is odd.');
```

There's two things I want you to pay attention to here.  First, for loops and if statements can appear inside each other.  In Python, indentation helps organize the information.  As structures start going inside other structures, pay attention to the indentation.  Second, for loops are used to go through each element of a list.  In the first for loop, the loop goes through a list of 0 - 9 made from the range statement.  In the second for loop, it goes through each element of the numbers list.  The numbers list holds 10 randomly generated numbers from 1 to 6.

