package lotto;

import lombok.Getter;

import static lotto.IntegerValidateUtils.isNumber;

public class LottoNumber {

    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 45;

    @Getter
    private final int lottoNumber;

    public LottoNumber(String lottoNumber) {
        validate(lottoNumber);

        this.lottoNumber = Integer.parseInt(lottoNumber);
    }

    private void validate(String input) {
        if(!isNumber(input)) {
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }

        int lottoNumber = Integer.parseInt(input);

        if (isOutOfBound(lottoNumber)) {
            throw new IllegalArgumentException("1~45 값을 입력해주세요");
        }
    }

    private boolean isOutOfBound(int lottoNumber) {
        return lottoNumber < LOWER_BOUND || lottoNumber > UPPER_BOUND;
    }
}