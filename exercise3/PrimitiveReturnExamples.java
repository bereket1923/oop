package oop.exercise3;
public class PrimitiveReturnExamples {

    // byte return
    public byte getByteValue() {
        return (byte) 10;
    }

    // short return
    public short getShortValue() {
        return (short) 1000;
    }

    // int return
    public int getIntValue() {
        return 5000;
    }

    // long return
    public long getLongValue() {
        return 100000L;
    }

    // float return
    public float getFloatValue() {
        return 5.75f;
    }

    // double return
    public double getDoubleValue() {
        return 99.99;
    }

    // char return
    public char getCharValue() {
        return "Hello".charAt(0);  // Returns 'H'
    }
    public String getStringWord(){//string is not primitive type it is reference type
        return "Hello";
    }
    public String toCapital(){
        return "hello".toUpperCase();
    }
    public String getSubstring() {
        return "lovers".substring(1, 5);
    }

    // boolean return
    public boolean isTrue() {
        return 10 > 5;  // Returns true
    }

    public static void main(String[] args) {
        PrimitiveReturnExamples examples = new PrimitiveReturnExamples();

        System.out.println("Byte: " + examples.getByteValue());
        System.out.println("Short: " + examples.getShortValue());
        System.out.println("Int: " + examples.getIntValue());
        System.out.println("Long: " + examples.getLongValue());
        System.out.println("Float: " + examples.getFloatValue());
        System.out.println("Double: " + examples.getDoubleValue());
        System.out.println("Char: " + examples.getCharValue());
        System.out.println("Boolean: " + examples.isTrue());
        System.out.println("String: " + examples.getStringWord());
        System.out.println("Capital: " + examples.toCapital());
        System.out.println("Capital: " + examples.getSubstring());
    }
}