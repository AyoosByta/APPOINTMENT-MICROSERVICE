package com.bytatech.ayoos.appointment.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Symptom.class)
public abstract class Symptom_ {

	public static volatile SingularAttribute<Symptom, ConsultationInfo> consultationInfo;
	public static volatile SingularAttribute<Symptom, Integer> numberOfDaysSuffering;
	public static volatile SingularAttribute<Symptom, String> ref;
	public static volatile SingularAttribute<Symptom, Long> id;

}

