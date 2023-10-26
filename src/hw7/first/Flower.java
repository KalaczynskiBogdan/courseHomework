package hw7.first;

public enum Flower {
    ROSE("Red", "China"),
    LILY("White", "Greece"),
    TULIP("Red", "Iran"),
    PEONY("White", "Mongolia");

    private final String color;
    private final String provenance;

    Flower(String color, String provenance) {
        this.color = color;
        this.provenance = provenance;
    }

    public String getColor() {
        return color;
    }

    public String getProvenance() {
        return provenance;
    }
}
