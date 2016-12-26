package methods_encapsulation.overloading;

/**
 *
 * @author ayoubfalah
 */
public class BinarySearch 
{
    /**
     * This subroutine searches in the array a for the value key. 
     * @param key an integer that will be searched in the array a
     * @param a an array of integers.
     * @return the index of the key if it exists in the array a, 
     *         otherwise -1.
     */
    public static int rank(int key, int[] a)
    {
            return rank(key, a, 0, a.length - 1);
    }

    /**
     * This subroutine works similarly to rank(int, int[]) with 
     * the extension that one could give a range [lo, hi] to search
     * only inside of it.
     * @param key an integer
     * @param a an array of integer
     * @param lo the lower bound of the range
     * @param hi the higher bound of the range
     * @return the index of the key if it exists in the array,
     *         otherwise -1
     */
    private static int rank(int key, int[] a, int lo, int hi)
    {
            if (lo > hi) return -1;
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])     return rank(key, a, lo, mid - 1);
            else if(key > a[mid]) return rank(key, a, mid + 1, hi);
            else                  return mid;
    }
}
