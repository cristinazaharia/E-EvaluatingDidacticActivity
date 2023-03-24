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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FacesValidator("validatorEmail")
public class ValidatorEmail implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        String email = (String) o;
        Pattern patternEmail = Pattern.compile("^(.+)@(.+)$");
        Matcher matcherEmail = patternEmail.matcher(email);
        if (!matcherEmail.matches()) { //email is invalid
            FacesMessage message = new FacesMessage("Email invalid!");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
        }
    }
}
