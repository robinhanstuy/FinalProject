import java.awt.Graphics;

public abstract class Entity{
    protected int  x,y;
    //building block for segments of the snake;
    public Entity( int  x, int y){
      this.x = x;
      this.y = y;
    }
    public abstract void tick();
    public abstract void render(Graphics g);
}
