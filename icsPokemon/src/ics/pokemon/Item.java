/**
 * 
 */
package ics.pokemon;

/**
 * @author Kobe
 *
 */
public abstract class Item {
	
	public String name;
	public int quantity, power, size;
	
	public abstract String getName();
	public abstract void setName(String name);
	public abstract int getQuantity();
	public abstract void setQuantity(int quantity);
	public abstract int getPower();
	public abstract void setPower(int power);
	public abstract int getSize();
	public abstract void setSize(int size);

}
