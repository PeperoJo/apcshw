/*
in java, all variables must be declared before use.
declarations specify the type of the variable.

local variable: declared in a method
it is created when the function is called
destroyed when the function exits and is only viviable (usaeabl) inside
*/

import java.io.*;
import java.util.*;

public class driver {
    public static void main(String[] args){
	/*
	  declares a local variable g to be of type Greeter
	*/
	Greeter g;
	
	/*
	  new does the following
	  1. Allocates enough memory to store a Greeter
	  2. Do whatever's needed to setup/ initalize the memory to be a Greeter
	  3. return the address of the memory that was allocated
	
	  The assignment staement stores the address in g
	*/

	g = new Greeter();

	// This prints out the memory location of Greeter g
	// System.out.println(g);
	g.greet();
    }
}

