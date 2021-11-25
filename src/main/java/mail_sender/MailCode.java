package mail_sender;

import lombok.SneakyThrows;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greeting.txt");

    private final String filename;

    MailCode(String filename){
        this.filename = filename;
    }

    @SneakyThrows
    public String generateText(){
        String text = "";
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        File file = new File(s + "/" + filename);
        Scanner input = new Scanner(file);

        while (input.hasNextLine()){
            text += input.nextLine();
        }
        input.close();

        return text;
    }
}
