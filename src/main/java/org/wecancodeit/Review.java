package org.wecancodeit;

import javax.persistence.Lob;

public class Review {
    private Long id;
    private String reviewTitle;
    private String imageUrl;
    private String reviewCategory;
    @Lob
    private String reviewContent;
    private String reviewPublicationDate;
    private String bookTitle;
    private String bookAuthor;
    private String bookPublicationDate;
    @Lob
    private String bookSynopsis;
    private String genre;
    private String bookRating;
    private String bookPagesNum;


    public Review(Long id, String reviewTitle, String imageUrl, String reviewCategory, String reviewContent, String reviewPublicationDate,
                  String bookTitle, String bookAuthor, String bookPublicationDate, String bookSynopsis, String genre, String bookRating, String bookPagesNum) {
        this.id = id;
        this.reviewTitle = reviewTitle;
        this.imageUrl = imageUrl;
        this.reviewCategory = reviewCategory;
        this.reviewContent = reviewContent;
        this.reviewPublicationDate = reviewPublicationDate;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublicationDate = bookPublicationDate;
        this.bookSynopsis = bookSynopsis;
        this.genre = genre;
        this.bookRating = bookRating;
        this.bookPagesNum = bookPagesNum;
    }

    public Review() {
    }

    public Long getId() {
        return id;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }
    public String getReviewPlusBookTitle() {
        return bookTitle + ": " + reviewTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public String getReviewPublicationDate() {
        return reviewPublicationDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookPublicationDate() {
        return bookPublicationDate;
    }

    public String getBookSynopsis() {
        return bookSynopsis;
    }

    public String getGenre() {
        return genre;
    }

    public String getBookRating() {
        return bookRating;
    }

    public String getBookPagesNum() {
        return bookPagesNum;
    }
}
