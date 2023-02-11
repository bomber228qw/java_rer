public class lesson_12 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4};
        int[] array2 = new int[]{5, 6};
        int[] array3 = new int[6];
        for (int i = 0; i < 6; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(array3[i]);;
        }
    }
}