package cay_tim_kiem_nhi_phan;

public class TreeNote<E> {
    protected E element;
    protected TreeNote<E> left;
    protected TreeNote<E> right;

    public TreeNote(E e) {
        element = e;
    }
}
