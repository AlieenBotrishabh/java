public class Quicksort {
    public static int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp = a[i];
        a[i] = pivot;
        a[high] = temp;

        return i;
    }

    public static void quicksort(int a[], int low, int high) {
        if (low < high) {
            int pid = partition(a, low, high);
            quicksort(a, low, pid - 1);
            quicksort(a, pid + 1, high);
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 7, 2, 3, 5, 9};
        quicksort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
