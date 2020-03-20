package edu.escuelaing.patrones.entities;

import edu.escuelaing.patrones.DataRepo;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author alejo
 */
@Component
public class StudentService implements DataService{
    @Autowired
    private DataRepo dataRepository;

    @Override
    public List<Student> findAll() throws SQLException {
        return dataRepository.findAll();
    }

    @Override
    public void insertStudent(Student s) throws SQLException {
        dataRepository.insertStudent(s);
    }
}
