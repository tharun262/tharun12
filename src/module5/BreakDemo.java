package module5;
 
public class BreakDemo {
 
    public static void main(String[] args) {
        for(int a=1; a<10; a++)
        { 
            if(a==5)
                //break;  //1-4
                continue;  //1,2,3,4,6,7,8,9
            else
                System.out.println(a);
        }
 
    }
 
}