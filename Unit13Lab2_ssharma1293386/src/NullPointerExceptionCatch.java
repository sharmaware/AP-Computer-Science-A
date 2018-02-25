
public class NullPointerExceptionCatch {

    public static void main(String[] args) {
        try {
            Object object = null;
            object.toString();
        } catch (NullPointerException e) {
            System.out.printf("NullPointerException is a RuntimeException that occurs when a program tries to access an object that has value null. In this example, object is given the value of null and the the toString() method thus throws a NullPointerException.");
        }
    }
}
