package new_assessment.config;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class JsonWriter {
    protected String JSON_FILE_PATH = "Config.json";
    public String read_value_from_json(String key){
        //READ FROM JSON
        try {
            Object obj = new JSONParser().parse(new FileReader(JSON_FILE_PATH));
            // typecasting obj to JSONObject
            JSONObject jo = (JSONObject) obj;
            // getting firstName and lastName
            String value = (String) jo.get(key);
           //System.out.println(value);
            return value;
        }catch(Exception ex){
            //System.out.println(ex);
            return "";
        }
    }
}
