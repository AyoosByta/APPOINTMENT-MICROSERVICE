package com.bytatech.ayoos.SMS.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import com.bytatech.ayoos.SMS.utils.SMSUtil;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

public class SMSUtil {

	 private static String APIKEY;
	    private static String SENDER;
	    private static String URL;
	    
	    public static void sendSMS(final String phoneCode, final String phoneNumber, final String message) throws IOException {
	        System.out.println("In send sms");
	        final Properties pro = new Properties();
	        pro.load(SMSUtil.class.getClassLoader().getResourceAsStream("smsconfig.properties"));
	        if (phoneCode.equals("91")) {
	            System.out.println("Indian phonecode and configurations");
	            SMSUtil.APIKEY = pro.getProperty("in-apiKey");
	            SMSUtil.SENDER = pro.getProperty("in-sender");
	            SMSUtil.URL = pro.getProperty("in-url");
	        }
	        else {
	            System.out.println("UK phonecode and configurations");
	            SMSUtil.APIKEY = pro.getProperty("uk-apiKey");
	            SMSUtil.SENDER = pro.getProperty("uk-sender");
	            SMSUtil.URL = pro.getProperty("uk-url");
	        }
	        final PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
	        try {
	            final Phonenumber.PhoneNumber phoneNumberProto = phoneUtil.parse("+" + phoneCode + phoneNumber, (String)null);
	            final boolean isValid = phoneUtil.isValidNumber(phoneNumberProto);
	            if (isValid) {
	                System.out.println("is valid");
	                createContact(phoneCode + phoneNumber);
	                execute(phoneCode + phoneNumber, message);
	            }
	            else {
	                System.out.println("Not valid");
	            }
	        }
	        catch (NumberParseException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    private static String execute(final String phoneNumber, final String content) {
	        System.out.println("IN execute");
	        try {
	            final String apiKey = "apikey=" + SMSUtil.APIKEY;
	            final String message = "&message=" + content;
	            final String sender = "&sender=" + SMSUtil.SENDER;
	            final String numbers = "&numbers=" + phoneNumber;
	            System.out.println("Api key is " + apiKey + " message is " + message + " numbers " + phoneNumber + " sender is " + sender);
	            System.out.println("Url is " + SMSUtil.URL);
	            final HttpURLConnection conn = (HttpURLConnection)new URL(SMSUtil.URL + "/send").openConnection();
	            final String data = apiKey + numbers + message + sender;
	            conn.setDoOutput(true);
	            conn.setRequestMethod("POST");
	            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
	            conn.getOutputStream().write(data.getBytes("UTF-8"));
	            System.out.println("Respobnse code is " + conn.getResponseCode());
	            final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	            final StringBuffer stringBuffer = new StringBuffer();
	            System.out.println("SMS Sent");
	            String line;
	            while ((line = rd.readLine()) != null) {
	                stringBuffer.append(line);
	            }
	            rd.close();
	            return stringBuffer.toString();
	        }
	        catch (Exception e) {
	            System.out.println("Error SMS " + e);
	            return "Error " + e;
	        }
	    }
	    
	    private static String createContact(final String phoneNumber) {
	        try {
	            final String apiKey = "apikey=" + SMSUtil.APIKEY;
	            final String numbers = "&numbers=" + phoneNumber;
	            final String group_id = "&group_id=0";
	            final HttpURLConnection conn = (HttpURLConnection)new URL(SMSUtil.URL + "/create_contacts/?").openConnection();
	            final String data = apiKey + numbers + group_id;
	            conn.setDoOutput(true);
	            conn.setRequestMethod("POST");
	            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
	            conn.getOutputStream().write(data.getBytes("UTF-8"));
	            final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	            final StringBuffer stringBuffer = new StringBuffer();
	            String line;
	            while ((line = rd.readLine()) != null) {
	                stringBuffer.append(line);
	            }
	            rd.close();
	            return stringBuffer.toString();
	        }
	        catch (IOException io) {
	            System.out.println("Exception occured while finding the file " + io.getMessage());
	            return "Error SMS File " + io;
	        }
	        catch (Exception e) {
	            System.out.println("Error SMS " + e);
	            return "Error " + e;
	        }
	    }
}
