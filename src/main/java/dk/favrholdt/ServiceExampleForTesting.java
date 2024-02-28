package dk.favrholdt;

public class ServiceExampleForTesting {

    public String getName(int number) {
        if (number < 0) {
            return "a";
        } else {
            return "b";
        }
    }
}
