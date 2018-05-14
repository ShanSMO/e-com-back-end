package MailSender;

import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by Shanaka Madushanka .
 * Created Date -  2/27/2018
 * Created Time -  10:16 PM
 * Project Name - core
 * Package Name - MailSender
 */

@Service
public class EmailSender {



    public void sendMail(){
        String senderAddress = "madushanka991@gmail.com";
        String recipientAddress = "madushanka991@gmail.com";
        String subject = "Test Email Subject";
        String messageBody = "Test Email Body";

        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");


        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication("madushanka991@gmail.com","Dodangoda@1");
                }
            });

        try{
            MimeMessage message =new MimeMessage(session);
            message.setFrom(new InternetAddress(senderAddress));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(recipientAddress));
            message.setSubject(subject);
            message.setText(messageBody);
            Transport.send(message);
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("--- mail error --" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
            emailSender.sendMail();
    }

}
