## User Guide
1. To start the game user has to press the “START” button.
2. The game board shows up, the first letter of the word is revealed, user has 5 attempts to guess the hidden word.
3. The user has to insert a word in the input field and press the “SUBMIT” button next to the input field.
4. Word that user inserted shows up in the first row- fields of letters that are in the correct position shows up green; fields of letters that the word contains but are not in the correct position are yellow; fields of letters that do not exist in the word are red.
5. If all five fields are green- the user guessed the word with 1st guess and earns 100 points. The new game board shows up and the user can guess the next word. Points are counted together for all rounds.
6. If all 5 fields are not green, the user has to make 2nd guess.
7. Each round user has 5 attempts to guess the word. If the word is guessed within 5 attempts, then starts the next round with a new word. The more guesses user needs the less points user can earn: 1st guess – 100 points, 2nd guess – 80 points, 3rd guess – 60 points, 4th guess – 45 points, 5th guess – 30 points.
8. If the 5th guess is wrong game ends and the window with the right answer, score, and high score shows up and the user can choose to push the “RESTART” button to start a new game and try to beat high score.


## Developer Guide

### After cloning the project from GitHub in the project directory enerate project meta-info:
- `cd workspace/Lingo/`
- `mvn clean compile eclipse:clean eclipse:eclipse`

### To create an executable jar file:
- Click ´Project´ menu item
- Choose ´Clean...´
- Select ´Lingo´ and press ´Clean´
- Right click on Lingo project
- Choose ´Maven´ -> ´Update Project...´
- Right click on Lingo project
- Choose ´Run As´ -> ´Maven build...´
- In the popup window
  - Provide Goal ´mvn clean install´
  - Select checkbox for ´Skip Tests´
  - Click ´Apply´ and ´Run´

#### Error solution

In case of getting Maven issues:
- delete ´.m2/repository´ folder in File Manager

In case of Maven options not being found in Eclipse:
- Right click on Lingo project
- Choose ´Configure´ -> ´Convert to Maven project´

### To run the executable jar file using command line:
- `cd workspace/Lingo/target`
- `java -jar Lingo-0.0.1-SNAPSHOT.jar`
- Ctrl+C to stop the web app
