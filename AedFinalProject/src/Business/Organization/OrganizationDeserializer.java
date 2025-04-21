/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import com.google.gson.*;

import java.lang.reflect.Type;

/**
 *
 * @author aaryakpawar
 */
public class OrganizationDeserializer implements JsonDeserializer<Organization> {

    @Override
    public Organization deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
           String type = jsonObject.get("type").getAsString();
        switch (type) {
            case "DoctorOrganization":
                return context.deserialize(json, DoctorOrganization.class);
            case "LabOrganization":
                return context.deserialize(json, LabOrganization.class);
            case "PatientOrganization":
                return context.deserialize(json, PatientOrganization.class);
            case "PharmacyOrganization":
                return context.deserialize(json, PharmacyOrganization.class);
            case "ReceptionistOrganization":
                return context.deserialize(json, ReceptionistOrganization.class);
            case "AdminOrganization":
                return context.deserialize(json, AdminOrganization.class);
            case "NurseOrganization":
                return context.deserialize(json, NurseOrganization.class);
            case "AdministrationSecretaryOrganization":
                return context.deserialize(json, AdministrationSecretaryOrganization.class);
            case "InsuranceOfficerOrganization":
                return context.deserialize(json, InsuranceOfficerOrganization.class);
            case "InsurancePolicyPlannerOrganization":
                return context.deserialize(json, InsurancePolicyPlannerOrganization.class);
            case "InsuranceFinanceOrganization":
                return context.deserialize(json, InsuranceFinanceOrganization.class);
            case "HealthCareOfficerOrganization":
                return context.deserialize(json, HealthCareOfficerOrganization.class);
            case "AdministratorTreasurerOrganization":
                return context.deserialize(json, AdministrationTreasurerOrganization.class);
            default:
                System.err.println("Unknown organization type: " + type);
                return null;
        }
    }
}