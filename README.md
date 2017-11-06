# jeff-rise-class

Introduction to programming with JAVA.  Making a pokemon game, different parts for classes.

# Install JAVA
sudo apt-get update
sudo apt-get install default-jdk


# Project 1

To download, follow these steps in cloud 9 terminal:

> mkdir pkmntui

> cd pkmntui

> wget -O Pokemon.java https://raw.githubusercontent.com/olindgallet/jeff-rise-class/master/Pokemon.java

> wget -O Tui.java https://raw.githubusercontent.com/olindgallet/jeff-rise-class/master/Tui.java

> c9 open *.java

## Understand the code

In this code, the program takes in a name for the pokemon from the user and displays the pokemon hitting itself until it gets to zero hp and faints.  Note that the program is made up of two JAVA files: the Tui (text user interface) and the Pokemon object.

## What I want you to do

-Add in another Pokemon

-Take in its name

-Have the two battle it out!  Put meaningful messages using each Pokemon's name and health, and remember to set health to a new value in battle.

-BONUS Look in the JAVA API for Math.random.  Use this function to generate random values during combat.  Don't forget to import the library!

# Project 1.5

## Get on the same page

Download the updated code as follows

> cd pkmntui

> wget -O TuiUpdated.java https://raw.githubusercontent.com/olindgallet/jeff-rise-class/master/TuiUpdated.java

> javac TuiUpdated.java

> java TuiUpdated

Try the program for a few times.  What do you think can be improved upon in the code?  How would you add these changes to the existing code?

# Project 2 (WIP)

Cloud 9 doesn't have native support for the GUIs on JAVA.  To add it in, type/copy the following in the terminal:

> cd ~

> git clone https://github.com/acabey/cloud9-vnc.git

> cd cloud9-vnc/

> sudo apt-get update

> sudo ./install.sh

> reboot

> c9vnc

TODO: Make a sample GUI for students to try out.

# Project 3 (WIP)

From the workspace menu, make a new workspace just for web development.  Keep your java work in one workspace, javascript in another.  

Let's make a webpage.  First, download a shell script to make the process easier.
> cd ~

> cd bin

> wget -O buildapp.sh https://raw.githubusercontent.com/olindgallet/developerscripts/master/buildapp.sh

> chmod +x buildapp.sh

> sed -i 's/\r/\n/g' buildapp.sh 

> npm install -g bower

> cd ~

> cd workspace

> buildapp.sh myapp
