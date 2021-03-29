package lsj.basic.day08;

public class Book {
    public static void main(String[] args) {
        BookInfo bi = new BookInfo();
        bi.setTitle("누구나 알기쉬운 자바: 입문편");
        bi.setAuthor("카와바 타케시");
        bi.setTranslator("하진일");
        bi.setPublisher("혜지원");
        bi.setpDate("2014년 06월");
        bi.setCost(25000);
        bi.setListPrice(22500);
        bi.setDiscount(10);
        bi.setPoint(2250);

        System.out.println(bi.getTitle());
        System.out.println(bi.getAuthor());
        System.out.println(bi.getTranslator());
        System.out.println(bi.getPublisher());
        System.out.println(bi.getpDate());
        System.out.println(bi.getCost());
        System.out.println(bi.getListPrice());
        System.out.println(bi.getDiscount());
        System.out.println(bi.getPoint());
    }
}

class BookInfo{
    private String title;
    private String author;
    private String translator;
    private String publisher;
    private String pDate;
    private int cost;
    private int listPrice;
    private double discount;
    private int point;

    public BookInfo(String title, String author, String translator, String publisher
            , String pDate, int cost, int listPrice, double discount, int point) {
        this.title = title;
        this.author = author;
        this.translator = translator;
        this.publisher = publisher;
        this.pDate = pDate;
        this.cost = cost;
        this.listPrice = listPrice;
        this.discount = discount;
        this.point = point;
    }

    public BookInfo() {
    }

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

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getpDate() {
        return pDate;
    }

    public void setpDate(String pDate) {
        this.pDate = pDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getListPrice() {
        return listPrice;
    }

    public void setListPrice(int listPrice) {
        this.listPrice = listPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}


