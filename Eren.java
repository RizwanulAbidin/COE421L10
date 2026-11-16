import java.util.Random;

public class Eren extends ConcreteSubject implements Runnable {
	private UI ui;
	private Random r = new Random();

	public Eren(int energy, UI ui) {
		this.energy = energy;
		this.ui = ui;
		Thread t = new Thread(this);
		t.start();
	}

	public void run() {
		while (energy > 0) {
			try {
				// wait between 5 and 10 seconds before transforming
				int wait = r.nextInt(6) + 5;
				Thread.sleep(wait * 1000);

				ui.print("\nEren transformed into a Titan! Energy: " + energy);
				notifyObservers();
				energy = energy - 5;

				// stays a titan for 10 seconds
				Thread.sleep(10000);
				ui.print("Eren is back to normal. Energy left: " + energy);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ui.print("\nEren has no energy left and can't transform anymore.");
	}
}
