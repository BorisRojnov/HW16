import java.util.Scanner;

public class Main {
    static final String VALID_TEXT = "([A-z]+\\s)";
    static final String PUNCTUATION_MARKS = "[.,!?;:\"\"'']";
    public static void main(String[] args) {
        //todo  код
        System.out.println("Введите английский текст: ");
        String text = new Scanner(System.in).nextLine();
        System.out.println(separateLine(text));
    }
    //todo метод
public static String separateLine(String textEdit){
       String noMarks = textEdit.replaceAll(PUNCTUATION_MARKS, " ");
       String[] split = noMarks.split("\\s+");
       String result = "";
       for(int i = 0; i < split.length; i++){
           result += split[i] + "\n";
       }
       return result;
    }
}