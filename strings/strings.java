import java.util.*;
public class strings{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         System.out.println("enter your name");
        String name1 ="roohi";
        String name2 ="ali";
        String name3=name1+name2;
        System.out.println(name3);
        for(int i=0;i<name3.length();i++){
            System.out.println(name3.charAt(i));
        }
        //concatination
        //compare
        if(name1.compareTo(name2)==0){
             System.out.println("strings are equal");
        }
        else{
            System.out.println("not equal+");
        }
    }
}