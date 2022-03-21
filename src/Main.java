
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> list = new List<>();

        String[] strings = {"1", "2", "3", "4", "5", "6", "7"};

        for (String string : strings) {
            list.addItem(string);
        }

        System.out.println("Содержимое односвязного списка:");
        System.out.println(list);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите n: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.print("Введите k: ");
        int k = Integer.parseInt(reader.readLine());

        list.removeNodes(n, k);
        System.out.println();

        System.out.println("Список после удаления элементов c n по k (не включая конец):\n" + list.toString());
    }
}
