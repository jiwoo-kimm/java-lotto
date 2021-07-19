package lotto.domain;

import lombok.Getter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LottoSet {

    @Getter
    private final Set<Lotto> lottoSet;

    public LottoSet(Set<Lotto> lottoSet) {
        this.lottoSet = Collections.unmodifiableSet(lottoSet);
    }

    public LottoSet(PurchaseCount purchaseCount) {
        this(generateRandomLottoSetWithSize(purchaseCount.getPurchaseCount()));
    }

    private static Set<Lotto> generateRandomLottoSetWithSize(int targetSize) {
        Set<Lotto> lottoSet = new HashSet<>();
        while (lottoSet.size() < targetSize) {
            lottoSet.add(new RandomLotto());
        }
        return lottoSet;
    }
}
