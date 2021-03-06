import java.util.List;

/**
 * we use this interface and implement their methods in their classes
 * @author kashefi
 * @version 0.0
 */
public interface ICourseService {
    final static String COURSE_FILE_NAME_First = "course1.txt";
    final static String COURSE_FILE_NAME_Second = "course2.txt";
    void addCourse(Course course);
    List<Course> getAllCourses();
    void printCourses();
}
