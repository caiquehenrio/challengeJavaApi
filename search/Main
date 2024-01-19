import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        var search = "";
        List<Anddress> anddresses = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        ConsultCep consultCep = new ConsultCep();

        while (!search.equalsIgnoreCase("exit")) {

            System.out.println("Enter the CEP you want to search for: ");
            search = read.nextLine();

            if(search.equalsIgnoreCase("exit")) {

                break;

            }

            try {

                Anddress anddress = consultCep.searchAndrress(search);
                anddresses.add(anddress);
                System.out.println("Address added!");

            } catch (RuntimeException exception) {

                System.out.println(exception.getMessage());

            }

            FileGenerator file = new FileGenerator();
            file.saveJson(anddresses);

        }

        System.out.println("Finishing the application...");

    }

}
