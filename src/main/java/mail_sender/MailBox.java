package mail_sender;

import lombok.Getter;
import mail_sender.MailInfo;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MailBox {
    List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo){
        this.infos.add(mailInfo);
    }

    public void sendAll(){
        for(MailInfo mail : infos){
            MailSender.sendMail(mail);
        }
    }
}
