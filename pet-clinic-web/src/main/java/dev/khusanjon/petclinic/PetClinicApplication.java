package dev.khusanjon.petclinic;

import dev.khusanjon.petclinic.controllers.PetController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PetClinicApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(PetClinicApplication.class, args);

        PetController petController = (PetController) ctx.getBean("petController");

        System.out.println(petController.getInfoAboutPet());

    }

}
