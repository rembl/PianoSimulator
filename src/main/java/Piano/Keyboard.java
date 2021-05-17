package Piano;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Random;

import static Piano.PianoSimulator.*;

public class Keyboard implements KeyListener {

    final Random r = new Random();

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {

        int keyCode = e.getKeyCode();
        String musicPathName;

        if(keyCode == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }

        if(keyCode == KeyEvent.VK_ENTER) {
            for (JButton button : buttons) {
                button.setForeground(Color.BLACK);
            }
        }

        if (keyCode == KeyEvent.VK_Z) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            C1.setForeground(color);
            musicPathName = "/29.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_W) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            C11.setForeground(color);
            musicPathName = "/30.wav";
            PLay(musicPathName);

        }

        if(keyCode == KeyEvent.VK_X) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            D1.setForeground(color);
            musicPathName = "/31.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_E) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            D11.setForeground(color);
            musicPathName = "/32.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_C) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            E1.setForeground(color);
            musicPathName = "/33.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_S) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            F1.setForeground(color);
            musicPathName = "/34.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_R) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            F11.setForeground(color);
            musicPathName = "/35.wav";
            PLay(musicPathName);

        }

        if(keyCode == KeyEvent.VK_D) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            G1.setForeground(color);
            musicPathName = "/36.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_T) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            G11.setForeground(color);
            musicPathName = "/37.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_F) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            A1.setForeground(color);
            musicPathName = "/38.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_Y) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            A11.setForeground(color);
            musicPathName = "/39.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_G) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            B1.setForeground(color);
            musicPathName = "/40.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_H) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            C2.setForeground(color);
            musicPathName = "/41.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_U) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            C22.setForeground(color);
            musicPathName = "/42.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_J) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            D2.setForeground(color);
            musicPathName = "/43.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_I) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            D22.setForeground(color);
            musicPathName = "/44.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_K) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            E2.setForeground(color);
            musicPathName = "/45.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_L) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            F2.setForeground(color);
            musicPathName = "/46.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_O) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            F22.setForeground(color);
            musicPathName = "/47.wav";
            PLay(musicPathName);
        }

        if(keyCode == 59) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            G2.setForeground(color);
            musicPathName = "/48.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_P) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            G22.setForeground(color);
            musicPathName = "/49.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_M) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            A2.setForeground(color);
            musicPathName = "/50.wav";
            PLay(musicPathName);
        }

        if(keyCode == 91) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            A22.setForeground(color);
            musicPathName = "/51.wav";
            PLay(musicPathName);
        }

        if(keyCode == KeyEvent.VK_COMMA) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            B2.setForeground(color);
            musicPathName = "/52.wav";
            PLay(musicPathName);
        }

        if(keyCode == 46) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            C3.setForeground(color);
            musicPathName = "/53.wav";
            PLay(musicPathName);
        }
    }

    public void PLay(String musicPathName) {
        InputStream s = this.getClass().getResourceAsStream(musicPathName);
        InputStream buffered = new BufferedInputStream(s);
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(buffered);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
