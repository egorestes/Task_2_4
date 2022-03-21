
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // создаём экземпляр нашего класса для списка
        List<String> list = new List<>();

        // добавляем в него элементы
        String[] strings = {"1", "2", "3", "4", "5", "6", "7"};
        for (int i = 0; i < strings.length; i++) {
            list.addItem(strings[i]);
        }

        System.out.println("Содержимое односвязного списка:");
        System.out.println(list.toString());

        Scanner scn = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scn.nextInt();
        System.out.print("Введите K: ");
        int k = scn.nextInt();

        list.removeNodes(n, k);
        System.out.println();

        System.out.println("Список после удаления элементов под номерами от N до K (не включая конец):\n" + list.toString());
    }
}
