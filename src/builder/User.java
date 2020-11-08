package builder;

public class User {
    String name;
    String phone;
    int age;
    String address;

    public User(String name, String phone, int age, String address) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.address = address;
    }
    public User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
