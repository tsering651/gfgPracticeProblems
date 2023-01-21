import java.util.HashMap;

public class countDistictElementInWindow {
    // function to print the distinct elements in every window of size k
    static void printDistinct(int arr[], int k) {
        int n = arr.length;
        // frequency map
        HashMap<Integer, Integer> mp = new HashMap<>();
        // creating frequency map for first window
        for (int i = 0; i < k; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);

        }
        System.out.print(mp.size() + " ");

        // for rest of the window
        for (int i = k; i < n; i++) {

            mp.put(arr[i - k], mp.get(arr[i - k]) - 1);

            if (mp.get(arr[i - k]) == 0) {
                mp.remove(arr[i - k]);0
            }
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);

            System.out.print(mp.size() + " ");
        }
    }

    public static void main(String[] args) {
          int arr[]={10,20,20,10,30,40,10};
          int k=4;
          printDistinct(arr, k);
    }

}
