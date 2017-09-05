import java.util.*;

public class Generic {

    private ArrayList<Point> ps;

    public Generic() {
	ps = new ArrayList<Point>();
    }

    public boolean add(Point p1) {
	return ps.add(p1);
    }

    public String toString() {
	String str = "";
	for (Point p1 : ps) {
	    str = str + p1 + "\n";
	}
	return str;
    }

    public static void main(String[] args) {
	Point p1 = new Point(2, 3);
	Point p2 = new Point3(3, 4, 5);
	Generic g = new Generic();
	g.add(p1);
	g.add(p2);
	System.out.println(g);
    }

}
