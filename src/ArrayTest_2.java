public class ArrayTest_2 {
    public static void main(String[] args) {
        int[][] num1 = new int[2][3];           //int[][]까지가 타입.

        int[][] num2 = new int[3][];            //어디까지 채워질지 모르기 때문에 비워놈.
        num2[0] = new int[1];
        num2[1] = new int[2];
        num2[2] = new int[10];
    }
}
