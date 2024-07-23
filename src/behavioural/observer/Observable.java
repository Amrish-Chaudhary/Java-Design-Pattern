package behavioural.observer;


public interface Observable {

	void add(Observer observer);
	
	void remove(Observer observer);
	
	void nofity();
	
	void setValue(int data);
	
}
