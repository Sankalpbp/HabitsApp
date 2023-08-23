package io.sankalp.habitstrackerapplication.service;

import io.sankalp.habitstrackerapplication.entity.Habit;
import io.sankalp.habitstrackerapplication.payload.HabitDTO;

import java.util.List;

public interface HabitService {

    public HabitDTO createHabit ( HabitDTO habitDTO );

}
