package Task1And2;

public class Store {

    String storeName;
    String typeOfInventory;
    final public int storeId;
    private static int storeCount;
    int level;
    int startingYear;

    public Store(String storeName, String typeOfInventory, int level, int startingYear) {
        this.storeName = storeName;
        this.typeOfInventory = typeOfInventory;
        this.level = level;
        this.startingYear = startingYear;
        storeId = storeCount;
        storeCount++;
    }

}
