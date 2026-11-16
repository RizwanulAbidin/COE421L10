// shared object that does all the printing
public class UI {
	public synchronized void print(String message) {
		System.out.println(message);
	}
}
