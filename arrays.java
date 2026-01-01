public class arrays {
    public static void changearr(int arr[],int i,int val){
        if(i==arr.length){           //base case
            newarray(arr);
            return;
        }
        arr[i] = val;              //recursion
        changearr(arr, i+1, val+1);
        arr[i] = arr[i] -2;        //backtracking step
    }

    public static void newarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int arr[] = new int[5];
        changearr(arr, 0, 1);
        newarray(arr);                       //time complexity O(n) space O(n) due to recursion in stack
    }
}
