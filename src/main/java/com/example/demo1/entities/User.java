package com.example.demo1.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user", schema = "authen")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Long id;

  @Column(name = "name")
  public String name;

  @Column(name = "email")
  public String email;

}
