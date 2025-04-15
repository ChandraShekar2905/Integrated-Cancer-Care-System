/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;
import com.google.gson.*;

import java.lang.reflect.Type;

/**
 *
 * @author hrishipal
 */
public class WorkRequestDeserializer implements JsonDeserializer<WorkRequest> {

    @Override
    public WorkRequest deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        String type = jsonObject.get("type").getAsString(); // Identify subclass type

        // Match the type to the corresponding subclass
        switch (type) {
            case "AccountantBillingRequest":
                return context.deserialize(json, AccountantBillingRequest.class);
            case "GovernmentFundRequest":
                return context.deserialize(json, AdministrationFundRequest.class);
            case "InsuranceWorkRequest":
                return context.deserialize(json, InsuranceWorkRequest.class);
            case "LabTestWorkRequest":

            default:
                throw new JsonParseException("Unknown type: " + type);
        }
    }
}
