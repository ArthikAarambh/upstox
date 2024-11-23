package upstox;

import api.MasterAPI_Steps;
import api.utils.API_Config;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class API_Automation {
    private static Response DELIVERY_API_REPONSE;
    @Test
    public static void verifyResponse(){
        MasterAPI_Steps.an_api_template_for_request("config/testData/rawapi/upstox/HistoricalData.json");
        MasterAPI_Steps.publish_the_final_api_call_validation();
        Response response = API_Config.RESPONSE;
        DELIVERY_API_REPONSE = response;
        System.out.println(DELIVERY_API_REPONSE.getBody().asPrettyString());
    }
    public static void main(String[] args) {

        try {
            verifyResponse();
        } catch (Exception e) {
            e.printStackTrace(); // Print any exception that occurs in main method
        }
        }
}