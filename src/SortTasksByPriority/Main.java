package SortTasksByPriority;

/**
 * /**
 *  * Сортировка массива задач по приоритету (Heap Sort)
 *  * Вам дан список задач, каждая из которых имеет приоритет (целое число).
 *  * Напишите функцию sortTasksByPriority, которая сортирует задачи по
 *  * убыванию приоритета с использованием сортировки кучей (Heap Sort).
 *  */

import java.util.Arrays;

import static SortTasksByPriority.HeapSortTasks.sortTasksByPriority;

public class Main {
 public static void main(String[] args) {
  int[] tasks = {3, 1, 4, 2, 5};
  System.out.println(Arrays.toString(sortTasksByPriority(tasks))
  );
 }
}