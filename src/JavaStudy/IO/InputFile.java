package JavaStudy.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class InputFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/JavaStudy/IO/data"));

        HashMap<String, ArrayList<Double>> totalData = new HashMap<>();

        String data = "";
        while ((data = br.readLine()) != null) {
            String[] temp1 = data.split(",");

            ArrayList<Double> asData = new ArrayList<>();
            for (int i = 0; i < temp1.length; i++) {
                if (i + 1 == temp1.length)
                    break;

                asData.add(Double.parseDouble(temp1[i + 1]));
            }

            totalData.put(temp1[0], asData);
        }

//        System.out.println(totalData.get("APPH012"));
    }
}
