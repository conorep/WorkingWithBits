package divisionalgo;

public class DivisionAlgorithm {

    /**
     * Creates a binary string representation for a positive decimal number
     * @param decimal a base 10 positive decimal number
     * @return binary representation of the number as a String
     */
    public static String decimalToBinary(int decimal){
        // initialize an empty String to return

        // while the decimal is > 0 {

            // use % 2 to get the left most bit value

            // add this bit value to the front of the String

            // make the decimal smaller by dividing by 2

        // } end while

        // return the binary string

//        StringBuilder binaryString = new StringBuilder();
//
//        while (decimal > 0)
//        {
//            binaryString.insert(0, (decimal % 2));
//            decimal /= 2;
//        }
//
//
//        return binaryString.toString();

        String binStr = "";

        while (decimal > 0)
        {
            binStr = decimal%2 + binStr;
            decimal /=2;
        }

        while (binStr.length() < 32)
        {
            binStr = 0 + binStr;
        }

        return binStr;
    }

}
