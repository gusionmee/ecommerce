package com.api.apiblog.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Photodto {
    private Long id;
    private String title;
    private String Url;
    private String thumbailUrl;
    private Long albumid;

    public Photodto(Long id, String title, String Url, String thumbailUrl, Long albumid) {
        this.albumid = albumid;
        this.id = id;
        this.title = title;
        this.Url = Url;
        this.thumbailUrl = thumbailUrl;
    }
    public Photodto(){

    }
}




