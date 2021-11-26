package collection;
import java.util.HashMap;
 
public class hashmapdemo {
 
    public static void main(String[] args) {
        HashMap<Character, String> hashmap=new HashMap<>();

        //add the ele
        hashmap.put('A',"Amey");
          //       key    value
        hashmap.put('B', "Bina");
        hashmap.put('C', "Chhaya");
        hashmap.put('K', "Krishna");
        hashmap.put('P', "Priti");

        //to display
        System.out.println(hashmap);

        System.out.println("keys are ");
        //get all the keys
        Object[] keys=hashmap.keySet().toArray();
        for(int i =0; i<keys.length; i++)
        {
            System.out.println(keys[i]);
        }

        //to get the single value
        String name =hashmap.get('A');
        System.out.println(name);

        //check whether the kye is present
        boolean result=hashmap.containsKey('A');  // t f
        System.out.println("check for a " + result);

        hashmap.remove('A');

        hashmap.clear();
    }
 
}