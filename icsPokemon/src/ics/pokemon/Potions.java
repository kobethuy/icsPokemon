package ics.pokemon;

public class Potions extends Item{
	
	public Potions(String name) {
		setName(name);
	}

	@Override
	public String getName() {
		return super.name;
	}

	@Override
	public void setName(String name) {
		super.name = name;
	}

	@Override
	public int getQuantity() {
		return super.quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		super.quantity = quantity;
	}

	@Override
	public int getPower() {
		return super.power;
	}

	@Override
	public void setPower(int power) {
		super.power = power;
	}

	@Override
	public int getSize() {
		return super.size;
	}

	@Override
	public void setSize(int size) {
		super.size = size;
	}

}
