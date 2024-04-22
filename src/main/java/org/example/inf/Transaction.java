package org.example.inf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class Transaction {
    private Integer trans_id;
    private Integer stud_id;
    private String trans_info;
    private LocalDate trans_date;


}
