package Piano;

import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardTest {


    @Test
    void ButtonTest1() {
        Keyboard keyboard = new Keyboard();
        JButton button1 = new JButton("1");
        button1.setForeground(Color.BLACK);
        keyboard.PLay("/a.awt", button1);

        assertNotSame(button1.getForeground(), Color.BLACK);
    }

    @Test
    void ButtonTest2() {
        Keyboard keyboard = new Keyboard();
        JButton button2 = new JButton("2");
        Random r = new Random();
        Color color = new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
        button2.setForeground(color);
        keyboard.PLay("/a.awt", button2);

        assertNotSame(button2.getForeground(), Color.BLACK);
        assertNotSame(button2.getForeground(), color);

    }

    @Test
    void ExceptionTest1() {

        Keyboard keyboard = new Keyboard();
        JButton button = new JButton("oops");
        String wrongName = "/no.awt";
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(b);
        PrintStream old = System.out;
        System.setOut(ps);
        keyboard.PLay(wrongName, button);
        System.out.flush();
        System.setOut(old);

        assertEquals("Stream closed\n", b.toString());
    }

    @Test
    void ExceptionTest2() {

        Keyboard keyboard = new Keyboard();
        JButton button = new JButton("oops");
        String wrongName = "";
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(b);
        PrintStream old = System.out;
        System.setOut(ps);
        keyboard.PLay(wrongName, button);
        System.out.flush();
        System.setOut(old);

        assertEquals("Stream of unsupported format\n", b.toString());
    }
}