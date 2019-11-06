package com.bytatech.ayoos.appointment.service.mapper;

import com.bytatech.ayoos.appointment.domain.Timing;
import com.bytatech.ayoos.appointment.service.dto.TimingDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-11-04T14:28:11+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_212 (Oracle Corporation)"
)
@Component
public class TimingMapperImpl implements TimingMapper {

    @Override
    public Timing toEntity(TimingDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Timing timing = new Timing();

        timing.setId( dto.getId() );
        timing.setDay( dto.getDay() );
        timing.setStartFrom( dto.getStartFrom() );
        timing.setEndTo( dto.getEndTo() );

        return timing;
    }

    @Override
    public TimingDTO toDto(Timing entity) {
        if ( entity == null ) {
            return null;
        }

        TimingDTO timingDTO = new TimingDTO();

        timingDTO.setId( entity.getId() );
        timingDTO.setDay( entity.getDay() );
        timingDTO.setStartFrom( entity.getStartFrom() );
        timingDTO.setEndTo( entity.getEndTo() );

        return timingDTO;
    }

    @Override
    public List<Timing> toEntity(List<TimingDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Timing> list = new ArrayList<Timing>( dtoList.size() );
        for ( TimingDTO timingDTO : dtoList ) {
            list.add( toEntity( timingDTO ) );
        }

        return list;
    }

    @Override
    public List<TimingDTO> toDto(List<Timing> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TimingDTO> list = new ArrayList<TimingDTO>( entityList.size() );
        for ( Timing timing : entityList ) {
            list.add( toDto( timing ) );
        }

        return list;
    }
}
