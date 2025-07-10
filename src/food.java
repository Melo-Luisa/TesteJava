/*
 * This file is part of the Snake Game project.
 * It defines the food class which represents food items in the game.
 */
public class food {
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
    public food(int x, int y, int size) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
