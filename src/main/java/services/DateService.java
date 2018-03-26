package services;

import java.text.SimpleDateFormat;

public class DateService {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

    public String parseDate(String dateToParse){
        try {
            return sdf.format(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(dateToParse));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

}
