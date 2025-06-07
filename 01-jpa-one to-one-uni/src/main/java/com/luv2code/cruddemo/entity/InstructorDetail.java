package com.luv2code.cruddemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {

    // annotate the class as an entity and map to db table

    // define the fields

    // annotate the fields with db column names

    // create constructors

    // generate getter/setter methods

    // generate toString() method

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @NonNull
    @Column(name="youtube_channel")
    private String youtubeChannel;

    @NonNull
    @Column(name="hobby")
    private String hobby;

}
