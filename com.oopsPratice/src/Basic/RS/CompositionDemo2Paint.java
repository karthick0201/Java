package Basic.RS;


/***********************************************
 * Only one is there like "brush" --> Create single class 
 * Multiple Creation Go to abstract class --> LIke 'Colors' --> Group the common data
 * 
 * 
 *
 */
public class CompositionDemo2Paint {
	public static void main(String[] args) {
		Paint red=new Paint("Red","Nippan");
		Paint orange=new Paint("orange","Nippan");
		Paint blue=new Paint("blue","Nippan");
		
		Brush brush=new Brush();
		brush.addColor(red);
		brush.paintWall();
	}
}

class Paint {
	String color;
	String brand;

	public Paint(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}

}

//class RedPaint extends Paint{
//
//	private Brush b;
//	public RedPaint(Brush b, String color, String brushType) {
//		super(color, brushType);
//		this.b=b;
//		
//	}
//
//	
//	
//}
class Brush {
	Paint p; // ANY COLOR OBJECT WE CAN GET

	public Brush() {
		System.out.println("Brush Created");
	}

	void addColor(Paint p) {
		this.p = p;
	}

	void paintWall() {
		if (p == null) {
			System.out.println("No paint flushed on wall ");
			return;
		}
		System.out.println("Painting on Wall " + p.color);
	}
}
