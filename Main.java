public class Main {
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int[] array = { 1, 2, 3, 4, 11, 1, -1, 3, -4 };
        boolean got = ls.linearSearch(array, 3);
        System.out.println(got);
    }
}
