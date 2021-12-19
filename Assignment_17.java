1.1)package assignment_17;

public class DisplayMessage {

	public static void main(String[] args) {
			System.out.println("Hello I am Mayuri");
		}

}
o/p
Hello I am Mayuri

1.2)package assignment_17;

public class PrimitiveDatatypes {
	   static boolean val1;
	   static double val2;
	   static float val3;
	   static int val4;
	   static long val5;
	   static String val6;
	   public static void main(String[] args) {
	      System.out.println("Default values.....");
	      System.out.println("Val1 = " + val1);
	      System.out.println("Val2 = " + val2);
	      System.out.println("Val3 = " + val3);
	      System.out.println("Val4 = " + val4);
	      System.out.println("Val5 = " + val5);
	      System.out.println("Val6 = " + val6);
	   }
	}
o/p
Default values.....
Val1 = false
Val2 = 0.0
Val3 = 0.0
Val4 = 0
Val5 = 0
Val6 = null

1.3)package Assignment_15_12_2021;

import java.util.Scanner;

public class CheckString {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string 1:");
	//taking input from the user
	String str1 = sc.nextLine();
	System.out.println("Enter the string 2:");
	//taking input from the user
		String str2 = sc.nextLine();
		//comparing string
		if(str1.equals(str2)) {
			System.out.println("Str1 isequal to str2");
			
		}
		else {
			System.out.println("str1 is not equal to str2");
		}
}
}
o/p
Enter the string 1:
Apple
Enter the string 2:
APPLE
str1 is not equal to str2

2.1.1)public class Increment {

	public static void main(String[] args) {
		int x = 21;
		int y = ++x;
		System.out.println("x: " + x + "y: " + y);

		int a = 21;
		int b = a++;
		System.out.println("a: " + a + " " + "b: " + b);

		int p = 5;
		int q = 4;
		int s = --p;
		int t = q--;
		System.out.println("p:" + p);
		System.out.println("q:" + q);
		System.out.println("s:" + s);
		System.out.println("t:" + t);

	}

}
o/p
x: 22y: 22
a: 22 b: 21
p:4
q:3
s:4
t:4

2.1.2)a) public class bitwiseand   
{   
public static void main(String[] args)   
{   
int x = 5, y = 4;   
// bitwise and   
// 1001 & 1000 = 1000 = 8  
System.out.println("x & y = " + (x & y));   
}  
}
o/p
x & y = 4

b)public class BitwiseCompliment  
{   
public static void main(String[] args)   
{   
int x = 5;   

System.out.println("~x = " + (~x));   
}  
}
o/p
~x = -6

c)public class BitwiseInclusiveOr 
{   
public static void main(String[] args)   
{   
int x = 4, y = 7;   
 
System.out.println("x | y = " + (x | y));   
}  
}
o/p
x | y = 7

d)public class BitwiseXor  
{   
public static void main(String[] args)   
{   
int x = 7, y = 6;   
 
System.out.println("x ^ y = " + (x ^ y));   
}  
}
o/p
x ^ y = 1

2.1.3)1. Addition Operators
public class Add {
	public static void main (String[] args) {
		int num1 =10;
		int num2 = 20;
		int sum;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		sum = num1 + num2;
		System.out.println("Sum is: "+sum);
		
	}
}

o/p
num1: 10
num2: 20
Sum is: 30

2. Subtraction Operator
public class Sub {
	public static void main(String args[]) {
		int num1 = 20;
		int num2 = 10;
		int sub;
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		sub = num1 - num2;
		System.out.println("Subtraction: "+sub);
	}
}

o/p
num1: 20
num2: 10
Subtraction: 10

3. Multiplication Operator
public class mutl {
	public static void main(String args[]) {
		int num1 = 20;
		int num2 = 5;
		int mult;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		mult = num1 * num2;
		System.out.println("Multipication: "+mult);
	}
}

o/p
num1: 20
num2: 5
Multipication: 100

4.Division Operator
public class Div {
	public static void main(String args[]) {
		int num1 = 150;
		int num2 = 5;
		int div;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		div = num1 / num2;
		System.out.println("division:"+div);
	}
	
}

o/p
num1: 150
num2: 5
division:30

5. Modulus Operator
public class Mod {
	public static void main(String args[]) {
		int num1 = 5;
		int num2 = 3;
		int mod;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		mod = num1 % num2;
		System.out.println("Remainder: "+mod);
	}
}

o/p
num1: 5
num2: 3
Remainder: 2

2.1.4)1.Equal to
public class Equalto {
	public static void main(String[] args)
    {
        int var1 = 5, var2 = 10, var3 = 5;
 
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        System.out.println("var1 == var2: "
                           + (var1 == var2));
 
        System.out.println("var1 == var3: "
                           + (var1 == var3));
    }

}

o/p
Var1 = 5
Var2 = 10
Var3 = 5
var1 == var2: false
var1 == var3: true

2.Not Equal To
public class NotEqualTo {
	public static void main(String[] args)
    {
        int var1 = 5, var2 = 10, var3 = 5;
 
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        System.out.println("var1 == var2: "
                           + (var1 != var2));
 
        System.out.println("var1 == var3: "
                           + (var1 != var3));
    }
}

o/p
Var1 = 5
Var2 = 10
Var3 = 5
var1 == var2: true
var1 == var3: false

3.Greater than
public class GreaterThan {
	public static void main(String[] args)
    {
        int var1 = 30, var2 = 20, var3 = 5;
 
        // Displaying var1, var2, var3
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        System.out.println("var1 > var2: " + (var1 > var2));
 
        System.out.println("var3 > var1: "
                           + (var3 >= var1));
    }
}

o/p
Var1 = 30
Var2 = 20
Var3 = 5
var1 > var2: true
var3 > var1: false


4.Less Than
public class LessThan {
	public static void main(String[] args)
    {
        int var1 = 10, var2 = 20, var3 = 5;
 
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        System.out.println("var1 < var2: " + (var1 < var2));
 
        System.out.println("var2 < var3: " + (var2 < var3));
    }
}

o/p
Var1 = 10
Var2 = 20
Var3 = 5
var1 < var2: true
var2 < var3: false

5.Greater than Equal to
public class greaterEqual {
	public static void main(String[] args)
    {
        int var1 = 20, var2 = 20, var3 = 10;
 
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        System.out.println("var1 >= var2: "
                           + (var1 >= var2));
 
        System.out.println("var2 >= var3: "
                           + (var3 >= var1));
    }
}

o/p
Var1 = 20
Var2 = 20
Var3 = 10
var1 >= var2: true
var2 >= var3: false

6.Less than Equal to
public class LessEqual {
	public static void main(String[] args)
    {
        int var1 = 10, var2 = 10, var3 = 9;
 
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("Var3 = " + var3);
 
        System.out.println("var1 <= var2: "
                           + (var1 <= var2));
 
        System.out.println("var2 <= var3: "
                           + (var2 <= var3));
    }
}

o/p
Var1 = 10
Var2 = 10
Var3 = 9
var1 <= var2: true
var2 <= var3: false

2.1.6)package individual;

public class ConditionalOperator 
{  
public static void main(String args[])   
{  
int x=6, y=3, z=9;  
System.out.println(x>y && x>z || y<z);  
System.out.println((x<z || y>z) && x<y);  
}  
}
o/p
true
false

2.2.1)public class IfelseIfLadder {

	public static void main(String[] args) {
		int a = 53;
		
		if(a>80) {
			System.out.println("A grade");
		}
		else if(a>70) {
			System.out.println("B grade");
		}
		else if(a>60) {
			System.out.println("C grade");
		}
		else if(a>50) {
			System.out.println("D grade");
		}
		else {
			System.out.println("F");
		}

	}

}
o/p
D grade

2.2.2)public class IfelseorSwitch {

	public static void main(String[] args) {
		// if else statemnet
//		char letter = '@';
//		
//		if(letter == 'A' || letter == 'E') {
//			System.out.println("this is an vowel");
//			System.out.println("this is an alphabet");
//		}
//		else if(letter == 'B' || letter == 'C' || letter == 'D') {
//			System.out.println("this is an alphabet");
//		}
//		else if(letter == '@' || letter == '#') {
//			System.out.println("this is a special charater");
//		}
		
		//Switch statement
		char letter = 'I';
		
		switch(letter)
		{
		case 'A':
		case 'E':
			System.out.println("this is an Vowel");
			break;
		case 'B':
		case 'C':
		case 'D':
			System.out.println("this is an alphabet");
			break;
		case '@':
		case '#':
			System.out.println("this is an special charater");
			break;
		default:
			System.out.println("this is just an alphabet");
		}

	}

}
o/p
this is just an alphabet

2.2.3)public class ForLoop {

	public static void main(String[] args) {
//		int number = 20;
//		System.out.println("list of even no: ");
//		for(int x = 1; x <=number; x++)
//		{
//			if(x%2!=0)
//			{
//				System.out.println(x + "");
//			}
//		}
//		System.out.println("After for loop");
		
		int input = 40;
		for(int i = input; (i == input || ((i-1)%10!=0)); i++)
		{
			System.out.println(i);
		}

	}

}
o/p
40

2.2.4)public class WhileDemo {

	public static void main(String[] args) {
		int x = 5;
		while(x >=0)
		{
			System.out.println("x = "+ x);
			--x;
		}

	}

}
o/p
x = 5
x = 4
x = 3
x = 2
x = 1
x = 0

2.2.5)public class DoWhileDemo {

	public static void main(String[] args) {
		int x = 6;
		do
		{
			System.out.println("The x value is: "+ x);
			--x;
		}while(x >=0);

	}

}
o/p
The x value is: 6
The x value is: 5
The x value is: 4
The x value is: 3
The x value is: 2
The x value is: 1
The x value is: 0

2.3.1)public class ArrayLength {
	public static void main(String[] args) {
		int[] array = new int[4];

		System.out.println("the lenght of array is: " + array.length);
	}
}
o/p
the lenght of array is: 4

2.3.2)public class OneDimentionalArray {

	public static void main(String[] args) {
		int[] number;

		number = new int[5];

		number[0] = 0;
		number[1] = 1;
		number[2] = 2;
		number[3] = 3;
		number[4] = 4;

		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}

}
o/p
0
1
2
3
4

2.3.3)public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] a = { { 10, 20 }, { 30, 40 }, { 50, 60 } };

		System.out.println("Two Dimensional Array is: ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(a[i][j]);
			}
		}

	}

}
o/p
Two Dimensional Array is: 
10
20
30
40
50
60

2.3.4)public class Multidimentional{
public static void main(String[] args)
    {
  
        int[][][] arr = { { { 11, 24 }, { 53, 64 } }, { { 5,1 6 }, { 70, 48 } } };
  
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int z = 0; z < 2; z++)
                    System.out.println("arr[" + i
                                       + "]["
                                       + j + "]["
                                       + z + "] = "
                                       + arr[i][j][z]);
    }
}
o/p
arr[0][0][0] = 11
arr[0][0][1] = 24
arr[0][1][0] = 53
arr[0][1][1] = 64
arr[1][0][0] = 5
arr[1][0][1] = 16
arr[1][1][0] = 70
arr[1][1][1] = 48

2.4.1)public class Summation {
public static void main(String a[]) {
int sum = 0;
int invalid = 0;
for (int I = 0; I < a.length; I++) {
try {
sum += Integer.parseInt(a[I]);
} catch (NumberFormatException e) {
invalid++;
}
}
System.out.println(“Total no.of arguments: ”+a.length);
System.out.println(“Invalid Integers: ”+invalid);
System.out.println(“Sum: ”+sum);
}
}
o/p
Total no.: 0
Invalid Integer: 0
Sum: 0

2.4.2)class A{  
public static void main(String args[]){  
  
for(int i=0;i<args.length;i++)  
System.out.println(args[i]);  
  
}  
}
o/p
hii
       maddy
       4
       9
      jan