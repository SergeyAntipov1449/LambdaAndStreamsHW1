package Task1;
//        Программа должна вывести на экран среднее значение всех четных чисел в списке.
//                Напишите программу, которая использует Stream API для обработки списка чисел.

import java.util.Arrays;

public class AvgNumber {
    static void AverageNumber(int[] numbers) {
        if (numbers.length < 2) {
            System.out.println("Последовательность чисел должна быть больше 2х");
            return;
        }
        System.out.println(Arrays.stream(numbers)
                .filter(i -> i % 2 == 0)
                .average()
                .orElse(0));
    }
}
