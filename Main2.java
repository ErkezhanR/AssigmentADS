import java.util.Arrays;
import java.util.List;

class Main2 {
    private static double getAverage(List<Integer> list) {
        return list.stream()
                .mapToInt(a -> a)
                .average().orElse(0);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 3, 2, 4, 1);

        double avg = getAverage(list);
        System.out.println(avg);
    }
}