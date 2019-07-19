package bookingclass.controller;

import bookingclass.db.CRUD;
import bookingclass.db.DBConnection;
import bookingclass.entity.Parent;
import bookingclass.entity.Student;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import viewInterface.User;


/**
 *
 * @author Aldana
 */
public class MenuController implements User {
    
    //StudentController sc = new StudentController();
    
    StudentController sc = new StudentController ();

    Scanner scan = new Scanner(System.in);    
    

    @Override
    public void registration () throws ParseException{
        Student st = new Student(); 
        Parent p = new Parent();
        
        String name, surname, phone, birth, college, level, email, pass;
        int age;
        Date bdate;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        System.out.println("Please complete the following fields");
        
        System.out.println("> Name: ");
        name = scan.nextLine();
        st.setName(name);
        
        System.out.println("> Surname: ");
        surname = scan.nextLine();
        st.setSurname(surname);
        
        System.out.println("> Birth date (yyyy-MM-dd): ");
        birth = scan.nextLine();
        bdate = sdf.parse(birth);
        st.setBirth(birth);
        age = this.CalculateAge(bdate);
        st.setAge(age);
        if (age < 18){
            p = this.parentDetails();
            st.setParent(p);
        }
        
        System.out.println("> Phone number: ");
        phone = scan.nextLine();
        st.setPhone(phone);
        
        System.out.println("> College: ");
        college = scan.nextLine();
        st.setCollege(college);
        
        System.out.println("> Level: ");
        level = scan.nextLine();
        st.setLevel(level);
        
        System.out.println("> E-mail: ");
        email = scan.nextLine();
        st.setEmail(email);
        
        System.out.println("> Password: ");
        pass = scan.nextLine();
        st.setPassword(pass);
        
        
        //sc.StudentTable(st);
        sc.registerStudent(st);
     
    }
    
    public int CalculateAge (Date bdate) throws ParseException{
        int age;
        
        Calendar c = Calendar.getInstance();
        c.setTime(bdate);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        LocalDate birth = LocalDate.of(year, month, date);
        LocalDate current = LocalDate.now();
        Period diff = Period.between(birth, current);
        age = diff.getYears();

        return age;
        
    }
    
    public Parent parentDetails(){
        Parent p = new Parent();
        String parentName, parentSurname, parentPhone;
        
        System.out.println("As you are under 18 we need your parent detail");
        
        System.out.println("> Name: ");
        parentName = scan.nextLine();
        p.setName(parentName);
        
        System.out.println("> Surname: ");
        parentSurname = scan.nextLine();
        p.setSurname(parentSurname);
        
        System.out.println("> Phone: ");
        parentPhone = scan.nextLine();
        p.setPhone(parentPhone);
        
        return p;
        
        
    }
    
    public void logIn(){
        System.out.print("User Name: ");
        System.out.print("Password: ");
    
    }
    
    public void logInMenu(){
        System.out.println("Please select an option");
        System.out.println("1) Metodology");
        System.out.println("2) Book a class");
        System.out.println("3) Log Out");
    }
    
}
