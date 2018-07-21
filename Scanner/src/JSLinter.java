import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JSLinter {
    public static void main(String[] args) {
        String path = "/Users/ahmedosman/Desktop/401/labs/lab4-ahmed/04-file-scanner-js-linter/gates.js";
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
