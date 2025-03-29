import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int[][] data;

    public Matrix(int rows, int cols) {
        data = new int[rows][cols];
    }

    // Заполнение случайными значениями
    public void fillRandom(Random random, int min, int max) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
    }

    // Отображение матрицы
    public void display() {
        for (int[] row : data) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Сложение матриц
    public Matrix add(Matrix other) {
        Matrix result = new Matrix(data.length, data[0].length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    // Среднее арифметическое
    public double average() {
        double sum = 0;
        int count = 0;
        for (int[] row : data) {
            for (int val : row) {
                sum += val;
                count++;
            }
        }
        return sum / count;
    }
}
