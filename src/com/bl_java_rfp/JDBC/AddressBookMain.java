public class AddressBookMain {

    public String getWelcomeMessage() {
        return "Welcome to Address Book Program";
    }

    public static void main(String[] args) {
        AddressBookMain main = new AddressBookMain();
        System.out.println(main.getWelcomeMessage());
    }
}