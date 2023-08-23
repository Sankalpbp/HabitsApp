package io.sankalp.habitstrackerapplication.service.impl;

import io.sankalp.habitstrackerapplication.entity.RepeatMode;
import io.sankalp.habitstrackerapplication.payload.RepeatModeDTO;
import io.sankalp.habitstrackerapplication.repository.RepeatModeRepository;
import io.sankalp.habitstrackerapplication.service.RepeatModeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class RepeatModeServiceImpl implements RepeatModeService {

    private final RepeatModeRepository repository;
    private final ModelMapper mapper;

    public RepeatModeServiceImpl ( RepeatModeRepository repository,
                                   ModelMapper mapper ) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public RepeatMode createRepeatMode ( RepeatModeDTO repeatModeDTO ) {
        return repository.save ( dtoToEntity ( repeatModeDTO ) );
    }

    /* TODO: Make these conversion methods Generic and put in a Utility package */
    private RepeatMode dtoToEntity ( RepeatModeDTO dto ) {
        return mapper.map ( dto, RepeatMode.class );
    }

}
