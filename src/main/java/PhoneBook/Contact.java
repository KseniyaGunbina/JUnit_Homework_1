package PhoneBook;

public class Contact {
    private String phoneNumber;
    private String name;

    public Contact(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Имя: " + name + "; тел.: " + phoneNumber;
    }
}
