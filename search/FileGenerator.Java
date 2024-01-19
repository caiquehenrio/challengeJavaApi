import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileGenerator {

    public void saveJson(List<Anddress> anddress) throws IOException {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter writer = new FileWriter("cep.json");
        writer.write(gson.toJson(anddress));
        writer.close();

    }

}
