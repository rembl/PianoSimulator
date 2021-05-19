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
            musicPathName = "/29.wav";
            PLay(musicPathName, C1);
        }

        if(keyCode == KeyEvent.VK_W) {
            musicPathName = "/30.wav";
            PLay(musicPathName, C11);

        }

        if(keyCode == KeyEvent.VK_X) {
            musicPathName = "/31.wav";
            PLay(musicPathName, D1);
        }

        if(keyCode == KeyEvent.VK_E) {
            musicPathName = "/32.wav";
            PLay(musicPathName, D11);
        }

        if(keyCode == KeyEvent.VK_C) {
            musicPathName = "/33.wav";
            PLay(musicPathName, E1);
        }

        if(keyCode == KeyEvent.VK_S) {
            musicPathName = "/34.wav";
            PLay(musicPathName, F1);
        }

        if(keyCode == KeyEvent.VK_R) {
            musicPathName = "/35.wav";
            PLay(musicPathName, F11);

        }

        if(keyCode == KeyEvent.VK_D) {
            musicPathName = "/36.wav";
            PLay(musicPathName, G1);
        }

        if(keyCode == KeyEvent.VK_T) {
            musicPathName = "/37.wav";
            PLay(musicPathName, G11);
        }

        if(keyCode == KeyEvent.VK_F) {
            musicPathName = "/38.wav";
            PLay(musicPathName, A1);
        }

        if(keyCode == KeyEvent.VK_Y) {
            musicPathName = "/39.wav";
            PLay(musicPathName, A11);
        }

        if(keyCode == KeyEvent.VK_G) {
            musicPathName = "/40.wav";
            PLay(musicPathName, B1);
        }

        if(keyCode == KeyEvent.VK_H) {
            musicPathName = "/41.wav";
            PLay(musicPathName, C2);
        }

        if(keyCode == KeyEvent.VK_U) {
            musicPathName = "/42.wav";
            PLay(musicPathName, C22);
        }

        if(keyCode == KeyEvent.VK_J) {
            musicPathName = "/43.wav";
            PLay(musicPathName, D2);
        }

        if(keyCode == KeyEvent.VK_I) {
            musicPathName = "/44.wav";
            PLay(musicPathName, D22);
        }

        if(keyCode == KeyEvent.VK_K) {
            musicPathName = "/45.wav";
            PLay(musicPathName, E2);
        }

        if(keyCode == KeyEvent.VK_L) {
            musicPathName = "/46.wav";
            PLay(musicPathName, F2);
        }

        if(keyCode == KeyEvent.VK_O) {
            musicPathName = "/47.wav";
            PLay(musicPathName, F22);
        }

        if(keyCode == 59) {
            musicPathName = "/48.wav";
            PLay(musicPathName, G2);
        }

        if(keyCode == KeyEvent.VK_P) {
            musicPathName = "/49.wav";
            PLay(musicPathName, G22);
        }

        if(keyCode == KeyEvent.VK_M) {
            musicPathName = "/50.wav";
            PLay(musicPathName, A2);
        }

        if(keyCode == 91) {
            musicPathName = "/51.wav";
            PLay(musicPathName, A22);
        }

        if(keyCode == KeyEvent.VK_COMMA) {
            musicPathName = "/52.wav";
            PLay(musicPathName, B2);
        }

        if(keyCode == 46) {
            musicPathName = "/53.wav";
            PLay(musicPathName, C3);
        }

    }

    public void PLay(String musicPathName, JButton button) {
        Color old = button.getForeground();
        while(button.getForeground() == Color.BLACK || button.getForeground() == old) {
            Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
            button.setForeground(color);
        }
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
