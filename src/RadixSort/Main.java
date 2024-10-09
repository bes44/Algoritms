package RadixSort;

import java.util.Arrays;

import static RadixSort.RadixSortPhoneNumbers.sortPhoneNumbers;

/**
 * Напишите функцию sortPhoneNumbers, которая сортирует номера телефонов
 * в порядке возрастания с использованием поразрядной сортировки (Radix Sort).
 */
public class Main {
    public static void main(String[] args) {

        long[] phoneNumbers = {9876543210L, 1234567890L, 5555555555L,
            1000000000L};
System.out.println(Arrays.toString(sortPhoneNumbers(phoneNumbers)));
}
}
