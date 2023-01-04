/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasya.pustaka.model;

/**
 *
 * @author user
 */
public class Anggota {
    public long anggotaId;
    public String nama;
    public String alamat;

    public long getAnggotaId() {
        return anggotaId;
    }

    public void setAnggotaId(long anggotaId) {
        this.anggotaId = anggotaId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Object getTxtAnggotaId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}