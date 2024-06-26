
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class DataHelper {

    // TODO: completare i metodi seguenti
    // restituisce una lista di numeri interi casuali compresi tra 0 e 10
    public static List<Integer> getRandomInteger(int size) {

        // List<Integer> list = new ArrayList<>();
        // Random rnd = new Random();
        // for (int x = 0; x < size; x++) {
        //     list.add(rnd.nextInt(11));
        // }
        return getRandomInteger(size, 10);
    }

    // restituisce una lista di numeri interi casuali compresi tra 0 e max
    public static List<Integer> getRandomInteger(int size, int max) {

        // List<Integer> list = new ArrayList<>();
        // Random rnd = new Random();
        // for (int x = 0; x < size; x++) {
        //     list.add(rnd.nextInt(max + 1));
        // }
        return getRandomInteger(size, 0, max + 1);
    }

    // restituisce una lista di numeri interi casuali compresi tra min e max
    public static List<Integer> getRandomInteger(int size, int min, int max) {
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int x = 0; x < size; x++) {
            list.add(rnd.nextInt(min, (max + 1)));
        }
        return list;
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e 10
    public static Set<Integer> getRandomUniqueInteger(int size) {

        // Set<Integer> setList = new HashSet<>();
        // Random rnd = new Random();
        // for (int x = 0; x < size;) {
        //     int numero = rnd.nextInt(11);
        //     if (setList.add(numero)) {
        //         x++;
        //     }
        // }
        return getRandomUniqueInteger(size, 9);
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e max
    public static Set<Integer> getRandomUniqueInteger(int size, int max) {

        // Set<Integer> setList = new HashSet<>();
        // Random rnd = new Random();
        // for (int x = 0; x < size;) {
        //     int numero = rnd.nextInt(max + 1);
        //     if (setList.add(numero)) {
        //         x++;
        //     }
        // }
        return getRandomUniqueInteger(size, 0, max + 1);
    }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra min e max
    public static Set<Integer> getRandomUniqueInteger(int size, int min, int max) {

        // while (setList.size == size) {
        //        set.list.add(rnd.nextInt(min. (max + 1)));
        // return setList;
        Set<Integer> setList = new HashSet<>();
        Random rnd = new Random();

        for (int x = 0; x < size;) {
            int numero = rnd.nextInt(min, (max + 1));
            if (setList.add(numero)) {
                x++;
            }
        }
        return setList;
    }

    // restituisce una mappa di frequenza di numeri interi
    public static Map<Integer, Integer> getFrequencyMap(List<Integer> list) {
        Map<Integer, Integer> numberCounter = new HashMap<>();
        for (int x : list) {
            if (numberCounter.containsKey(x)) {
                numberCounter.put(x, numberCounter.get(x) + 1); 
            }else {
                numberCounter.put(x, 1);
            }
        }
        return numberCounter;
    }
}
