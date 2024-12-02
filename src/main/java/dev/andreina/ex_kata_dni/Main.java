package dev.andreina.ex_kata_dni;


import dev.andreina.ex_kata_dni.Controller.DniController;
import dev.andreina.ex_kata_dni.models.DniModel;
import dev.andreina.ex_kata_dni.models.person;
import dev.andreina.ex_kata_dni.view.DniView;

public class Main {
    public static void main(String[] args) {
        System.out.println("                         ");
        System.out.println("Welcome to DNI calculator");
        System.out.println("-------------------------");
        person person= new person(null, null, 0);
        DniModel dnimodel = new DniModel();
        DniView dniview = new DniView();
        DniController dniController= new DniController(person, dnimodel, dniview);

        dniController.makeValidation();
    }
}
