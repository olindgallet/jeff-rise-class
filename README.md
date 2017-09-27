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

__Understand the code

In this code, the program takes in a name for the pokemon from the user and displays the pokemon hitting itself until it gets to zero hp and faints.  Note that the program is made up of two JAVA files: the Tui (text user interface) and the Pokemon object.

__What I want you to do

-Add in another Pokemon

-Take in its name

-Have the two battle it out!  Put meaningful messages using each Pokemon's name and health, and remember to set health to a new value in battle.

-BONUS Look in the JAVA API for Math.random.  Use this function to generate random values during combat.  Don't forget to import the library!

# Project 2 (WIP)

Cloud 9 doesn't have native support for the GUIs on JAVA.  To add it in, type/copy the following in the terminal:

> cd ~

> git clone https://github.com/acabey/cloud9-vnc.git

> cd cloud9-vnc/

> sudo apt-get update

> sudo ./install.sh

> reboot

> c9vnc
