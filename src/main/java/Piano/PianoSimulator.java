package Piano;

import javax.swing.*;
import java.awt.*;

public class PianoSimulator{

    JFrame frame;
    JLabel header;
    JLabel background;
    ImageIcon back = new ImageIcon("src/main/resources/backgroundImage.png");


    public PianoSimulator() {
        frame = new JFrame("Piano Simulator");
        frame.setSize(1200, 465);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setFocusable(true);

        header = new JLabel("Press any key", SwingConstants.CENTER);
        header.setFont(header.getFont().deriveFont(35.0f));
        frame.add(header, BorderLayout.NORTH);

        background = new JLabel();
        background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
        frame.add(background, BorderLayout.SOUTH);

        Keyboard.Keys(frame, header, background);

        frame.setVisible(true);

    }


    public static void main(String[] args) {
        PianoSimulator test = new PianoSimulator();
    }
}
