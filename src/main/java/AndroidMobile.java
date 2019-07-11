public class AndroidMobile extends Mobile {

    public AndroidMobile() {
    }

    public AndroidMobile(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void makeACall(String message) {
        System.out.println("<Andriod>Message : [" + message + "]");
    }
}
