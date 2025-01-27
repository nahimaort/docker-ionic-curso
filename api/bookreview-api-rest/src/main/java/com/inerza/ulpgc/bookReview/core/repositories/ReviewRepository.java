package com.inerza.ulpgc.bookReview.core.repositories;

import com.inerza.ulpgc.bookReview.model.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface ReviewRepository extends JpaRepository<Review, Long>, PagingAndSortingRepository<Review, Long> {
    List<Review> findByBookId(Long bookId);
}
