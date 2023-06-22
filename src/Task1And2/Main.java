package Task1And2;

public class Main {

    public static void main(String[] args) {
        Mall mall = new Mall("Bulgaria mall", "Bul. Bulgaria", 2010);
        Store a = new Store("A1", "Phone Services", 0, 2010);
        Store b = new Store("Pizza Hub", "Food services", 3, 2011);
        Store c = new Store("H&M", "Clothes", 1, 2012);

        mall.storesCapacity[0] = a;
        mall.storesCapacity[1] = b;
        mall.storesCapacity[2] = c;

        System.out.println(mall);

        System.out.println("10 years have passed, store H&M is no longer working\n");

        Store d = new Store("Pull&Bear", "Clothes", 1, 2022);

        mall.storesCapacity[2] = d;

        System.out.println(mall);


    }

}
