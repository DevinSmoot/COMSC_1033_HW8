# Listing Project: How to Generate a Random Upper Case Letter

## Introduction

This document details the generation of a Java program that writes an uppercase letter to the console.
This code is managed inside Github.com and uses the Math.random() method as well as a custom method
call.

## Outline

```java
// Generate a random upper-case letter (using a custom method call)
// Print the random letter to the console
```

## References and Literature

```java
// Liang Java 10th edition. Pg 87, Listing 3.3
// This is an example of how to make a random number.
// int number1 = (int)(Math.random()*10);

// Liang Java 10th edition. Pg 125, Table 4.4
// Explanation of the range of upper-case letters in ASCII
// Characters 'A' to 'Z' have a Value in Decimal of 65 to 90.

// Liang Java 10th edition. Pg 122, 4.2.5 the random method.
// a + Math.random() * b
// returns a random number between a and a+b, exluding a+b.

// Liang Java 10th edition. Pg 209, 6.4 void Method example.
// This shows how we can set up a method call.
```

## Code

```java
/* Project:			4.1.6 Print a random upper-case character 
 * Author:			Devin Smoot
 * Class: 			COMSC 1033
 * Date:			2015-11-1
 */
public class COMSC_1033_HW8 {
	public static void main(String[] args) {
		int randomNum;
		// Set integers to hold number range
		int startingValue = 65; // 'A' begins at 65
		int endingValue = 90 - startingValue + 1; // 'Z' is 90
		//System.out.println(startingValue); //Debug statement: View startingValue
		//System.out.println(endingValue); //Debug statement: View endingValue
		//randomNum (startingValue ,endingValue); //Debug statement: Call randomChar method
		char letter = (char)randomNum(startingValue,endingValue);
		System.out.println(letter);
	}
	public static int randomNum (int startNum, int endNum) {
		int result; // This will hold our randomly generated number for return.
		result = (int)(startNum + Math.random()*endNum);
		//System.out.println(randomNumber); //Debug statement: View randomNumber
		return result;
	}
}
```

## Console Ouput
```
Z
```
Ran the program multiple times and recieved a random upper-case letter each time.

## Command Prompt

1. Open Eclipse and start New Project

2. Go to Github and start a new repository.

3. Use the command prompt to make the connections:
	
	*	Navigate to the correct location. Looking for src and bin folders.
	
		```
		cd E:\Documents\School\Fall 2015\Computer Science 1\Workspace\COMSC_1033_HW8
		```

	*	Use dir to verify correct folder. Should see src and bin folders.
	
		```
		 E:\Documents\School\Fall 2015\Computer Science 1\Workspace\COMSC_1033_HW8>dir
		 Volume in drive E has no label.
		 Volume Serial Number is 5D48-ACED
		
		 Directory of E:\Documents\School\Fall 2015\Computer Science 1\Workspace\COMSC_1033_HW8
		
		11/02/2015  09:22 AM    <DIR>          .
		11/02/2015  09:22 AM    <DIR>          ..
		11/02/2015  09:22 AM               390 .project
		11/02/2015  09:22 AM    <DIR>          src
		11/02/2015  09:22 AM    <DIR>          bin
		11/02/2015  09:22 AM               232 .classpath
		               2 File(s)            622 bytes
		               4 Dir(s)   7,943,340,032 bytes free
		```

	*	Create a new Untitled Text File in Eclipse
	
		: File->Untitled Text File
	
	*	Save the file and select location for file
	
		: File->Save As...
	
		Save the file in the COMSC_1033_HW8 folder
	
	*	Now you can add, commit, and push changes to Github.
	
		Set user information.
		```
		git config user.name "DevinSmoot"
			
		git config user.email smootd@student.swosu.edu
		```
			
		Initialize the new repository on the local machine.
		```
		git init
		```
			
		Next add all files to the repository.
		```
		git add .
		```
			
		Now you can commit those changes.
		```
		git commit -m "Initial commit"
		```
			
		Now you push to the remote repository. This is shown on Github once the repository is created.
		```
		git remote add origin https://github.com/DevinSmoot/COMSC_1033_HW8.git
		
		git push -u origin master
		```
		
	*	Type in code for program using the following format:
		
		*	Identify variables needed
		*	Type pseudocode
		*	Fill in pseudocode with actual code
		*	Test code
			*	Isolate problems by commenting out working code
			*	Isolate variable problems by hard coding variables
		*	Confirm code works with 'True' statements, 'False' statements', and a mixture of both
		*	When comfortable with code. Merge into master. (Not applicable to this lesson)
		
	*	Commit changes to Github.com
		
		```
		git add .
		
		git commit -m "Saving working and tested code. 100% tested."
		
		git push
		```
	
## Summary

	This was an interesting lesson in calling methods. It allowed me to learn to call a method, pass
	variables, and work with a returned result. Although I have done this in other programming languages
	I feel more comfortable with doing so in java now. This is the corner stone of future programming as
	calling methods is a MUST in most any program big or small. Working with passing arguments and then
	working with the returned results allows for easy expansion of code with little effort and removes
	duplicate code by making certain parts reuseable. It also makes code much more manageable by
	breaking it into smaller workable pieces.	
	
		