import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class wordcount {
    public static void main(String[] args) {
        System.out.println("*** Word Counter ***");
        System.out.println("Enter '1' to enter text or '2' to provide a file path:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        String S = "";
        String filePath;
        int count=1;
        switch (num) {
            case 1:
                System.out.println("Enter the text:");
                S = sc.nextLine();
                for (int i=0;i<S.length()-1;i++){
                    if((S.charAt(i)==' ') && (S.charAt(i+1)!=' ')){
                        count++;
                    }
                }
                System.out.println("The Number of words in the Sentence:" +count);
                break;
            case 2:
                System.out.println("Enter the file path:");
                filePath = sc.nextLine();
                try {
                    S = readFromFile(filePath);
                } catch (FileNotFoundException e) {
                    System.out.println("Error: File not found.");
                    return;
                }

                for (int i=0;i<S.length()-1;i++){
                    if((S.charAt(i)==' ') && (S.charAt(i+1)!=' ')){
                        count++;
                    }
                }
                System.out.println("The Number of words in the Sentence:" +count);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }



    }

    private static String readFromFile(String filePath) throws FileNotFoundException{
        StringBuilder con=new StringBuilder();
        File file=new File(filePath);
        try(Scanner scan=new Scanner(file)){
            while (scan.hasNextLine()){
                con.append(scan.nextLine()).append("\n");
            }
        }
        return con.toString();
    }

}