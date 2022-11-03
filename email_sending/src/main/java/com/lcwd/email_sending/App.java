package com.lcwd.email_sending;

import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * Hello world!
 *
 */
public class App 
{
	//This method is responsible to send message
	private static void sendEmail(String message, String subject, String to, String from) {
		
		//Variable for gmail post
		String host = "smtp.gmail.com";
		
		//Get the system properties
		Properties properties = System.getProperties();
		System.out.println("PROPERTIES "+properties);
		
		//Setting important information to properties object
		
		//Host set
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");		//secure socket layer
		properties.put("mail.smtp.auth", "true");
		
		//Step 1 : to get the session object
		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("ak2400320@gmail.com", "mbeu npqh ubda fpdc");
			}
			
		});
		
		session.setDebug(true);
		
		//Step 2 : compose the message[text, multi media]
		MimeMessage mimeMessage =  new MimeMessage(session);
		
		try {
			//from emailID
			mimeMessage.setFrom(from);
			
			//adding recipient to message
			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			//adding subject to message
			mimeMessage.setSubject(subject);
			
			//adding text to message
			mimeMessage.setText(message);
			
			//Send
			//Step 3 : send the message using Transport class
			Transport.send(mimeMessage);
			
			System.out.println("Sent Successfully");
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}
	
	
	//This method is reponsible to send the message with attachment
	private static void sendAttach(String message, String subject, String to, String from) {
		
		
		//Variable for gmail post
		String host = "smtp.gmail.com";
		
		//Get the system properties
		Properties properties = System.getProperties();
		System.out.println("PROPERTIES "+properties);
		
		//Setting important information to properties object
		
		//Host set
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");		//secure socket layer
		properties.put("mail.smtp.auth", "true");
		
		//Step 1 : to get the session object
		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("ak2400320@gmail.com", "mbeu npqh ubda fpdc");
			}
			
		});
		
		session.setDebug(true);
		
		//Step 2 : compose the message[text, multi media]
		MimeMessage mimeMessage =  new MimeMessage(session);
		
		try {
			//from emailID
			mimeMessage.setFrom(from);
			
			//adding recipient to message
			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			//adding subject to message
			mimeMessage.setSubject(subject);
			
			//attachment
			
			//file path 
			String path = "/Users/arpitkumar/Downloads/tree.png";
			
			MimeMultipart mimeMultipart = new MimeMultipart();
			
			//text
			MimeBodyPart textMime = new MimeBodyPart();
			
			//file
			MimeBodyPart fileMime = new MimeBodyPart();
			
			try {
				textMime.setText(message);
				
				File file = new File(path);
				fileMime.attachFile(file);
				
				mimeMultipart.addBodyPart(textMime);
				mimeMultipart.addBodyPart(fileMime);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			mimeMessage.setContent(mimeMultipart);
			
			//Send
			//Step 3 : send the message using Transport class
			Transport.send(mimeMessage);
			
			System.out.println("Sent Successfully");
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Preparing to send message..." );
        
        String message = "Hello, Dear this is message for security check.";
        String subject = "CodeArena : Confirmed";
        String to = "akay0651@gmail.com";
        String from = "ak2400320@gmail.com";
        
//        sendEmail(message, subject, to, from);
        sendAttach(message, subject, to, from);
    }



}
