import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaScriptLinter {
    public static void main(String[] args) {
        String filePath = "/Users/amycohen/codefellows/401/lab-amy/04-file-scanner-js-linter/gates.js";
        javaScriptLinter(filePath);
    }

    /*
    Don't show an error if the line is empty.
    Don't show an error if the line ends with an opening curly brace {
    Don't show an error if the line ends with an closing curly brace }
    Don't show an error if the line contains if or else
     */

    public static void javaScriptLinter (String fileName) {
        int line = 0;
        String regExSkipTheseLine = "(\\b(if)\\b)|(\\b(else)\\b)|}|\\{";
        String regExErrorTheseLines = ";";

        try {
            File checkFile = new File(fileName);
            Scanner scanner = new Scanner(checkFile);

            while (scanner.hasNextLine()) {
                line++;
                System.out.println("Checking Line " + line);
                System.out.println("Line " + line + " reads:   -->   " + scanner.nextLine() + "   <--");

                if (scanner.hasNext(regExSkipTheseLine)) {
                    System.out.println("skipped line");
                } else if (!scanner.hasNext(regExErrorTheseLines)) {
                    System.out.println("Line " + line + ": Missing semicolon.");
//                    System.out.println("Line reads: " + scanner.nextLine());
                }
//                if (scanner.nextLine().contains("{")) {
//                    System.out.println("Skipped Line " + line);
//                }
////                else if (scanner.nextLine().contains("}")) {
////                    System.out.println("Skipped Line " + line);
////                }
//                else if (scanner.nextLine().contains("if")) {
//                    System.out.println("Skipped Line " + line);
//                } else if (scanner.nextLine().contains("else")) {
//                    System.out.println("Skipped Line " + line);
//                }
////                else if (scanner.nextLine().contains("")) {
////                    System.out.println("Skipped Line " + line);
////                }
//                else if (!scanner.nextLine().contains(";")) {
//                    System.out.println("Line " + line + ": Missing semicolon.");
//                    System.out.println("Line reads: " + scanner.nextLine());
////                    System.out.println();
//                }

                System.out.println();

//                if (scanner.nextLine().contains("{")
//                        || scanner.nextLine().contains("}")
//                        || scanner.nextLine().contains("if")
//                        || scanner.nextLine().contains("else")
//                        || scanner.nextLine().contains("")) {
//
//                    System.out.println("Skipped Line " + line);
//                } else if (!scanner.nextLine().contains(";")) {
//                    System.out.println("Line " + line + ": Missing semicolon.");
//                    System.out.println("Line reads: " + scanner.nextLine());
//                    System.out.println();
//                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
