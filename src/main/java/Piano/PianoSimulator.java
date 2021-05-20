package Piano;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class PianoSimulator extends JPanel {

    JFrame frame;
    JPanel radar;
    JLabel header;
    JLabel background;
    static JButton[] buttons = new JButton[25];
    List<String> buttonNames = Arrays.asList("C1", "C11", "D1", "D11", "E1", "F1", "F11", "G1", "G11", "A1", "A11", "B1", "C2", "C22", "D2", "D22", "E2", "F2", "F22", "G2", "G22", "A2", "A22", "B2", "C3");
    String absName = "/backgroundImage.png";
    InputStream s = this.getClass().getResourceAsStream(absName);
    Keyboard keyboard;

    public PianoSimulator() {
        frame = new JFrame("Piano Simulator");
        frame.setSize(1200, 500);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        header = new JLabel("Press any key, press ENTER to reset colors", SwingConstants.CENTER);
        header.setFont(header.getFont().deriveFont(30.0f));
        frame.add(header, BorderLayout.NORTH);

        for(int i = 0; i < buttons.length; i++) {
            String name = buttonNames.get(i);
            buttons[i] = new JButton(name);
        }
        radar = new JPanel();
        radar.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        buttons[0].setPreferredSize(new Dimension(55, 40));
        buttons[1].setPreferredSize(new Dimension(45, 40));
        buttons[2].setPreferredSize(new Dimension(38, 40));
        buttons[3].setPreferredSize(new Dimension(45, 40));
        buttons[4].setPreferredSize(new Dimension(56, 40));
        buttons[5].setPreferredSize(new Dimension(56, 40));
        buttons[6].setPreferredSize(new Dimension(45, 40));
        buttons[7].setPreferredSize(new Dimension(38, 40));
        buttons[8].setPreferredSize(new Dimension(45, 40));
        buttons[9].setPreferredSize(new Dimension(38, 40));
        buttons[10].setPreferredSize(new Dimension(45, 40));
        buttons[11].setPreferredSize(new Dimension(55, 40));
        buttons[12].setPreferredSize(new Dimension(55, 40));
        buttons[13].setPreferredSize(new Dimension(45, 40));
        buttons[14].setPreferredSize(new Dimension(38, 40));
        buttons[15].setPreferredSize(new Dimension(45, 40));
        buttons[16].setPreferredSize(new Dimension(55, 40));
        buttons[17].setPreferredSize(new Dimension(55, 40));
        buttons[18].setPreferredSize(new Dimension(45, 40));
        buttons[19].setPreferredSize(new Dimension(38, 40));
        buttons[20].setPreferredSize(new Dimension(45, 40));
        buttons[21].setPreferredSize(new Dimension(38, 40));
        buttons[22].setPreferredSize(new Dimension(45, 40));
        buttons[23].setPreferredSize(new Dimension(55, 40));
        buttons[24].setPreferredSize(new Dimension(80, 40));
        for(int i = 0; i < buttons.length; i++) {
            buttons[i].setFocusable(false);
            c.gridx = i;
            c.gridy = 0;
            radar.add(buttons[i], c);
        }
        frame.add(radar, BorderLayout.CENTER);

        background = new JLabel();
        ImageIcon back = null;
        try {
            back = new ImageIcon(ImageIO.read(s));
        } catch (IOException e) {
            e.printStackTrace();
        }
        background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
        frame.add(background, BorderLayout.SOUTH);
        
        keyboard = new Keyboard();
        frame.addKeyListener(keyboard);
        frame.setFocusable(true);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        PianoSimulator test = new PianoSimulator();
    }
}
