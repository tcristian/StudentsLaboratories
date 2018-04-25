package controller;

import junit.framework.TestCase;
import model.Laboratory;
import model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

/**
 * Created by cristi on 20.03.2018.
 */
public class LaboratoriesControllerTest extends TestCase {

    LaboratoriesController ctrl = new LaboratoriesController("students.txt", "laboratories.txt");

    public void setUp() throws Exception {
        super.setUp();



    }

    public void tearDown() throws Exception {

    }

    public void testSaveStudent() throws Exception {
        System.out.println("\n TEST - Save student \n");


        Student student = new Student("asdf4455", "mircea bravo", 933);
        ctrl.saveStudent(student);
        assertEquals(student.getRegNumber(), "asdf4455");
        assertEquals(student.getName(), "mircea bravo");
        assertEquals(student.getGroup(), 933);
    }

    public void testSaveLaboratory() throws Exception {
        System.out.println("\n TEST - Save Laboratory \n");

        LaboratoriesController ctrl = new LaboratoriesController("students.txt", "laboratories.txt");

        Laboratory laboratory = new Laboratory(10,"11/12/2017", 2, "asdf4455");
        ctrl.saveLaboratory(laboratory);
        assertEquals(laboratory.getNumber(), 10);
        assertEquals(laboratory.getProblemNumber(), 2);
        assertEquals(laboratory.getStudentRegNumber(), "asdf4455");
    }

    public void testAddGrade() throws Exception {

        Student s1 = new Student("asdf1234", "Timar Cristian", 935);
        Laboratory l1 = new Laboratory(1,"02/05/2018",1, "asdf1234");
        Student s2 = new Student("a", "11111", 945);
        ctrl.addGrade(s1.getRegNumber(), "1", 5);
        ctrl.addGrade(s2.getRegNumber(), "0", 11);
        ctrl.addGrade(s1.getRegNumber(), "0", 10);
        ctrl.addGrade(s1.getRegNumber(), "3", 11);
        assertEquals(s1.getName(), "Timar Cristian");
        assertTrue(s1.getGroup() == 935);

    }

    public void testPassedStudents() throws Exception {
        Student s1 = new Student("asdf1234", "Timar Cristian", 935);
        Laboratory l1 = new Laboratory(1,"02/05/2018",1, "asdf1234");
        Student s2 = new Student("a", "11111", 945);
        List<Student> l = ctrl.passedStudents();
        assertFalse(l.size() == 30);
        assertTrue(l.size() >= 0)
;
    }

    public void testBigBang() throws Exception{
        testSaveStudent();
        testAddGrade();
        testPassedStudents();

    }

    /***** ----- hmwork ------- *****/
    public void testMethB() throws Exception {
        testSaveStudent();
        testAddGrade();
    }
    public void testMethC() throws Exception {
        testSaveStudent();
        testAddGrade();
        testPassedStudents();

    }
}