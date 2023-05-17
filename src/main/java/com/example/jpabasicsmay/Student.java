package com.example.jpabasicsmay;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity  //It is used to send all the values into database
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student_info") //this line is used to change the name of table from your database

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private int age;
    @Column(name="full_name") //this line is used to change the name of column from your table
    private String name;
    private int marks;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    LibraryCard libraryCard;
}
