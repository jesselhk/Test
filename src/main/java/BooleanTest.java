public class BooleanTest {
    public static void main(String[] args) {

        boolean b1 = Boolean.parseBoolean("True");
        boolean b2 = Boolean.parseBoolean("TruE");
        boolean b3 = Boolean.parseBoolean("False");
        boolean b4 = Boolean.parseBoolean("FALSE");
        boolean b5 = new Boolean("True");
        boolean b = false;
        boolean x = Boolean.FALSE;

        System.out.println(Boolean.toString(b1));
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b);
        System.out.println(x);

    }
}
