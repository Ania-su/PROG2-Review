import com.review.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeManagerTest {

    private Student ania;
    private Course prog2;
    private Exam pooExam1;
    private Grade pooGrade1;
    private Grade pooGrade2;
    private Instant t1;
    private Instant t2;

    @BeforeEach
    public void setUp(){
        Tutor aniaMom = new Tutor(70, "Mahefa", "Hasina", LocalDate.of(1986, 3, 12), "hamahefa@gmail.com", "0326752184", "Mother of Ania Su");
        ania = new Student(24026, "Ania", "Su", LocalDate.of(2006,6,15), "aniaaaasu@gmail.com", "0348288102", "K1", aniaMom);
        Teacher toky = new Teacher(1, "Tokimahery", "Ramarozaka", LocalDate.of(1989, 3, 16), "tokimahery@hei.school", "0385182135", "backend dev");
        prog2 = new Course(9, "Prog2 POO", "6", toky);
        pooExam1 = new Exam(1, "POO first exam", prog2, LocalDateTime.of(2025,7,5,8,0,0), 2);
        Exam pooExam2 = new Exam(6, "POO second exam", prog2, LocalDateTime.of(2025, 9, 12, 13, 0, 0), 2);
        pooGrade1 = new Grade(ania, pooExam1, prog2, 15, null);
        pooGrade2 = new Grade(ania, pooExam2, prog2, 12, null);

        t1 = Instant.parse("2025-07-31T14:32:12Z");
        t2 = Instant.parse("2025-08-24T23:56:29Z");

        pooGrade1.addChange(16, "Add bonus");

    }

    @Test
    public void getExamGradetest(){
        GradeManager gm = new GradeManager(List.of(pooGrade1));

        assertEquals(15, gm.getExamGrade(pooExam1, ania, t1));
        assertEquals(16, gm.getExamGrade(pooExam1, ania, t2));
    }

    @Test
    public void getCourseGradetest(){
        GradeManager gm = new GradeManager(List.of(pooGrade1, pooGrade2));
        double result = gm.getCourseGrade(prog2, ania, Instant.now());

        assertEquals(13.5, result);
    }
}
