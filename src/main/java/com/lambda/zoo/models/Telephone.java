package com.lambda.zoo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "telephones")
public class Telephone extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long phoneid;

    private String phonetype;

    //MTO Zoo
    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties(value = "phones", allowSetters = true)
    private Zoo zoo;

    public Telephone() {
    }

    public Telephone(String phonetype, Zoo zoo) {
        this.phonetype = phonetype;
        this.zoo = zoo;
    }

    public long getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(long phoneid) {
        this.phoneid = phoneid;
    }

    public String getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(String phonetype) {
        this.phonetype = phonetype;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }
}
