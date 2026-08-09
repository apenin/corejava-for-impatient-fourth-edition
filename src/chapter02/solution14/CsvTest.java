package chapter02.solution14;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.StringReader;

public class CsvTest {
    public static void main(String[] args) throws Exception {
        String csvData = """
                name,age,city
                Alice,30,New York
                Bob,25,London
                """;

        CSVFormat format = CSVFormat.Builder.create(CSVFormat.DEFAULT)
                .setHeader()
                .setSkipHeaderRecord(true)
                .build();

        try (CSVParser parser = CSVParser.parse(new StringReader(csvData), format)) {
            for (CSVRecord record : parser) {
                String name = record.get("name");
                String age = record.get("age");
                String city = record.get("city");
                System.out.printf("%s, %s years, city %s%n", name, age, city);
            }
        }
    }
}