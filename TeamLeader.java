public class TeamLeader extends ConcreteObserver {
	private String name;
	private int patience;
	private UI ui;

	public TeamLeader(String name, int patience, UI ui, Subject subject) {
		super(subject);
		this.name = name;
		this.patience = patience;
		this.ui = ui;
	}

	public void update(int energy) {
		// once patience hits 0 he doesn't say anything anymore
		if (patience <= 0) {
			return;
		}
		patience = patience - 5;
		ui.print(name + "'s patience is now " + patience);

		if (patience == 10) {
			ui.print(name + ": My patience is waning!");
		} else if (patience == 5) {
			ui.print(name + ": Is this entertaining?");
		} else if (patience == 0) {
			ui.print(name + ": Omae wa mou shindeiru");
		}
	}
}
