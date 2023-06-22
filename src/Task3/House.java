package Task3;

public class House {

    private String color;
    private String buildingMaterial;
    final private String nameOfBuilder;
    public Room[] rooms = new Room[4];

    public House(String color, String buildingMaterial, String nameOfBuilder) {
        this.color = color;
        this.buildingMaterial = buildingMaterial;
        this.nameOfBuilder = nameOfBuilder;
    }

    public String getNameOfBuilder() {
        return nameOfBuilder;
    }

}
