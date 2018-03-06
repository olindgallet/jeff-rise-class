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

> i = 0;
> while i < 10:
>    print(i);
>    i = i + 1;

Save, then go to your command line and type:

> python3 whileloops.py

What happens?  If it didn't work, pay attention to your indentation.  All code that gets executed in a while loop is separated by indentation.

As for the code:
- ** i = 0 ** sets up the counter.  The counter is used to keep track of how many times the loop runs.  Unlike a for loop, a counter must be manually changed.
- ** i < 10 ** is the condition 

Now let's compare it to a for loop.  Copy and paste this new code, erasing the old code and run it.  What do you see?

> print('** while loop **');

> i = 0;
> while i < 10:
>     print(i);
>     i = i + 1;

> print('** for loop **');
    
> for i in range(0, 10):
>     print(i);

