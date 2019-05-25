import java.io.Console;

/**
 * Created by jesselim on 10/06/16.
 */
public class TestSingleton {
    private static TestSingleton ourInstance = new TestSingleton();

    public static TestSingleton getInstance() {
        return ourInstance;
    }

    private TestSingleton() {

        System.out.println("Test Singleton");
        System.out.println(System.getenv("USER"));
    }
}

