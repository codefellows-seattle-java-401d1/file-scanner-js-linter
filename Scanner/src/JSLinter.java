import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JSLinter {
    public static void main(String[] args) {
        String path = "./gates.js";
        jsLinter(path);
    }

    public static void jsLinter(String jsFile) {

        String nextLine = "";
        int line = 0;

        try {

            File file = new File(jsFile);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                nextLine = scanner.nextLine();
                if (!nextLine.contains(";")) {
                    if (!nextLine.contains("if") && !nextLine.contains("else") && !nextLine.isEmpty() && !nextLine.contains("{") && !nextLine.contains("}")) {
                        System.out.println("Line " + line + ": Missing semicolon.");
                    }
                }
                line++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
