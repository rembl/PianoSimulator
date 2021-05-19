package Piano;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class PianoSimulator extends JPanel {

    static JFrame frame;
    static JPanel radar;
    static JLabel header;
    static JLabel background;
    static JButton C1 = new JButton("C1");
    static JButton C11 = new JButton("C#1");
    static JButton D1 = new JButton("D1");
    static JButton D11 = new JButton("D#1");
    static JButton E1 = new JButton("E1");
    static JButton F1 = new JButton("F1");
    static JButton F11 = new JButton("F#1");
    static JButton G1 = new JButton("G1");
    static JButton G11 = new JButton("G#1");
    static JButton A1 = new JButton("A1");
    static JButton A11 = new JButton("A#1");
    static JButton B1 = new JButton("B1");
    static JButton C2 = new JButton("C2");
    static JButton C22 = new JButton("C#2");
    static JButton D2 = new JButton("D2");
    static JButton D22 = new JButton("D#2");
    static JButton E2 = new JButton("E2");
    static JButton F2 = new JButton("F2");
    static JButton F22 = new JButton("F#2");
    static JButton G2 = new JButton("G2");
    static JButton G22 = new JButton("G#2");
    static JButton A2 = new JButton("A2");
    static JButton A22 = new JButton("A#2");
    static JButton B2 = new JButton("B2");
    static JButton C3 = new JButton("C3");
    static List<JButton> buttons;
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

        buttons = Arrays.asList(C1, C11, D1, D11, E1, F1, F11, G1, G11, A1, A11, B1, C2, C22, D2, D22, E2, F2, F22, G2, G22, A2, A22, B2, C3);
        for(JButton button : buttons) {
            button.setFocusable(false);
        }
        radar = new JPanel();
        radar.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        C1.setPreferredSize(new Dimension(55, 40));
        c.gridx = 0;
        c.gridy = 0;
        radar.add(C1, c);
        C11.setPreferredSize(new Dimension(45, 40));
        c.gridx = 1;
        c.gridy = 0;
        radar.add(C11, c);
        D1.setPreferredSize(new Dimension(38, 40));
        c.gridx = 2;
        c.gridy = 0;
        radar.add(D1, c);
        D11.setPreferredSize(new Dimension(45, 40));
        c.gridx = 3;
        c.gridy = 0;
        radar.add(D11, c);
        E1.setPreferredSize(new Dimension(55, 40));
        c.gridx = 4;
        c.gridy = 0;
        radar.add(E1, c);
        F1.setPreferredSize(new Dimension(55, 40));
        c.gridx = 5;
        c.gridy = 0;
        radar.add(F1, c);
        F11.setPreferredSize(new Dimension(45, 40));
        c.gridx = 6;
        c.gridy = 0;
        radar.add(F11, c);
        G1.setPreferredSize(new Dimension(38, 40));
        c.gridx = 7;
        c.gridy = 0;
        radar.add(G1, c);
        G11.setPreferredSize(new Dimension(45, 40));
        c.gridx = 8;
        c.gridy = 0;
        radar.add(G11, c);
        A1.setPreferredSize(new Dimension(38, 40));
        c.gridx = 9;
        c.gridy = 0;
        radar.add(A1, c);
        A11.setPreferredSize(new Dimension(45, 40));
        c.gridx = 10;
        c.gridy = 0;
        radar.add(A11, c);
        B1.setPreferredSize(new Dimension(55, 40));
        c.gridx = 11;
        c.gridy = 0;
        radar.add(B1, c);
        C2.setPreferredSize(new Dimension(55, 40));
        c.gridx = 12;
        c.gridy = 0;
        radar.add(C2, c);
        C22.setPreferredSize(new Dimension(45, 40));
        c.gridx = 13;
        c.gridy = 0;
        radar.add(C22, c);
        D2.setPreferredSize(new Dimension(38, 40));
        c.gridx = 14;
        c.gridy = 0;
        radar.add(D2, c);
        D22.setPreferredSize(new Dimension(45, 40));
        c.gridx = 15;
        c.gridy = 0;
        radar.add(D22, c);
        E2.setPreferredSize(new Dimension(55, 40));
        c.gridx = 16;
        c.gridy = 0;
        radar.add(E2, c);
        F2.setPreferredSize(new Dimension(55, 40));
        c.gridx = 17;
        c.gridy = 0;
        radar.add(F2, c);
        F22.setPreferredSize(new Dimension(45, 40));
        c.gridx = 18;
        c.gridy = 0;
        radar.add(F22, c);
        G2.setPreferredSize(new Dimension(38, 40));
        c.gridx = 19;
        c.gridy = 0;
        radar.add(G2, c);
        G22.setPreferredSize(new Dimension(45, 40));
        c.gridx = 20;
        c.gridy = 0;
        radar.add(G22, c);
        A2.setPreferredSize(new Dimension(38, 40));
        c.gridx = 21;
        c.gridy = 0;
        radar.add(A2, c);
        A22.setPreferredSize(new Dimension(45, 40));
        c.gridx = 22;
        c.gridy = 0;
        radar.add(A22, c);
        B2.setPreferredSize(new Dimension(55, 40));
        c.gridx = 23;
        c.gridy = 0;
        radar.add(B2, c);
        C3.setPreferredSize(new Dimension(80, 40));
        c.gridx = 24;
        c.gridy = 0;
        radar.add(C3, c);
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
