package Links;
// This class helps determine complex numbers
public class Comp {
    double real;
    double fake;
    Quad test = new Quad();

   public Comp(double real, double fake)
   {       // we use this keyword here to avoid confusion due to using the same variables
            //we have constructor to initialize complex number parameters
        this.real=real;
        this.fake=fake;
    }


        // the following methods will be called after using the class constructor above
    public void new_Format(){       //here is the format we will use to print the complex roots
        System.out.println("x= " + this.real + " +" + this.fake+"i");
    }
    public void neg_Format(){       //here is the format we will use to print the complex roots negative
        System.out.println("x= " + this.real + " -" + this.fake+"i");
    }


    }

//}
