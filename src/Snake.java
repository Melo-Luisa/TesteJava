
public class Snake {
    public int x;
    public int y;
    public int size;


    public Snake(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public int getSize() {
        return size;
    }
    public void move(){
        this.x += x;
        this.y += y;
    }
    public void grow(int size) {
        this.size += size;
    }
}
