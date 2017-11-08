
public class MergeSorter
{
    public static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int lolist[] = new int [n1];
        int hilist[] = new int [n2];
        for (int i=0; i<n1; ++i)
            lolist[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            hilist[j] = arr[m + 1+ j];
        int  firstPointer = 0, secondPointer = 0;
        int finalPointer = l;
        while ( firstPointer < n1 && secondPointer < n2)
        {
            if (lolist[firstPointer] <= hilist[secondPointer])
            {
                arr[finalPointer] = lolist[firstPointer];
                firstPointer++;
            }
            else
            {
                arr[finalPointer] = hilist[secondPointer];
                secondPointer++;
            }
            finalPointer++;
        }
        while ( firstPointer < n1)
        {
            arr[finalPointer] = lolist[firstPointer];
            firstPointer++;
            finalPointer++;
        }
        while (secondPointer < n2)
        {
            arr[finalPointer] = hilist[secondPointer];
            secondPointer++;
            finalPointer++;
        }
    }
    public static void mergeSort(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr , m+1, r);
            merge(arr, l, m, r);
        }
    }
}