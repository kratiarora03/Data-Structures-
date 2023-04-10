import java.util.Scanner;

public class Array_Question {
    static int largest(int []arr)
    {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int get_count(int []arr,int val){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                ++c;
            }
        }
        return c;
    }
    static int [] del_max_value(int[] arr,int j){
        int[] arr_new = new int[arr.length-1];
        for(int i=0, k=0;i<arr.length;i++){
            if(arr[i]!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        return arr_new;
    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,j,count,sum;
        System.out.print("Enter size of array required : ");
        n =sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the elements in the array : ");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number of distinct integers allowed to maximize sum: ");
        j =sc.nextInt();
        sum=0;
        for(i=1;i<=j;i++){
            count=0;
            int max_val=largest(arr);
            count=get_count(arr,max_val);
            sum=sum+(max_val*count);
            arr=del_max_value(arr,max_val);
        }
        System.out.print("Maximum sum: "+sum);
    }
}


