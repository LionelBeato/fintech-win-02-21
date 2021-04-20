package com.tts;

public class Book {

    // what are some properties of a book
    // author
    // title
    // year published
    // publisher
    // genre

    private String author;
    private String title;
    private Integer yearPublished;
    private String publisher;
    private String genre;

    public Book(String author, String title, Integer yearPublished, String publisher, String genre) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Integer yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearPublished=" + yearPublished +
                ", publisher='" + publisher + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
