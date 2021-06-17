package com.codegym;

import java.util.ArrayList;
import java.util.Comparator;

public class ManageBook extends Book implements IBook {

    ArrayList<ManageBook> books = new ArrayList<>();

    public ManageBook() {

    }


    public ManageBook(int ID, String name, String publishDate, String author, String language, float averagePrice) {
        super(ID, name, publishDate, author, language, averagePrice);
    }

    public void insertBook(int ID, String name, String publishDate, String author, String language, float averagePrice) {
        books.add(new ManageBook(ID, name, publishDate, author, language, averagePrice));
    }

    public void removeBook(int ID) {
        ManageBook target = null;
        for (ManageBook s : books) {
            if (s.getID() == ID) {
                target = s;
            }
        }
        books.remove(target);
    }

    public void updateBook(int ID, String newName, String newPublishDate, String newAuthor, String newLanguage, float newAveragePrice) {
        for (ManageBook s : books) {
            if (s.getID() == ID) {
                s.setName(newName);
                s.setPublishDate(newPublishDate);
                s.setAuthor(newAuthor);
                s.setLanguage(newLanguage);
                s.setAveragePrice(newAveragePrice);
            }
        }
    }

    public void searchBook(String name) {
        for (ManageBook s : books) {
            if (s.getName().equals(name)) {
                System.out.println(s);
            }
        }
    }
//    public void sortBook(){
//
//    }

    @Override
    public void Display() {
        for (ManageBook s : books) {
            System.out.println(s);
        }
    }

    @Override
    public void Sort() {
        Comparator bookComporator = new BookComporator();
        books.sort(bookComporator);
    }
}
