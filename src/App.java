
import java.util.List;
import java.util.Set;

/**
 * TODO:
 *
 * completare la classe DataHelper
 *
 * aggiungere i seguenti metodi per testare la classe DataHelper: -
 * testRandomInteger : void testare le 3 implementazioni del metodo
 * getRandomInteger
 *
 * - testRandomUniqueInteger : void testare le 3 implementazioni del metodo
 * getRandomUniqueInteger
 *
 * - testFrequencyMap : void testare il metodo getFrequencyMap; sfruttare i
 * metodi precedentemente svolti e utilizzarli come dati in ingresso per il
 * metodo getFrequencyMap
 *
 */
public class App {

    public static void main(String[] args) throws Exception {
        testRandomInteger();
        testRandomUniqueInteger();
    }

    public static void testRandomInteger() {
        List<Integer> randomZeroTen = DataHelper.getRandomInteger(7);
        System.out.println(randomZeroTen);

        List<Integer> randomZeroMax = DataHelper.getRandomInteger(6, 5);
        System.out.println(randomZeroMax);

        List<Integer> randomMinMax = DataHelper.getRandomInteger(5, 6, 10);
        System.out.println(randomMinMax);
    }

    public static void testRandomUniqueInteger() {
        Set<Integer> randomUnique = DataHelper.getRandomUniqueInteger(4);
        System.out.println(randomUnique);

    }

}
