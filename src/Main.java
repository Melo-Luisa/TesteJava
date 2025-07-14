import javax.swing.*;

// ------------ CONTROLADOR / JANELA -----------------
public class Main extends JFrame {
    private final Snake snake;
    private final GamePanel panel;
    private final Food food; 

    public Main() {
        snake = new Snake(50, 50, 20);
        food = new Food(50, 100, 20); // Criando um objeto Food
        panel = new GamePanel(snake);

        setTitle("Snake Java Swing");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        add(panel);

        // Exemplo de Timer para animar a cobra a cada 100 ms
        new Timer(100, e -> {
            snake.move();
            panel.repaint();
        }).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
}
