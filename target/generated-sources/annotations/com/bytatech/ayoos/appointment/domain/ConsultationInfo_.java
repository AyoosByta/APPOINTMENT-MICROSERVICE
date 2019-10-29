package com.bytatech.ayoos.appointment.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ConsultationInfo.class)
public abstract class ConsultationInfo_ {

	public static volatile SetAttribute<ConsultationInfo, Symptom> symptoms;
	public static volatile SingularAttribute<ConsultationInfo, Float> weight;
	public static volatile SingularAttribute<ConsultationInfo, Long> id;
	public static volatile SingularAttribute<ConsultationInfo, Integer> age;
	public static volatile SingularAttribute<ConsultationInfo, Float> height;

}

