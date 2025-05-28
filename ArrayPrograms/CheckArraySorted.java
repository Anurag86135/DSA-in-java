package ArrayPrograms;

import java.util.Scanner;
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
            Scanner sc =new Scanner(System.in);
            System.out.println("enter the size of an array");
            int n=sc.nextInt();
            int arr [] = new int[n];
            System.out.println("enter the elements of the array");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("the Array according to you is given below");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+ ",");
            }
            // int arr[]={1,2,3,4,556};
            System.out.println();
           boolean result= CheckArray(arr);
             System.out.println("Is given array is sorted  ->>" + result);
            

        }
    }
    

