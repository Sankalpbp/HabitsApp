package io.sankalp.habitstrackerapplication.payload;

import io.sankalp.habitstrackerapplication.enums.RepeatModeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RepeatModeDTO {

    private long id;
    private RepeatModeType type;
    private int repeatDays;
    private List<DayOfWeek> days;
    private int frequencyInADay;

}
