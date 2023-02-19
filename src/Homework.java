public class Homework {

    //Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки,
    // или слово NO в противном случае.
    //Операцией возведения в степень пользоваться нельзя!
    //Ввод
    //Вывод
    //8: YES
    //3: NO


    public void number(int N) {
        int x = 2;
        if (N == 1) {
            System.out.println("0");
        } else if (N % 2 == 0) {
            while (x != N) {
                x *= 2;
            }
            System.out.println("Yes");
        } else System.out.println("No");

    }
    //Дано натуральное число N. Вычислите сумму его цифр.
    //При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
    //Ввод
    //Вывод
    //179: 17

    public void counter(int N) {
        int sum = 0;
        while (N != 0) {
            sum += N % 10;
            N /= 10;

        }
        System.out.println("Сумма числа равна: " + sum);
    }

    //2.1 Напишите рекурсивный метод, который выводит на экран числа Фибоначчи до N-ого элемента.

    public void fibonacci(int N) {

        int No = 1;
        int N1 = 1;
        int N2;
        System.out.print(No + " " + N1 + " ");
        for (int i = 3; i <= N; i++) {
            N2 = No + N1;
            System.out.print(N2 + " ");
            No = N1;
            N1 = N2;
        }
        System.out.println();
    }

    //Напишите рекурсивный метод, который проверяет, является ли строка палиндромом.

    public boolean isPolindrom(String text) {
        int middle = text.length();
        for (int i = 0; i < (n / 2); i++) {
            if (text.charAt(i) == text.charAt(n - i - 1)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Homework a = new Homework();
        a.number(29);
        a.counter(123);
        a.fibonacci(13);
        a.isPolindrom("abcddcba");
    }
}
