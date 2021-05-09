package Piano;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

public class Keyboard {

    public static void Keys(JFrame frame, JLabel header, JLabel background){

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {

                String pathName;
                int keyCode = e.getKeyCode();

                if(keyCode == KeyEvent.VK_ESCAPE) {
                    System.exit(0);
                }

                if(keyCode == KeyEvent.VK_ENTER) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImage.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Press any key, press ENTER to reset");
                }

                if(keyCode == KeyEvent.VK_Z) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageC1.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: C1");
                    pathName = "src/main/resources/29.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_W) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageC#1.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: C#1");
                    pathName = "src/main/resources/30.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_X) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageD1.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: D1");
                    pathName = "src/main/resources/31.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_E) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageD#1.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: D#1");
                    pathName = "src/main/resources/32.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_C) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageE1.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: E1");
                    pathName = "src/main/resources/33.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_S) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageF1.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: F1");
                    pathName = "src/main/resources/34.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_R) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageF#1.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: F#1");
                    pathName = "src/main/resources/35.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_D) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageG1.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: G1");
                    pathName = "src/main/resources/36.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_T) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageG#1.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: G#1");
                    pathName = "src/main/resources/37.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_F) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageA1.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: A1");
                    pathName = "src/main/resources/38.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_Y) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageA#1.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: A#1");
                    pathName = "src/main/resources/39.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_G) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageB1.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: B1");
                    pathName = "src/main/resources/40.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_H) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageC2.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: C2");
                    pathName = "src/main/resources/41.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_U) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageC#2.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: C#2");
                    pathName = "src/main/resources/42.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_J) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageD2.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: D2");
                    pathName = "src/main/resources/43.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_I) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageD#2.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: D#2");
                    pathName = "src/main/resources/44.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_K) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageE2.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: E2");
                    pathName = "src/main/resources/45.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_L) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageF2.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: F2");
                    pathName = "src/main/resources/46.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_O) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageF#2.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: F#2");
                    pathName = "src/main/resources/47.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == 59) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageG2.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: G2");
                    pathName = "src/main/resources/48.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_P) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageG#2.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: G#2");
                    pathName = "src/main/resources/49.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_M) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageA2.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: A2");
                    pathName = "src/main/resources/50.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == 91) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageA#2.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: A#2");
                    pathName = "src/main/resources/51.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == KeyEvent.VK_COMMA) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageB2.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: B2");
                    pathName = "src/main/resources/52.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                if(keyCode == 46) {
                    ImageIcon back = new ImageIcon("src/main/resources/backgroundImageC3.png");
                    background.setIcon(new ImageIcon(back.getImage().getScaledInstance(1200, 400, Image.SCALE_SMOOTH)));
                    header.setText("Key pressed: C3");
                    pathName = "src/main/resources/53.wav";
                    try {
                        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(pathName));
                        Clip clip = AudioSystem.getClip();
                        clip.stop();
                        clip.open(audioInputStream);
                        clip.start();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }
}
