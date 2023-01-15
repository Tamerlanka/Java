package maraphone.day11;

public class Task_1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);

        System.out.println(warehouse +" "+picker+" "+courier);
        courier.doWork();
        picker.doWork();
        System.out.println(warehouse +" "+picker+" "+courier);
        for(int i=1;i<1500;i++){
            courier.doWork();
            picker.doWork();
        }
        System.out.println(warehouse +" "+picker+" "+courier);
        courier.doWork();
        picker.doWork();
        courier.bonus();
        picker.bonus();
        System.out.println(warehouse +" "+picker+" "+courier);
    }
}
