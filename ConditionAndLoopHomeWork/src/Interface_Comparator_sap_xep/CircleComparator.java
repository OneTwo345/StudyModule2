package Interface_Comparator;



import java.util.Comparator;
import tinh_da_hinh_thuc_hanh_hinh_hoc.Circle;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
       if (c1.getRadius()>c2.getRadius()) {return 1;}
       else if (c1.getRadius() < c2.getRadius()) {
           return -1;
       }
       else return 0;

    }
}
