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
import java.util.stream.Stream;

import static Piano.PianoSimulator.buttons;


public class Keyboard implements KeyListener {

    final Random r = new Random();
    Boolean[] keysPressed = Stream.of(new Boolean[25]).map(i -> false).toArray(Boolean[]::new);

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {

        int keyCode = e.getKeyCode();

        if(keyCode == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }

        if(keyCode == KeyEvent.VK_ENTER) {
            for (JButton button : buttons) {
                button.setForeground(Color.BLACK);
            }
        }

        if (keyCode == KeyEvent.VK_Z) {
            if(!keysPressed[0]) {
                PLay("/29.wav", buttons[0]);
                keysPressed[0] = true;
            }
        }

        if(keyCode == KeyEvent.VK_W) {
            if(!keysPressed[1]) {
                PLay("/30.wav", buttons[1]);
                keysPressed[1] = true;
            }
        }

        if(keyCode == KeyEvent.VK_X) {
            if(!keysPressed[2]) {
                PLay("/31.wav", buttons[2]);
                keysPressed[2] = true;
            }
        }

        if(keyCode == KeyEvent.VK_E) {
            if(!keysPressed[3]) {
                PLay("/32.wav", buttons[3]);
                keysPressed[3] = true;
            }
        }

        if(keyCode == KeyEvent.VK_C) {
            if(!keysPressed[4]) {
                PLay("/33.wav", buttons[4]);
                keysPressed[4] = true;
            }
        }

        if(keyCode == KeyEvent.VK_S) {
            if(!keysPressed[5]) {
                PLay("/34.wav", buttons[5]);
                keysPressed[5] = true;
            }
        }

        if(keyCode == KeyEvent.VK_R) {
            if(!keysPressed[6]) {
                PLay("/35.wav", buttons[6]);
                keysPressed[6] = true;
            }
        }

        if(keyCode == KeyEvent.VK_D) {
            if(!keysPressed[7]) {
                PLay("/36.wav", buttons[7]);
                keysPressed[7] = true;
            }
        }

        if(keyCode == KeyEvent.VK_T) {
            if(!keysPressed[8]) {
                PLay("/37.wav", buttons[8]);
                keysPressed[8] = true;
            }
        }

        if(keyCode == KeyEvent.VK_F) {
            if(!keysPressed[9]) {
                PLay("/38.wav", buttons[9]);
                keysPressed[9] = true;
            }
        }

        if(keyCode == KeyEvent.VK_Y) {
            if(!keysPressed[10]) {
                PLay("/39.wav", buttons[10]);
                keysPressed[10] = true;
            }
        }

        if(keyCode == KeyEvent.VK_G) {
            if(!keysPressed[11]) {
                PLay("/40.wav", buttons[11]);
                keysPressed[11] = true;
            }
        }

        if(keyCode == KeyEvent.VK_H) {
            if(!keysPressed[12]) {
                PLay("/41.wav", buttons[12]);
                keysPressed[12] = true;
            }
        }

        if(keyCode == KeyEvent.VK_U) {
            if(!keysPressed[13]) {
                PLay("/42.wav", buttons[13]);
                keysPressed[13] = true;
            }
        }

        if(keyCode == KeyEvent.VK_J) {
            if(!keysPressed[14]) {
                PLay("/43.wav", buttons[14]);
                keysPressed[14] = true;
            }
        }

        if(keyCode == KeyEvent.VK_I) {
            if(!keysPressed[15]) {
                PLay("/44.wav", buttons[15]);
                keysPressed[15] = true;
            }
        }

        if(keyCode == KeyEvent.VK_K) {
            if(!keysPressed[16]) {
                PLay("/45.wav", buttons[16]);
                keysPressed[16] = true;
            }
        }

        if(keyCode == KeyEvent.VK_L) {
            if(!keysPressed[17]) {
                PLay("/46.wav", buttons[17]);
                keysPressed[17] = true;
            }
        }

        if(keyCode == KeyEvent.VK_O) {
            if(!keysPressed[18]) {
                PLay("/47.wav", buttons[18]);
                keysPressed[18] = true;
            }
        }

        if(keyCode == 59) {
            if(!keysPressed[19]) {
                PLay("/48.wav", buttons[19]);
                keysPressed[19] = true;
            }
        }

        if(keyCode == KeyEvent.VK_P) {
            if(!keysPressed[20]) {
                PLay("/49.wav", buttons[20]);
                keysPressed[20] = true;
            }
        }

        if(keyCode == KeyEvent.VK_M) {
            if(!keysPressed[21]) {
                PLay("/50.wav", buttons[21]);
                keysPressed[21] = true;
            }
        }

        if(keyCode == 91) {
            if(!keysPressed[22]) {
                PLay("/51.wav", buttons[22]);
                keysPressed[22] = true;
            }
        }

        if(keyCode == KeyEvent.VK_COMMA) {
            if(!keysPressed[23]) {
                PLay("/52.wav", buttons[23]);
                keysPressed[23] = true;
            }
        }

        if(keyCode == 46) {
            if(!keysPressed[24]) {
                PLay("/53.wav", buttons[24]);
                keysPressed[24] = true;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_Z) {
            keysPressed[0] = false;
        }

        if(keyCode == KeyEvent.VK_W) {
            keysPressed[1] = false;
        }

        if(keyCode == KeyEvent.VK_X) {
            keysPressed[2] = false;
        }

        if(keyCode == KeyEvent.VK_E) {
            keysPressed[3] = false;
        }

        if(keyCode == KeyEvent.VK_C) {
            keysPressed[4] = false;
        }

        if(keyCode == KeyEvent.VK_S) {
            keysPressed[5] = false;
        }

        if(keyCode == KeyEvent.VK_R) {
            keysPressed[6] = false;
        }

        if(keyCode == KeyEvent.VK_D) {
            keysPressed[7] = false;
        }

        if(keyCode == KeyEvent.VK_T) {
            keysPressed[8] = false;
        }

        if(keyCode == KeyEvent.VK_F) {
            keysPressed[9] = false;
        }

        if(keyCode == KeyEvent.VK_Y) {
            keysPressed[10] = false;
        }

        if(keyCode == KeyEvent.VK_G) {
            keysPressed[11] = false;
        }

        if(keyCode == KeyEvent.VK_H) {
            keysPressed[12] = false;
        }

        if(keyCode == KeyEvent.VK_U) {
            keysPressed[13] = false;
        }

        if(keyCode == KeyEvent.VK_J) {
            keysPressed[14] = false;
        }

        if(keyCode == KeyEvent.VK_I) {
            keysPressed[15] = false;
        }

        if(keyCode == KeyEvent.VK_K) {
            keysPressed[16] = false;
        }

        if(keyCode == KeyEvent.VK_L) {
            keysPressed[17] = false;
        }

        if(keyCode == KeyEvent.VK_O) {
            keysPressed[18] = false;
        }

        if(keyCode == 59) {
            keysPressed[19] = false;
        }

        if(keyCode == KeyEvent.VK_P) {
            keysPressed[20] = false;
        }

        if(keyCode == KeyEvent.VK_M) {
            keysPressed[21] = false;
        }

        if(keyCode == 91) {
            keysPressed[22] = false;
        }

        if(keyCode == KeyEvent.VK_COMMA) {
            keysPressed[23] = false;
        }

        if(keyCode == 46) {
            keysPressed[24] = false;
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
        } catch (Exception ignored) {
            System.out.println("Wrong music path name");
        }
    }
}
