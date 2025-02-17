public class ZeroesToLast {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,0,0,1,1,0,1};
        int n = arr.length;
        int index = 0; 
        for(int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                arr[index++] = 1;
            }
        }
        while(index < n) {
            arr[index++] = 0;
        }
        for(int i = 0; i < n; i++)
            System.out.print(arr[i]);
    }
}