
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> list = new List<>();

        String[] strings = {"1", "2", "3", "4", "5", "6", "7"};
        for (int i = 0; i < strings.length; i++) {
            list.addItem(strings[i]);
        }

        System.out.println("Содержимое односвязного списка:");
        System.out.println(list.toString());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите N: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.print("Введите K: ");
        int k = Integer.parseInt(reader.readLine());

        list.removeNodes(n, k);
        System.out.println();

        System.out.println("Список после удаления элементов под номерами от N до K (не включая конец):\n" + list.toString());
    }
}
