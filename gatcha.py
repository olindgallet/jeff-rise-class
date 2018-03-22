# Name: Olin Gallet
# Date: 3/22/2018
#
# This program will simulate a gatcha game.
# It will take in some form of currency, then create a random outcome based
# on a die roll.

import random;

# Rolls a die.
# return: 
#   a random number from 1 to 6 inclusive
def rollDie():
    return random.randint(1, 6);

# Gets a prize based on the number given.
# params:
#   number - the number for the prize
# return:
#   the name of the prize to give
def getPrize(number):
    prize = '';
    
    if number == 1 or number == 2 or number == 3:
        prize = 'Common Rock';
    elif number == 4 or number == 5:
        prize = 'Uncommon Stone';
    else:
        prize = 'Rare Jewel';
        
    return prize;

# Game will run as long as a player has currency.
# Player will start with 10 currency items and can therefore run 10 games.
# At the end of the 10 games, run game will return a list of prizes.
def runGame():
    return [];

# This will take in a list and print the results.
# Ideally it would look something like this:
#   Common - x number
#   Uncommon - y number
#   Rare - z number
#
# params:
#   results - the results of a game
def printResults(results):
    print();

#main program.
printResults(runGame());
