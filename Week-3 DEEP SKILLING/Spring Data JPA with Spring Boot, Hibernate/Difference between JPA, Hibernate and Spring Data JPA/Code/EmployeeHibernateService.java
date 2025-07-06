package com.example.hibernate;

import com.example.entity.Employee;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class EmployeeHibernateService {

    private static SessionFactory factory;

    static {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create SessionFactory: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public Integer addEmployee(Employee employee){
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }

    public void shutdown() {
        factory.close();
    }

    // ✅ This is your main method for testing
    public static void main(String[] args) {
        EmployeeHibernateService service = new EmployeeHibernateService();

        Employee e = new Employee();
        e.setName("Keerthana");
        e.setDepartment("Development");

        Integer id = service.addEmployee(e);
        System.out.println("Employee saved with ID: " + id);

        service.shutdown();
    }
}

