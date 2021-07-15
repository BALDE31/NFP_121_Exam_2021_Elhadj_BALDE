import javax.swing.*;
import java.awt.*;

public class CliFrame {

    public void IHM_CLI() {
        JFrame frame = new JFrame("IHM pour CLI");
        frame.setLayout(new BorderLayout());

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);



        JButton emptyModeButton = new JButton("Creuse (C)");
        JButton fullModeButton = new JButton("Pleine (P)");

        JPanel buttons = new JPanel();

        buttons.add(emptyModeButton);
        buttons.add(fullModeButton);

        frame.add(buttons, BorderLayout.NORTH);

        JLabel indexLabel = new JLabel("Valeur de l'indice (K)");
        JTextField indexField = new JTextField();

        JPanel options = new JPanel();
        options.setLayout(new GridLayout(3,3));
        options.add(indexLabel);
        options.add(indexField);


        JButton indexButton = new JButton("+");
        JLabel alphaLabel = new JLabel("Valeur de alpha (A)");
        JTextField alphaField = new JTextField();
        JButton alphaButton = new JButton("+");
        JLabel epsilonLabel = new JLabel("Valeur de epsilon (E)");
        JTextField epsilonField = new JTextField();
        JButton epsilonButton = new JButton("+");
        JTextArea command = new JTextArea();


        options.add(indexButton);
        options.add(alphaLabel);
        options.add(alphaField);
        options.add(alphaButton);
        options.add(epsilonLabel);
        options.add(epsilonField);
        options.add(epsilonButton);

        frame.add(options, BorderLayout.CENTER);

        command.setEditable(false);
        frame.add(command, BorderLayout.SOUTH);

        // Action Listeners
        emptyModeButton.addActionListener(e -> command.append("-C "));

        fullModeButton.addActionListener(e -> command.append("-P "));

        indexButton.addActionListener(e -> command.append("-K " + indexField.getText() + " "));

        alphaButton.addActionListener(e -> command.append("-A " + alphaField.getText() + " "));

        epsilonButton.addActionListener(e -> command.append("-E " + epsilonField.getText() + " "));

    }

    public static void main(String[] args) {
        CliFrame cliFrame = new CliFrame();
    }
}
