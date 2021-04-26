package Day8_Dictionaries_and_Maps;

//Complete this code or write your own from scratch
import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> phoneCatalog = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneCatalog.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            System.out.println(phoneCatalog.get(s));

        }
        in.close();
    }
}