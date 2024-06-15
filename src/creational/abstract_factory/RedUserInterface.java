package creational.abstract_factory;

public class RedUserInterface implements UserInterface{

	@Override
	public Button createButton() {
		return new RedButton();
	}

	@Override
	public Label createLabel() {
		return new RedLabel();
	}
	

}
