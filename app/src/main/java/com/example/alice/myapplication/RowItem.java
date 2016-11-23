package com.example.alice.myapplication;

/**
 * Created by Alice on 23/11/2016.
 */

public class RowItem {

    private String animaux;
    private int image_id;
    private String statues;
    private String jsaispas;

    public RowItem(String animaux, int image_id, String statues,
                   String jsaispas) {
        this.animaux = animaux;
        this.image_id = image_id;
        this.statues = statues;
        this.jsaispas = jsaispas;
    }

    public String getAnimaux() { return animaux; }

    public void setAnimaux(String animaux) { this.animaux = animaux; }

    public int getImage_id() { return image_id; }

    public void setImage_id(int image_id)  {this.image_id = image_id; }

    public String getStatues() { return statues; }

    public void setStatues(String statues) {this.statues = statues; }

    public String getJsaispas() { return jsaispas; }

    public void setJsaispas(String jsaispas) { this.jsaispas = jsaispas; }

}
