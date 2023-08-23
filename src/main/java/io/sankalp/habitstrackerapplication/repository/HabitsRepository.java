package io.sankalp.habitstrackerapplication.repository;

import io.sankalp.habitstrackerapplication.entity.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitsRepository extends JpaRepository<Habit, Long> {

}
