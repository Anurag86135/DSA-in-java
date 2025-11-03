package ArrayPrograms;


public class AlternateNagativePositive {
    public static void main(String[] args){


    int[]arr ={1,2,3,-4,-1,4};
    int pos[] =new int [arr.length];
    int neg[] =new int[arr.length];
    int p=0;
    int n=0;
    for(int num : arr){
        if(num>=0) pos[p++]=num;
        else
        neg[n++]=num;

    }
    int i=0,j=0,k=0;
    while(i<p&&j<n){
        arr[k++]=neg[j++];
        arr[k++]=neg[i++];

    }
    while(i<p)
    arr[k++]=pos[i++];

    while(j<n){
        arr[k++]=neg[j++];
    }
    System.out.print("result: ");
    for(int num :arr){
        System.out.print(num + " ");
    }
}
}
