import javax.swing.JOptionPane;
public class WordleGame {
    public static void main(String[] args) {
        String wordToGuess = JOptionPane.showInputDialog("Enter the word to be guessed:");
        WordleModel model = new WordleModel(wordToGuess);
        WordleView view = new WordleView();
        WordleController controller = new WordleController(model, view);

        view.setVisible(true);
    }
}
