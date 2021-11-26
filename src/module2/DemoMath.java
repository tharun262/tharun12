package module2;
 
public class DemoMath {
 
    public static void main(String[] args) {
        //to generate any random number  between 0-1
        double d=(Math.random() * 100 );
        System.out.println("d is " + d);

        int i=(int)(Math.random()* 100); //between 0 to 100
        System.out.println("i is" + i);
 
        System.out.println(Math.sqrt(144));
        /*
         * Math.pow(3,2)
         * Math.abs(-100)   : return the positive number
         * Math.min()
         * Math.max()
         * Math.ceil()
         * Math.floor()
         * Math.round()
         * 
         */



    }
 
}