
package Validatori;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validatorNrMatricol")

public class ValidatorNrMatricol implements Validator{
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        String nr_matricol = (String) o, errorMessage = null;
     
        if (nr_matricol.contains(" ")) {
            errorMessage = "Numărul matricol nu poate conține spații!";
        } else {
            for (int i = 0; i < nr_matricol.length(); i++) {
                if (nr_matricol.charAt(i) < '0' || nr_matricol.charAt(i) > '9') {
                    errorMessage = "Numărul matricol nu poate conține litere!";
                    break;
                }
            }
        }
        if (errorMessage != null) {
            FacesMessage message = new FacesMessage(errorMessage);
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
        }
    }
}
