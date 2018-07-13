import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class FileScanner {
    public static void main(String[] args) {
        String gates = "gates.js";
        File file = new File(gates);
        try (Scanner scanner = new Scanner(file)) {
            int lineNumber = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains("{") || line.contains("}") || line.contains("if") || line.contains("else") || line.contains(";")) {
                    lineNumber++;
                    continue;
                } else if (line.isEmpty()) {
                    lineNumber++;
                    continue;
                } else {
                    lineNumber++;
                    System.out.println("Line " + lineNumber + " missing semi-colon.");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}