package com.example.springwebvalidatorenumdate.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private VisitEnum firstVisit;

    @Enumerated(EnumType.ORDINAL)
    private VisitEnum secondVisit;

    @JsonFormat(pattern = "HH:mm:ss")
    private java.sql.Time sqlTime;
}
