import java.awt.*;
import java.applet.*;

public class Sprite {
  
  private int health;
  private ImageEntity entity;
  boolean int isAlive;
  private int pos;
  //add image implementation
  
  public Sprite(Applet a, Graphics2D g2d, int h) {
    entity = new ImageEntity(a);
    entity.setGraphics(g2d);
    entity.setAlive(false);
    this.pos = newPoint2D(0, 0);
    health = h;
    
  }
  
  public boolean isCollided() {//requires implemetation
  }
  
  
}
