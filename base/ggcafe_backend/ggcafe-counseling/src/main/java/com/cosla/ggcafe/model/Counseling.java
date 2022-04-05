package com.cosla.ggcafe.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@Entity
@Data
public class Counseling {
    @Id @GeneratedValue
    Long id;
    String counselor;
    int counselorId;
    String counselee;
    int counseleeId;
    String purpose;
    String category;
    String url;
    Date date;
}
