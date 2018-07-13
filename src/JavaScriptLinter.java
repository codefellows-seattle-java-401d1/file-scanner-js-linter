import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaScriptLinter {
    public static void main(String[] args) {
        String filePath = "/Users/amycohen/codefellows/401/lab-amy/04-file-scanner-js-linter/gates.js";
        javaScriptLinter(filePath);
    }

    public static void javaScriptLinter (String fileName) {
        int line = 0;
            String aLine = "";
        try {
            File checkFile = new File(fileName);
            Scanner scanner = new Scanner(checkFile);
            while (scanner.hasNextLine()) {
                aLine = scanner.nextLine();
                line++;
                if (!aLine.contains(";")) {
                    if (!aLine.contains("{") && !aLine.contains("}") && !aLine.contains("if") && !aLine.contains("else") && !aLine.contains("//") && !aLine.isEmpty()){
                        System.out.println("Line " + line + ": Missing semicolon.");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
