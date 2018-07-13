import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JSLinter {
    public static void main(String[] args) {
        try {
            String input = "/home/user/Documents/learnin/school/codefellows/java401/day4/04-file-scanner-js-linter/gates.js";
            Scanner sc = new Scanner(new File(input));
            String currentToken = "";
            String oldToken = "";
            int currentLine=1;
            boolean exemptionFound = false;

            while(sc.hasNextLine()){
                currentToken=sc.nextLine();
                String[] currentTokenArray = currentToken.split(" ");
                String finalToken = currentTokenArray[currentTokenArray.length-1];
                for(int i=0; i<=currentTokenArray.length-1; i++) {
                    if (currentTokenArray[i].contains("if") || currentTokenArray[i].contains("else")) {
                        exemptionFound = true;
                    }
                }

                    if(finalToken.contains(";")||finalToken.contains("}")||finalToken.contains("{")||finalToken.contentEquals("")){
                        exemptionFound = true;
                    }

                if(exemptionFound == false){
                    System.out.println("No semicolon on line " + currentLine + ".");
                }
                currentLine++;
                exemptionFound = false;
            }
        /*    while(sc.hasNext()){
                oldToken=currentToken;
                currentToken = sc.next();
                System.out.println(currentToken);
                if(currentToken=="if"||currentToken=="else"){
                    exemptionFound=true;
                }
                if(currentToken == "return"){
                    currentLine++;
                    if(exemptionFound==false){
                        switch(oldToken){
                            case "{":
                            case "}":
                            case "\n":
                            break;
                            default:
                                System.out.println("Line "+currentLine+": Missing semicolon.");
                        }
                    }
                    booleanFound = false;
                }
            }*/

        } catch (IOException e){
            e.printStackTrace();
            System.out.println("it's broken idiot");
        }

    }
}
