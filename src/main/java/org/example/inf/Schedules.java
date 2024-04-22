package org.example.inf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString


public class Schedules {
    private Integer sched_id;
    private String Name;
    private Integer course_id;
    private Integer teach_id;
    private Integer sub_id;
    private Integer stud_id;
    private LocalDate day;
    private LocalTime time_start;
    private LocalTime time_end;

}
