public class CellphoneApplication {
    public static void main(String[] args) {

        Cellphone phone = new Cellphone("2597153",
                "iPhone 15 Pro Max",
                "Verizon",
                "888-555-1234",
                "Sandra");

        display(phone);

        Cellphone phone2 = new Cellphone("6923053",
                "iPhone 13 Pro",
                "AT&T",
                "650-234-4589",
                "Shawn");
        display(phone2);
        phone2.dial(phone.phoneNum);
        phone.dial(phone2.phoneNum);
    }

    public static void display(Cellphone phone) {
        System.out.println(phone.serialNumber);
        System.out.println(phone.model);
        System.out.println(phone.carrier);
        System.out.println(phone.phoneNum);
        System.out.println(phone.owner);
    }
}
