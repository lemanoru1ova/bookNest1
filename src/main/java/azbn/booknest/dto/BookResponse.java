package azbn.booknest.dto;

public record BookResponse(
    Long id,
    String title,
    String isbn,
    Integer publishedYear,
    Integer availableCopies
) {
}
