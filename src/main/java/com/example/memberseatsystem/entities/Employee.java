package com.example.memberseatsystem.entities;
import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_ID")
    private Long empId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @ManyToOne
    @JoinColumn(name = "FLOOR_SEAT_SEQ")
    private SeatingChart seatingChart;
}
