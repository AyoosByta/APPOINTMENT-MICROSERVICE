package com.bytatech.ayoos.appointment.domain;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Timing.class)
public abstract class Timing_ {

	public static volatile SingularAttribute<Timing, ZonedDateTime> startFrom;
	public static volatile SingularAttribute<Timing, ZonedDateTime> endTo;
	public static volatile SingularAttribute<Timing, Long> id;
	public static volatile SingularAttribute<Timing, LocalDate> day;

}

