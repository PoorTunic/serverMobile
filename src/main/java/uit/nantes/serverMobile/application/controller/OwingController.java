package uit.nantes.serverMobile.application.controller;

import java.util.List;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import uit.nantes.serverMobile.api.entities.Expense;
import uit.nantes.serverMobile.api.entities.Owing;
import uit.nantes.serverMobile.domain.ExpenseManagerService;
import uit.nantes.serverMobile.domain.ExpenseService;

/**
 * @author Daniel Clemente Aguirre
 * @author Djurdjevic Sacha
 */
@Controller
@RequestMapping("/api/expenseManager")
public class OwingController {
    
    @Autowired
    ExpenseService expenseService;
    
    @Autowired
    ExpenseManagerService expenseManagerService;
    
    @GetMapping(path = "/get/{idUser}/{idEvent}")
    public @ResponseBody
    List<Owing> getOwing(@PathVariable String idUser, @PathVariable String idEvent) throws JSONException {
        List<Expense> expenseList = expenseService.findAllByEventId(idEvent);
        return expenseManagerService.getOwing(idUser, expenseList);
    }
}