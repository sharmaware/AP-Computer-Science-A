/**
 *
 * @author saarthaksharma
 */

public class Rectangle {

    private int width;
    private int length;
    private char character;

    //constructor
    public Rectangle(int setlength, int setwidth, char setcharacter) {
        if (setlength > 0 && setlength <= 30) {
            this.length = setlength;
        } else {
            error_message();
        }
     
        if (setwidth > 0 && setwidth <= 30) {
            this.width = setwidth;
        } else {
            error_message();
        }
        character = setcharacter;
    }

    private void error_message() {
        System.out.println("Valid values are between 1 and 30");
    }

    public void setWidth(int EnteredWidth) {
        if (EnteredWidth > 0 && EnteredWidth <= 30) {
            width = EnteredWidth;
        } else {
            error_message();
        }
    }

    public void setLength(int EnteredLength) {
        if (EnteredLength > 0 && EnteredLength <= 30) {
            this.length = EnteredLength;
        } else {
            error_message();
        }
    }

    public void setCharacter(char EnteredCharacter){
        character = EnteredCharacter;
    }
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public char getCharacter() {
        return character;
    }

    public void draw() {
        for (int i = 1; i <= this.getLength(); i++) {
            for (int j = 1; j <= this.getWidth(); j++) {
                System.out.print(this.getCharacter()+ " ");
            }
            System.out.println();
        }
    }
}
