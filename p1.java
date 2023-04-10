import java.util.Scanner;

public class p1{


    static int max(int []arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int min(int []arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array you require : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("enter all the elements in the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=max(arr);
        int min=min(arr);
        int diff=max-min;
        System.out.println("maximum  "+max);
        System.out.println("minimum "+min);
        System.out.println("difference is -  "+diff);
    }
}

