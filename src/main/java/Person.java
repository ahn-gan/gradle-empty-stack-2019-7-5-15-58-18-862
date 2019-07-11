public class Person {

    private String name;

    private Mobile mobile;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public Mobile getMobile() {
        return mobile;
    }
}
