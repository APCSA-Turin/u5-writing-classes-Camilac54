package U5T7_StaticMethods1;

public class MainT {
    public static void main(String[] args) {
        // 1.
        Temperature temp1 = new Temperature(78.52, 54.59, "F");
        String info = temp1.tempInfo();
        System.out.println(info);

        // 2.
        Temperature temp2 = new Temperature(23.9, 14.95, "C");
        info = temp2.tempInfo();
        System.out.println(info);

        // 3.
        Temperature temp3 = new Temperature(57.53, 38.65, "F");
        info = temp3.tempInfo();
        System.out.println(info);

        // 4.
        System.out.println(Temperature.convertFtoC(78.5));

        // 5.
        System.out.println(Temperature.convertCtoF(12.6));

        // 6. 
        temp1.changeToC();
        System.out.println(temp1.tempInfo());

        // 7.
        temp1.changeToC();
        System.out.println(temp1.tempInfo());

        // 8.
        temp1.changeToF();
        System.out.println(temp1.tempInfo());

        // 9.
        temp1.changeToF();
        System.out.println(temp1.tempInfo());
    }
}
