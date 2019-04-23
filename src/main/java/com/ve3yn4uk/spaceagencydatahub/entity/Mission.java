package com.ve3yn4uk.spaceagencydatahub.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * Created by 8e3Yn4uK on 23.04.2019
 */

@Entity
@Table(name = "mission")
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "imagery_type")
    private String imageryType;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "finish_date")
    private Date finishDate;

    public Mission() {
    }

    public Mission(String name, ImageryType imageryType, Date startDate, Date finishDate) {
        this.name = name;
        this.imageryType = imageryType.toString();
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

    public void setImageryType(ImageryType imageryType) {
        this.imageryType = imageryType.toString();
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

