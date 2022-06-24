package com.example.bookstore;

import javafx.scene.image.Image;

public class BookStore {



    //private instance variables
    private String bookName;
    private String ISBN;
    private String detailsAboutAuthor;
    private Image bookImage;
    private static BookStore test = new BookStore();

    private BookStore(){

    }
    public static BookStore getBookStore(){
        return test;
    }

    //Our Public services (getter and setter methods)
    public void setBookName(){
        this.bookName = "Things Fall Apart";
    }
    public String getBookName(){
        return bookName;
    }

    public void setISBN(){
        this.ISBN = "12345";
    }
    public String getISBN(){
        return ISBN;
    }

    public void setDetailsAboutAuthor(){
        this.detailsAboutAuthor ="Chinua Achebe was a Nigerian novelist, poet, and critic who is regarded as the dominant figure of modern African literature. His first novel and magnum opus, Things Fall Apart, occupies a pivotal place in African literature and remains the most widely studied, translated and read African novel.";

    }
    public String getDetailsAboutAuthor(){
        return detailsAboutAuthor;
    }

    public void setBookImage(){
        bookImage = new Image(getClass().getResourceAsStream("TFA.jpeg"));
    }
    public Image getBookImage(){
        return bookImage;
    }

}
