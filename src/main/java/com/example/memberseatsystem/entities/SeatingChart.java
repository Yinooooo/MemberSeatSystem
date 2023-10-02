package com.example.memberseatsystem.entities;
import javax.persistence.*;

@Entity
@Table(name = "seatingchart")
public class SeatingChart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FLOOR_SEAT_SEQ")
    private Long floorSeatSeq;

    @Column(name = "FLOOR_NO")
    private String floorNo;

    @Column(name = "SEAT_NO")
    private String seatNo;
}
