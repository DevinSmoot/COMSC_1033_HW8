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

```

## Console Ouput


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
		*	When comfortable with code. Merge into master.
		
	*	Commit changes to Github.com
		
		```
		git add .
		
		git commit -m "Saving working and tested code. 100% tested."
		
		git push
		```
		
	*	Merge into master branch
		
		```
		git checkout master
		
		git merge dev
		```
	
## Summary
	
	
		