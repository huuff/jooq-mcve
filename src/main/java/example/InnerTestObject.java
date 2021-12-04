package example;

import java.time.LocalDateTime;

public class InnerTestObject {
    private final LocalDateTime timestamp;

    public InnerTestObject(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
