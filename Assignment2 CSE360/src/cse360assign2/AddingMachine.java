/* Mario Roman Reyes
 * CSE 360-70641
 * Assignment 2 
 * Class called AddingMachine that adds and subtracts an int from the private int total.
 * Class also stores the transaction history in a string and clears the total and transaction history.
 */
package cse360assign2;

public class AddingMachine 
{

	private int total;//Creates private int variable for total
	private String history = "0";//Creates private string variable for history
	
	public AddingMachine () //Constructor
	{
		total = 0;
	}
	
	public int getTotal()// returns the private int variable total 
	{
		return total;
	}
	
	public void add(int value)//Function to add a value to the total
	{
		total += value;//adds the value to the total
		history = history + " + " + Integer.toString(value);//changes string history to keep track of transaction history
	}
	
	public void subtract(int value)//Function to subtract a value from the total
	{
		total -= value;//subtracts the value from the total
		history = history + " - " + Integer.toString(value);//changes string history to keep track of transaction history
	}
		
	public String toString()//returns string history
	{
		return history;
	}

	public void clear()//clears the total
	{
		total = 0;
		history = "0";
	}
}

