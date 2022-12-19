package dlibrary.libfunction3;

import dlibrary.Book;

public interface ReturnBook {
    public void returnBook(Book book);      //book 객체를 받아 반납 메서드 실행
    public void returnBook(String serialNum);//도서의 일련번호로 반납 실행
}
