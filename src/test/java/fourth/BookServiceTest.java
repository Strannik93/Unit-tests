package fourth;

import org.junit.jupiter.api.Test;
import org.seminars.fourth.Book;
import org.seminars.fourth.BookService;
import org.seminars.fourth.InMemoryBookRepository;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
class BookServiceTest {
    // 1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
    // Использование тестовых заглушек может быть полезным при написании модульных тестов, так как они могут заменить
    // реальные зависимости модуля и позволить тестировать его изолированно.

    // 2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван
    // с определенными аргументами?
    // Для этого следует использовать test doubles, такие как шпионы или моки.
    // Шпионы - виды тестовых заглушек, которые записывают информацию о вызовах метода, включая переданные аргументы.
    // Моки - заглушки, предопределяющие ожидаемые вызовы методов и их возвращаемые значения.

    // 3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?
    // Для этого следует использовать заглушки: stubs или фейки.
    // stubs - заглушки, задающие фиксированные возвращаемые значения для вызовов методов.
    // Фейки - заглушки, реализующие упрощенную вервию реального объекта или интерфейса.

    // 4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?
    // Для этого рекомендуется использовать фейки.

    @Test
    public void testFindBooks() {
        // Создаем подделку BookRepository
        InMemoryBookRepository fakeBookRepository = new InMemoryBookRepository();

        // Создаем BookService c фейковым репозиторием
        BookService bookService = new BookService(fakeBookRepository);

        // Проверяем, что в подделке всего 2 книги
        assertEquals(2,bookService.findAllBooks().size());

        // Получаем объект книгу с id "2"
        Book book = bookService.findBookById("2");

        // Проверяем, что полученные данные совпадают
        assertEquals("2",book.getId());
        assertEquals("Book2",book.getTitle());
        assertEquals("Author2",book.getAuthor());
    }

}