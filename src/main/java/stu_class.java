
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class stu_class implements Serializable{
    private String department;
    private String name;
    private String regi_num;
    private String season;
    private String batch;

    public stu_class(String department, String name, String regi_num, String season, String batch) {
        this.department = department;
        this.name = name;
        this.regi_num = regi_num;
        this.season = season;
        this.batch = batch;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegi_num() {
        return regi_num;
    }

    public void setRegi_num(String regi_num) {
        this.regi_num = regi_num;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}
