import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
import java.io.*;
 
class EmailClient
{
    final String emailInfo = "EmailInfo.properties";
    Properties properties = new Properties();
 
    public static void main(String args[])
    {
        EmailClient emailClient = new EmailClient ();
        emailClient.sendEmail();
    }
 
    private void sendEmail()
    {
       try{
            //This is required to load all the properties
           FileInputStream fileInputStream = new FileInputStream(emailInfo);
           properties.load(fileInputStream);
           fileInputStream.close();
        }catch(IOException ioe)
       {
            //throw IOException of your choice.
            //can end here
       }
        System.out.println("Email properties read successfully.");
 
       String smtpAddress = properties.getProperty("smtpAddress");
       String fromAddress = properties.getProperty("fromAddress");
       String toAddress = properties.getProperty("toAddress");
       String emailSubject = properties.getProperty("emailSubject");
       String emailBody = properties.getProperty("emailBody");
 
       Properties props = new Properties();
        props.put("mail.smtp.host", smtpAddress);
        props.put("mail.from", fromAddress);
       Session session = Session.getInstance(props, null);
 
       try
       {
           MimeMessage mimeMessage = new MimeMessage(session);
           mimeMessage.setRecipients(Message.RecipientType.TO,toAddress);
           mimeMessage.setSentDate(new Date());
           mimeMessage.setSubject(emailSubject);
           mimeMessage.setText(emailBody);
           System.out.println("Sending e-mail...");
           Transport.send(mimeMessage);
           System.out.println("e-mail sent.");
       }
        catch(MessagingException me)
       {
           System.out.println("e-mail send failed.");
           me.getMessage();
       }
    }
}
