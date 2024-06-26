
import java.util.List;
import java.util.Map;
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
        testFrequencyMap();
    }

    public static void testRandomInteger() {
        System.out.println("LISTA DI NUMERI DA 1 a 10: ");
        List<Integer> randomZeroTen = DataHelper.getRandomInteger(7);
        System.out.println(randomZeroTen);

        System.out.println("--------------------------------------");

        System.out.println("LISTA DI NUMERI DA 1 a MAX: ");
        List<Integer> randomZeroMax = DataHelper.getRandomInteger(6, 5);
        System.out.println(randomZeroMax);

        System.out.println("--------------------------------------");

        System.out.println("LISTA DI NUMERI DA MIN a MAX: ");
        List<Integer> randomMinMax = DataHelper.getRandomInteger(5, 6, 10);
        System.out.println(randomMinMax);

        System.out.println("--------------------------------------");

    }

    public static void testRandomUniqueInteger() {
        System.out.println("LISTA DI NUMERI UNIVOCI DA 1 a 10: ");
        Set<Integer> randomUnique = DataHelper.getRandomUniqueInteger(4);
        System.out.println(randomUnique);

        System.out.println("--------------------------------------");

        System.out.println("LISTA DI NUMERI UNIVOCI DA 1 a MAX: ");
        Set<Integer> randomUniqueZeroMax = DataHelper.getRandomUniqueInteger(5, 10);
        System.out.println(randomUniqueZeroMax);

        System.out.println("--------------------------------------");

        System.out.println("LISTA DI NUMERI UNIVOCI DA MIN a MAX: ");
        Set<Integer> randomUniqueMinMax = DataHelper.getRandomUniqueInteger(5, 2, 7);
        System.out.println(randomUniqueMinMax);

        System.out.println("--------------------------------------");

    }

    public static void testFrequencyMap() {
        System.out.println("LISTA DI NUMERI DA CONTROLLARE: ");
        List<Integer> randomNumberForFrequency = DataHelper.getRandomInteger(14);
        System.out.println(randomNumberForFrequency);
        Map<Integer, Integer> frequencyMap = DataHelper.getFrequencyMap(randomNumberForFrequency);

        System.out.println(frequencyMap);
    }

}
