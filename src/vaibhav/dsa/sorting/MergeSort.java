package vaibhav.dsa.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {30, 10, 18, 3, 2, 16, 50};
        int[] res = mergeSort(a, 0, a.length - 1);
        for (int x : res) System.out.print(x + " ");
    }

    private static int[] mergeSort(int[] a, int low, int high) {
        if (low == high) { // only one element
            int[] baseArray = new int[1];
            baseArray[0] = a[low];
            return baseArray;
        }
        int mid = (low + high) / 2;

        int[] firstSortedHalf = mergeSort(a, low, mid);
        int[] secondSortedHalf = mergeSort(a, mid + 1, high);
        int[] fullSortedArray = merge(firstSortedHalf, secondSortedHalf);
        return fullSortedArray;
    }

    private static int[] merge(int[] left, int[] right) {
        int l = left.length;
        int r = right.length;
        int a[] = new int[l + r];

        int i = 0, j = 0, k = 0;
        while (i < l && j < r) {
            if (left[i] <= right[j]) a[k++] = left[i++];
            else a[k++] = right[j++];
        }
        while (i < l) a[k++] = left[i++];
        while (j < r) a[k++] = right[j++];
        return a;
    }

//    private static void mergeSort(int [] a) {
//        divide(a);
//    }
//
//    private static void divide(int[] a) {
//       int n = a.length;
//       int mid = n/2;
//       if(n==1) return;
//       int left[] = new int [mid];
//       int right[] = new int[n-mid];
//       for(int i =0; i < mid; i++) left[i] = a[i];
//       for(int i =mid; i < n; i++) right[i-mid] = a[i];
//       divide(left);
//       divide(right);
//       merge(a,left,right);
//
//    }
//
//    private static void merge(int[] a, int[] left, int[] right) {
//        int l = left.length;
//        int r = right.length;
//        int i=0,j=0,k=0;
//        while(i < l && j < r) {
//            if(left[i] <= right[j]) a[k++] = left[i++];
//            else a[k++] = right[j++];
//        }
//        while(i < l) a[k++] = left[i++];
//        while(j < r) a[k++] = right[j++];
//    }
}
