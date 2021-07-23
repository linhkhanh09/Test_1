package fs.apidef.identifyservice.java.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1. Use the keyboard to enter the number N.
 *
 * 2. Use the keyboard to enter N integers and put them in a list: the getIntegerList method.
 *
 * 3. Find the minimum among the list items: the getMinimum method.
 *
 * Requirements:
 * •The program should read values from the keyboard.
 * •The getIntegerList() method should read the number N from the keyboard and then return a list of N elements, which has been filled with numbers read from the keyboard.
 * •The getMinimum() method must return the minimum among the list items.
 * •The main() method should call the getIntegerList() method.
 * •The main() method should call the getMinimum() method.
 */

public class Task_4 {
    public static void main(String[] args) throws Exception{
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> totatlList = new ArrayList<Integer>();
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        System.out.println("N: " + n);

        for (int i = 0; i < n; i++) {
            s = reader.readLine();
            Integer x = Integer.parseInt(s);
            totatlList.add(x);
        }
        return totatlList;
    }
}
