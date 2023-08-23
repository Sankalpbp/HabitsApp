package io.sankalp.habitstrackerapplication.payload;

import io.sankalp.habitstrackerapplication.entity.RepeatMode;
import io.sankalp.habitstrackerapplication.enums.Color;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HabitDTO {

    private long id;
    private String name;
    private String description;
    private Set<LocalDate> successfulDates;
    private Color color;
    private RepeatModeDTO repeatMode;
    private LocalDate startDate;
    private int consecutiveDaysGoal;
}
