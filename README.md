# Wordle

## Overview  
This is a Java-based implementation of the popular word-guessing game, **Wordle**. Players have five attempts to guess a secret five-letter word. After each guess, feedback is provided for each letter:  
- **Green (G):** Correct letter in the correct position.  
- **Yellow (Y):** Correct letter in the wrong position.  
- **Gray (X):** Incorrect letter.  

The game features a graphical user interface (GUI) created using the Swing library.

---

## Features  
- **Interactive GUI:** Players can input guesses and view results on a 5x5 grid.  
- **Dynamic Feedback:** Buttons in the grid change color to indicate the correctness of letters.  
- **Win or Lose Messages:** Players are notified when they win or lose.  
- **JUnit Tests:** Unit tests validate the core game logic.  

---

## How to Play  
1. Start the game by running the `WordleGame` class.  
2. Enter a five-letter word to be guessed when prompted (this is for demo purposes).  
3. Input guesses in the text field at the bottom and press **Submit**.  
4. Check the grid for feedback:  
   - **Green button:** Correct letter in the correct position.  
   - **Yellow button:** Correct letter in the wrong position.  
   - **Gray button:** Incorrect letter.  
5. You have 5 attempts to guess the word.  

---

## Project Structure  
```
/src
├── WordleController.java  // Handles game logic and interaction between model and view
├── WordleModel.java       // Core game logic and rules
├── WordleView.java        // GUI implementation
├── WordleGame.java        // Entry point for the game
└── WordleModelTest.java   // JUnit tests for WordleModel
```

---

## Dependencies  
- **Java SE 8 or higher**  
- **JUnit 4 (for testing)**  

---

## Installation and Execution  

1. **Clone the Repository:**  
   ```bash
   git clone https://github.com/your-repo/wordle-game.git
   cd wordle-game
   ```

2. **Compile the Code:**  
   ```bash
   javac -d bin src/*.java
   ```

3. **Run the Game:**  
   ```bash
   java -cp bin WordleGame
   ```

4. **Run Unit Tests (Optional):**  
   ```bash
   java -cp bin:junit-4.12.jar org.junit.runner.JUnitCore WordleModelTest
   ```

---

## Future Improvements  
- Allow the computer to randomly generate the word to be guessed.  
- Add difficulty levels with varying word lengths.  
- Improve UI design and responsiveness.  
- Save game progress and results.  

---
