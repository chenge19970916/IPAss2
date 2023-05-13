package com.msb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Renting_History {
    private String user_email;
    private Date rent_date;
    private Integer bond_amount;
}
