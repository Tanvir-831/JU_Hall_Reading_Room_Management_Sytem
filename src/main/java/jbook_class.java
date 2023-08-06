
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class jbook_class implements Serializable {
    
    private String publication;
    private String book_name;
    private String author;
    private String issue_date;
    private String isbn;
    private String adition;

    public jbook_class(String publication, String book_name, String author, String issue_date, String isbn, String adition) {
        this.publication = publication;
        this.book_name = book_name;
        this.author = author;
        this.issue_date = issue_date;
        this.isbn = isbn;
        this.adition = adition;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAdition() {
        return adition;
    }

    public void setAdition(String adition) {
        this.adition = adition;
    }  
}
