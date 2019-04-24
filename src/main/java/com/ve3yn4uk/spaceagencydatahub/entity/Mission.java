package com.ve3yn4uk.spaceagencydatahub.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * Created by 8e3Yn4uK on 23.04.2019
 */

@Entity
@Table(name = "mission")
public class Mission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", length = 64, nullable = false)
    private String name;

    @Column(name = "imagery_type", length = 64, nullable = false)
    private String imageryType;

    @Temporal(TemporalType.DATE)
    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "finish_date", nullable = false)
    private Date finishDate;

    public Mission() {
    }

    public Mission(String name, String imageryType, Date startDate, Date finishDate) {
        this.name = name;
        this.imageryType = imageryType;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageryType() {
        return imageryType;
    }

    public void setImageryType(String imageryType) {
        this.imageryType = imageryType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mission)) return false;
        Mission mission = (Mission) o;
        return name.equals(mission.name) &&
                imageryType.equals(mission.imageryType) &&
                startDate.equals(mission.startDate) &&
                finishDate.equals(mission.finishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, imageryType, startDate, finishDate);
    }

    @Override
    public String toString() {
        return "Mission{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imageryType='" + imageryType + '\'' +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                '}';
    }
}

