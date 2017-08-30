import java.util.Random;

public class PasswordRandomizer {
    private Random random;
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String password = "";
        while (i < this.length){
        char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
        password += symbol;
        i++;
        }
        return password;
    }
}
