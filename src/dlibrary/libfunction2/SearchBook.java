package dlibrary.libfunction2;

import dlibrary.Book;

public interface SearchBook {
    public Book searchBook(Book book);
    public Book searchBook(String serialNum);
}
