import java.util.Scanner;
//импортируем класс Scanner из библиотеки Java.util, который позволяет считывать данные с консоли.

public class binarnyi {//объявляем класс с именем "binarnyi".
    public static void main(String[] args) {
        //объявляем метод main, который является точкой входа в программу.
        Scanner scanner = new Scanner(System.in);
        //создаем объект класса Scanner для считывания данных с консоли.
        System.out.print("Введите длину списка: ");
        //выводим сообщение на консоль с просьбой ввести длину списка.
        int length = scanner.nextInt();
//считываем введенное пользователем значение и сохраняем его в переменную length.
        int[] value = new int[length];
        //создаем массив целых чисел длиной length и сохраняем его в переменную value.

        System.out.println("Введите элементы списка в отсортированном порядке:");
        //выводим сообщение на консоль с просьбой ввести элементы списка в отсортированном порядке.
        for (int i = 0; i < length; i++) {//считываем введенные пользователем значения и сохраняем их в массиве value.
            value[i] = scanner.nextInt();
        }

        System.out.print("Введите значение, которое нужно найти(а точнее число, индекс которого мы должны найти): ");
        //выводим сообщение на консоль с просьбой ввести значение, которое нужно найти.
        int valueToFind = scanner.nextInt();
        //считываем введенное пользователем значение и сохраняем его в переменную valueToFind.

        System.out.println(binarySearch(value, valueToFind));
    }   //выводим на консоль результат выполнения метода binarySearch с аргументами value и valueToFind.

    private static int binarySearch(int[] values, int valueToFind) {
        //объявляем метод binarySearch с двумя аргументами:
        // массивом целых чисел values и целым числом valueToFind. Метод возвращает целое число.
        int index = -1;
        int low = 0;
        int high = values.length - 1;

        while (low <= high) {
            //начинаем цикл while, который будет выполняться до тех пор
            // , пока значение переменной low меньше или равно значению переменной high.
            int mid = low + (high - low) / 2;
            //вычисляем середину диапазона поиска и сохраняем ее в переменную mid.
            if (values[mid] < valueToFind) {
                low = mid + 1;
                //если значение элемента массива, находящегося по индексу mid,
                // меньше значения переменной valueToFind, то устанавливаем значение переменной low равным mid + 1.
            } else if (values[mid] > valueToFind) {
                high = mid - 1;
                //если значение элемента массива, находящегося по индексу mid,
                // больше значения переменной valueToFind, то устанавливаем значение переменной high равным mid - 1.
            } else if (values[mid] == valueToFind) {
                index = mid;
                //если значение элемента массива, находящегося по индексу mid, равно
                // значению переменной valueToFind, то устанавливаем значение переменной index равным mid и выходим из цикла.
                break;//заканчиваем цикл
            }
        }

        return index;//возвращаем значение переменной index.
    }
}