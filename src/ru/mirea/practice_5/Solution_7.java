package ru.mirea.practice_5;
/*
7. Разложение на множители
Дано натуральное число n > 1. Выведите все простые множители этого
числа в порядке не убывания с учетом кратности. Алгоритм должен иметь
сложность O(log n).
 */
public class Solution_7 {
    public static void recursion(int n, int k) {
        // Базовый случай
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        if (n % k == 0) {
            System.out.println(k);
            recursion(n / k, k);
        } // Шаг рекурсии / рекурсивное условие
        else {
            recursion(n, ++k);
        }
    }
    public static void main(String[] args) {
        recursion(135, 2); // вызов рекурсивной функции
        // k- дополнительный параметр. При вызове должен быть равен 2.
    }
}