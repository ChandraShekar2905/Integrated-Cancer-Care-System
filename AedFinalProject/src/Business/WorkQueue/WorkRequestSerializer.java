/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

/**
 *
 * @author hrishipal
 */
public class WorkRequestSerializer implements JsonSerializer<WorkRequest> {

@Override
public JsonElement serialize(WorkRequest src, Type typeOfSrc, JsonSerializationContext context) {
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("message", src.getMessage());
    jsonObject.addProperty("status", src.getStatus());
    jsonObject.addProperty("requestDate", src.getRequestDate().toString());
    if (src.getResolveDate() != null)
        jsonObject.addProperty("resolveDate", src.getResolveDate().toString());

    // Don't serialize sender, receiver, or other nested objects
    return jsonObject;
}

}
