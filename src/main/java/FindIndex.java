import java.util.List;

class FindIndex {
    int findHighIndex(List<Integer> arr, int key) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = high / 2;

        while (low <= high) {
            int mid_elem = arr.get(mid);
            if (mid_elem <= key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = low + (high - low) / 2;
        }
        if (high == -1) {
            return high;
        }
        if (high < arr.size() && arr.get(high) == key) {
            return high;
        }
        return -1;
    }

    int findLowIndex(List<Integer> arr, int key) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = high / 2;

        while (low <= high) {
            int mid_elem = arr.get(mid);
            if (mid_elem < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = low + (high - low) / 2;
        }
        if (low < arr.size() && arr.get(low) == key) {
            return low;
        }
        return -1;
    }
}
