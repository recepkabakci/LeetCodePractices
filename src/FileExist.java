import java.io.File;

public class FileExist {
    public static void main(String[] args) {
        File x = new File("C:\\Users\\RECEP KABAKCI\\Desktop\\job\\java-interwiev-questions.pdf");
        if (x.exists()) {
            System.out.println(x.getName() + "  exists!");
        } else {
            System.out.println("The file does not exist");
        }
    }
}
