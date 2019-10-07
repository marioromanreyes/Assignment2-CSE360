/* Mario Roman Reyes
 * CSE 360-70641
 * Assignment 2 
 * Class called AddingMachine that adds and subtracts an int from the private int total 
 */
package cse360assign2;

public class AddingMachine 
{

	private int total;//Creates private int variable for total
	private String history = "0";//Creates private string variable for history
	
	public AddingMachine () 
	{
		total = 0;
	}
	
	public int getTotal()
	{
		return total;
	}
	
	public void add(int value) 
	{
		total += value;
		history = history + " + " + Integer.toString(value);
	}
	
	public void subtract(int value)
	{
		total -= value;
		history = history + " - " + Integer.toString(value);
	}
		
	public String toString()
	{
		return history;
	}

	public void clear()
	{
		total = 0;
		history = "0";
	}
}

