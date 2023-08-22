package io.sankalp.habitstrackerapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (
        name = "users"
)
public class User {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    private long id;

    @Column (
            name = "name"
    )
    private String name;

    @Column (
            name = "username"
    )
    private String username;

    @Column (
            name = "email"
    )
    private String email;

    @Column (
            name = "password"
    )
    private String password;

    @OneToMany ( mappedBy = "user" )
    private List<Habit> habits;

}
