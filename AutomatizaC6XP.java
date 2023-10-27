import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AutomatizaC6XP {
    public static void main(String[] args) {
        String path = args[0];
        File file = new File(path);
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (sc !=null) {
                sc.close();
            }
        }
    }
}