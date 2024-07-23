//1)//print Solid Ractangle
//this is Solid Ractangle
//*****
//*****
//*****
//*****


public class SolidRactangle{
    
    public static void main(String[] args){
        
        int row = 4;
        int column = 5;
        
        //outer loop
        for(int i = 1; i<=row; i++){
            //inner loop
            for(int j = 1; j<=column; j++){
                System.out.print("*");//we use print() for printing in same line
            }
            System.out.println();
        }
    }
}



//2)//print Hollow Rectangle
//this is Hollow Rectangle
//*****
//*   *
//*   *
//*****
public class HollowRectangle{
    
    public static void main(String[] args){
        
        int row = 4;
        int column = 5;
        
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=column; j++){
                if(i == 1 || j == 1 || i == row || j == column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
       
    }
}



//3)//print Half Pyramid
//this is Half Pyramid
//*
//**
//***
//****


public class HalfPyramid{
    
    public static void main(String[] args){
        
        int row = 4;
        
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



//4)//print Inverted Half Pyramid
//this is Inverted Half Pyramid
//****
//***
//**
//*


public class InvertedHalfPyramid{
    
    public static void main(String[] args){
        
        int row = 4;
        
        for(int i = row; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



//5)//print Inverted Half Pyramid(rotated by 180)
//this is Inverted Half Pyramid(rotated by 180)
//   *
//  **
// ***
//****


public class InvertedHalfPyramid{
    
    public static void main(String[] args){
        
        int row = 4;
        
        for(int i = 1; i<=row; i++){
            //inner loop for space
            for(int j = 1; j<=row-1; j++){
                System.out.print(" ");
            }
            //inner loop for stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



//6)
public class HelloWorld {
    public static void main(String[] args) {
        int row = 5;
        
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 



//7)
public class HelloWorld {
    public static void main(String[] args) {
        int row = 5;
        
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 



//8)
public class HelloWorld {
    public static void main(String[] args) {
        int row = 5;
        int num = 1;
        
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;//num = num + 1
            }
            System.out.println();
        }
    }
}

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 



//9)
public class HelloWorld {
    public static void main(String[] args) {
        int row = 5;
       
        
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

/*
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
*/


//10)
public class StarPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
*/
