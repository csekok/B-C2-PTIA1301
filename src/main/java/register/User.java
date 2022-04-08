package register;

public class User {
    private String name;
    private int birthYear;
    private String address;
    private final EyeColor eyeColor;

    public User() {
        this("John Doe", 1987, "Baker Street 135", EyeColor.BROWN);
    }

    public User(String name, int birthYear, String address) {
        this(name, birthYear, address, EyeColor.BROWN);
    }

    public User(String name, int birthYear, String address, EyeColor eyeColor) {
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
        this.eyeColor = eyeColor;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int ageIn(int year) {
        if (year < birthYear) {
            return 0;
        }
        return year - birthYear;
    }

    /*
    @Override
    public String toString() {
        return name;
    }
     */

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", address='" + address + '\'' +
                ", eyeColor=" + eyeColor +
                '}';
    }
}
