import java.awt.*;
public interface UIContext {
  //  public abstract void drawCircle(Circle circle);
  public abstract void drawLine(Point point1, Point point2 );
  public abstract void drawLabel(String s, Point p);

  // For triangle
  public abstract void drawTriangle(Point point1, Point point2, Point point3);

  // For polygon
  public abstract void drawPolygon(Point[] list);
}
