package fs.apidef.identifyservice.java.Test;

import java.util.*;

/**
 Write a program that will read a string containing numbers from the keyboard, each number is separated by comma ","
 Display to screen the whole list of number in decreasing sorting order.
 If string contains alphabetical character instead of a number, then the method should catch an exception and display to screen the message "String contains character which cannot be converted into number".
 Requirements:
 •The program must read a string of numbers from the keyboard.
 •The readData method is to read numbers from the keyboard
 •The readData method must contain a try-catch block.
 •The sortNumber method is to sorting list of numbers into decreasing order.
 •The readData method calls sortNumber method.
 •If the user enters alphabetical character rather than a number, the program should display message "String contains character which cannot be converted into number".
 */

public class Task_1 {
    public List<Integer> readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert data number: ");
        String read = scanner.nextLine();
        read = read.replace(" ", "");
        String[] arr = read.split(",");
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            try {
                listNumber.add(Integer.parseInt(arr[i]));
            } catch (NumberFormatException ex1) {
                System.out.println("String contains character which cannot be converted into number");
            }
        }
        sortNumberList(listNumber);
        return listNumber;
    }
    public List<Integer> sortNumberList(List<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
    public static void main(String[] args) {
        Task_1 task1 = new Task_1();
        List<Integer> listNumber = task1.readData();
        System.out.print("List of number in decreasing sorting order: " + listNumber );
    }
}