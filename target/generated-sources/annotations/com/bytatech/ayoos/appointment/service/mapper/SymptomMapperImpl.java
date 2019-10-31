package com.bytatech.ayoos.appointment.service.mapper;

import com.bytatech.ayoos.appointment.domain.ConsultationInfo;
import com.bytatech.ayoos.appointment.domain.Symptom;
import com.bytatech.ayoos.appointment.service.dto.SymptomDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-31T11:26:07+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_212 (Oracle Corporation)"
)
@Component
public class SymptomMapperImpl implements SymptomMapper {

    @Autowired
    private ConsultationInfoMapper consultationInfoMapper;

    @Override
    public List<Symptom> toEntity(List<SymptomDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Symptom> list = new ArrayList<Symptom>( dtoList.size() );
        for ( SymptomDTO symptomDTO : dtoList ) {
            list.add( toEntity( symptomDTO ) );
        }

        return list;
    }

    @Override
    public List<SymptomDTO> toDto(List<Symptom> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SymptomDTO> list = new ArrayList<SymptomDTO>( entityList.size() );
        for ( Symptom symptom : entityList ) {
            list.add( toDto( symptom ) );
        }

        return list;
    }

    @Override
    public SymptomDTO toDto(Symptom symptom) {
        if ( symptom == null ) {
            return null;
        }

        SymptomDTO symptomDTO = new SymptomDTO();

        Long id = symptomConsultationInfoId( symptom );
        if ( id != null ) {
            symptomDTO.setConsultationInfoId( id );
        }
        symptomDTO.setId( symptom.getId() );
        symptomDTO.setRef( symptom.getRef() );
        symptomDTO.setNumberOfDaysSuffering( symptom.getNumberOfDaysSuffering() );

        return symptomDTO;
    }

    @Override
    public Symptom toEntity(SymptomDTO symptomDTO) {
        if ( symptomDTO == null ) {
            return null;
        }

        Symptom symptom = new Symptom();

        symptom.setConsultationInfo( consultationInfoMapper.fromId( symptomDTO.getConsultationInfoId() ) );
        symptom.setId( symptomDTO.getId() );
        symptom.setRef( symptomDTO.getRef() );
        symptom.setNumberOfDaysSuffering( symptomDTO.getNumberOfDaysSuffering() );

        return symptom;
    }

    private Long symptomConsultationInfoId(Symptom symptom) {
        if ( symptom == null ) {
            return null;
        }
        ConsultationInfo consultationInfo = symptom.getConsultationInfo();
        if ( consultationInfo == null ) {
            return null;
        }
        Long id = consultationInfo.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
