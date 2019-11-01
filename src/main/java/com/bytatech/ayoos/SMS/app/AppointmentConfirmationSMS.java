package com.bytatech.ayoos.SMS.app;

import org.activiti.engine.delegate.DelegateExecution;

import com.bytatech.ayoos.SMS.utils.SMSUtil;
import com.bytatech.ayoos.appointment.client.bpmn.model.appointment.PatientInfo;


public class AppointmentConfirmationSMS {

	public void execute(final DelegateExecution execution) throws Exception {
        //final Long phoneNumber = (Long)execution.getVariable("phone");
        //final Long phoneCode = (Long)execution.getVariable("phoneCode");
        //final String orderId = (String)execution.getVariable("orderId");
		PatientInfo patientInfo = null;
		
		final Long phoneNumber = patientInfo.getPhoneNumber();
		final Long phoneCode = 91l;
        final String message = "AYOOS: Thanks for booking appointment with us! Dear customer your Booing is confirmed" ;
        System.out.println(phoneCode + " " + phoneNumber + " " + message);
        SMSUtil.sendSMS(phoneCode.toString(), phoneNumber.toString(), message);
    }
}
