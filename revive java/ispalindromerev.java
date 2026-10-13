public class ispalindromerev {
    public static void main(String[] args) {
        String name="aryan";
        boolean ispalindrome=true;
        int strt=0;
        int end=name.length()-1;
        if(name.charAt(strt)!=name.charAt(end)){
            ispalindrome=false;

        }
        else{
            strt++;
            end--;
        }
        if(ispalindrome){
            System.out.println("the name "+name+" is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        }
        }
    
    

