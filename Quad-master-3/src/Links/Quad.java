package Links;
import java.lang.Math;

public class Quad extends CompPair {  //super 
    public double Compute_dis(int a , int b , int c){
        double j;           //discriminant 
        
        
        j= Math.pow(b, 2) - 4*(a)*(c);
        return j;
    }

    public double Formula(int a , int b, int c){
        double x;
        double k= Math.pow(b, 2) - 4*(a)*(c);
        double u = Math.sqrt(k);
                x= (-b + u)/(2*a);
        return x;
    }

    public double Formula_Neg(int a , int b, int c){
        double x;
        double k = Math.pow(b,2) - 4*(a)*(c);
        double u = Math.sqrt(k);
            x= (-b - u)/(2*a);
        return x;
    }
String compare(double x, double y){     //CompPair object to be returned using super
        return super.checker(x, y);
    }

}
