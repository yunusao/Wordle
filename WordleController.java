import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class WordleController {
    private WordleModel model;
    private WordleView view;

    public WordleController(WordleModel model, WordleView view) {
        this.model = model;
        this.view = view;

        view.getSubmitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleGuess();
            }
        });
        view.getGuessField().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleGuess();
            }
        });
    }

    private void handleGuess() {
        String guess = view.getGuessField().getText();
        String result = model.evaluateGuess(guess);

        for (int i = 0; i < guess.length(); i++) {
            JButton button = view.getGridButtons()[model.getCurrentGuessCount() - 1][i];
            button.setText(String.valueOf(guess.charAt(i)));
            if (result.charAt(i) == 'G') {
                button.setBackground(Color.GREEN);
            } else if (result.charAt(i) == 'Y') {
                button.setBackground(Color.YELLOW);
            } else {
                button.setBackground(Color.GRAY);
            }
        }

        if (model.isWordGuessed(guess)) {
            JOptionPane.showMessageDialog(view, "Congrats, you won!", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (model.isGameOver()) {
            JOptionPane.showMessageDialog(view, "Boo, you lost!", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
