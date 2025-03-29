import java.util.*;
import java.util.function.Function;

class Array<T extends Number & Comparable<T>> {
    private final T[] elements;
    private final Function<Integer, T> generator; // Функция для создания элементов

    public Array(T[] elements, Function<Integer, T> generator) {
        this.elements = elements;
        this.generator = generator; // Сохраняем фабричный метод
    }

    // Заполнение массива случайными числами
    public void fillRandom(Random random, int min, int max) {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = generator.apply(random.nextInt(max - min + 1) + min);
        }
    }

    // Отображение массива
    public void display() {
        System.out.println(Arrays.toString(elements));
    }

    // Поиск максимального значения
    public T max() {
        return Collections.max(Arrays.asList(elements));
    }

    // Поиск минимального значения
    public T min() {
        return Collections.min(Arrays.asList(elements));
    }

    // Среднее арифметическое
    public double average() {
        double sum = 0;
        for (T el : elements) {
            sum += el.doubleValue();
        }
        return sum / elements.length;
    }
}