import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alternative implements ActionListener {

    JFrame frame;
    JTextField textfield;
    JButton[] buttons = new JButton[19];
    String[] labels = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", ".", "=", "/", "C",
            "D", "ne" };
    double num1, num2, result;
    char operator;
    boolean hasOperation; // indicates if there is a pending operation

    Alternative() {
        frame = new JFrame("Huna Bopa'r ning a Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(520, 600);
        frame.getContentPane().setBackground(Color.pink); // Set window background color
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 400, 50);
        textfield.setFont(new Font("Ink Free", Font.BOLD, 30));
        textfield.setEditable(false);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(labels[i]);
            buttons[i].addActionListener(this);
            buttons[i].setFont(new Font("Ink Free", Font.BOLD, 30));
            buttons[i].setFocusable(false);
        }

        JPanel panel = new JPanel();
        panel.setBounds(50, 100, 300, 400);
        panel.setLayout(new GridLayout(5, 4, 10, 10));
        panel.setBackground(Color.DARK_GRAY);

        for (int i = 0; i < buttons.length; i++) {
            panel.add(buttons[i]);
        }

        frame.add(panel);
        frame.add(textfield);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Alternative();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String text = textfield.getText();

            for (JButton button : buttons) {
                if (e.getSource() == button) {
                    switch (button.getText()) {
                        case "C":
                            textfield.setText("");
                            num1 = 0;
                            num2 = 0;
                            result = 0;
                            operator = ' ';
                            hasOperation = false;
                            break;
                        case "D":
                            textfield.setText(text.substring(0, text.length() - 1));
                            break;
                        case "ne":
                            double temp = Double.parseDouble(textfield.getText());
                            temp *= -1;
                            textfield.setText(String.valueOf(temp));
                            break;
                        case "=":
                            num2 = Double.parseDouble(textfield.getText());

                            switch (operator) {
                                case '+':
                                    result = num1 + num2;
                                    break;
                                case '-':
                                    result = num1 - num2;
                                    break;
                                case '*':
                                    result = num1 * num2;
                                    break;
                                case '/':
                                    result = num1 / num2;
                                    break;
                                default:
                                    break;
                            }
                            textfield.setText(String.valueOf(result));
                            num1 = result;
                            hasOperation = false;
                            break;
                        case ".":
                            if (!text.contains(".")) {
                                textfield.setText(text + button.getText());
                            }
                            break;
                        default:
                            if (button.getText().matches("[+-/*]")) {
                                if (hasOperation) {
                                    num2 = Double.parseDouble(textfield.getText());
                                    switch (operator) {
                                        case '+':
                                            result = num1 + num2;
                                            break;
                                        case '-':
                                            result = num1 - num2;
                                            break;
                                        case '*':
                                            result = num1 * num2;
                                            break;
                                        case '/':
                                            result = num1 / num2;
                                            break;
                                        default:
                                            break;
                                    }
                                    textfield.setText(String.valueOf(result));
                                    num1 = result;
                                } else {
                                    num1 = Double.parseDouble(textfield.getText());
                                }
                                operator = button.getText().charAt(0);
                                hasOperation = true;
                                textfield.setText("");
                            } else {
                                textfield.setText(text + button.getText());
                            }
                            break;
                    }
                }
            }
        } catch (Exception exception) {
            textfield.setText(exception.getMessage());
        }
    }
} // shortened improved version within 150 lines of code
