import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        bubbleSort();
//        selectionSort();
        insertionSort();
    }

    // time complexity = O(n^2)
    private static void bubbleSort(){
        int arr[] = {7,2,5,8,1};
        for (int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(element -> System.out.print(element+" "));
    }

    // time complexity = O(n^2)
    private static void selectionSort(){
        int arr[] = {7,2,5,8,1};
        for (int i = 0; i < arr.length-1; i++){
            int smallest = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j]<arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        Arrays.stream(arr).forEach(element -> System.out.print(element+" "));
    }

    // time complexity
    private static void insertionSort(){
        int arr[] = {7,2,5,8,1};
        for (int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i -1;
            // insertion
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            // placement
            arr[j+1] = current;
        }
        Arrays.stream(arr).forEach(element -> System.out.print(element + " "));
    }
}