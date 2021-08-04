package house_objects_practice;

public class BuildAHome {

    public static void main(String[] args) {

        House house1 = new House();
        House house2 = new House();

        house1.color = "White";
        house2.color = "blue";

        System.out.println(house1.color);
        System.out.println(house2.color);
    }
}
