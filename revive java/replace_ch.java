import java.util.*;
public class replace_ch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word=sc.nextLine();
        String result="";
        for(int i=0;i<word.length();i++){
            char ch= word.charAt(i);
            if(ch=='e'){
                
                result+='i';

            }else{
                result+=ch;
            }
            

        }
        System.out.println("After repacing elements in inputed striing is: "+ result);
        sc.close();
        
    }
    
}
