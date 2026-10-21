public class CellphoneApplication {
    public static void main(String[] args) {

        Cellphone phone = new Cellphone("2597153",
                "iPhone 15 Pro Max",
                "Verizon",
                "888-555-1234",
                "Sandra");

        System.out.println(phone.serialNumber);
        System.out.println(phone.model);
        System.out.println(phone.carrier);
        System.out.println(phone.phoneNum);
        System.out.println(phone.owner);
    }

}
