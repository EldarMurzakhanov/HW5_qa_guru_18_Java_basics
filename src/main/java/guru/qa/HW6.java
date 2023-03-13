package guru.qa;

public class HW6 {
    public static void main(String[] args) {

//        Арифметические операторы
        int a = 15;
        int b = 7;

        int sum = a + b; // сложение
        System.out.println("Cложение: " + sum);
        int diff = a - b; // вычитание
        System.out.println("Вычитаение: " + diff);
        int product = a * b; // умножение
        System.out.println("Умножение: " + product);
        int division = a / b; // деление
        System.out.println("Деление: " + division);
        int remainder = a % b; // остаток от деления
        System.out.println("Остаток: " + remainder);

//        Операторы присвоения
        int c = 15;
        System.out.println("c = " + c);
        c += 3; // эквивалентно c = c + 5
        System.out.println("Эквивалентно c = c + 5: " + c);
        c -= 5; // эквивалентно c = c - 5
        System.out.println("Эквивалентно c = c - 5: " + c);
        c *= 5; // эквивалентно c = c * 5
        System.out.println("Эквивалентно c = c * 5: " + c);
        c /= 3; // эквивалентно c = c / 5
        System.out.println("Эквивалентно c = c / 5: " + c);
        c %= 14; // эквивалентно c = c % 5
        System.out.println("Эквивалентно c = c % 5: " + c);

//        Операторы сравнения
        boolean isEqual = a == b; // равно
        System.out.println(isEqual);
        boolean isNotEqual = a != b; // не равно
        System.out.println(isNotEqual);
        boolean isGreater = a > b; // больше
        System.out.println(isGreater);
        boolean isLess = a < b; // меньше
        System.out.println(isLess);
        boolean isGreaterOrEqual = a >= b; // больше или равно
        System.out.println(isGreaterOrEqual);
        boolean isLessOrEqual = a <= b; // меньше или равно
        System.out.println(isLessOrEqual);

//        Логические операторы
        boolean d = true;
        boolean e = false;
        boolean result1 = d && e; // логическое "и"
        System.out.println("Результат логического 'и': " + result1);
        boolean result2 = d || e; // логическое "или"
        System.out.println("Результат логического 'или': " + result2);
        boolean result3 = !d; // логическое отрицание
        System.out.println("Результат логического отрицания: " + result3);

//        Тернарный оператор
        int min = (a < b) ? a : b; // если a < b, то min = a, иначе min = b
        System.out.println("min = " + min);

//        Переполнение
        int f = Integer.MAX_VALUE; // максимальное значение типа int
        System.out.println("Максимальное значение int: " + f);
        int g = 1;
        int h = f + g; // произойдет переполнение
        System.out.println("Результат из-за переполнения: " + h); // вывод: -2147483648

//        Комбинация разных типов данных (int и double)
        int i = 10;
        double j = 3.14;
        System.out.println(i + j); // приведение к типу данных, который соответствует наибольшей точности вычислений - double
    }
}
