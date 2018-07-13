import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerLinter {
    public static void main(String[] args) {
        String filename = "//Users/macbookpro-2/Desktop/401/04-file-scanner-js-linter/gates.js";
        File file = new File(filename);

        try (Scanner scanner = new Scanner(file)) {
                String line = "";
                int lineNum = 0;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                lineNum++;
                if (!line.contains(";")) {
                    if (!line.contains("}") && !line.contains("{") && !line.contains("}") && !line.contains("if") && !line.isEmpty() && !line.contains("else")) {
                        System.out.println("Line " + lineNum + " is Missing SemiColon " );
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}