**Understanding Cloud9, Linux, and how to get started with Javascript**

Hello, for today's lab you will be familiarizing yourself with the C9 IDE, the Unix command line, and the start of programming with Javascript in Node.  First, understand that Cloud9 is a cloud-based integrated development environment (IDE).  Let's break it down -- being cloud-based means that as long as you have your username and password, you can access Cloud9's services from any computer with an Internet connection.  If you want to experiment at home or the library, do so!  Integrated development environment is a place to write code and test programs.  It includes a text processor, a command line, and other features to make programming easier.

Now let's get started.

1. Go to the [C9 Login](https://c9.io/login).  Enter your login information; if you don't have one or have problems, see Mr. Olin.  **Always** keep track of your login and password as this is needed for future classes. 

2. Once you're logged in, you should see something like this:

![workspaces](https://github.com/olindgallet/jeff-rise-class/blob/master/python/lab1/c9workspaces.png)

Since you're just starting out, you'll have an empty workspace.  

3.  Click "Create a New Workspace".  Fill it out as follows:

- **Workspace Name** - nodejs

- **Description** - Workspace for Node class

- **Team** - Jeff Rise

- **Hosted Workspace** - Public

- **Clone from Git or Mercurial URL** - (leave blank)

- **Choose a Template** - Javascript

After that, click "Create Workspace" and your workspace will be created.  In the background, a virtual machine is being made.  So why do you need a "computer inside a computer"?  Having a virtual machine means you can run multiple operating systems on one computer; keep in mind some programs only run on certain operating systems (or OSes).

4.  After your virtual machine gets created and finishes loading, you should see something like this:

![c9interior](https://github.com/olindgallet/jeff-rise-class/blob/master/python/lab1/cloud9interior.png)

Keep in mind I've been using this for a while, so mine will look a bit different.  Near the top-middle, look for a green plus.  Click that and select "Open New Terminal".

What you now have is what's known as the **command line**.  From here, you can do different things like copy files, delete files, and download files.  The only thing that changes is how you do it.

If you use an operating system like Windows or ChromeOS, that's more computing power that's needed to run those.  Unix, the operating system with this command line, takes up much less computer power that could be used for other things.

- **First**, type in **ls**.  ls will list all files and directories in the current directory.  There shouldn't be much there right now.  So make a work directory (a directory is like a folder in Windows).

- **Second**, type in **mkdir helloworld**.  mkdir means "make directory", so you are making a directory named helloworld.  How would you check to see if the directory was made?

- **Third**, type in **cd helloworld**.  cd means "change directory", so you going into the directory you just made.

- **Fourth**, type in **touch helloworld.js**, touch makes an empty file, so you make an empty file named helloworld.js.  All Javascript and Node.js files end with .js.

- **Fifth**, type in **c9 open helloworld.js**.  You should see a new tab pop up.  What you just did is open up helloworld.js in the text editor and now you can start writing code.

5.  So let's take a break and talk about the text editor.  The main thing you need to know is **ctrl + s**.  That will save your work.  Save often.  Ever play a video game, die, and lose progress?  Same thing happens in programming.  Save.  Save.  Save.

6.  Time to write your first lines of code.  Start with the following:
> console.log('Hello world!');

Save, then go to your command line and type:
> node helloworld.js

What happens?

Note that most lines in Javascript end with a semicolor(;).  Typing in code has rules so that the computer can understand what you're trying to say; this is known as **syntax**.  Like how English sentences begin with a capital letter and end with a punctuation mark, code has its own set of rules.

As a side note, I will be teaching you Node.  Javascript used to be used only in web browsers, but through node it can be used without one.  Be aware of this.

7.  What you just did is known as **output**, or sending information to the user.  Taking in information is known as **input**.  Keep in mind that in complicated programs, the user might not even be a human -- input and output can happen between sensors, database readers, and other hardward and software parts.  So let's do input -- type in your code in the previous window as follows:

> const readline = require('readline');


> const rl = readline.createInterface({

> &nbsp; &nbsp; input: process.stdin,

> &nbsp; &nbsp; output: process.stdout

> });


> rl.question('What do you think of Node.js? ', (answer) => {

> &nbsp; &nbsp; console.log(`Thank you for your valuable feedback: ${answer}`);

> &nbsp; &nbsp; rl.close();

> });

This is a lot of code.  First, look at the first line with **const readline**.  Nodejs has very limited capabilities, so if you need to do something that the basic language can't, you need to import a library (a library is some prewritten code).  Here the line is importing the library *readline* and has all functions from that library available.  This information is getting stored in a **const**ant variable since it won't change its values.

The next few lines makes an rl object.  The std.in and std.out means standard input and output; in other words your keyboard and monitor.

**rl.question** and other lines tell what happen

8.  Now that you understand output and input, try making a bot that has a basic conversation with you.  Have it ask your name, what your favorite color is, and another question of your choice.  Also, make it respond however you want.  Is it a serious bot?  Does it have jokes?  Your code, your freedom.

Let me know how you like this lab too!
