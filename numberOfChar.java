import java.util.Scanner;

public class numberOfChar
 { 
    public static void  main(String[] args) {
        System.out.println("Harsh");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");

        int charCount = 0;
        int wordsCount = 0;
        int lineCount = 0;

        while(true){
            String line = scanner.nextLine(); 
            if(line.isEmpty()) {
                break;

            }
            charCount +=line.length();
            String[] words = line.split("\\s+");
            wordsCount += words.length;

            lineCount++;


        }
        System.out.println("Charcater count : " +charCount);
        System.out.println("word count: "+ wordsCount);
        System.out.println("Line count: " +lineCount);
    }
}