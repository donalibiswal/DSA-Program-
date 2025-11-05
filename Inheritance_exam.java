/*create a cls which name is phone with 3 attribute and 2 methods. then create a samsung s24 ultra 
cls which is extend from phone class s24 cls has 2 attribute and 3 method*/

class Phones{
    int price;
    int storage;
    String model;

    void show(String model){
        System.out.println("Model:" + model);
    }
    void getPhone(int storage, int price){
        System.out.println("storage:" + storage + ", price:" + price);
    }
}

class Samsung_s24_ultra extends Phones{
    int price;
    int storage;

    void quality(String quality){
        System.out.println("have a good quality");
    }
    void camera(String size){
        System.out.println("camera size in round");
    }
    void batteryLife(String life){
        System.out.println("battery life: " + life);
    }
}

public class Inheritance_exam{
    public static void main(String[] args) {
        Samsung_s24_ultra s2 = new Samsung_s24_ultra();
        s2.show("s24 ultra");
        s2.getPhone(256, 1200);
        s2.quality("excellent");
        s2.camera("108MP");
        s2.batteryLife("24 hours");

    }
}