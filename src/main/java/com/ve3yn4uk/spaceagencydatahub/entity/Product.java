package com.ve3yn4uk.spaceagencydatahub.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * Created by 8e3Yn4uK on 24.04.2019
 */

@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                          CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "mission_id")
    private Mission mission;

    @Temporal(TemporalType.DATE)
    @Column(name = "acquisition_date", nullable = false)
    private Date acquisitionDate;

    @Embedded
    private Footprint footprint;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "url", length = 64, nullable = false)
    private String url;

    public Product() {
    }

    public Product(Mission mission, Date acquisitionDate, Footprint footprint, BigDecimal price, String url) {
        this.mission = mission;
        this.acquisitionDate = acquisitionDate;
        this.footprint = footprint;
        this.price = price;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public Footprint getFootprint() {
        return footprint;
    }

    public void setFootprint(Footprint footprint) {
        this.footprint = footprint;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return mission.equals(product.mission) &&
                acquisitionDate.equals(product.acquisitionDate) &&
                footprint.equals(product.footprint) &&
                price.equals(product.price) &&
                url.equals(product.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mission, acquisitionDate, footprint, price, url);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", mission=" + mission +
                ", acquisitionDate=" + acquisitionDate +
                ", footprint=" + footprint +
                ", price=" + price +
                ", url='" + url + '\'' +
                '}';
    }
}
