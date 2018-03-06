**Working with while loops**

Hello, for today's lab you will be familiarizing yourself with while loops.  I've also included material from previous labs to help you since I've noticed some of you struggle there.  

Now let's get started.

1. Go to the [C9 Login](https://c9.io/login).  Enter your login information; if you don't have one or have problems, see Mr. Olin.  **Always** keep track of your login and password as this is needed for future classes. 

2. Once you're logged in, you should see something like this:

![workspaces](https://github.com/olindgallet/jeff-rise-class/blob/master/python/lab1/c9workspaces.png)

Since you're just starting out, you'll have an empty workspace.  

3.  Click "Create a New Workspace".  Fill it out as follows:

- **Workspace Name** - Python

- **Description** - Workspace for Python class

- **Team** - Jeff Rise

- **Hosted Workspace** - Public

- **Clone from Git or Mercurial URL** - (leave blank)

- **Choose a Template** - Python

After that, click "Create Workspace" and your workspace will be created.  In the background, a virtual machine is being made.  So why do you need a "computer inside a computer"?  Having a virtual machine means you can run multiple operating systems on one computer; keep in mind some programs only run on certain operating systems (or OSes).

4.  After your virtual machine gets created and finishes loading, you should see something like this:

![c9interior](https://github.com/olindgallet/jeff-rise-class/blob/master/python/lab1/cloud9interior.png)

Keep in mind I've been using this for a while, so mine will look a bit different.  Near the top-middle, look for a green plus.  Click that and select "Open New Terminal".

What you now have is what's known as the **command line**.  From here, you can do different things like copy files, delete files, and download files.  The only thing that changes is how you do it.

- **First**, type in **ls**.  ls will list all files and directories in the current directory.  There shouldn't be much there right now.  So make a work directory (a directory is like a folder in Windows).

- **Second**, type in **mkdir lab4**.  mkdir means "make directory", so you are making a directory named lab4.  How would you check to see if the directory was made?

- **Third**, type in **cd lab4**.  cd means "change directory", so you going into the directory you just made.

- **Fourth**, type in **touch whileloops.py**, touch makes an empty file, so you make an empty file named whileloops.py.  All python files end with .py.  

- **Fifth**, type in **c9 open .py**.  You should see a new tab pop up.  What you just did is open up helloworld.py in the text editor and now you can start writing code.

5.  So let's take a break and talk about the text editor.  The main thing you need to know is **ctrl + s**.  That will save your work.  Save often.  Ever play a video game, die, and lose progress?  Same thing happens in programming.  Save.  Save.  Save.

6.  Time to write your lines of code.  You can use copy (ctrl + C) and paste (ctrl + V) to put this code into the editor.  Start with the following:

```
i = 0;
while i < 10:
    print(i);
    i = i + 1;
```

Save, then go to your command line and type:

> python3 whileloops.py

What happens?  If it didn't work, pay attention to your indentation.  All code that gets executed in a while loop is separated by indentation.  For future reference, when I say "run the program", that means typing this command in the terminal.

As for the code:
- ** i = 0 ** sets up the counter.  The counter is used to keep track of how many times the loop runs.  Unlike a for loop, a counter must be manually changed.
- ** i < 10 ** is the condition 

Now let's compare it to a for loop.  Copy and paste this new code, erasing the old code and run it.  What do you see?

```
print('** while loop **');

i = 0;
while i < 10:
    print(i);
    i = i + 1;

print('** for loop **');
    
for i in range(0, 10):
    print(i);
```

You should see the same thing.  For loops and while loops can be used for many of the same jobs, but there are times when it is better to use one or the other.  Here's an example, type it in and see what happens:

```
i = 10;
while i > 0:
    print(i);
    i = i - 1;    
```

You can use while loops to go backwards.  Now try this:

```
i = 0;
while i < 10:
    print(i);
    i = i + 2;
```

And now this:

```
import random;
print ('Game will end when you roll a 6.');
die = 0;
while die != 6:
    die = random.randint(1, 6);
    print('You rolled a ' + str(die) + '.');
print('Game complete.');
```

Try that game for a few times.  Key thing is to notice that it doesn't need a counter -- the loop continues until a condition is met.  You can use a while loop like this in for example menu; keep showing the menu until the user selects a menu option shown.

This is what I want you to take away:

- **While loops** - While loops show repetition like for loops.  However, unlike for loops they must meet a certain condition to keep going.  For loops are used to go over each element of a list (remember range(0, 10) makes a list also even though it looks like you're counting up).

- **Be able to differentiate when to use a for loop and a while loop**

- **Use conditionals to say when a while loop starts and ends**

__
**On your own**

Try adding up all the even numbers from 1 to 100.  Print out the answer at the end.  There are many ways to do this, so trust in your programming skill.  
