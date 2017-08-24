import java.util.*;

public class stringPerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        boolean b = strCmp(x,y);
        System.out.println(b);
    }
    public static boolean strCmp(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        return sort(t).equals(sort(t));
    }

    public static String sort(String s){
        char[] schar = s.toCharArray();
        Arrays.sort(schar);
        return new String(schar);

    }
}

