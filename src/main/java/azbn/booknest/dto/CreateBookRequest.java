package azbn.booknest.dto;

import jakarta.validation.constraints.*;

public record CreateBookRequest(

        @NotBlank(message = "Kitap başlığı boş ola bilməz")
        @Size(min = 2, max = 100)
        String title,

        @NotBlank(message = "ISBN boş ola bilməz")
        @Size(min = 10, max = 20)
        String isbn,

        @Min(value = 1450, message = "Yayın ili mənfi ola bilməz")
        Integer publishedYear,

        @NotNull
        @Positive(message = "Müsbət ədəd olmalıdır")
        Integer initialCopies
) {
}
