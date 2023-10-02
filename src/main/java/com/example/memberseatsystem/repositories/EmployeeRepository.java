package com.example.memberseatsystem.repositories;
import com.example.memberseatsystem.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("INSERT INTO Employee (EMP_ID, NAME, EMAIL, FLOOR_SEAT_SEQ) VALUES (:empId, :name, :email, :floorSeatSeq)")
    void insertEmployee(@Param("empId") Long empId, @Param("name") String name, @Param("email") String email, @Param("floorSeatSeq") Long floorSeatSeq);
}
