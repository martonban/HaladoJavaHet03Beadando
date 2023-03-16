package hu.me.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Validator {

    private List <String[]> validatedData = new ArrayList<>();
    private List <String[]> inValidData = new ArrayList<>();



    public void validation (List <String[]> dataFromFileReader) {

        for(int i = 0; i<dataFromFileReader.size(); i++){

            // Basic Data
            boolean flag = true;
            String date = dataFromFileReader.get(i)[0];
            String jobId = dataFromFileReader.get(i)[1];
            String occupied = dataFromFileReader.get(i)[2];
            String comment = dataFromFileReader.get(i)[3];
            String dayOfWeek = dataFromFileReader.get(i)[4];


            // Date Validation
            if(!isThatValidDate(date)){
                flag = false;
            }


            // ID is not null Validation
            if(!isDataEmpty(jobId)){
                flag = false;
            }

            // Week Of Day Exist Validation
                if(!dayOfWeekValidation(dayOfWeek)) {
                    flag = false;
                }


            // Comment Validation
            if(!isDataEmpty(comment)){
                flag = false;
            }

            // Occupied Validation
            if(!isValidBoolean(occupied)){
                flag = false;
            }

            if(flag){
               validatedData.add(dataFromFileReader.get(i));
            }else{
                inValidData.add(dataFromFileReader.get(i));
            }
        }
    }

    public List<String[]> getValidatedData() {
        return validatedData;
    }

    public List<String[]> getInvalidData(){
        return inValidData;
    }


    /*
    -------------------------------------------------
                   Validation functions
    -------------------------------------------------
    */

    public boolean isThatValidInteger(String testData){
        try{
            int finalData = Integer.parseInt(testData);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }

    public boolean isThatValidDate(String date) {
        if(!isDataEmpty(date)){
            try {
                LocalDate finalData = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
            } catch (DateTimeParseException e) {
                return false;
            }
            return true;
        }else{
            return false;
        }
    }

    public boolean isValidBoolean(String data){
            if(!isDataEmpty(data)){
                return false;
            }
            if(data.equals("true") || data.equals("false")){
                return true;
            }else{
                return false;
            }
    }

    public boolean dayOfWeekValidation(String data){
        // If data is not integer return false
        if(!isThatValidInteger(data)){
            return false;
        }
        int testData = Integer.parseInt(data);
        if(testData > 0 && testData < 8){
            return true;
        }else{
            return false;
        }
    }

    public boolean isDataEmpty(String data){
        if(data == null || !data.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
