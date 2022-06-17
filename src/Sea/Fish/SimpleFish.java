package Sea.Fish;

public class SimpleFish {
    private String fishName;

    public SimpleFish(String fishName) {
        this.fishName = fishName.intern();
    }

    public boolean equals(SimpleFish other) {
        return this.fishName == other.fishName;
    }

    public String toString() {
        return fishName;
    }
}
