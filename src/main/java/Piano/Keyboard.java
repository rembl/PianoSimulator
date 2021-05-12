package Piano;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import static Piano.PianoSimulator.background;
import static Piano.PianoSimulator.header;

public class Keyboard implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int keyCode = e.getKeyCode();
        String musicPathName;
        String picPathName;
        String text;

        if(keyCode == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }

        if(keyCode == KeyEvent.VK_ENTER) {
            ImageIcon back = new ImageIcon("src/main/resources/backgroundImage.png");
            background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
            header.setText("Press any key, press ENTER to reset");
        }

        if (keyCode == KeyEvent.VK_Z) {
            musicPathName = "src/main/resources/29.wav";
            picPathName = "src/main/resources/backgroundImageC1.png";
            text = "Key pressed: C1";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_W) {
            musicPathName = "src/main/resources/30.wav";
            picPathName = "src/main/resources/backgroundImageC#1.png";
            text = "Key pressed: C#1";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_X) {
            musicPathName = "src/main/resources/31.wav";
            picPathName = "src/main/resources/backgroundImageD1.png";
            text = "Key pressed: D1";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_E) {
            musicPathName = "src/main/resources/32.wav";
            picPathName = "src/main/resources/backgroundImageD#1.png";
            text = "Key pressed: D#1";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_C) {
            musicPathName = "src/main/resources/33.wav";
            picPathName = "src/main/resources/backgroundImageE1.png";
            text = "Key pressed: E1";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_S) {
            musicPathName = "src/main/resources/34.wav";
            picPathName = "src/main/resources/backgroundImageF1.png";
            text = "Key pressed: F1";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_R) {
            musicPathName = "src/main/resources/35.wav";
            picPathName = "src/main/resources/backgroundImageF#1.png";
            text = "Key pressed: F#1";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_D) {
            musicPathName = "src/main/resources/36.wav";
            picPathName = "src/main/resources/backgroundImageG1.png";
            text = "Key pressed: G1";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_T) {
            musicPathName = "src/main/resources/37.wav";
            picPathName = "src/main/resources/backgroundImageG#1.png";
            text = "Key pressed: G#1";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_F) {
            musicPathName = "src/main/resources/38.wav";
            picPathName = "src/main/resources/backgroundImageA1.png";
            text = "Key pressed: A1";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_Y) {
            musicPathName = "src/main/resources/39.wav";
            picPathName = "src/main/resources/backgroundImageA#1.png";
            text = "Key pressed: A#1";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_G) {
            musicPathName = "src/main/resources/40.wav";
            picPathName = "src/main/resources/backgroundImageB1.png";
            text = "Key pressed: B1";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_H) {
            musicPathName = "src/main/resources/41.wav";
            picPathName = "src/main/resources/backgroundImageC2.png";
            text = "Key pressed: C2";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_U) {
            musicPathName = "src/main/resources/42.wav";
            picPathName = "src/main/resources/backgroundImageC#2.png";
            text = "Key pressed: C#2";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_J) {
            musicPathName = "src/main/resources/43.wav";
            picPathName = "src/main/resources/backgroundImageD2.png";
            text = "Key pressed: D2";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_I) {
            musicPathName = "src/main/resources/44.wav";
            picPathName = "src/main/resources/backgroundImageD#2.png";
            text = "Key pressed: D#2";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_K) {
            musicPathName = "src/main/resources/45.wav";
            picPathName = "src/main/resources/backgroundImageE2.png";
            text = "Key pressed: E2";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_L) {
            musicPathName = "src/main/resources/46.wav";
            picPathName = "src/main/resources/backgroundImageF2.png";
            text = "Key pressed: F2";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_O) {
            musicPathName = "src/main/resources/47.wav";
            picPathName = "src/main/resources/backgroundImageF#2.png";
            text = "Key pressed: F#2";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == 59) {
            musicPathName = "src/main/resources/48.wav";
            picPathName = "src/main/resources/backgroundImageG2.png";
            text = "Key pressed: G2";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_P) {
            musicPathName = "src/main/resources/49.wav";
            picPathName = "src/main/resources/backgroundImageG#2.png";
            text = "Key pressed: G#2";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_M) {
            musicPathName = "src/main/resources/50.wav";
            picPathName = "src/main/resources/backgroundImageA2.png";
            text = "Key pressed: A2";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == 91) {
            musicPathName = "src/main/resources/51.wav";
            picPathName = "src/main/resources/backgroundImageA#2.png";
            text = "Key pressed: A#2";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == KeyEvent.VK_COMMA) {
            musicPathName = "src/main/resources/52.wav";
            picPathName = "src/main/resources/backgroundImageB2.png";
            text = "Key pressed: B2";
            PLay(musicPathName, picPathName, text);
        }

        if(keyCode == 46) {
            musicPathName = "src/main/resources/53.wav";
            picPathName = "src/main/resources/backgroundImageC3.png";
            text = "Key pressed: C3";
            PLay(musicPathName, picPathName, text);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public void PLay(String musicPathName, String picPathName, String text) {
        ImageIcon back = new ImageIcon(picPathName);
        background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
        header.setText(text);
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(musicPathName));
            Clip clip = AudioSystem.getClip();
            clip.stop();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
