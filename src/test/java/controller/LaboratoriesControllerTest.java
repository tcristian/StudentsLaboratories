package controller;

import junit.framework.TestCase;
import model.Laboratory;
import model.Student;

/**
 * Created by Alex on 20.03.2018.
 */
public class LaboratoriesControllerTest extends TestCase {

    LaboratoriesController ctrl = new LaboratoriesController("students.txt", "laboratories.txt");

    public void setUp() throws Exception {
        super.setUp();



    }

    public void tearDown() throws Exception {

    }

    public void testSaveStudent() throws Exception {

    }

    public void testSaveLaboratory() throws Exception {

    }

    public void testAddGrade() throws Exception {

        Student s1 = new Student("asdf1234", "Pop Alex", 935);
        Laboratory l1 = new Laboratory(1,"02/05/2018",1, "asdf1234");

        ctrl.addGrade("asdf1234", "1", 5);


    }

    public void testPassedStudents() throws Exception {

    }

}