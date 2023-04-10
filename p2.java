
public class p2{


    // FOR EVERY ELEMENT AT EVEN INDEX
    void even_index(int arr[]){
        System.out.print("EVERY ELEMENT AT EVEN INDEX : ");
        for(int i=1;i<arr.length;i=i+2){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // EVERY ODD ELEMENT
    void odd_element(int arr[]){
        System.out.print("EVERY ODD ELEMENT : ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    // REVERSE THE ARRAY
    void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.print("REVERSE ORDER OF ARRAY : ");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        p2 a=new p2();
        int arr[]=new int[10];
        int number=1;
        for(int i=0;i<arr.length;i++){
            arr[i]=number;
            number++;
        }
        System.out.print("ELEMENTS OF THE ARRAY : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        a.even_index(arr);
        a.odd_element(arr);
        a.reverse(arr);
        // first and last element
        System.out.println("FIRST ELEMENT : "+arr[0]);
        System.out.println("LAST ELEMENT : "+arr[arr.length-1]);


    }
}
