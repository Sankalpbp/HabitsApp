package io.sankalp.habitstrackerapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (
        name = "repeatModes"
)
public class RepeatMode {

    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
    private long id;

    @Column (
            name = "type"
    )
    private RepeatModeType type;

    @Column (
            name = "repeatDays"
    )
    private int repeatDays;

    @Column (
            name = "days"
    )
    private List<DayOfWeek> days;

    @Column (
            name = "frequencyInADay"
    )
    private int frequencyInADay;

    private static enum RepeatModeType {
        DAILY,
        FIXED,
        FLEXIBLE;

        private RepeatModeType () {
        }
    }

}
