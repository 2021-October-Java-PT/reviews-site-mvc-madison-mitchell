package org.wecancodeit;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    private ReviewRepository underTest;
    Review reviewOne = new Review(1L, "Review One Title", "image1.Url", "Review One Category",
            "Review One Content", "Review One/Publication/Date", "Book1 Title", "Book1 Author",
            "Book1/Publication/Date", "Book1 Synopsis", "High Fantasy", "0/5", "400");
    Review reviewTwo = new Review(2L, "Review Two Title", "image2.Url", "Review Two Category",
            "Review Two Content", "Review Two/Publication/Date", "Book2 Title", "Book2 Author",
            "Book2/Publication/Date", "Book2 Synopsis", "Autobiography", "5/5", "500");

    @Test
    public void shouldFindReviewOne() {
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindAllReviews() {
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);
    }
}
