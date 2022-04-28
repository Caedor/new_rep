import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        countl(word);

    }

    //Sorting method
    static void countl(String word) {
        // sort letters
        char[] chrr = word.toLowerCase().toCharArray();
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (char i : chrr) {
            if (hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i) + 1);
            } else {
                hashMap.put(i, 1);
            }
        }

        //Print sorted letters
        List<Map.Entry<Character, Integer>> list = hashMap.entrySet()
                .stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
        for (Map.Entry<Character, Integer> entry : list) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}

