/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Math;

/**
 *
 * @author saarthaksharma
 */
public class Unit7Lab2_ssharma1293386 {

    public static void main(String[] args) {
        
        String binary = "11001111011001010101100101";
        int decimal = 54367589;

        System.out.println(binaryToDecimal(binary));
        System.out.println(binaryToHex(binary));
        System.out.println(decimalToBinary(decimal));
        System.out.println(decimalToHex(decimal));

    }

    
    public static int binaryToDecimal(String binaryString) {
        int sum = 0;
        for (int i = 0; i <= binaryString.length() - 1; i++) {

            sum += (binaryString.charAt(i) == '1' ? 1 : 0) * ((int) Math.pow(2, binaryString.length() - 1 - i));

        }
        return sum;
    }

   
    public static String decimalToBinary(int decimal) {
        int maxpower2 = 0;
        int counter = 0;

        boolean PowerOver = false;
        while (PowerOver == false) {

            //Finding greatest power of 2 that fits under decimal
            if (Math.pow(2, counter) > decimal) {
                PowerOver = true;
                maxpower2 = counter - 1;
            }
            counter++;
        }
        

        int[] bin = new int[maxpower2 + 1];
        int remainder = decimal;

        for (int i = 0; i <= maxpower2; i++) {
            int digit = remainder / (int) Math.pow(2, maxpower2 - i);
            remainder = remainder - (digit * (int) Math.pow(2, maxpower2 - i));

            bin[i] = digit;
            digit = remainder;
        }
        

        char[] BinCharacters = new char[bin.length];

        for (int i = 0; i < bin.length; i++) {
            if (bin[i] == 0) {
                BinCharacters[i] = '0';
            }
            if (bin[i] == 1) {
                BinCharacters[i] = '1';
            }
        }

        String BinString = new String(BinCharacters);
        return BinString;
    }

    public static String decimalToHex(int decimal) {

        int decimalValue = decimal;
        int mod = 0;
        String hexString = "";
        char[] hexDigits = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
        };

        while (decimal > 0) {
            mod = decimal % 16;
            hexString = hexDigits[mod] + hexString;
            decimal = decimal / 16;
        }

        return ("0x" + hexString);
    }

    public static String binaryToHex(String binaryString) {
        int nibble = 0;

        char[] hexDigits = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
        };

        int hexStringLen = (binaryString.length() / 4) + ((binaryString.length() % 4) != 0 ? 1 : 0);
        char[] hexString = new char[hexStringLen];

        for (int i = binaryString.length() - 1, j = 0; i >= 0; i -= 4, j++) {
            for (int k = 0; k <= 3 && (k + j * 4) < binaryString.length(); k++) {
                nibble += binaryString.charAt(i - k) == '1' ? Math.pow(2, k) : 0;

            }

            hexString[hexStringLen - 1 - j] = hexDigits[nibble];
            nibble = 0;
        }

        String hex = new String(hexString);
        return ("0x" + hex);
    }

}
