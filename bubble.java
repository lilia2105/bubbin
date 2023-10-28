import java.util.Arrays;
import java.util.Scanner;

public class bubble {//объявляем класс с именем "bubble".
    public static void main(String[] args) {//объявляем метод main, который является точкой входа в программу.
        Scanner input = new Scanner(System.in);//создаем объект класса Scanner для считывания данных с консоли.
        System.out.print("Введите число элементов списка: ");
        //выводим сообщение на консоль с просьбой ввести число элементов списка.
        int n = input.nextInt();
        //считываем введенное пользователем значение и сохраняем его в переменную n.
        int [] chisla = new int[n];
        //создаем массив целых чисел длиной n и сохраняем его в переменную chisla.
        System.out.print("Введите число(-а): ");
        //выводим сообщение на консоль с просьбой ввести числа.
        for (int i = 0; i < n; i++) {
            //считываем введенные пользователем значения и сохраняем их в массиве chisla.
            chisla[i] = input.nextInt();
        }

        boolean isSorted = false;//инициализируем переменную isSorted значением false.
        int buf;//объявляем переменную buf типа int.
        while(!isSorted) {//начинаем цикл while, который будет выполняться до тех пор,
            // пока значение переменной isSorted равно false.
            isSorted = true;
            //устанавливаем значение переменной isSorted равным true.
            for (int i = 0; i < chisla.length-1; i++) {
                // начинаем цикл for, который будет выполняться для каждого элемента массива chisla, кроме последнего.
                if(chisla[i] > chisla[i+1]){
                    //если текущий элемент массива chisla больше следующего элемента, то выполняем следующие действия:
                    isSorted = false;
                  //устанавливаем значение переменной isSorted равным false.
                    buf = chisla[i];
                    //сохраняем значение текущего элемента массива chisla в переменную buf.
                    chisla[i] = chisla[i+1];
                    //присваиваем текущему элементу массива chisla значение следующего элемента.
                    chisla[i+1] = buf;
                    //присваиваем следующему элементу массива chisla значение переменной buf.
                }
            }
        }
        System.out.println(Arrays.toString(chisla));
        //выводим на консоль отсортированный массив chisla с помощью метода toString класса Arrays.
    }
}

