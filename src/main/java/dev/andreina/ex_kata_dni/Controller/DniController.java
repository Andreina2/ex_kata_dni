package dev.andreina.ex_kata_dni.Controller;
import dev.andreina.ex_kata_dni.models.person;
import dev.andreina.ex_kata_dni.models.DniModel;
import dev.andreina.ex_kata_dni.view.DniView;

public class DniController {
    private person person;
    private DniModel dniModel;
    private DniView dniView;

    public DniController(person person, DniModel dniModel, DniView dniView) {
        this.person = person;
        this.dniModel = dniModel;
        this.dniView = dniView;
    }

    public void makeValidation() {
        boolean isValid = false;

        while (!isValid) {
            String enter = dniView.dniNumber();

            try {
                int dni = Integer.parseInt(enter); // parse convierte string a número

                if (dniModel.isValid(dni)) {
                    char letter = dniModel.CalculateLetter(dni);
                    dniView.Message(" DNI Letter " + dni + " is: " + letter);
                    isValid = true;
                } else {
                    dniView.Message("The number must be between 0 and 99,999,999.");
                }

            } catch (NumberFormatException e) {
                dniView.Message("Please, enter a valid number.");
            }
        }
    }
}

