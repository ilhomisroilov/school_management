package org.example.inf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

public class Teachers {
    private Integer teach_id;
    private String fullname;
    private String userteach;
    private Integer age;
    private String contact;
    private String teach_email;
    private String teach_password;

}
