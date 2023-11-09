package Question7;
import java.util.Comparator;

public class ComparatorStudentRoll implements Comparator<Student> {

    @Override
    public int compare(Student arg0, Student arg1) {
	return arg0.getRoll()-arg1.getRoll();
    }

}