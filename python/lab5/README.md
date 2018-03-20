**Working with while loops**

Hello, for today's lab you will be familiarizing yourself with while loops.  I've also included material from previous labs to help you since I've noticed some of you struggle there.  

Now let's get started.

1. Go to the [C9 Login](https://c9.io/login).  Enter your login information; if you don't have one or have problems, see Mr. Olin.  **Always** keep track of your login and password as this is needed for future classes. 

2. Once you're logged in, you should see something like this:

![workspaces](https://github.com/olindgallet/jeff-rise-class/blob/master/python/lab1/c9workspaces.png)

3.  Go to your workspace.

4.  After your virtual machine gets created and finishes loading, you should see something like this:

![c9interior](https://github.com/olindgallet/jeff-rise-class/blob/master/python/lab1/cloud9interior.png)

Keep in mind I've been using this for a while, so mine will look a bit different.  Near the top-middle, look for a green plus.  Click that and select "Open New Terminal".

What you now have is what's known as the **command line**.  From here, you can do different things like copy files, delete files, and download files.  The only thing that changes is how you do it.

- **First**, type in **ls**.  ls will list all files and directories in the current directory.  There shouldn't be much there right now.  So make a work directory (a directory is like a folder in Windows).

- **Second**, type in **mkdir lab5**.  mkdir means "make directory", so you are making a directory named lab4.  How would you check to see if the directory was made?

- **Third**, type in **cd lab5**.  cd means "change directory", so you going into the directory you just made.

- **Fourth**, type in **touch functions.py**, touch makes an empty file, so you make an empty file named functions.py.  All python files end with .py.  

- **Fifth**, type in **c9 open functions.py**.  You should see a new tab pop up.  What you just did is open up functions.py in the text editor and now you can start writing code.

Now for functions.  Functions are named blocks of code.  Whereever you use that name, you can access that code.  Let's look at one you've been using so far:
```
import random;

number = random.randint(1, 6);
```
First off, remember that import brings in code that other people already have written and tested.  It lets you use this code as your own.  ```random.randint(1,6)``` generates a number from 1 to 6, but check this out:
```
random.randint(floor, ceiling)
```
This is how you may see it in documentation.  See *floor* and *ceiling*?  Those are values that need to be provided when you call that function, or **parameters**.  In this case, you need to provide both the lowest random number and the highest random number.

Also keep in mind that functions may or may not return values.  In this case, the function is returning a randomly generated number.

Now here's how you do it in Python:
```
def hello(name):
  print('I am a computer');
  print('Hello ' + name);

hello('person');
```
Replace person with whatever your name is, just keep it in the single quotes.  Another thing to note -- use tabs to separate your code.  Everything that belongs to that hello function is tabbed over.

This is how you use a return statement also:
```
def addtwo(number):
  return number + 2;
  
print(addtwo(5));
```
__

**Your turn**

Try writing a function that will say if a number is even or odd.  Use that function to go through a list and say which numbers are odd or even.
