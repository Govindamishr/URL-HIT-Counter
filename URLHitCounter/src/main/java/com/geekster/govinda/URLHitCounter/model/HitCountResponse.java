package com.geekster.govinda.URLHitCounter.model;

public  class  HitCountResponse {
    private String username;
    private int hitcount;

    public HitCountResponse(String username, int hitcount) {
        this.username = username;
        this.hitcount = hitcount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getHitcount() {
        return hitcount;
    }

    public void setHitcount(int hitcount) {
        this.hitcount = hitcount;
    }



}
