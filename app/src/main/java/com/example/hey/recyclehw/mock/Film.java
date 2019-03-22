package com.example.hey.recyclehw.mock;

public class Film {
    private String Name,Year,Description,Actors,Score,Website,Awards,Number;
    int Poster;
    private Film film;

    public Film(String Number,String Name,String Description,String Actors,String Year, String Score,String Website,int Poster,String Awards){
        this.Number=Number;
        this.Name=Name;
        this.Description=Description;
        this.Actors =Actors;
        this.Year=Year;
        this.Score=Score;
        this.Website=Website;
        this.Poster=Poster;
        this.Awards=Awards;


    }
     public String getNumber()   { return Number;};
    public String getActors() {
        return Actors;
    }

    public String getYear() {
        return Year;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public String getWebsite() {
        return Website;
    }

    public String getScore() {
        return Score;
    }

    public int getPoster() {
        return Poster;
    }

}
