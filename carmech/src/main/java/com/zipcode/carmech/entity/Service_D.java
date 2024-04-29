package com.zipcode.carmech.entity;

import jakarta.persistence.*;

@Entity
@Table(name="service_d")
public class Service_D {

    //define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="service_name")
    private String service_name;


    public Service_D(){

    }

    public Service_D(String service_name) {
        this.service_name = service_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    @Override
    public String toString() {
        return "Service_D{" +
                "id=" + id +
                ", service_name='" + service_name + '\'' +
                '}';
    }
}
