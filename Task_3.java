package fs.apidef.identifyservice.java.Test;

import java.util.Scanner;
/**
 * Write a method readString that reads a string from the keyboard.
 *
 * Write a method upperCaseString to change the first letter of each word to uppercase
 *
 * Display the result on the screen.
 *
 * Example input:
 * sam i am.
 *
 * Example output:
 * Sam I Am.
 *
 * Requirements:
 * •The method readString should read a string from the keyboard.
 * •The method upperCaseString should change the first letter of each word to uppercase
 * •The main method displays the result to screen.
 */

public class Task_3 {
    public static String readString()  {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return upperCaseString(s);
    }

    public static String upperCaseString (String s) {
        //return s.substring(0, 1).toUpperCase() + s.substring(1);
        char[] charArray = s.toCharArray();
        boolean foundSpace = true;
        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for(int i = 0; i < charArray.length; i++) {
            // nếu phần tử trong mảng là một chữ cái
            if(Character.isLetter(charArray[i])) {
                // kiểm tra khoảng trắng có trước chữ cái
                if(foundSpace) {
                    //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }
        s = String.valueOf(charArray);
        return s;
    }

    public static void main(String[] args) {
        String output = readString();
        System.out.println(output);
    }
}
