public class p3{
    //Sum of all the elements
    void sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("SUM OF ALL THE ELEMENTS : "+sum);
    }
    // Sum of alternate elements in the array
    void sum_alternate(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i=i+2){
            sum=sum+arr[i];
        }
        System.out.println("SUM OF ALTERNATE ELEMENTS : "+sum);
    }
    //Second highest element in the array
    void second_largest(int arr[]){
        int second=0;
        int largest = second = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }
        System.out.println("SECOND HIGHEST ELEMENT : "+second);
    }


    public static void main(String[] args) {
        p3 a=new p3();
        int arr[]=new int[5];
        int number=1;
        for(int i=0;i<arr.length;i++){
            arr[i]=number;
            number++;
        }


        System.out.print("ELEMENTS OF ARRAY : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        a.sum(arr);
        a.sum_alternate(arr);
        a.second_largest(arr);
    }
}





