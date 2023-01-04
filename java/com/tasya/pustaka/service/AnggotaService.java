/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tasya.pustaka.service;

import com.google.gson.Gson;
import com.tasya.pustaka.model.Anggota;
import java.util.List;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

/**
 *
 * @author user
 */
public class AnggotaService {
    private String URL = "http://localhost:9001";
    
    public Anggota getAnggota (long anggotaId){
        Anggota anggota = Unirest.get(URL+"/anggota"+anggotaId).asObject(Anggota.class).getBody();
        if(anggota!=null){
            return anggota;
        }
        return null;
    }
    
    public Anggota saveAnggota(Anggota anggota){
        HttpResponse<JsonNode> response = Unirest.post(URL + "/anggota")
                .header("content-type", "application/json")
                .body(anggota)
                .asJson();
        Gson gson = new Gson();
        Anggota a = gson.fromJson(response.getBody().toString(), Anggota.class);
        return a;
    }

    public Anggota updateAnggota(Anggota anggota) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Anggota> getAllAnggota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void deleteAnggota(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
