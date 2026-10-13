import java.util.HashSet;

public class findingduplicate {
    public static void main(String[] args) {
        int[] arr={10,45,10,20,30,20};
        HashSet<Integer> seen=new HashSet<>();
        //HashSet<Integer> seen- is used to find duplicate element in array.
        //seen-is used to store element which has already present in array.
        HashSet<Integer> duplicate=new HashSet<>();
        //duplicate-is used to find the which is already been occured in an arrays
        for(int i=0;i<arr.length;i++){
            if(seen.contains(arr[i])){
                duplicate.add(arr[i]);
            }
            else{
                seen.add(arr[i]);
            }
        } 
        System.out.println("the duplicate element in an array is "+duplicate);
    }
    
}
