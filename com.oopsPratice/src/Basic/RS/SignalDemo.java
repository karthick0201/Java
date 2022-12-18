package Basic.RS;

public class SignalDemo {
	public static void main(String[] args) {

	}
}

/* abstract class TrafficSignalRules{ */
interface TrafficSignalRules{
	default void red() {
		System.out.println("Vehicle - Stop");
	}
	public default void yellow() {
		System.out.println("Vehicle - Stay alert!!!");
	}
	public default void green() {
		System.out.println("vehicle - Go");
		
	}
	
}
//class Check implements TrafficSignalRules{
//	
//}
