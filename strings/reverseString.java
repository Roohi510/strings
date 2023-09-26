import java.util.*;
public class reverseString {
     public static void reverse(String name){
        
     }
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("hello");
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i)+"  ");
        }
    }
}
