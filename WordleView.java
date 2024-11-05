import javax.swing.*;
import java.awt.*;
public class WordleView extends JFrame {

    private JButton[][] gridButtons;
    private JTextField guessField;
    private JButton submitButton;

    public WordleView() {
        setTitle("Wordle Game");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel gridPanel = new JPanel(new GridLayout(5, 5));
        gridButtons = new JButton[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                gridButtons[i][j] = new JButton();
                gridPanel.add(gridButtons[i][j]);
            }
        }
        add(gridPanel, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new BorderLayout());
        guessField = new JTextField();
        submitButton = new JButton("Submit");
        inputPanel.add(guessField, BorderLayout.CENTER);
        inputPanel.add(submitButton, BorderLayout.EAST);
        add(inputPanel, BorderLayout.SOUTH);
    }

    public JButton[][] getGridButtons() {
        return gridButtons;
    }

    public JTextField getGuessField() {
        return guessField;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }
}
