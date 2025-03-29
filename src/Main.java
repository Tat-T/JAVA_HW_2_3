import java.util.Random;

public class Main {
    public static void main(String[] args) {
       Random random = new Random();
         // Создаем массив Integer
         Integer[] intArray = new Integer[10];
         Array<Integer> intArrayObj = new Array<>(intArray, Integer::valueOf);
 
         intArrayObj.fillRandom(random, 1, 100);
         intArrayObj.display();
         System.out.println("Макс: " + intArrayObj.max() + ", Мин: " + intArrayObj.min() + ", Среднее: " + intArrayObj.average());
       
        // Тест Matrix
        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(3, 3);
        matrix1.fillRandom(random, 1, 10);
        matrix2.fillRandom(random, 1, 10);

        System.out.println("Матрица 1:");
        matrix1.display();

        System.out.println("Матрица 2:");
        matrix2.display();

        System.out.println("Сумма матриц:");
        Matrix sumMatrix = matrix1.add(matrix2);
        sumMatrix.display();

        System.out.println("Среднее значение: " + matrix1.average());
    
    }
}