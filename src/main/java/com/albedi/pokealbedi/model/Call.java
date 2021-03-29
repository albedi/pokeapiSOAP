package com.albedi.pokealbedi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Call {
  @Id
  @GeneratedValue()
  private Integer id;

  @Column(name = "requestIp", nullable = false)
  private String requestIp;

  @CreationTimestamp
  @Column(name = "requestDate", nullable = false)
  private Date requestDate;

  @Column(name = "method", nullable = false)
  private String method;

  public void setId(Integer id) {
    this.id = id;
  }

  public void setRequestIp(String requestIp) {
    this.requestIp = requestIp;
  }

  public void setRequestDate(Date requestDate) {
    this.requestDate = requestDate;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public Integer getId() {
    return this.id;
  }

  public String getRequestIp() {
    return this.requestIp;
  }

  public Date getRequestDate() {
    return this.requestDate;
  }

  public String getMethod() {
    return this.method;
  }

}
