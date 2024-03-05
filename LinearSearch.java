public class LinearSearch {
    public boolean linearSearch(int[] array, int search) {
        for (int i = 0; i < array.length; i++) {
            int each = array[i];
            if (each == search) {
                return true;
            }
        }
        return false;
    }
}
