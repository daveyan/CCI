import java.io.*;
import java.util.*;

public class Urlify {
    public static void main(String[] args) {
        System.out.println("enter a string with spaces");
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        String line = new String();
        try {
            line = buffer.readLine();
        }
        catch(Exception e){
            System.out.println(e);
        }

        String result = url(line);
        System.out.println(result);
    }
    public static String url(String s){
        ArrayList<Character> newString = new ArrayList();
        StringBuilder sb;

        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == ' '){
                newString.add('%');
                newString.add('2');
                newString.add('0');
            }
            else{
                newString.add(s.charAt(i));
            }

        }
        sb = new StringBuilder(newString.size());
        for(char c:newString){
            sb.append(c);
        }
        return sb.toString();
    }
}
