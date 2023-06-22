package Task1And2;

public class Mall {

    String name;
    String address;
    Store[] storesCapacity = new Store[3];
    int startingYear;

    public Mall(String name, String address, int startingYear) {
        this.name = name;
        this.address = address;
        this.startingYear = startingYear;
    }

    @Override
    public String toString() {
        return "Здравейте вие посетихте " + name + " основан през " + startingYear + " на адрес " + address + ", който има " + storesCapacity.length + " магазини.\n" +
                storesCapacity[0].storeName +" основан през " + storesCapacity[0].startingYear + " продава стока " + storesCapacity[0].typeOfInventory + " и се намира на етаж " + storesCapacity[0].level + " с идентификационен номер:" + storesCapacity[0].storeId +"\n" +
                storesCapacity[1].storeName +" основан през " + storesCapacity[1].startingYear + " продава стока " + storesCapacity[1].typeOfInventory + " и се намира на етаж " + storesCapacity[1].level + " с идентификационен номер:" + storesCapacity[1].storeId +"\n" +
                storesCapacity[2].storeName +" основан през " + storesCapacity[2].startingYear + " продава стока " + storesCapacity[2].typeOfInventory + " и се намира на етаж " + storesCapacity[2].level + " с идентификационен номер:" + storesCapacity[2].storeId +"\n";
    }
}
