package test.no2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
    private Set<Integer> numbers;

    public Lotto() {
        numbers = generateLottoNumbers();
    }

    public Set<Integer> getNumbers() {
        generateLottoNumbers();
        return numbers;
    }

    private Set<Integer> generateLottoNumbers() {
        Random random = new Random();
        numbers = new TreeSet<>();

        while(numbers.size() != 6) {
            numbers.add(random.nextInt(45) + 1);
        }
        return numbers;
    }

    @Override
    public String toString() {
        return "Lotto { numbers = " + numbers + " }";
    }
}