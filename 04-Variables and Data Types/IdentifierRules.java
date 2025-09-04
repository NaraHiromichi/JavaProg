/**********************************************************************
  
  Program Title : Demonstrating Identifier Rules in Java
  File Name: "IdentifierRules.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 04 September 2025
  
 **********************************************************************/
 
// Intentionally incorrect program to demonstrate invalid Java identifiers.
// switch should be Switch
class Switch{
	String SwitchStatus = "On";
	
}

public class IdentifierRules {
	// 1start() variable begins with a number. So I fixed it by making the variable start1 since "1" is added in purpose
    public static void start1() { 
		System.out.println("Static Method Output");
	}

    public static void main(String[] args) {
        // added undersocre at the beginning of the identifier. It won't break the previous variable structure
        int _2ndPlace = 2;
        // removed the space between the words and made it to camelCase
        int firstName = 10;
        // since # is not allowed to set as identifier, I removed it
        int price = 99;
        // since - is not allowed to set as identifier, I removed it and made it camelCase
		int userName = 25;
        // identifier should not be reserved names, so I added underscore at the beginning
		int _class = 1;
        // identifier should not be reserved names, so I added underscore at the beginning
		int _double = 3;
        // fixed Socre to score so that it would be the same as the variable called in sout
        int score = 10;

        System.out.println(score);
		
		System.out.println("This program is executed after all errors are rectified.");

        //since method name is fixed to start1, it should be called by start1()
        start1();
    }

}
