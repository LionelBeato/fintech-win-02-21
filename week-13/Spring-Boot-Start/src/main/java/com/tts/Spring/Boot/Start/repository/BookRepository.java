package com.tts.Spring.Boot.Start.repository;

import com.tts.Spring.Boot.Start.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Long aligns with your ID type for your entity
// the repository needs to have its ID type defined, otherwise it will not work
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    // this method will be generated for us by spring
    // the generation will follow the name of the method
    // in order to perform the requested functionality
    List<Book> findByTitle(String title);

    // basically anything you can do in SQL you can do here
    List<Book> findByAuthor(String author);

    // findById is default and given to you for free

}
