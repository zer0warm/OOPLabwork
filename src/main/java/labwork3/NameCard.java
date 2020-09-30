package labwork3;
public class NameCard {
    private final String name;
    private final String phone;
    private final String email;

    NameCard(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    String getName() {
        return this.name;
    }

    String getPhone() {
        return this.phone;
    }

    String getEmail() {
        return this.email;
    }

    public void printNameCard() {
        System.out.println("Name:\t" + getName());
        System.out.println("Phone:\t" + getPhone());
        System.out.println("Email:\t" + getEmail());
    }
}
