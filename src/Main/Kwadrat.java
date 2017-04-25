package Main;

import java.util.ArrayList;
import java.util.List;

public class Kwadrat implements IFigura{

	private int dlugoscBoku = 0;
	List<Point> point = new ArrayList<Point>();
	
	@Override
	public List<Point> Rysuj(int x) {	
		this.dlugoscBoku = x;
		point.add(new Point(punktStartowyX,punktStartowyY));
		point.add(new Point(punktStartowyX+x,punktStartowyY));
		point.add(new Point(punktStartowyX+x,punktStartowyY+x));
		point.add(new Point(punktStartowyX,punktStartowyY+x));
		
		System.out.println("Wspo³rzêdne kwadratu: ");
		point.stream().forEach((p)->System.out.println("[" + p.getX() +"," + p.getY() + "]"));
		
		return point;
		
		}


}
