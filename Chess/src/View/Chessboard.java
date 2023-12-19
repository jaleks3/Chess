package View;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Chessboard extends JFrame {

    public Chessboard(String fen) {
        setTitle("Chessboard with Icons");
        setSize(480, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel chessboardPanel = new ChessboardPanel();
        add(chessboardPanel);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class ChessboardPanel extends JPanel {
    private static final int SIZE = 8;
    private static final int SQUARE_SIZE = 60;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                Color color = (i + j) % 2 == 0 ? Color.WHITE : Color.BLACK;
                g.setColor(color);
                g.fillRect(j * SQUARE_SIZE, i * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);

            }
        }
    }
}
