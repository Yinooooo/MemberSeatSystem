package com.example.memberseatsystem.repositories;
import com.example.memberseatsystem.entities.SeatingChart;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SeatingChartRepository extends JpaRepository<SeatingChart, Long> {
   @Query("SELECT s FROM SeatingChart s WHERE s.floorNo = :floorNo")
    List<SeatingChart> findByFloorNo(@Param("floorNo") String floorNo);
}
