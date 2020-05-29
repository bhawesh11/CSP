package resources;

import org.json.JSONException;
import org.json.JSONObject;

public class Output {

	private JSONObject output;

	// CONSTRUCTOR:
	Output(Database db, String brandName) {
		try {
			String json = db.getPolicyDetails(brandName);
			output = new JSONObject(json);
			output.put("Password", "Passw0rd");
			output.put("Email", "jstar@elephant.kom");
			System.out.println("Output.17: JSON:\n"+output);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	// ----------------------------------------------------------

	// GETTER / SETTER FOR OUTPUT:
	public void setOutput(String key, String value) {
		try {
			output.put(key, value);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	// ----------------------------------------------------------
	public String getOutput(String key) {
		String value = null;
		try {
			// GET VALUE ACCORDING TO KEY
			value = output.getString(key);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}
}// close Class
