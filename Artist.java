package com.company;

//Write two Java classes Artist and Album
//Artist class having ID, Name, ArtisticName, BirthYear, Role, Country, City properties
//Album class having ID, Title, Genre and PublishedYear properties
public class Artist
{

    private String name;
    private String id;
    private String artisticName;
    private int birthYear;
    private String role;
    private String country;
    private String city;


    Artist(String name, String id, String artisticName, int birthYear, String role, String country, String city)
    {
        this.name = name;
        this.id = id;
        this.artisticName = artisticName;
        this.country = country;
        this.birthYear = birthYear;
        this.role = role;
        this.city = city;
    }


    public int getbirthYear()
    {
        return this.birthYear;
    }

    public String getName()
    {
        return this.name;
    }



}

 class Album
{
    private String id;
    private String title;
    private String genre;
    private int publishedYear;


    Album (String id, String title, String genre, int publishedYear)
    {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.publishedYear = publishedYear;
    }

}


