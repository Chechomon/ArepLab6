package edu.escuelaing.patrones;

import edu.escuelaing.patrones.entities.Student;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author alejo
 */
public interface DataRepo {
    public List<Student> findAll() throws SQLException ;  
    public void insertStudent(Student s) throws SQLException;
}
