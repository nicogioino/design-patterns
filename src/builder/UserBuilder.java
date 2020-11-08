package builder;

public  class UserBuilder {

    User user;


    public UserBuilder() {
        user = new User();
    }

    public void age(int age){
        user.setAge(age);
    }

    public void address(String address){
        user.setAddress(address);
    }

    public void phone(String phone){
        user.setPhone(phone);
    }

    public void name(String name){
        user.setName(name);
    }

    public User build(){
        return user;
    }


}
