package baiTap.decorator;

public abstract class BorrowDecorator implements Borrowable {
    protected Borrowable borrowable;

    public BorrowDecorator(Borrowable borrowable) {
        this.borrowable = borrowable;
    }

    @Override
    public void borrow() {
        borrowable.borrow();
    }
}
