/**
 * Created by IntelliJ IDEA.
 * User: jesselim
 * Date: Dec 25, 2009
 * Time: 4:04:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String args[]) {

        Server server = new Server();
        Thread serverThread = new Thread(server);
        serverThread.start();


        TestSingleton test = TestSingleton.getInstance();


        String z = "9999.99";
        if (z.length() > 0) {
            int y = Double.valueOf(z).intValue();
            String x = Integer.toString(y);
            System.out.println("x: " + x);
        }
        System.out.println("\nThis is a test!");
        String a = "0102000001";
        String b = "";

        if (a.length() != 10) {
            System.out.println("a is not 10 digit or empty!");
        } else {
            for (int i = 0; i < 10; i = i + 2) {
                System.out.println(a.substring(i, i + 2));
                if (getCode(a.substring(i, i + 2)) != null) {
                    b = b + getCode(a.substring(i, i + 2));
                }
            }

            System.out.println("RESULT = [" + b + "]");
        }

        TestSingleton test2 = TestSingleton.getInstance();

    }

    private static String getCode(String code) {
        String b = null;

        if (code.equals("01")) {
            b = "0107";
        }
        if (code.equals("02")) {
            b = "0106";
        }
        if (code.equals("03")) {
            b = "0103";
        }

        return b;
    }
}
