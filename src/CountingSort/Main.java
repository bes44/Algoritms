package CountingSort;

import static CountingSort.CountingSortLetters.countLetters;
import static CountingSort.CountingSortLetters.countLettersRus;

/**
 * Напишите функцию countLetters, которая подсчитывает количество каждой
 * буквы в строке и выводит их по порядку алфавита. Функция должна
 * игнорировать регистр букв.
 */
public class Main {
    public static void main(String[] args) {
        String textRus = "Привет мир";
        countLettersRus(textRus);
        System.out.println();
        String text = "Hello World";
        countLetters(text);
    }
}

