package com.mycompany.lab2;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.DELETE;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Course")
public class Course {
    private int id;
    private String name;
    
    private List<Student> students = new ArrayList<>();
    
    private Student findById(int id) {
        for (Student student : getStudents()) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @GET
    @Path("{studentId}")
    public Student getStudent(@PathParam("studentId")int studentId) {
        return findById(studentId);
    }
    
    @POST
    @Path("")
    public Response createStudent(Student student) {
        for (Student element : students) {
            if (element.getId() == student.getId()) {
                return Response.status(Response.Status.CONFLICT).build();
            }
        }
        students.add(student);
        return Response.ok(student).build();
    }
    
    @DELETE
    @Path("{studentId}")
    public Response deleteStudent(@PathParam("studentId") int studentId) {
        Student student = findById(studentId);
        if (student == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        students.remove(student);
        return Response.ok().build();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @XmlElementWrapper(name="Students")
    @XmlElement(name = "Student")
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    @Override
    public int hashCode() {
        return id + name.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Course) && (id == ((Course) obj).getId()) && (name.equals(((Course) obj).getName()));
    }
}
