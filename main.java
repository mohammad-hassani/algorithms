import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class main {

	class Point {
		int x, y;

		public Point(int xx, int yy) {
			x = xx;
			y = yy;
		}

		double distance(Point b) {
			return Math.sqrt((x - b.x) * (x - b.x) + (y - b.y) * (y - b.y));
		}
	}
}