package mail_sender;

import mail_sender.MailInfo;

public class MailSender {
    public static void sendMail(MailInfo mailInfo){
        System.out.println("This text is send to " + mailInfo.getClientName() + ": ");
        System.out.println(mailInfo.getMailText());
    }
}
