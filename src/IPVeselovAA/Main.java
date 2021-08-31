package IPVeselovAA;

public class Main {

    public static void main(String[] args) {
        String STR = System.getenv().getOrDefault("STR", "");
        System.out.println("Hello " + STR);
    }
}
