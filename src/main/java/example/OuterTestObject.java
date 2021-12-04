package example;

public class OuterTestObject {
    private final InnerTestObject innerTestObject;

    public OuterTestObject(InnerTestObject innerTestObject) {
        this.innerTestObject = innerTestObject;
    }

    public InnerTestObject getInnerTestObject() {
        return innerTestObject;
    }
}
