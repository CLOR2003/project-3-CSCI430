import java.awt.*;
import java.util.ArrayList;

public class Polygon extends Item {
  private ArrayList<Point> pointList;

  // Constructor for arrays
  public Polygon(Point[] List) {
    pointList = new ArrayList<Point>();
    for (Point p : List) {
        this.pointList.add(p);
    }
  }
  
  // Constructor for Array lists
  public Polygon(ArrayList<Point> List) {
    this.pointList = new ArrayList<Point>(List);
  }

  // Constructor for none
  public Polygon() {
	pointList = new ArrayList<Point>();
  }
  public boolean includes(Point point) {
    Point lastPoint = pointList.get(pointList.size() - 1);
    Point firstPoint = pointList.get(0);
    return ((distance(point, lastPoint) < 10.0) || (distance(point, firstPoint)< 10.0));
  }
  // Still needs to fix this
  public void render(UIContext uiContext) {
    uiContext.drawLine(point1, point2);
  }
  public void addPoint(Point point){
    pointList.add(point);
  }
  public Point[] getPoints() {
    int count = pointList.size()
    Point[] array = new Point[count];
    for(int i = 0; i < count - 1; i++) array[i] = pointList.get(i);
    return array;
  }
  // Fix this too
  public String toString() {
    return "Line  from " + point1 + " to " + point2;
  }
}

