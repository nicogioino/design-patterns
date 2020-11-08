package builder;

public class UserMain {
    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder();
        userBuilder.name("nico");
        userBuilder.age(17);
        User user = userBuilder.build();
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.address);
    }
}
