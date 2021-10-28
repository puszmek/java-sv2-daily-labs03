package day02;

public class Matrix {

    public void printMatrix(int[][] m){
        for (int i[] : m) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public boolean checkMatrix(int[][] m) {
        for (int i = 1; i < m.length; i++) {
            for (int j = 0; j < i; j++) {
                if (m[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Matrix matrix = new Matrix();

        int[][] startArray = {{1, 2, 3}, {0, 6, 7}, {0, 0, 9}};
        matrix.printMatrix(startArray);
        System.out.println("A mátrix főátlója alatt minden elem 0.");
        System.out.println(matrix.checkMatrix(startArray));

        int[][] startArray1 = {{1, 2, 3}, {7, 6, 7}, {0, 3, 9}};
        matrix.printMatrix(startArray1);
        System.out.println("A mátrix főátlója alatt minden elem 0.");
        System.out.println(matrix.checkMatrix(startArray1));
    }
}
