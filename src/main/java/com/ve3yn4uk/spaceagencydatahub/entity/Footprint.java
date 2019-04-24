package com.ve3yn4uk.spaceagencydatahub.entity;

import javax.persistence.Embeddable;

/**
 * Created by 8e3Yn4uK on 24.04.2019
 */

@Embeddable
public class Footprint {

    private int x;
    private int y;
    private int z;
    private int t;

    public Footprint() {
    }

    public Footprint(int x, int y, int z, int t) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
}