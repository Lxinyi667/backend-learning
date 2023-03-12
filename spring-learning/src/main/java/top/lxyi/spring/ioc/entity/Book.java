package top.lxyi.spring.ioc.entity;

public class Book {
    private String bookId;
    private String bookName;
    private String bookPrice;

    public Book(String bookId, String bookName, String bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public Book() {
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "bookId:"+bookId+",bookName:"+bookName+",bookprice:"+bookPrice;
    }
}
