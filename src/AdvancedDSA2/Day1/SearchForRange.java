package AdvancedDSA2.Day1;

import java.util.ArrayList;

public class SearchForRange {
    public static void main(String[] args) {
        int[] A = {1};
        int B = 1;

        ArrayList list = new ArrayList();
        list.add(search1(A,B));
        list.add(search2(A,B));

        System.out.println(list);
    }
    static int search1(int[] A, int k) {
        int index = -1;
        int low = 0;
        int high = A.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] == k) {
                index = mid;
                high = mid - 1;
            }else if (A[mid] < k) {
                low = mid + 1;
            }else  {
                high = mid - 1;
            }
        }
        return index;
    }

    static int search2(int[] A, int k) {
        int index = -1;
        int low = 0;
        int high = A.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] == k) {
                index = mid;
                low = mid + 1;
            }else if (A[mid] < k) {
                low = mid + 1;
            }else  {
                high = mid - 1;
            }
        }
        return index;
    }

}
