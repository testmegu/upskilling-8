package com.cg.upskill;
import java.util.Scanner;  
public class MysteryNumberExample1  
{  
 
static int reverse(int x)  
{  
     
String str = Integer.toString(x);  
 
String string="";  
for(int i=str.length()-1;i>=0;i--)  
{  
      
string=string+str.charAt(i);  
}   
int rev=Integer.parseInt(str);  
//returns the reverse number  
return rev;  
}  
//function that checks the number is mystery or not  
static boolean isMysteryNo(int num)  
{  
for (int i=1; i <= num/2; i++)  
{  
//calling the function that reverse a number and assign it to j  
int j = reverse(i);  
//compares the sum of two numbers is equal to given number or not  
if (i + j == num)  
{  
//prints a pair of numbers whose sum is the given number      
System.out.println( i + " " + j);  
System.out.println(num+ " is a mystery number.");  
//returns a boolean value if pair is found  
return true;  
}  
}  
System.out.println("The given number is not a mystery number.");  
//returns false if pair is not found  
return false;  
}  
 
public static void main(String args[])  
{  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a number: ");    
int num = sc.nextInt();  
 
isMysteryNo(num);  
}  
}  
