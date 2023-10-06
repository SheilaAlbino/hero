import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.input.KeyStroke;

import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Game {
    private final TerminalScreen screen;
    private final Arena arena;

    public Game(int width, int height) throws IOException {
        Terminal terminal = new DefaultTerminalFactory().setInitialTerminalSize(new TerminalSize(width, height)).createTerminal();
        screen = new TerminalScreen(terminal);

        screen.setCursorPosition(null);
        screen.startScreen();
        screen.doResizeIfNecessary();

        arena = new Arena(width, height);
    }

    private void processKey(KeyStroke key) {
        arena.processKey(key);
    }

    private void draw() throws IOException {
        screen.clear();
        arena.draw(screen.newtextGraphics());
        hero.draw(textGraphics);
        screen.refresh();
    }

    public void run() throws IOException {
        while (true) {
            draw();
            KeyStroke key = screen.readInput();
            if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'q')
                screen.close();
            if (key.getKeyType() == KeyType.EOF)
                break;
            processKey(Key);
        }

    }


}