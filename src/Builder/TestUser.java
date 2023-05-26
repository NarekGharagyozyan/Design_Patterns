package Builder;

public final class TestUser {

    private final String name;
    private final String lastName;
    private int age;
    private boolean isArmenian;

    public TestUser(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.isArmenian = userBuilder.isArmenian;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "TestUser:" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isArmenian=" + isArmenian;
    }

    public static class UserBuilder{
        private final String name;
        private final String lastName;
        private int age;
        private boolean isArmenian;

        public UserBuilder(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder isArmenian(boolean isArmenian){
            this.isArmenian = isArmenian;
            return this;
        }

        public TestUser build(){
            return new TestUser(this);
        }
    }
}
