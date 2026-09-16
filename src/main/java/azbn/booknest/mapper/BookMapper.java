package azbn.booknest.mapper;

import azbn.booknest.dto.BookResponse;
import azbn.booknest.dto.CreateBookRequest;
import azbn.booknest.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public BookResponse toResponse(Book book) {
        return new BookResponse(
                book.getId(),
                book.getTitle(),
                book.getIsbn(),
                book.getPublishedYear(),
                book.getAvailableCopies()
        );
    }
    public Book toEntity(CreateBookRequest request) {
        return new Book(
                request.title(),
                request.isbn(),
                request.publishedYear(),
                request.initialCopies()
        );
    }
}
