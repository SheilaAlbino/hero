import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        try {
            new Game(width: 60, height: 30).run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
