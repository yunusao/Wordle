public class WordleModel {
        private String wordToGuess;
        private int maxGuesses = 5;
        private int currentGuessCount = 0;

        public WordleModel(String wordToGuess) {
            this.wordToGuess = wordToGuess.toLowerCase();
        }

        public String getWordToGuess() {
            return wordToGuess;
        }

        public String evaluateGuess(String guess) {
            guess = guess.toLowerCase();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < guess.length(); i++) {
                if (guess.charAt(i) == wordToGuess.charAt(i)) {
                    result.append("G"); // Correct letter and position
                } else if (wordToGuess.contains(String.valueOf(guess.charAt(i)))) {
                    result.append("Y"); // Correct letter, wrong position
                } else {
                    result.append("X"); // Incorrect letter
                }
            }
            currentGuessCount++;
            return result.toString();
        }

        public int getCurrentGuessCount(){
            return currentGuessCount;
        }
        public boolean isGameOver() {
            return currentGuessCount >= maxGuesses;
        }

        public boolean isWordGuessed(String guess) {
            return guess.equalsIgnoreCase(wordToGuess);
        }
    }
