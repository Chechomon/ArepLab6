package edu.escuelaing.patrones.entities;

import java.sql.SQLException;
import java.util.*;
import org.springframework.stereotype.Service;
/**
 *
 * @author alejo
 */
@Service
public interface DataService {
    public List<Student> findAll() throws SQLException ;  
    public void insertStudent(Student s) throws SQLException;
}
