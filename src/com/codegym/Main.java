package com.codegym;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageBook book = new ManageBook();
        int choice;
        while (true) {
            System.out.println("Manage Book: ");
            System.out.println("1.Insert Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Update Book");
            System.out.println("4. Search Book");
            System.out.println("5. Sort:");
            System.out.println("0. Exit");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập ngày xuất bản: ");
                    String publishDate = sc.nextLine();
                    System.out.println("Nhập tên tác giả: ");
                    String author = sc.nextLine();
                    System.out.println("Nhập ngôn ngữ: ");
                    String language = sc.nextLine();
                    System.out.println("Nhập giá bìa: ");
                    Float price = Float.parseFloat(sc.nextLine());
                    book.insertBook(id, name, publishDate, author, language, price);
                    book.Display();
                    break;
                case 2:
                    System.out.println("Nhập ID cần xóa: ");
                    int id1 = Integer.parseInt(sc.nextLine());
                    book.removeBook(id1);
                    book.Display();
                    break;
                case 3:
                    System.out.println("Nhập ID cần sửa: ");
                    int idUpdate = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên: ");
                    String nameUpdate = sc.nextLine();
                    System.out.println("Nhập ngày xuất bản: ");
                    String publishDateUpdate = sc.nextLine();
                    System.out.println("Nhập tên tác giả: ");
                    String authorUpdate = sc.nextLine();
                    System.out.println("Nhập ngôn ngữ: ");
                    String languageUpdate = sc.nextLine();
                    System.out.println("Nhập giá bìa: ");
                    Float priceUpdate = Float.parseFloat(sc.nextLine());
                    book.updateBook(idUpdate, nameUpdate, publishDateUpdate, authorUpdate, languageUpdate, priceUpdate);
                    book.Display();
                    break;
                case 4:
                    System.out.println("Nhập tên: ");
                    String name3 = sc.nextLine();
                    book.searchBook(name3);
                    break;
                case 5:
                    System.out.println("Sắp xếp theo tên: ");
                    book.Sort();
                    book.Display();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
