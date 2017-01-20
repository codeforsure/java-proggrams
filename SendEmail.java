import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
public class SendEmail
{
public static void main(String [] args)
{
// Recipient's email ID needs to be mentioned.
String to = "haitovarun@gmail.com";
// Sender's email ID needs to be mentioned
String from = "iec2015087@iiita.ac.in";
// Assuming you are sending email from localhost
String host = "localhost";
// Get system properties
Properties properties = System.getProperties();
properties.setProperty("mail.user", "iec2015087");
properties.setProperty("mail.password", "8374965784");
// Setup mail server
properties.setProperty("mail.smtp.host","172.31.1.4");
properties.setProperty("mail.smtp.port","8080");
// Get the default Session object.
Session session = Session.getDefaultInstance(properties);
try{
// Create a default MimeMessage object.
MimeMessage message = new MimeMessage(session);
// Set From: header field of the header.
message.setFrom(new InternetAddress(from));
// Set To: header field of the header.
message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
// Set Subject: header field
message.setSubject("This is the Subject Line!");
// Now set the actual message
message.setText("This is actual message");
// Send message
Transport.send(message);
System.out.println("Sent message successfully....");
}catch (MessagingException mex) {
mex.printStackTrace();
}
}
}
