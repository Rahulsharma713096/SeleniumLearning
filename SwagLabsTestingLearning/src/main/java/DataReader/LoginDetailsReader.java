package DataReader;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LoginDetailsReader {
	public static List<HashMap<String, String>> getJSONDataMap() {

		try {
			// reads json to string
			String jsonPath = System.getProperty("user.dir") + "\\src\\main\\java\\DataReader\\LoginDetails.json";
			String jsonContent = FileUtils.readFileToString(new File(jsonPath), StandardCharsets.UTF_8);
			// String to HashMap
			ObjectMapper mapper = new ObjectMapper();

			// List<Map<String, String>> readValue = mapper.readValue(jsonContent,
			// List.class);
			List<HashMap<String, String>> readValue = mapper.readValue(jsonContent,
					new TypeReference<List<HashMap<String, String>>>() {
					});
			return readValue;

			// String to HashMap Json data binder
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
