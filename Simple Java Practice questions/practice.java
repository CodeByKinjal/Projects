
Java Practice 



1)public class Student{
  	public static void main(String[] args){
        	System.out.println("My First Java Program..");
    }
  }


//2)//Write a Java program to calculate the sum and product of two given number.

public class Calculation{
    
    public static void main(String[] args){
        
        int a,b,sum=0,product=0;
        
        a = 13;
        b = 23;
        
        sum = a+b;
        product = a*b;
        
        System.out.println("Sum of a and b is = " +sum);
        System.out.println("Product of a and b is = " +product);
    }
}



//3)//Write a Java program to accept two numbers from the user and calculate sum and product.

import java.util.*;
public class Calculation{
    
    public static void main(String[] args){
        
        int a,b,sum=0,product=0;
        
        //Scanner is one type of class constructor
        //scan is an object of Scanner
        //System.in is use to read characters from keyboard
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        //.nextInt() is the method for read the next integer enterd by the user
        a = scan.nextInt();
        System.out.println("Enter your second number: ");
        b = scan.nextInt();
        
        sum = a + b;
        product = a * b;
        
        System.out.println("Sum is = "+sum);
        System.out.println("Product is = "+product);
        
    }
}


//4)//Write a Java program to accept two number from the user and calculate the average.

import java.util.*;

public class Avg{
    
    public static void main(String[] args){
        
        double a,b,sum=0,avg=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        a = sc.nextDouble();
        System.out.println("Enter your second number: ");
        b = sc.nextDouble();
        
        sum = a + b;
        avg = sum / 2;
        
        System.out.println("Average is = "+avg);
    }
}



//5)//Write a java program to convert fahrenheit to celsius and celsius to Fahrenheit using formula        c =(5.0/9.0)*(f-32).

import java.util.Scanner;

public class Temp{
    
    public static void main(String[] args){
        
        double c,f;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter tempreture in fahrenhit = ");
        f = scan.nextDouble();
        
        c = (5.0/9.0)*(f-32);
        
    System.out.println("Celsius Tempreture = "+c);
    }
}



//6)//Write a Java program to calculate the area of triangle using three sides.

import java.util.Scanner;

public class Area{
    
    public static void main(String[] args){
        
        int a,b,c;
        double s,area;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three sides = ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        s = (a + b + c)/2;
        //.sqrt() is a function that returns the square root
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle = "+area);
        
        
    }
}



//7)// java primitive data types


public class Datatype{
    
    public static void main(String[] args){
        
        char c = 'K';
        int i = 23;
        byte b = 2;
        short s = 13;
        double d = 13.232;
        float f = 23.133332f;
        long l = 23132313;
        
        System.out.println("Character = "+c);
        System.out.println("Integer = "+i);
        System.out.println("Byte = "+b);
        System.out.println("Short = "+s);
        System.out.println("Double = "+d);
        System.out.println("Float = "+f);
        System.out.println("Long = "+l);
        
        
    }
}



//8)// Arithmetic operators 


public class Arithmeticop{
    
    public static void main(String[] args){
        
        int a = 23;
        int b = 13;
        
        System.out.println("Multiplication = "+(a*b));
        System.out.println("Division = "+(a/b));
        System.out.println("Addition = "+(a+b));
        System.out.println("Substraction = "+(a-b));
        System.out.println("Module = "+(a%b));
        
    }
}



//9)// Uneary operators 


public class Uneryop{
    
    public static void main(String[] args){
        
        int a = 23;
        int b = 13;
        
        System.out.println("Postincrement = "+(a++));
        System.out.println("Preincrement = "+(++a));
        System.out.println("Postdecremnet = "+(b--));
        System.out.println("Predecrement = "+(--b));
        
    }
}



//10)// Assignment Operator

public class Assignmentop{
    
    public static void main(String[] args){
        
        int f = 23;
        
        System.out.println("f += 3"+(f += 3));
        System.out.println("f -= 10"+(f -= 10));
        System.out.println("f *= 2"+(f *= 2));
        System.out.println("f /= 1"+(f /= 1));
        System.out.println("f %= 3"+(f %= 3));
        System.out.println("f &= 3"+(f += 4));
        System.out.println("f |= 3"+(f += 2));
        System.out.println("f ^= 3"+(f += 1));
        System.out.println("f <<= 3"+(f += 3));
        System.out.println("f >>= 3"+(f += 3));
        System.out.println("f >>>= 3"+(f += 3));
        
    }
}



//11)// Relational Operator

public class Relationalop{
    
    public static void main(String[] args){
        
        int a = 13;
        int b = 23;
        int c = 2;
        
        System.out.println("a==b "+(a==b));
        System.out.println("a<=b "+(a<=b));
        System.out.println("a>=b "+(a>=c));
        System.out.println("a<b "+(a<b));
        System.out.println("a>b "+(a>c));
        System.out.println("a!=b "+(a!=c));
    }
}



//12)// Logical Operator

public class Relationalop{
    
    public static void main(String[] args){
        
        boolean a = true;
        boolean b = false;
       System.out.println("a && b :"+(a && b));
       System.out.println("a || b :"+(a || b));
       System.out.println("!a :"+(!a));
       
       
    }
}



//13)// Bitwise Operator

public class Bitwiseop{
    
    public static void main(String[] args){
        
        int a = 13;
        int b = 10;
        
        System.out.println("a & b :"+(a & b));
        System.out.println("a | b :"+(a | b));
        System.out.println("a ^ b :"+(a ^ b));
        System.out.println("~a :"+(~a));
        System.out.println("a << b :"+(a << b));
        System.out.println("a >> b :"+(a >> b));
        System.out.println("a >>> b :"+(a >>> b));
       
    }
}



//14)// Shift Operator

public class Shiftop{
    
    public static void main(String[] args){
        
        int a = 13;
        
        System.out.println("a <<1 :"+(a << 1));
        System.out.println("a >>1 :"+(a >> 1));
       
    }
}



//15)// Local variable

public class Localv{
    
    public static void main(String[] args){
        
        int x = 13;
        
        String message = "Hello";
        
        System.out.println("X :"+x);
        System.out.println("Message : "+message);
        
        if(x < 23){
            
            String output = "x is greater than 23";
            System.out.println("X < 23 : "+output);
        }
        
        for(int i=0;i<4;i++){
            String msg = "iteration"+i;
            System.out.println(msg);
        }
    }
}



//In Java, instance variables of type int are automatically initialized to 0, while instance variables of type Integer (which is an object) are initialized to null if not explicitly initialized.

//16)// Instance variable

import java.io.*;
public class Instancev{
    
    //this all are instance variable
    public int i;
    public String n;
    public Integer I;
    
    //create defualt constructor
    public Instancev(){
        //initialize instance variable
        this.n = "Kinjal Raythatha";
    }
    
    //main mathod
    public static void main(String[] args){
        
        //object creation
        Instancev name = new Instancev();
        
        System.out.println("Name is: "+name.n);
        System.out.println("Defualt value for integer: "+name.i);
        System.out.println("Defualt value for integer: "+name.I);
    }
}



//17)// Static variable

import java.io.*;
public class Staticv{
    
    //declared static variable
    public static String name = "Kinja Raythatha";
    
    public static void main(String[] args){
        
        System.out.println("Name is: "+Staticv.name);
    }
}



//18)//Java program to demonstrate working of Scanner in Java

import java.util.Scanner;

public class Scannerd{
    
    public static void main(String[] args){
        
        Scanner k = new Scanner(System.in);
        
        String name = k.nextLine();
        System.out.println("Name : "+name);
        
        int a = k.nextInt();
        System.out.println("Integer :"+a);
        
        float b = k.nextFloat();
        System.out.println("Float :"+b);
    }
}



//19)// Write a Java program to find the maximum of two numbers.

import java.util.Scanner;

public class Numbersm{
    
    public static void main(String[] args){
        int a;
        int b;
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter your first number : ");
        a = scan.nextInt();
        System.out.println("Enter your second number : ");
        b = scan.nextInt();
        
        int m = (a > b) ? a : b;
        System.out.println("Maximum number is : "+m);
        
    }
}



//20)// Write a Java program to swap two numbers without using a third variable.

import java.util.Scanner;

public class Swapnuum{
    
    public static void main(String[] args){
        
        int a,b;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number :");
        a = scan.nextInt();
        System.out.println("Enter your second number :");
        b = scan.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("Swap numbers a is"+a);
        System.out.println("Swap numbers b is"+b);
        
    }
}



//21)// Write a Java program to check if a number is even or odd.

import java.util.Scanner;

public class Evenodd{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println("This number is even");
        }
        else{
            System.out.println("This number is odd");
        }
    }
}



//22)// Write a Java program to find the factorial of a number.

import java.util.Scanner;
public class Facto{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        long factorial = 1;
        
        for(int i=1; i <= num; i++){
            factorial *= i;
        }
        
        System.out.println("The factorial of " +num+ " is " +factorial);
    }
}



//23)// Write a Java program to check if a number is prime.
//prime number is a number that is divisible only by 1 and itself.
//ex = 2,3,5,7,11....

import java.util.Scanner;

public class Primenum{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        boolean isPrime = true;
        
        if(num <= 1){
            isPrime = false;
        }
        else{
            for(int i=2; i <= num/2; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                    
                }
            }
        }
        
        if(isPrime){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
        
    }
}



//24)// Write a Java program to find the greatest common divisor (GCD) of two numbers.
//gcd or we can say Highest Common Factor (hcf) or Greatest Common Factor (GCF)

import java.util.Scanner;

public class Gdc{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number :");
        int a  = sc.nextInt();
        System.out.println("Enter your second number :");
        int b  = sc.nextInt();
        
        int gcd = 1;
        for(int i = 1;i <= a && i <=b; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        
        System.out.println("Gcd of " +a+ " and " +b+ " is " +gcd);
        
    }
}



//25)// Write a Java program to find the sum of digits of a number.

import java.util.Scanner;

public class Sumdigits{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int sum = 0;
        
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("The sum of digits is : " +sum);
    }
}



//26)// write a program to calculate percentage of given student in CBSE board exam.This marks form five students must be taken as input from the user(marks out of 100)

import java.util.Scanner;

public class Percentage{
    
    public static void main(String[] args){
        
        
        Scanner scan = new Scanner(System.in);
        int totalofmark = 0;
        int numofsub = 5;
        
        for(int i = 1; i <= numofsub; i++){
            System.out.print("Mark of subject" + i + ": ");
            int marks = scan.nextInt();
            while(marks < 0 || marks > 100){
                System.out.println("Invalid input. Marks should be between  0 and 100");
                System.out.print("Mark of subject" + i + ": ");
                marks = scan.nextInt();
            }
            totalofmark += marks;
        }
        
        double percentage = ((totalofmark / (double) (numofsub * 100))*100);
        System.out.println("Percentage: " + percentage + "%");
    }
}



//27)// write a program to calculate sum of three numbers.

import java.util.Scanner;

public class Sumofthreeno{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your first number: ");
        int a = scan.nextInt();
        
        System.out.print("Enter your second number: ");
        int b = scan.nextInt();
        
        System.out.print("Enter your third number: ");
        int c = scan.nextInt();
        
        int sum = a + b + c;
        System.out.print("Sum of three numbers: " +sum);
    }
}



//28)// write a program to calculate CGPA using marks of three subject(out of 100)
//CGPA = percentage divide by 10
public class Cgpa{
    
    public static void main(String[] args){
        
        float sub1 = 56;
        float sub2 = 66;
        float sub3 = 76;
        
        float cgpa = (sub1 + sub2 + sub3)/30;
        System.out.println(cgpa);
    }
}



//29)//Print name with massage from user


import java.util.Scanner;

public class Name{
    
    public static void main(String[] args){
        
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        
        String name = scan.next();
        
        System.out.println("Hello " + name + ", Have a good day.");
    }
}



