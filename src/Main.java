import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        Dictionary d1 = new Dictionary();
        d1.newEntry("Fuck", "You are so done");
        out.println(d1.look("Fuck"));
        out.println(d1.look("What"));

        int multiplication = MultiplyTwoNumbers.multiply(1, 2);
        out.println(multiplication);
    }
}