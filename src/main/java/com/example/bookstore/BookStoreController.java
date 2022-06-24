package com.example.bookstore;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;

public class BookStoreController {

    @FXML
    private TextField bookName;

    @FXML
    private TextField isbn;

    @FXML
    private ImageView imageDisplay;

    @FXML
    private TextField bookDisplay;

    @FXML
    private TextArea detailsDisplay;

    @FXML
    void bookPurchase(ActionEvent event) {

    }

    @FXML
    void bookSearch(ActionEvent event) {
        BookStore test = BookStore.getBookStore();
        test.setBookImage();
        test.setBookName();
        test.setISBN();
        test.setDetailsAboutAuthor();
        bookDisplay.setText(test.getBookName());
        bookName.setText(test.getBookName());
        isbn.setText(test.getISBN());
        imageDisplay.setImage(test.getBookImage());
        detailsDisplay.setText(test.getDetailsAboutAuthor());
    }

    @FXML
    void isbnSearch(ActionEvent event) {
        BookStore test = BookStore.getBookStore();
        test.setBookImage();
        test.setBookName();
        test.setISBN();
        test.setDetailsAboutAuthor();
        bookDisplay.setText(test.getBookName());
        bookName.setText(test.getBookName());
        isbn.setText(test.getISBN());
        imageDisplay.setImage(test.getBookImage());
        detailsDisplay.setText(test.getDetailsAboutAuthor());

    }

    @FXML
    void resetFields(ActionEvent event) {
        bookDisplay.clear();
        bookName.clear();
        isbn.clear();
        imageDisplay.setImage(null);
        detailsDisplay.clear();

    }

}
