
public class DataTypes {
	public static void main(String[] args) {
		// byte: 1 byte = 8 bits, range = -2^7 to 2^7 - 1
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byte:     Min = " + byteMin + ", Max = " + byteMax);

        // short: 2 bytes = 16 bits, range = -2^15 to 2^15 - 1
        short shortMin = -32768;
        short shortMax = 32767;
        System.out.println("short:    Min = " + shortMin + ", Max = " + shortMax);

        // int: 4 bytes = 32 bits, range = -2^31 to 2^31 - 1
        int intMin = -2147483648;
        int intMax = 2147483647;
        System.out.println("int:      Min = " + intMin + ", Max = " + intMax);

        // long: 8 bytes = 64 bits, range = -2^63 to 2^63 - 1
        long longMin = -9223372036854775808L;
        long longMax = 9223372036854775807L;
        System.out.println("long:     Min = " + longMin + ", Max = " + longMax);

        // float: ~±3.4e38 (7 digits precision)
        float floatMin = -3.4028235e38f;
        float floatMax = 3.4028235e38f;
        System.out.println("float:    Min = " + floatMin + ", Max = " + floatMax);

        // double: ~±1.7e308 (15 digits precision)
        double doubleMin = -1.7976931348623157e308;
        double doubleMax = 1.7976931348623157e308;
        System.out.println("double:   Min = " + doubleMin + ", Max = " + doubleMax);

        // char: 2 bytes = 0 to 65535 (Unicode)
        char charMin = 0;
        char charMax = 65535;
        System.out.println("char:     Min = " + (int) charMin + ", Max = " + (int) charMax);

        // boolean: only two possible values
        boolean boolFalse = false;
        boolean boolTrue = true;
        System.out.println("boolean:  Values = " + boolFalse + ", " + boolTrue);

        // String: default is null (reference type)
        String str = null;
        System.out.println("String:   Default value = " + str);
        

        //Store Mobile number
        long mobileNumber = 9876543210L; // Note the 'L' at the end

        System.out.println("Mobile Number: " + mobileNumber);
    }


}
