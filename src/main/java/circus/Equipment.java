<<<<<<< HEAD:src/main/java/circus/Equipment.java
package circus;

public abstract class Equipment {
=======
public abstract class Equipment implements Asset {
>>>>>>> master:src/main/java/Equipment.java
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getValue() {
        return purchasePrice;
    }
}
