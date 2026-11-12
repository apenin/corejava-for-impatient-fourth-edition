package chapter05.solution04;

import java.util.Collections;
import java.util.List;

public record ReadResult(ErrorCode code, List<Double> values) {
    public static ReadResult success(List<Double> values) {
        return new ReadResult(ErrorCode.NORMAL, List.copyOf(values));
    }

    public static ReadResult failure(ErrorCode code) {
        return new ReadResult(code, Collections.emptyList());
    }
}
