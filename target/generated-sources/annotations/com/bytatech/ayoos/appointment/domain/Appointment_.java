package com.bytatech.ayoos.appointment.domain;

import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Appointment.class)
public abstract class Appointment_ {

	public static volatile SingularAttribute<Appointment, ConsultationInfo> consultationInfo;
	public static volatile SingularAttribute<Appointment, String> note;
	public static volatile SingularAttribute<Appointment, String> patientId;
	public static volatile SingularAttribute<Appointment, String> doctorId;
	public static volatile SingularAttribute<Appointment, String> appointmentId;
	public static volatile SingularAttribute<Appointment, Timing> timing;
	public static volatile SingularAttribute<Appointment, String> chronicDiseaseRef;
	public static volatile SingularAttribute<Appointment, Long> id;
	public static volatile SingularAttribute<Appointment, String> trackingId;
	public static volatile SingularAttribute<Appointment, ZonedDateTime> appointmentDateAndTime;
	public static volatile SingularAttribute<Appointment, Status> status;

}

