/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/**
 *
 * @author hrishipal
 */
public class EnterpriseDeserializer implements JsonDeserializer<Enterprise> {
    @Override
    public Enterprise deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        String type = jsonObject.get("type").getAsString();

        switch (type) {
            case "HospitalsEnterprise":
                return context.deserialize(json, HospitalsEnterprise.class);
            case "AdministrationEnterprise":
                return context.deserialize(json, AdministrationEnterprise.class);
            case "InsuranceProvidersEnterprise":
                return context.deserialize(json, InsuranceProvidersEnterprise.class);
            case "PharmacyEnterprise":
                return context.deserialize(json, PharmacyEnterprise.class);
            default:
                throw new JsonParseException("Unknown type: " + type);
        }
    }
}

