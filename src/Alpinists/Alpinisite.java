package Alpinists;

public class Alpinisite {
    private String name;
    private int age;
    private String address;

    public Alpinisite(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
