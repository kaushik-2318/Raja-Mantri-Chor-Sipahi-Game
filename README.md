# Raja Mantri Chor Sipahi Game

This is a simple Java-based game that simulates the traditional Indian game of "Raja Mantri Chor Sipahi". The game involves four players, each with a different role - Raja, Mantri, Chor, and Sipahi.

## Game Rules

- If you are a Sipahi, you will get 500 points.
- If you are a Chor, you will get 000 points.
- If you are a Chor and get caught, you will get 500 points.
- If you are a Mantri, you will get 800 points.
- If you are the King, you will get 1000 points.

## How to Run the Game

1. Compile the Java code "javac RajaMantriChorSipahiGame.java"
1. Run the compiled Java class "java RajaMantriChorSipahiGame"
1. Enter the names of the four players.
1. Enter the number of rounds you want to play.
1. In each round, the game will randomly assign roles to each player.
1. Sipahi, will be asked to guess who the Chor is.
1. Points will be awarded based on the correctness of the guess.
1. The game will run for the number of rounds specified.
1. At the end of the game, the total scores of all players will be displayed.


## Notes

- The code uses the `java.util.Random` and `java.util.Scanner` classes for random number generation and user input, respectively.
- The game is text-based and runs in the console.
- The code is not optimized for performance and is intended for educational purposes.