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
  
  // Constructor for none
  public Polygon() {
pointList = new ArrayList<Point>();
  }
  public boolean includes(Point point) {
    Point lastPoint = pointList.get(pointList.size() - 1);
    Point firstPoint = pointList.get(0);
    return ((distance(point, lastPoint) < 10.0) || (distance(point, firstPoint)< 10.0));
  }
  public void render(UIContext uiContext) {
    uiContext.drawPolygon(this.getPoints());
  }
  public void addPoint(Point point){
    pointList.add(point);
    for (Point i : pointList) {
      System.out.print(i);
    }
    
  }
  public Point[] getPoints() {
    int count = pointList.size();
    Point[] array = new Point[count];
    int index = 0;
    for(Point p : pointList) {
      array[index] = p;
      index++;
    }
    return array;
  }
  public Point getPointFirst(){
    return pointList.get(0);
  }
  public Point getPointLast(){
    return pointList.get(pointList.size()-1);
  }
  public String toString() {
    String string = "Polygon has points: ";
    for(Point p: pointList) string = string + ", " + p;
    return string;
  }
}