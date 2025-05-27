
public class CheckArraySorted {
    
        static boolean CheckArray(int []arr){
           
            for(int i=1;i<arr.length;i++){
                if(arr[i-1]>arr[i]){
                    return false;

                }
            }
              return true;
           
        }
       
        public static void main(String[] args){
            int arr[]={1,2,3,4,556};
           boolean result= CheckArray(arr);
             System.out.println("Is given array is sorted  ->>" + result);
            

        }
    }
    

