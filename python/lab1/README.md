**Understanding Cloud9, Linux, and how to get started with Python**

Hello, for today's lab you will be familiarizing yourself with the C9 IDE, the Unix command line, and the start of programming with Python.  First, understand that Cloud9 is a cloud-based integrated development environment (IDE).  Let's break it down -- being cloud-based means that as long as you have your username and password, you can access Cloud9's services from any computer with an Internet connection.  If you want to experiment at home or the library, do so!  Integrated development environment is a place to write code and test programs.  It includes a text processor, a command line, and other features to make programming easier.

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

If you use an operating system like Windows or ChromeOS, that's more computing power that's needed to run those.  Unix, the operating system with this command line, takes up much less computer power that could be used for other things.

- **First**, type in **ls**.  ls will list all files and directories in the current directory.  There shouldn't be much there right now.  So make a work directory (a directory is like a folder in Windows).

- **Second**, type in **mkdir helloworld**.  mkdir means "make directory", so you are making a directory named helloworld.  How would you check to see if the directory was made?

- **Third**, type in **cd helloworld**.  cd means "change directory", so you going into the directory you just made.

- **Fourth**, type in **touch helloworld.py**, touch makes an empty file, so you make an empty file named helloworld.py.  All python files end with .py.  

- **Fifth**, type in **c9 open helloworld.py**.  You should see a new tab pop up.  What you just did is open up helloworld.py in the text editor and now you can start writing code.

5.  So let's take a break and talk about the text editor.  The main thing you need to know is **ctrl + s**.  That will save your work.  Save often.  Ever play a video game, die, and lose progress?  Same thing happens in programming.  Save.  Save.  Save.

6.  Time to write your first lines of code.  Start with the following:
> print('Hello', person, '!');


