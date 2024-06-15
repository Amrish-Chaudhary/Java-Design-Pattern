package creational.abstract_factory;

public class BlueUserInterface implements UserInterface{

	@Override
	public Button createButton() {
		return new BlueButton();
	}

	@Override
	public Label createLabel() {
		return new BlueLabel();
	}

}
