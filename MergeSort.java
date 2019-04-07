public class MergeSort {


    public static int[] MergeSort(int[] ar)
    {
        if (ar.length <=1) return ar;

        int midpoint = ar.length/2;

        int left[] = new int[midpoint];
        int right[];

        if (ar.length%2 ==0) right = new int[midpoint];
        else right = new int[midpoint+1];


        //Repopulate arrays
        for (int i =0; i < midpoint; i++) left[i] = ar[i];
        for (int j = 0; j < right.length; j++) right[j] = ar[midpoint+j];

        int[] result; //I don't think that it is essential to create a new instance

        //recursive part
        left = MergeSort(left);
        right = MergeSort(right);

        return result = merge(left, right);
    }

    private static int[] merge(int[] left, int[] right)
    {
        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resulPpointer = 0;


        while (leftPointer < left.length || rightPointer < right.length)
        {
            if (leftPointer < left.length && rightPointer < right.length)
            {
                if (left[leftPointer] < right[rightPointer])
                {
                    result[resulPpointer++] = left[leftPointer++];
                }
                else {
                    result[resulPpointer++] = right[rightPointer++];
                }
            }

            else if (leftPointer < left.length) {
                result[resulPpointer++] = left[leftPointer++];
            }
            else if (rightPointer < right.length) {
                result[resulPpointer++] = right[rightPointer++];
            }

        }

        return  result;

    }

    public static void main(String[] args) {
        int[] ar = {43,5,3,7,5,6,8,9,3,2,1};

        int[] sortedAr = MergeSort(ar);

        for (int i = 0; i< sortedAr.length; i++)
        {
            System.out.print(sortedAr[i] + " ");
        }

    }

}
