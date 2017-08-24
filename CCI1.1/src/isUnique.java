import java.util.*;

public class isUnique {

    public static void main(String[] args) {
        boolean u;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String userString = sc.next();

        u = uniqueChar(userString);
        System.out.println(u);

    }

    public static boolean  uniqueChar(String s){
        boolean b = true;
        Map strchar = new HashMap<Character,Boolean>();
        for (int i = 0; i < s.length();i++){
            if(strchar.containsKey(s.charAt(i))){
                b = false;
            }
            else{strchar.put(s.charAt(i),true);}
        }
        return b;
    }
}
