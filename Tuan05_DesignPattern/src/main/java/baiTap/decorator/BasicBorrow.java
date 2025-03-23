package baiTap.decorator;

public class BasicBorrow implements Borrowable {

    @Override
    public void borrow() {
        System.out.println("Borrowing a book...");
    }
}
