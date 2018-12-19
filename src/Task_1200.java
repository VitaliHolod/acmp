import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task_1200 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        String[] arr = getArr(sc).toArray(new String[0]);


        for (int i = 0; i < arr.length; i++) {
            pw.print(getStr(arr[i]));
            pw.println();
        }
        pw.close();
    }

    private static String getStr(String s) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();

        Collections.reverse(Arrays.asList(arr));

        for (int i = 0; i < arr.length; i++) {
            res.append(arr[i]).append(" ");
        }
        return res.toString().trim();
    }

    private static List<String> getArr(Scanner sc) throws FileNotFoundException {
        int i = sc.nextInt();
        List<String> list = new ArrayList<>();
        Scanner in = new Scanner(new File("input.txt"));
        while (in.hasNextLine())
            list.add(in.nextLine());
        list.remove(0);

        return list;
    }
}
