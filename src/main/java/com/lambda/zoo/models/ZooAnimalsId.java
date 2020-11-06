package com.lambda.zoo.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ZooAnimalsId implements Serializable {

    private long zooid;
    private long animalid;

    public ZooAnimalsId() {
    }

    public long getZooid() {
        return zooid;
    }

    public void setZooid(long zooid) {
        this.zooid = zooid;
    }

    public long getAnimalid() {
        return animalid;
    }

    public void setAnimalid(long animalid) {
        this.animalid = animalid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooAnimalsId that = (ZooAnimalsId) o;
        return getZooid() == that.getZooid() &&
                getAnimalid() == that.getAnimalid();
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
