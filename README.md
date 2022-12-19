# teamwork
도서관리 프로그램관련 내용

1. 도서관리 기능 구현(인터페이스, 클래스)
2. GUI로 관리 프로그램 구현

package & interface
teamwork.dlibrary.libfunction1
 - 도서의 등록, 수정, 삭제 기능과 관련되어 있는 패키지.
  -. RegisterBook, UpdateBook, DeleteBook(interface) 
   -> Book(기능구현한 인터페이스를 상속받은 인터페이스)
 - 도서 등록 시 중복되는 도서는 일련번호로 구분해야 하므로, 
   모든 도서는 일련번호로 관리.
teamwork.dlibrary.libfunction2
 - SearchBook(인터페이스)
 - 도서 조회 기능과 관련되어 있는 패키지.
teamwork.dlibrary.libfunction3(4)
 - CheckOutBook, ReturnBook -> Book
 - 도서 대출, 반납 기능과 관련되어 있는 패키지.

필요 기능 정리
 - 도서 등록, 수정, 삭제 기능(관리자 이상 가능)
  -. 도서 등록 사항
   -> 도서명, 출판사, 저자, 도서 일련번호, 도서의 대출 가능일 수
 - 도서 조회 기능(누구나 가능)
  -. 등록 사항마다 조회 가능하도록 설계
 - 도서 대출, 반납 기능
   -. 대출 시 해당 도서의 일련번호에 대출 일자를 남기고, 반납 
      예정일이 연산되도록 한다.
   -. 반납 예정일을 넘긴 경우, 반납 예정 목록에 나타나도록 한다.
   -. 반납한 경우, 초기화(대출일자, 반납예정일)
   -. 대출 , 반납 시에 기록들을 따로 로깅한다.
