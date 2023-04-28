/*This project was done by Mamadou Sy and Anthony Rivera
 Done on Friday, April 28th, 2023
 */





package Links;

import java.util.Scanner;
public class SolveEq {
            static void standard(int a, int b, int c){    //method to format the given coefficicients into a standard formula
                System.out.println("The Quadratic formula is: " + a +"x^2+" + b+"x" +"+"+ c);
            }
            static String line(String degree){
                if( degree.contains("x^2")){
                    return "This is a quadratic function due to the presence of x^2";
                }else{
                    return "This is a linear equation, your forumula is y=mx+c";
                }
            }
    public static void main(String[] args) throws Exception {
        Scanner linear_check = new Scanner(System.in);


        Quad ExampleOne = new Quad();
        Quad ExampleTwo = new Quad();
        Comp tarea = new Comp(-1.5,1.32288);
        Quad ExampleThree= new Quad();

        System.out.println("Hello, Is the equation you are trying to solve linear or quadratic? Is there a polynomial to the second degree?Choose one of the options below: ");
        System.out.println("Is your formula, y=mx+c  or  y=ax^2 + bx + c. Enter x or x^2 to confirm: ");
        String linear = linear_check.nextLine();
        System.out.println(line(linear));
        linear_check.close();
        
        System.out.println("-------------------------");

        System.out.println("This discriminant is greater than 0. The coefficients are a =1 , b=65 , c=85");
        standard(1, 65, 85);
        if( ExampleOne.Compute_dis(1, 65, 85) == 0){
            System.out.println("There is a double real root due to the disciminant being zero");
        }else{
            System.out.println("No double real root detected");
        }
        System.out.println("Discriminant equals = " +  ExampleOne.Compute_dis(1, 65 , 85)); // discriminant test case with two real roots
        System.out.println("The discriminant is greater than 0 so, there are only two real/distinct roots. Your distinct roots are: ");
        System.out.println("x= " + ExampleOne.Formula(1, 65,85)); // Quad Formula Solved for Positive Value
        System.out.println("x= " + ExampleOne.Formula_Neg(1, 65,85)); // Quad Formula Solved for Negative Value
        
        System.out.println("------------------------------------------------");
        System.out.println("The discriminant is less than 0. The coeffecients are a=1 , b=3 , c=4"); 
        // we are testing two complex/imaginary roots

       System.out.println("Discriminant equals = " +  ExampleTwo.Compute_dis(1, 3 , 4));
       standard(1, 3, 4);
       if( ExampleTwo.Compute_dis(1, 3, 4) == 0){
        System.out.println("There is a double real root due to the disciminant being zero");
    }else{
        System.out.println("No double real root detected");
    }


            tarea.new_Format();     //a +bi
            tarea.neg_Format();     //a-bi
            double t= ExampleTwo.Formula(1, 3, 4);
            double u = ExampleTwo.Formula_Neg(1, 3, 4);
            System.out.println(ExampleTwo.compare(t, u));


        System.out.println("------------------------------------------------");
        System.out.println("This discriminant is equal to 0. The coefficients are a =4 , b=4 , c=1");
        standard(4, 4, 1);
        if( ExampleThree.Compute_dis(4, 4, 1) == 0){
            System.out.println("There is a double real root due to the disciminant being zero");
        }else{
            System.out.println("No double real root detected");
        }
        System.out.println("Discriminant equals = " +  ExampleThree.Compute_dis(4, 4 , 1)); // discriminant test case with one real root
        System.out.println("Your two real roots are as follows: ");
        System.out.println("x= " + ExampleThree.Formula(4, 4,1)); // Quad Formula Solved for Positive Value
        System.out.println("x= " + ExampleThree.Formula_Neg(4, 4,1)); // Quad Formula Solved for Negative Value
  

        double x = ExampleThree.Formula(4, 4,1);        //calling on the CompPair object using the Quad class
        double y = ExampleThree.Formula_Neg(4, 4,1);
       System.out.println("The discriminate is 0 so there is only one real root: " + ExampleThree.real_root(x, y));




    }
}
