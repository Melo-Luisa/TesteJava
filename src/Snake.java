import java.awt.*;

public class Snake {
    public int x;
    public int y;
    public int size;


    public Snake(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public int getX() {return x;}
    public int getY() {return y;}
    public int getSize() {return size;}

    public void move(){
        this.x += 5;
        this.y += 5;
    }
    public void grow(int size) {
        this.size += 2;
    }
    public void draw(Graphics2D g) {
        g.setColor(Color.GREEN.darker());
        g.fillRect(x, y, size, size);
    }
}
