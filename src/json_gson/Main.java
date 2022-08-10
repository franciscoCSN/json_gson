package json_gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Main {

	public static void main(String[] args) throws Exception {

		Usuario usuario1 = new Usuario();
		usuario1.setLogin("fesoalll");
		usuario1.setSenha("1258");
		usuario1.setCpf("25896347");

		Usuario usuario2 = new Usuario();
		usuario2.setLogin("scanor");
		usuario2.setSenha("1478");
		usuario2.setCpf("259874512");

		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String jayson = gson.toJson(usuarios);

		System.out.println(jayson);
		FileWriter fileWriter = new FileWriter("/home/fesoalll/Documentos/0.java/json_gson/file.json");
		fileWriter.write(jayson);
		fileWriter.flush();
		fileWriter.close();

		FileReader fread = new FileReader("/home/fesoalll/Documentos/0.java/json_gson/file.json");
		JsonArray jsonarray = (JsonArray)JsonParser.parseReader(fread); 

		List<Usuario> lusuarios = new ArrayList<Usuario>();

		for(JsonElement jsonelement : jsonarray) {
			Usuario usuario = new Gson().fromJson(jsonelement, Usuario.class);
			lusuarios.add(usuario);
		}
		System.out.println(lusuarios);
	}

}
