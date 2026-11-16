import java.util.Random;

public class Friend extends ConcreteObserver {
	private String name;
	private UI ui;
	private Random r = new Random();

	public Friend(String name, UI ui, Subject subject) {
		super(subject);
		this.name = name;
		this.ui = ui;
	}

	public void update(int energy) {
		// 50% chance
		if (r.nextInt(2) == 0) {
			ui.print(name + ": Eren, please be safe!");
		}
		if (energy < 20) {
			ui.print(name + ": Rage, rage against the dying of the light");
		}
	}
}
