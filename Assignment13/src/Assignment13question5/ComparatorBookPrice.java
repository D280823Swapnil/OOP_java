package Question5;
import java.util.Comparator;

public class ComparatorBookPrice implements Comparator<Book> {

    @Override
    public int compare(Book arg0, Book arg1) {
	return -Double.compare(arg0.getPrice(),arg1.getPrice());
    }

}
