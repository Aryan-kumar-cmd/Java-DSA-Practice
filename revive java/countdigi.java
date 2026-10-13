public class countdigi {
    static int count(int n){
        int count=0;
        if(n==0){
            return 1;
        }
        while(n!=0){
            n=n/10;
             count++;
        }return count;
        
    }
    public static void main(String[] args) {
        int n=45789;
        System.out.println("total digit are: "+ count(n));
    }
    
}
