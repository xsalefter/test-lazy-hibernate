package com.denodev.model;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "PERSON")
@DiscriminatorValue("E")
public class Employee extends Person implements Serializable {

    private static final long serialVersionUID = 2233431440325193084L;

    @OneToMany( fetch = FetchType.LAZY, mappedBy="employee", cascade=CascadeType.ALL)
    private List<Meeting> listAppointment;

    public Employee() {
        super();
    }

    public Employee(String personFirstName, String personLastName) {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
    }

    public List<Meeting> getListAppointment() {
        return listAppointment;
    }

    public void setListAppointment(List<Meeting> listAppointment) {
        this.listAppointment = listAppointment;
    }

}