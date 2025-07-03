
public class DataTypes {
	public static void main(String[] args) {
        // byte
        System.out.println("byte:     Min = " + Byte.MIN_VALUE + ", Max = " + Byte.MAX_VALUE);

        // short
        System.out.println("short:    Min = " + Short.MIN_VALUE + ", Max = " + Short.MAX_VALUE);

        // int
        System.out.println("int:      Min = " + Integer.MIN_VALUE + ", Max = " + Integer.MAX_VALUE);

        // long
        System.out.println("long:     Min = " + Long.MIN_VALUE + ", Max = " + Long.MAX_VALUE);

        // float
        System.out.println("float:    Min = " + -Float.MAX_VALUE + ", Max = " + Float.MAX_VALUE);

        // double
        System.out.println("double:   Min = " + -Double.MAX_VALUE + ", Max = " + Double.MAX_VALUE);

        // char
        System.out.println("char:     Min = " + (int) Character.MIN_VALUE + ", Max = " + (int) Character.MAX_VALUE);
        
        // boolean - only two values
        System.out.println("boolean:  Values = " + false + ", " + true);

        // String (reference type)
        String str = null;
        System.out.println("String:   Default value = " + str);
        

        //Store Mobile number
        long mobileNumber = 9876543210L; // Note the 'L' at the end

        System.out.println("Mobile Number: " + mobileNumber);
    }


}
