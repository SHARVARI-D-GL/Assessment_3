


package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity

public class Customer {

@Id

 private int custid;

 private String custname;

 private String addr;

 public int getCustid() {

 return custid;

 }

 public void setAid(int custid) {

 this.custid = custid;

 }

 public String getCustname() {

 return custname;

 }

 public void setAname(String Custname) {

 this.custname = custname;

 }

 public String getAddr() {

 return addr;

 }

 public void setAddr(String addr) {

 this.addr = addr;

 }

 @Override

 public String toString() {

 return "Customer [custid=" + custid + ", custname=" + custname + ", addr=" + addr + "]";

 }

}