public class ConcreteObserver implements Observer {
	protected Subject subject;

	public ConcreteObserver(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	// each character overrides this with their own reaction
	public void update(int energy) {
	}
}
