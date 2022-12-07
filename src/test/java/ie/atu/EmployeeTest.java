package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void validName(){
        Employee myEmployee = new Employee("Cliodhna", "12345678913", "Female", "Full-Time", 56);
        assertEquals("Cliodhna", myEmployee.getName());
    }

    @Test
    void invalidName(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{new Employee("Al", "12345678912",
                "Female", "Full-Time", 56);});
        assertEquals("Invalid name", exception.getMessage());
    }

//    @Test
//    void validID(){
//        Employee myEmployee = new Employee("Cliodhna", "12345678912", "Female", "Full-Time", 56);
//        assertEquals("123456789123", myEmployee.getPPS());
//    }
//
//    @Test
//    void invalidID(){
//        Exception exception = assertThrows(IllegalArgumentException.class, () ->{new Employee("Cliodhna", "123456789",
//                "Female", "Full-Time", 56);});
//        assertEquals("Invalid PPS ID", exception.getMessage());
//    }
//
//    @Test
//    void validEmployment(){
//
//    }
//
//    @Test
//    void invalidEmployment(){
//        Exception exception = assertThrows(IllegalArgumentException.class, () ->{new Employee("Cliodhna", "12345678912",
//                "Female", "Student", 56);});
//        assertEquals("Invalid Employment", exception.getMessage());
//    }
//
//    @Test
//    void validGender(){
//        Employee myEmployee = new Employee("Cliodhna", "12345678912", "Female", "Full-Time", 22);
//        assertEquals("Female", myEmployee.getGender());
//    }
//
//    @Test
//    void invalidGender(){
//        Exception exception = assertThrows(IllegalArgumentException.class, () ->{new Employee("Cliodhna", "12345678913",
//                "Dog", "Part-Time", 56);});
//        assertEquals("Invalid Gender", exception.getMessage());
//    }
//
//    @Test
//    void validAge(){
//        Employee myEmployee = new Employee("Cliodhna", "12345678912", "Female", "Full-Time", 22);
//        assertEquals(22, myEmployee.getAge());
//    }
//
//    @Test
//    void invalidAge(){
//        Exception exception = assertThrows(IllegalArgumentException.class, () ->{new Employee("Cliodhna", "12345678913",
//                "Female", "Part-Time", 12);});
//        assertEquals("Invalid Age, must be over 16", exception.getMessage());
//    }

    @AfterEach
    void tearDown() {
    }
}