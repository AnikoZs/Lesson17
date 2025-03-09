import java.util.*;

class Apple {
    String type;
    int weight;

    public Apple(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return type + " (" + weight + "g)";
    }
}

class AppleWeightComparator implements Comparator<Apple> {
    @Override
    public int compare(Apple a1, Apple a2) {
        return Integer.compare(a1.weight, a2.weight);
    }
}

public class AppleComparatorExample {
    public static void main(String[] args) {
        List<Apple> apples = createAppleList();
        printApples("Antes de ordenar: ", apples);
        sortApplesByWeight(apples);
        printApples("Después de ordenar por peso: ", apples);
    }

    private static List<Apple> createAppleList() {
        return new ArrayList<>(Arrays.asList(
                new Apple("Fuji", 180),
                new Apple("Granny Smith", 150),
                new Apple("Gala", 200)
        ));
    }

    private static void sortApplesByWeight(List<Apple> apples) {
        apples.sort(new AppleWeightComparator());
    }

    private static void printApples(String message, List<Apple> apples) {
        System.out.println(message + apples);
    }
}
