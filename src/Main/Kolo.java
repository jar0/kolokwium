package Main;

import java.util.ArrayList;
import java.util.List;

public class Kolo implements IFigura {

	private int promien = 0;
	List<Point> points = new ArrayList<Point>();
	
	@Override
	public List<Point> Rysuj(int x) {
		this.promien = x;
		points.add(new Point(punktStartowyX-x,punktStartowyY));
		points.add(new Point(punktStartowyX,punktStartowyY+x));
		points.add(new Point(punktStartowyX+x,punktStartowyY));
		points.add(new Point(punktStartowyX,punktStartowyY-x));
		
		System.out.println("Wspo³rzêdne ko³a: ");
		points.stream().forEach((p)->System.out.println("[" + p.getX() +"," + p.getY() + "]"));
		return points;
		
	}

}
