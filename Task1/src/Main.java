/*

Лямбды и Stream API
Напишите программу, которая использует Stream API для обработки списка чисел.
Программа должна вывести на экран среднее значение всех четных чисел в списке.


 */


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,5,7,9,8,16,24,33);

        double average;
        average = numbers.stream()
                .filter(num -> num % 2 == 0 )  // фильтр четных чисел
                .mapToInt(Integer::intValue) // Преобразование в IntStream
                .average()  // Нахождение среднеарифметического чисел
                .orElse(0); // Возвращает 0, если список пустой
        System.out.println("Среднее значение четных чисел: " + average);


    }
}