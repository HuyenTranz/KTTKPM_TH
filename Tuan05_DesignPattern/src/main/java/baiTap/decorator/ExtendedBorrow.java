package baiTap.decorator;

public class ExtendedBorrow extends BorrowDecorator {

    public ExtendedBorrow(Borrowable borrowable) {
        super(borrowable);
    }

    @Override
    public void borrow() {
        super.borrow();
        extendBorrowing();
    }

    private void extendBorrowing() {
        System.out.println("Extended borrowing period.");
    }
}
