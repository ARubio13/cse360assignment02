package cse360assignment02;

/**
* This is for Assignment 01. Version Control
*
* @author Adan Rubio
*
*/

public class AddingMachine {
  private int total;
  private String operations;

  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    operations = "0";
  }

/**
* getTotal method returns the total value so far.
*
* @return total
*/

  public int getTotal () {
    return this.total;
  }

/**
* The add method adds value to total.
* <p> 
* This method takes the parameter variable value and adds it
* to the class variable total. It also appends what operation 
* was done in the class variable operations. 
*
* @param value
*/

  public void add (int value) {
    this.total += value;
    this.operations += " + " + Integer.toString(value); 
  }

/**
* The subtract method subtracts value from total.
* <p>
* This method takes the parameter varibale value and subtracts
* it from the class variable total. It also append what
* operation was done in the class variable operations. 
*
* @param value
*/

  public void subtract (int value) {
    this.total -= value;
    this.operations += " - " + Integer.toString(value);
  }

/**
* The toString method shows operations variable.
* <p>
* The operations variable has all the operations done so far and 
* toString will return this variable.
*
* @return operations
*/

  public String toString () {
    return this.operations;
  }

/**
* The clear method resets total and operations
* <p>
* When the clear method is called it will reset the values of
* total and operations back to 0.
*/

  public void clear() {
    this.total = 0;
    this.operations = "0";
  }
}
