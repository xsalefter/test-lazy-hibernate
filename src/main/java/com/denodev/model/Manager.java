package com.denodev.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="PERSON")
@DiscriminatorValue("M")
public class Manager extends Person implements Serializable{

    private static final long serialVersionUID = 6584823719050564487L;

    @Column(name="Budget")
    private double budget;

    @OneToMany( fetch = FetchType.LAZY, mappedBy="manager", cascade=CascadeType.ALL)
    private List<Meeting> listAppointment;

    public Manager() {
        super();
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<Meeting> getListAppointment() {
        return listAppointment;
    }

    public void setListAppointment(List<Meeting> listAppointment) {
        this.listAppointment = listAppointment;
    }

}