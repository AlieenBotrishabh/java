class mergesort {
    public static void conquer(int a[], int start, int mid, int end) {
        int merged[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (a[i] <= a[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = a[j++];
            }
        }
        while (i <= mid) {
            merged[k++] = a[i++];
        }
        while (j <= end) {
            merged[k++] = a[j++];
        }
        for (int idx = 0, jdx = start; idx < merged.length; idx++, jdx++) {
            a[jdx] = merged[idx];
        }
    }

    public static void divide(int a[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        divide(a, start, mid);
        divide(a, mid + 1, end);
        conquer(a, start, mid, end);
    }

    public static void main(String args[]) {
        int a[] = {1, 3, 2, 4, 9};
        System.out.println("Sorted array");
        divide(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
