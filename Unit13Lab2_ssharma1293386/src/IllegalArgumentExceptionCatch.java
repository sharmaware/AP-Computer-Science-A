
public class IllegalArgumentExceptionCatch {

    public static void main(String[] args) {
        try {
            IllegalArgumentExceptionThrown.takeTwo(1);
        } catch (IllegalArgumentException e) {
            System.out.printf("IllegalArgumentException is thrown when some method "
                    + "receives an invalid argument. "
                    + "In this instance, the method takeTwo(), only takes the integer "
                    + "value of 2 as an acceptable argument.");
        }
    }
}
