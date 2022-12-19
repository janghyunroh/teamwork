package dlibrary;

public class Book {

    //======================================    member field(등록사항)        ======================================
    private String title;           //도서명
    private String author;          //저자
    private String publisher;       //출판사
    private String serialNumber;    //도서 일련번호
    private int checkOutDays;    //도서 대출 가능일수




    private int checkedOutDays; //현재 대여 일수(반납 예정일 연산용)


    //======================================    getters & setters   ======
    // ===============================

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getCheckOutDays() {   return checkOutDays; }

    public void setCheckOutDays(int checkOutDays) { this.checkOutDays = checkOutDays; }

    public int getCheckedOutDays() { return checkedOutDays; }

    public void setCheckedOutDays(int checkedOutDays) { this.checkedOutDays = checkedOutDays; }

    //======================================


    @Override
    public String toString() {
        return "Book{}";
    }






    //======================================    메서드 구현      ======================================


}
