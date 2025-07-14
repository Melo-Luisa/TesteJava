import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        setTitle("Minha Janela com Java");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centraliza na tela
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main janela = new Main();
            janela.setVisible(true);
        });
        //Criando novos objeto de Cobra
        Snake cobra = new Snake(50,50,10);
        cobra.move();
        cobra.grow(5);
        System.out.println("Cobra está na posição: " + cobra.getX()); 
        System.out.println("Tamanho da : " + cobra.getSize()); 
    }
}
