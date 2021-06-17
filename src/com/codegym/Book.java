package com.codegym;

public class Book {
    private int ID;
    private String Name;
    private String PublishDate;
    private String Author;
    private String Language;
    private float AveragePrice;

    public Book() {

    }

    public Book(int ID, String name, String publishDate, String author, String language, float averagePrice) {
        this.ID = ID;
        Name = name;
        PublishDate = publishDate;
        Author = author;
        Language = language;
        AveragePrice = averagePrice;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public float getAveragePrice() {
        return AveragePrice;
    }

    public void setAveragePrice(float averagePrice) {
        AveragePrice = averagePrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", PublishDate='" + PublishDate + '\'' +
                ", Author='" + Author + '\'' +
                ", Language='" + Language + '\'' +
                ", AveragePrice=" + AveragePrice +
                '}';
    }

}
