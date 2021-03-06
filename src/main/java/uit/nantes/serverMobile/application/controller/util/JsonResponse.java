package uit.nantes.serverMobile.application.controller.util;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Daniel Clemente Aguirre
 * @author Djurdjevic Sacha
 */
public class JsonResponse {
    
    final static String INSERT_USER_OK_MESSAGE = "L'utilisateur a été ajouté à l'évènenement";
    final static String INSERT_USER_ERROR_MESSAGE = "L'utilisateur n'a pas été ajouté à l'évènement";
    
    final static String REMOVE_USER_OK_MESSAGE = "L'utilisateur a été retiré de l'évènement";
    final static String REMOVE_USER_ERROR_MESSAGE = "L'utilisateur n'a pas été retiré de l'évènement";
    
    final static String INSERT_EXPENSE_OK_MESSAGE = "La dépense a été ajouté";
    final static String INSERT_EXPENSE_ERROR_MESSAGE = "La dépense n'a pas été ajouté";
    
    final static String REMOVE_EXPENSE_OK_MESSAGE = "La dépense a été retiré de l'évènement";
    final static String REMOVE_EXPENSE_ERROR_MESSAGE = "La dépense n'a pas été retiré de l'évènement";
    
    final static String UPDATE_ERROR_MESSAGE = "Les valeurs n'ont pas étés modifiés";
    final static String UPDATE_OK_MESSAGE = "Les valeurs ont bien étés changés)";
    
    final static String INSERT_ERROR_MESSAGE = "L'insertion impossible";
    final static String INSERT_OK_MESSAGE = "Insertion faite";
    
    final static String DELETE_ERROR_MESSAGE = "Suppression non effectué";
    final static String DELETE_OK_MESSAGE = "Suppression effectué";
    
    public static JSONObject insertJsonResponse(boolean value) throws JSONException{
        JSONObject response = new JSONObject();
        
        if(value){
            response.put("ok", true);
            response.put("message", INSERT_OK_MESSAGE);
        }else{
            response.put("ok", false);
            response.put("message", INSERT_ERROR_MESSAGE);
        }
        
        return response;
    }
    
    public static JSONObject updateJsonResponse(boolean value) throws JSONException{
        JSONObject response = new JSONObject();
        
        if(value){
            response.put("ok", true);
            response.put("message", UPDATE_OK_MESSAGE);
        }else{
            response.put("ok", false);
            response.put("message", UPDATE_ERROR_MESSAGE);
        }
        
        return response;
    }
    
    public static JSONObject deleteJsonResponse(boolean value) throws JSONException{
        JSONObject response = new JSONObject();
        
        if(value){
            response.put("ok", true);
            response.put("message", DELETE_OK_MESSAGE);
        }else{
            response.put("ok", false);
            response.put("message", DELETE_ERROR_MESSAGE);
        }
        
        return response;
    }
    
    public static JSONObject addUserJsonResponse(boolean value) throws JSONException{
        JSONObject response = new JSONObject();
        
        if(value){
            response.put("ok", true);
            response.put("message", INSERT_USER_OK_MESSAGE);
        }else{
            response.put("ok", false);
            response.put("message", INSERT_USER_ERROR_MESSAGE);
        }
        
        return response;
    }
    
    public static JSONObject removeUserJsonResponse(boolean value) throws JSONException{
        JSONObject response = new JSONObject();
        
        if(value){
            response.put("ok", true);
            response.put("message", REMOVE_USER_OK_MESSAGE);
        }else{
            response.put("ok", false);
            response.put("message", REMOVE_USER_ERROR_MESSAGE);
        }
        
        return response;
    }
    
    public static JSONObject addExpenseJsonResponse(boolean value) throws JSONException{
        JSONObject response = new JSONObject();
        
        if(value){
            response.put("ok", true);
            response.put("message", INSERT_EXPENSE_OK_MESSAGE);
        }else{
            response.put("ok", false);
            response.put("message", INSERT_EXPENSE_ERROR_MESSAGE);
        }
        
        return response;
    }
    
    public static JSONObject removeExpenseJsonResponse(boolean value) throws JSONException{
        JSONObject response = new JSONObject();
        
        if(value){
            response.put("ok", true);
            response.put("message", REMOVE_EXPENSE_OK_MESSAGE);
        }else{
            response.put("ok", false);
            response.put("message", REMOVE_EXPENSE_ERROR_MESSAGE);
        }
        
        return response;
    }

	public static Object totalJsonResponse(double result) throws JSONException{
		JSONObject response = new JSONObject();
		response.put("ok", true);
		response.put("total", result);
		return response;
	}

}
