package io.sankalp.habitstrackerapplication.entity;

import io.sankalp.habitstrackerapplication.enums.Color;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (
        name = "habits",
        uniqueConstraints = {
                @UniqueConstraint ( columnNames = {
                        "name"
                })
        }
)
public class Habit {

    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO )
    private long id;

    @Column (
            name = "name",
            nullable = false
    )
    private String name;

    @Column (
            name = "description",
            nullable = true
    )
    private String description;

    @Column (
            name = "successfulDates"
    )
    private Set<LocalDate> successfulDates;

    @Column (
            name = "color"
    )
    private Color color;

    @OneToOne ( fetch = FetchType.LAZY )
    @JoinColumn ( name = "repeat_mode_id" )
    private RepeatMode repeatMode;

    @ManyToOne
    @JoinColumn ( name = "user_id" )
    private User user;

    @Column (
            name = "startDate"
    )
    private LocalDate startDate;

    @Column (
            name = "consecutiveDaysGoal"
    )
    private int consecutiveDaysGoal;

}
