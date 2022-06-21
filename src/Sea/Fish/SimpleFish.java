package Sea.Fish;

public class SimpleFish {
    private String fishName;
    private FishType fishType;

    enum FishType{NormalFish, MutatedFish, PerfectFish, EvilFish}

    public SimpleFish(String fishName) {
        this.fishName = fishName.intern();
        fishType = FishType.NormalFish;
    }

    public boolean equals(SimpleFish other) {
        return this.fishName == other.fishName;
    }

    public String toString() {
        return fishName;
    }
}
