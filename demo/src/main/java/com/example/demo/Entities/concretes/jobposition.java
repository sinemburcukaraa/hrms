package com.example.demo.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getter setter
@Entity                         //implements entity yazmak yerine bu
@Table(name = "job_positions")  //veritabanı tarafında bir table a denk geldiğini söylüyor
@NoArgsConstructor              //parametresiz constructor eklemeye yarıyor.
@AllArgsConstructor             //tüm field parametrelerini içeren contructor 

public class jobposition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//generate edilen değer
    @Column(name = "id")
	private int id;
    @Column(name = "position")
	private String position;
	
}
