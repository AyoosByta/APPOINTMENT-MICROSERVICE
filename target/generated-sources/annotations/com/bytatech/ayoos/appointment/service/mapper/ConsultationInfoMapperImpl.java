package com.bytatech.ayoos.appointment.service.mapper;

import com.bytatech.ayoos.appointment.domain.ConsultationInfo;
import com.bytatech.ayoos.appointment.service.dto.ConsultationInfoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-10-29T14:44:16+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_222 (Private Build)"
)
@Component
public class ConsultationInfoMapperImpl implements ConsultationInfoMapper {

    @Override
    public ConsultationInfoDTO toDto(ConsultationInfo entity) {
        if ( entity == null ) {
            return null;
        }

        ConsultationInfoDTO consultationInfoDTO = new ConsultationInfoDTO();

        consultationInfoDTO.setId( entity.getId() );
        consultationInfoDTO.setHeight( entity.getHeight() );
        consultationInfoDTO.setWeight( entity.getWeight() );
        consultationInfoDTO.setAge( entity.getAge() );

        return consultationInfoDTO;
    }

    @Override
    public List<ConsultationInfo> toEntity(List<ConsultationInfoDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ConsultationInfo> list = new ArrayList<ConsultationInfo>( dtoList.size() );
        for ( ConsultationInfoDTO consultationInfoDTO : dtoList ) {
            list.add( toEntity( consultationInfoDTO ) );
        }

        return list;
    }

    @Override
    public List<ConsultationInfoDTO> toDto(List<ConsultationInfo> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ConsultationInfoDTO> list = new ArrayList<ConsultationInfoDTO>( entityList.size() );
        for ( ConsultationInfo consultationInfo : entityList ) {
            list.add( toDto( consultationInfo ) );
        }

        return list;
    }

    @Override
    public ConsultationInfo toEntity(ConsultationInfoDTO consultationInfoDTO) {
        if ( consultationInfoDTO == null ) {
            return null;
        }

        ConsultationInfo consultationInfo = new ConsultationInfo();

        consultationInfo.setId( consultationInfoDTO.getId() );
        consultationInfo.setHeight( consultationInfoDTO.getHeight() );
        consultationInfo.setWeight( consultationInfoDTO.getWeight() );
        consultationInfo.setAge( consultationInfoDTO.getAge() );

        return consultationInfo;
    }
}
