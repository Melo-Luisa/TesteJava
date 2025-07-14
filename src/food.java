import java.awt.*;


/*
 * This file is part of the Snake Game project.
 * It defines the food class which represents food items in the game.
 */
public class Food {
    /**
     * Atributos da classe food.
     * Modo Protected para permitir acesso apenas dentro do pacote e por subclasses.
     * x: A coordenada x do alimento.   
     * y: A coordenada y do alimento.
     */
    protected int x;
    protected int y;

    /*
     * Método construtor da classe food.
     * @param x A coordenada x do alimento.
     * @param y A coordenada y do alimento.
     * 
     */
    public Food(int x, int y, int size) {
        this.x = x;
        this.y = y;
    }

    public int getX() {return x;}
    public int getY() {return y;}

    public void draw(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, 20, 20); // Desenha o alimento como um quadrado vermelho de 20x20 pixels
    }



}
