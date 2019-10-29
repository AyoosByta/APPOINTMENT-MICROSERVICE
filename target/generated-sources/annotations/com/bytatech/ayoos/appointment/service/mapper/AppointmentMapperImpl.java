package com.bytatech.ayoos.appointment.service.mapper;

import com.bytatech.ayoos.appointment.domain.Appointment;
import com.bytatech.ayoos.appointment.domain.ConsultationInfo;
import com.bytatech.ayoos.appointment.domain.Status;
import com.bytatech.ayoos.appointment.domain.Timing;
import com.bytatech.ayoos.appointment.service.dto.AppointmentDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-29T14:44:16+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_222 (Private Build)"
)
@Component
public class AppointmentMapperImpl implements AppointmentMapper {

    @Autowired
    private ConsultationInfoMapper consultationInfoMapper;
    @Autowired
    private TimingMapper timingMapper;
    @Autowired
    private StatusMapper statusMapper;

    @Override
    public List<Appointment> toEntity(List<AppointmentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Appointment> list = new ArrayList<Appointment>( dtoList.size() );
        for ( AppointmentDTO appointmentDTO : dtoList ) {
            list.add( toEntity( appointmentDTO ) );
        }

        return list;
    }

    @Override
    public List<AppointmentDTO> toDto(List<Appointment> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AppointmentDTO> list = new ArrayList<AppointmentDTO>( entityList.size() );
        for ( Appointment appointment : entityList ) {
            list.add( toDto( appointment ) );
        }

        return list;
    }

    @Override
    public AppointmentDTO toDto(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }

        AppointmentDTO appointmentDTO = new AppointmentDTO();

        Long id = appointmentConsultationInfoId( appointment );
        if ( id != null ) {
            appointmentDTO.setConsultationInfoId( id );
        }
        Long id1 = appointmentStatusId( appointment );
        if ( id1 != null ) {
            appointmentDTO.setStatusId( id1 );
        }
        Long id2 = appointmentTimingId( appointment );
        if ( id2 != null ) {
            appointmentDTO.setTimingId( id2 );
        }
        appointmentDTO.setId( appointment.getId() );
        appointmentDTO.setTrackingId( appointment.getTrackingId() );
        appointmentDTO.setAppointmentId( appointment.getAppointmentId() );
        appointmentDTO.setChronicDiseaseRef( appointment.getChronicDiseaseRef() );
        appointmentDTO.setAppointmentDateAndTime( appointment.getAppointmentDateAndTime() );
        appointmentDTO.setNote( appointment.getNote() );
        appointmentDTO.setPatientId( appointment.getPatientId() );
        appointmentDTO.setDoctorId( appointment.getDoctorId() );

        return appointmentDTO;
    }

    @Override
    public Appointment toEntity(AppointmentDTO appointmentDTO) {
        if ( appointmentDTO == null ) {
            return null;
        }

        Appointment appointment = new Appointment();

        appointment.setConsultationInfo( consultationInfoMapper.fromId( appointmentDTO.getConsultationInfoId() ) );
        appointment.setTiming( timingMapper.fromId( appointmentDTO.getTimingId() ) );
        appointment.setStatus( statusMapper.fromId( appointmentDTO.getStatusId() ) );
        appointment.setId( appointmentDTO.getId() );
        appointment.setTrackingId( appointmentDTO.getTrackingId() );
        appointment.setAppointmentId( appointmentDTO.getAppointmentId() );
        appointment.setChronicDiseaseRef( appointmentDTO.getChronicDiseaseRef() );
        appointment.setAppointmentDateAndTime( appointmentDTO.getAppointmentDateAndTime() );
        appointment.setNote( appointmentDTO.getNote() );
        appointment.setPatientId( appointmentDTO.getPatientId() );
        appointment.setDoctorId( appointmentDTO.getDoctorId() );

        return appointment;
    }

    private Long appointmentConsultationInfoId(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }
        ConsultationInfo consultationInfo = appointment.getConsultationInfo();
        if ( consultationInfo == null ) {
            return null;
        }
        Long id = consultationInfo.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long appointmentStatusId(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }
        Status status = appointment.getStatus();
        if ( status == null ) {
            return null;
        }
        Long id = status.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long appointmentTimingId(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }
        Timing timing = appointment.getTiming();
        if ( timing == null ) {
            return null;
        }
        Long id = timing.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
