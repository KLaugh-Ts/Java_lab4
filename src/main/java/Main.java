import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String csvFilePath = "D:\\Visual Studio\\Лабы\\Java\\lab4\\foreign_names.csv";
        String separator = ";";
        List <Person> list = new ArrayList <> ();

        try (InputStream in = Main.class.getClassLoader().getResourceAsStream(csvFilePath)){
            CSVReaderBuilder csvReaderBuilder = new CSVReaderBuilder(new FileReader(csvFilePath));
            CSVReader csvReader = csvReaderBuilder.withSkipLines(1).build();
            if (csvReader == null)
                throw new FileNotFoundException(csvFilePath);
            String[] nextLine;
            while ((nextLine = csvReader.readNext()) != null){
                nextLine = nextLine[0].split(separator);
                if(nextLine.length > 2){
                    Person person = new Person(nextLine[0], nextLine[1], nextLine[2], nextLine[3], nextLine[4].charAt(0) - 'A', nextLine[4], nextLine[5]);
                    list.add(person);
                }
            }
        }

        for (int i = 1; i < list.size(); i++)
        {
            System.out.print(list.get(i).getID()+"\t");
            System.out.print(list.get(i).getName()+"\t");
            System.out.print(list.get(i).getGender()+"\t");
            System.out.print(list.get(i).getBirthDate()+"\t");
            System.out.print(list.get(i).getSubdivisionName()+"\t");
            System.out.print(list.get(i).getSubdivisionID()+"\t");
            System.out.print(list.get(i).getSalary()+"\t");
            System.out.println();
        }
    }
}
