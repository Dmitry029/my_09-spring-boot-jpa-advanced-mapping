package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.AppDAO;
import com.luv2code.cruddemo.entity.Instructor;
import com.luv2code.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO theAppDAO) {
        return runner -> {
            createInstructor(theAppDAO);
        };
    }

    private void createInstructor(AppDAO theAppDAO) {

        // create the instructor

        Instructor tempInstructor =
                new Instructor("Chad", "Darby", "darby@luv2code");

        // create the instructor detail
        InstructorDetail tempInstructorDetail =
                new InstructorDetail(
                        "http://www.luv2code.com/youtube",
                        "Luv 2 code!!!");

        // associate the objects
        tempInstructor.setInstructorDetail(tempInstructorDetail);

        // save the instructor
        //
        // NOTE: this will ALSO save the details object
        // because of CascadeType.ALL
        //
        System.out.println("Saving instructor: " + tempInstructor);
        theAppDAO.save(tempInstructor);

        System.out.println("Done!");
    }
}
