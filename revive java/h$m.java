
public class h$m {
    public static void main(String[] args) {
        int[] marks={45,54,32,78,24};
        int max=marks[0];
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
            
        if(marks[i]>max){
            marks[i]=max;
        }
        
        }
        System.out.println("maxium = "+max);
        

    }
    
}
