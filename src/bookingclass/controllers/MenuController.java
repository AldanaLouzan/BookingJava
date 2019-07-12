package bookingclass.controllers;

import bookingclass.entities.Parent;
import bookingclass.entities.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Aldana
 */
public class MenuController {
    
    StudentController sc = new StudentController();
    Scanner scan = new Scanner(System.in);    
    
    public void registerForm () throws ParseException{
        
        Student st = new Student(); 
        Parent p = new Parent();
        String name, surname, phone, bdate, college, level, email, pass;
        int age;
        
        System.out.println("Please complete the following fields");
        
        System.out.println("> Name: ");
        name = scan.nextLine();
        st.setName(name);
        
        System.out.println("> Surname: ");
        surname = scan.nextLine();
        st.setSurname(surname);
        
        System.out.println("> Birth date (yyyy/MM/dd): ");
        bdate = scan.nextLine();
        st.setBirth(bdate);
        age = this.CalculateAge(bdate);
        st.setAge(age);
        if (age < 18){
            p = this.ParentDetails();
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
        
        sc.StudentTable(st);
        System.out.println("You have been successfully register");
        
        
        
    }
    
    public int CalculateAge (String bdate) throws ParseException{
        int age;
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date d = sdf.parse(bdate);
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        LocalDate birth = LocalDate.of(year, month, date);
        LocalDate current = LocalDate.now();
        Period diff = Period.between(birth, current);
        age = diff.getYears();

        return age;
        
    }
    
    public Parent ParentDetails(){
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
    
    public void LogIn(){
        System.out.print("User Name: ");
        System.out.print("Password: ");
    
    }
    
    public void LogInMenu(){
        System.out.println("Please select an option");
        System.out.println("1) Metodology");
        System.out.println("2) Book a class");
        System.out.println("3) Log Out");
    }
    
}
