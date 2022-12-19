package dlibrary;



import dlibrary.libfunction1.DeleteBook;
import dlibrary.libfunction1.RegisterBook;
import dlibrary.libfunction1.UpdateBook;
import dlibrary.libfunction2.SearchBook;
import dlibrary.libfunction3.CheckOutBook;
import dlibrary.libfunction3.ReturnBook;

import java.util.Map;

public class Library implements DeleteBook, RegisterBook, UpdateBook, SearchBook, CheckOutBook, ReturnBook {

    //도서 저장 Map
    Map<String, Book> books;

    
    //===================libfunction1============================================(관리자만 가능)

    //도서 삭제
    @Override
    public void deleteBook(Book book) {

    }

    @Override
    public void deleteBook(String serialNum) {

    }

    //도서 등록
    @Override
    public void registerBook(Book book) {

    }

    @Override
    public void registerBook(String serailNum) {

    }

    //도서 수정
    @Override
    public void updateBook(Book book) {

    }

    @Override
    public void updateBook(String serialNum) {

    }

    //===================libfunction2============================================


    //도서 검색
    @Override
    public Book searchBook(Book book) {
        return null;
    }

    @Override
    public Book searchBook(String serialNum) {
        return null;
    }

    //===================libfunction3============================================

    //도서 대출
    @Override
    public void checkOutBook(Book book) {

    }

    @Override
    public void checkOutBook(String serialNum) {
        
    }
    
    //도서 반납
    @Override
    public void returnBook(Book book) {

    }

    @Override
    public void returnBook(String serialNum) {

    }


    //========================추가 기능들================================

    //도서 등록사항 조회
    public String searchTitle(Book book) {
        return book.getTitle();
    }

    public String searchAuthor(Book book) {
        return book.getAuthor();
    }

    public String searchPublisher(Book book) {
        return book.getPublisher();
    }

    public String searchSerialNumber(Book book) {
        return book.getSerialNumber();
    }

    public int searchCheckOutDays(Book book) {
        return book.getCheckOutDays();
    }

    public int searchCheckedOutDays(Book book) {
        return book.getCheckedOutDays();
    }


}
