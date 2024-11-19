public class mergingofarray
{

    public static void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int i = 0;
        int j = 0;
        int k = 0;
        m = nums1.length;
        n = nums2.length;
        int nums3[] = new int[m + n];
        while(i < m && j < n)
        {
            if(nums1[i] < nums2[j])
            {
                nums3[k] = nums1[i];
                i++;
            }
            else
            {
                nums3[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < m)
        {
            nums3[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n)
        {
            nums3[k] = nums1[j];
            j++;
            k++;
        }
        for(k = 0;k < nums3.length;k++)
        {
            System.out.print(nums3[k]);
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        int m = arr1.length;
        int n = arr2.length;
        merge(arr1, m, arr2, n);
    }
}

