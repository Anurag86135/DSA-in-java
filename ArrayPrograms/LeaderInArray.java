package ArrayPrograms;

public class LeaderInArray {
    public static void Find_Leader(int [] arr) {
        int n=arr.length;
        //last elemnt is always a leader
        int maxFoundRight=arr[n-1];
         System.out.print("[");
        System.out.print("Leaders: "+ maxFoundRight + " , ");

  
        //loop from second last element to the begining
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxFoundRight){
                maxFoundRight=arr[i];
                System.out.print(maxFoundRight +" , ");
                
            }

        }
        System.out.println("]");

    }    
     public static void main(String[] args) {
        int arr[]={16,17,4,5,3,2};
        Find_Leader(arr);

    
}
}
