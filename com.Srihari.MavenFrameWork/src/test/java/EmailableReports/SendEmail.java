package EmailableReports;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.testng.annotations.AfterSuite;

//package EmailableReports;
//
//import java.util.Properties;
//
//import javax.activation.DataHandler;
//import javax.activation.DataSource;
//import javax.activation.FileDataSource;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.Multipart;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//
//import org.openqa.selenium.WebDriver;
//

public class SendEmail {
//	
//	WebDriver driver;											
//
//
//
//	public static void main(String[] args) throws Exception {
//
//		final String username = "sriharinaidu88@gmail.com";
//		final String password = "govindagovinda9";
//
//		Properties props = new Properties();
//		props.put("mail.smtp.starttls.enable", "true");
//		props.put("mail.smtp.auth", "true");
//		props.put("mail.smtp.host", "smtp.googlemail.com");
//		props.put("mail.smtp.port", "587");
//
//		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication(username, password);
//			}
//		});
//
//		try {
//
//			Message message = new MimeMessage(session);
//			message.setFrom(new InternetAddress("sriharinaidu88@gmail.com"));
//			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("srisri.pudu@gmail.com"));
//			message.setSubject("Reports Availalbe!");
//			message.setText("Dear Mail Crawler," + "\n\n No spam to my email, please!");
//
//			MimeBodyPart messageBodyPart = new MimeBodyPart();
//
//			Multipart multipart = new MimeMultipart();
//
//			messageBodyPart = new MimeBodyPart();
//			String file = "/Users/reenupanwar/Documents/SeleniumPrograms/com.Srihari.MavenFrameWork/test-output/emailable-report.html";
//			String fileName = file;
//			DataSource source = new FileDataSource(file + fileName);
//			messageBodyPart.setDataHandler(new DataHandler(source));
//			//System.out.println("Sending");
//			messageBodyPart.setFileName(fileName);
//			multipart.addBodyPart(messageBodyPart);
//
//			message.setContent(multipart);
//			System.out.println("Sending");
//			Transport.send(message);
//			System.out.println("Done");
//		} catch (MessagingException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void execute(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//
	
	
	
	
	
	 private static void sendPDFReportByGMail(String from, String pass, String to, String subject, String body) {

		 Properties props = System.getProperties();

		 String host = "smtp.googlemail.com";

		 props.put("mail.smtp.starttls.enable", "true");

		 props.put("mail.smtp.host", host);

		 props.put("mail.smtp.user", from);

		 props.put("mail.smtp.password", pass);

		 props.put("mail.smtp.port", "587");

		 props.put("mail.smtp.auth", "true");

		 Session session = Session.getDefaultInstance(props);

		 MimeMessage message = new MimeMessage(session);

		 try {

		     //Set from address

		 message.setFrom(new InternetAddress(from));

		 message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

		 //Set subject

		 message.setSubject(subject);

		 message.setText(body);

		 BodyPart objMessageBodyPart = new MimeBodyPart();

		 objMessageBodyPart.setText("Please Find The Attached Report File!");

		 Multipart multipart = new MimeMultipart();

		 multipart.addBodyPart(objMessageBodyPart);

		 objMessageBodyPart = new MimeBodyPart();

		 //Set path to the pdf report file

		 String filename = System.getProperty("user.dir")+"\\Default test.pdf";

		 //Create data source to attach the file in mail

		 DataSource source = new FileDataSource(filename);

		 objMessageBodyPart.setDataHandler(new DataHandler(source));

		 objMessageBodyPart.setFileName(filename);

		 multipart.addBodyPart(objMessageBodyPart);

		 message.setContent(multipart);

		 Transport transport = session.getTransport("smtp");

		 transport.connect(host, from, pass);

		 transport.sendMessage(message, message.getAllRecipients());

		 transport.close();

		 }

		 catch (AddressException ae) {

		 ae.printStackTrace();

		 }

		 catch (MessagingException me) {

		 me.printStackTrace();

		 }

		 }

		 }

