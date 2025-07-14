
import javax.swing.*;
import java.awt.*;

// ------------ VISÃO (Painel) -----------------
class GamePanel extends JPanel {
    private final Snake snake;
    private final Food food;

    GamePanel(Snake snake, Food food) {
        this.snake = snake;
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        snake.draw((Graphics2D) g);   // delega o desenho à cobra
    }
}
