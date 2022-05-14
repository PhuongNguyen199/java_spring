package com.techmaster.lab1.model;

public class bmi {
    private float cannang;
    private float chieucao;

    public bmi(float cannang, float chieucao) {
        this.cannang = cannang;
        this.chieucao = chieucao;
    }

    public float getCannang() {
        return cannang;
    }

    public void setCannang(float cannang) {
        this.cannang = cannang;
    }

    public float getChieucao() {
        return chieucao;
    }

    public void setChieucao(float chieucao) {
        this.chieucao = chieucao;
    }

    public float chisobim(float cannang, float chieucao) {
        float chiso = cannang / (chieucao * chieucao);
        return chiso;
    }
}
