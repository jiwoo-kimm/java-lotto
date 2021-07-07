package lotto.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RandomLotto extends Lotto {

    private static final int INDEX_LOWER_BOUND = 0;
    private static final int INDEX_UPPER_BOUND = 6;

    public RandomLotto() {
        super(generateRandomLottoNumbers());
    }

    private static List<LottoNumber> generateRandomLottoNumbers() throws IllegalArgumentException {
        List<Integer> defaultNumbers = new ArrayList<>(DefaultNumbers.getDefaultNumbers());
        Collections.shuffle(defaultNumbers);
        return defaultNumbers.subList(INDEX_LOWER_BOUND, INDEX_UPPER_BOUND)
                .stream()
                .map(String::valueOf)
                .map(LottoNumber::new)
                .collect(Collectors.toList());
    }
}
