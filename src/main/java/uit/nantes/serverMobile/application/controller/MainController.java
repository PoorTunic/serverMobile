package uit.nantes.serverMobile.application.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Daniel Clemente Aguirre
 * @author Djurdjevic Sacha
 */
@RestController()
@CrossOrigin
public class MainController {
    
    @GetMapping(path = "/welcome}")
    public @ResponseBody
    String getWelcome() {
        return "welcome";
    }
    
}
