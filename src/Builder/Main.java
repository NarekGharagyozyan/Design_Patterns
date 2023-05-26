package Builder;

public class Main {
    public static void main(String[] args) {
        TestUser armenian = new TestUser.UserBuilder("name", "las name")
                .age(18)
                .isArmenian(true)
                .build();
        System.out.println(armenian);
    }
}
