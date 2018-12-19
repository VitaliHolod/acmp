//По заданному номеру месяца в году требуется определить время года.
//
//Входные данные
//Входной файл INPUT.TXT содержит натуральное число N (N≤100) – номер месяца.
//
//Выходные данные
//В выходной файл OUTPUT.TXT выведите для летних месяцев значение «Summer»,
// для зимних – «Winter», для весенних – «Spring», для осенних – «Autumn».
// Если число не соответствует возможному значению месяца,
// то в этом случае следует вывести «Error».


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_892 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter pw = new PrintWriter(new File("output.txt"));

        int numb = sc.nextInt();
        String res = "Error";

        if (numb > 0 && numb < 13) {
            switch (numb) {
                case 12:
                case 1:
                case 2:
                    res = "Winter";
                    break;

                case 3:
                case 4:
                case 5:
                    res = "Spring";
                    break;

                case 6:
                case 7:
                case 8:
                    res = "Summer";
                    break;

                case 9:
                case 10:
                case 11:
                    res = "Autumn";
                    break;
            }
        }
        pw.print(res);
        pw.close();
    }
}
