/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.Role.AdministratorRole;
import Business.Role.AdministrationHealthOfficerRole;

import com.google.gson.*;

import java.lang.reflect.Type;
/**
 *
 * @author aaryakpawar
 */
public class RoleDeserializer implements JsonDeserializer<Role> {

    @Override
    public Role deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        String type = jsonObject.get("type").getAsString(); // Identify subclass type

        // Match the type to the corresponding subclass
        switch (type) {
            case "ReceptionistRole":
                return context.deserialize(json, ReceptionistRole.class);
            case "AdministratorRole":
                return context.deserialize(json, AdministratorRole.class);
            case "AdministrationHealthOfficerRole":
                return context.deserialize(json, AdministrationHealthOfficerRole.class);
            case "AdministrationSecretary":
                return context.deserialize(json, AdministrationSecretary.class);
            case "AdministrationTreasurer":
                return context.deserialize(json, AdministrationTreasurer.class);
            case "InsuranceOfficerRole":
                return context.deserialize(json, InsuranceOfficerRole.class);
            case "InsuranceFinanceManagerRole":
                return context.deserialize(json, InsuranceFinanceManagerRole.class);
            case "InsurancePolicyPlannerRole":
                return context.deserialize(json, InsurancePolicyPlannerRole.class);
            case "LabAssistantRole":
                return context.deserialize(json, LabAssistantRole.class);
            case "Nurse":
                return context.deserialize(json, Nurse.class);
            case "OncologistDoctorRole":
                return context.deserialize(json, OncologistDoctorRole.class);
            case "PatientRole":
                return context.deserialize(json, PatientRole.class);
            case "PharmacistRole":
                return context.deserialize(json, PharmacistRole.class);
            case "RadiologistDoctorRole":
                return context.deserialize(json, RadiologistDoctorRole.class);
            case "SystemAdminRole":
                return context.deserialize(json, SystemAdminRole.class);
            default:
                throw new JsonParseException("Unknown type: " + type);
        }
    }
}
