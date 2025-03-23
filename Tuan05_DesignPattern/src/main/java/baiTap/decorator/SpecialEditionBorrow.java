package baiTap.decorator;

public class SpecialEditionBorrow extends BorrowDecorator {

    public SpecialEditionBorrow(Borrowable borrowable) {
        super(borrowable);
    }

    @Override
    public void borrow() {
        super.borrow();
        requestSpecialEdition();
    }

    private void requestSpecialEdition() {
        System.out.println("Requested a special edition book.");
    }
}
