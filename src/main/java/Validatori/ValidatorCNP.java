/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validatori;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validatorCNP")

public class ValidatorCNP implements Validator{
    
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        String CNP = (String) o, errorMessage = null;
        if (CNP.length() != 13) {
            errorMessage = "Codul Numeric Personal trebuie să conțină 13 cifre!";
        } else if (CNP.contains(" ")) {
            errorMessage = "Codul Numeric Personal nu poate conține spații!";
        } else {
            for (int i = 0; i < CNP.length(); i++) {
                if (CNP.charAt(i) < '0' || CNP.charAt(i) > '9') {
                    errorMessage = "Codul Numeric Personal nu poate conține litere!";
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
