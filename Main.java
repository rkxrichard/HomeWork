import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
//        removeRepetitions();
//        startWith("W");
          secondBiggestElement();
    }

    private static void removeRepetitions () {
        List<?> list = Arrays.asList("nds",14,"nds",14,23.2);
        List<?> newList = list.stream()
                .distinct()
                .toList();
        System.out.println(newList);
    }

    private static void startWith(String word) {
        List<String> list = Arrays.asList("World","Glow","wear","Edge","Weather");
        List<String> startWithWord = list.stream()
                .filter(a -> a.startsWith(word.toLowerCase()) || a.startsWith(word.toUpperCase()) )
                .toList();
        System.out.println(startWithWord);
    }

    private static void secondBiggestElement() {
        List<Integer> list = Arrays.asList(12,45,6,78,87,434,34,567,99,346);
//        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
        int secondBiggest = list.stream().skip(1).findFirst().orElse(0);
        System.out.println(secondBiggest);

    }
}