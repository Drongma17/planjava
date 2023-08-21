package com.thonglam.datastructures;

// Java program to implement
// the above approach
class GFG{

// Function to check if char ch is
// odd or not
static boolean checkOdd(char ch)
{
	return ((ch - '0') & 1) != 0 ?
			true : false;
}

// Function to insert dash - between
// any 2 consecutive digit in string str
static String Insert_dash(String num_str)
{
	StringBuilder result_str = new StringBuilder(num_str);

	// Traverse the string character
	// by character
	for(int x = 0; x < num_str.length() - 1; x++)
	{

		// Compare every consecutive
		// character with the odd value
		if (checkOdd(num_str.charAt(x)) &&
			checkOdd(num_str.charAt(x + 1)))
		{
			result_str.insert(x + 1, "-");
			num_str = result_str.toString();
			x++;
		}
	}

	// Print the resultant string
	return result_str.toString();
}

// Driver Code
public static void main(String[] args)
{
	
	// Given number in form of string
	String str = "1745389";

	// Function call
	System.out.println(Insert_dash(str));
}
}

// This code is contributed by rutvik_56
