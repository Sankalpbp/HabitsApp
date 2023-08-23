package io.sankalp.habitstrackerapplication.service.impl;

import io.sankalp.habitstrackerapplication.entity.Habit;
import io.sankalp.habitstrackerapplication.entity.RepeatMode;
import io.sankalp.habitstrackerapplication.payload.HabitDTO;
import io.sankalp.habitstrackerapplication.payload.RepeatModeDTO;
import io.sankalp.habitstrackerapplication.repository.HabitsRepository;
import io.sankalp.habitstrackerapplication.repository.RepeatModeRepository;
import io.sankalp.habitstrackerapplication.service.HabitService;
import io.sankalp.habitstrackerapplication.service.RepeatModeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class HabitServiceImpl implements HabitService {

    private final HabitsRepository repository;
    private final RepeatModeService repeatModeService;
    private final ModelMapper mapper;

    public HabitServiceImpl ( HabitsRepository repository,
                              RepeatModeService repeatModeService,
                              ModelMapper mapper ) {
        this.repository = repository;
        this.repeatModeService = repeatModeService;
        this.mapper = mapper;
    }

    @Override
    public HabitDTO createHabit ( HabitDTO habitDTO ) {
        RepeatMode createdRepeatMode = repeatModeService.createRepeatMode ( habitDTO.getRepeatMode() );

        Habit newHabit = dtoToEntity ( habitDTO  );
        newHabit.setRepeatMode ( createdRepeatMode );

        return entityToDTO ( repository.save ( newHabit ) );
    }

    /* TODO: Make these convert methods Generic */
    private Habit dtoToEntity ( HabitDTO habitDTO ) {
        return mapper.map ( habitDTO, Habit.class );
    }

    private HabitDTO entityToDTO ( Habit habit ) {
        return mapper.map ( habit, HabitDTO.class );
    }

}
