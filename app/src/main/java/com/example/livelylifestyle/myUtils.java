package com.example.livelylifestyle;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * myUtils is a public class created to use static methods anywhere in the program
 */
public class myUtils {

    /**
     * A static function to write to the plan file used in the CreatePlan activities
     * idea from https://stackoverflow.com/questions/14376807/read-write-string-from-to-a-file-in-android
     * edited by Kyle to work
     * @param data
     * The string taken to be written down
     * @param context
     * the context, usually though getBaseContext()
     */
    public static void writeToFile(String data, Context context) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("plan.txt", Context.MODE_PRIVATE));
            outputStreamWriter.write(data + "\n");
            outputStreamWriter.close();
        } catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }

    /**
     *Similar write function, though appends it instead, used for CreatePlan activites
     * edited version of the writeToFile, also Kyle
     * @param data
     * String to be written to the file
     * @param context
     * the context, usually though getBaseContext()
     */
    public static void appendToFile(String data, Context context) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("plan.txt", Context.MODE_APPEND));
            outputStreamWriter.append(data).append("\n");
            outputStreamWriter.close();
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }

    /**
     * static function to read the plan.txt file and returns it in a string format
     * string usually used to run the according activity for meal/workout plans
     * taken from: ttps://stackoverflow.com/questions/14376807/read-write-string-from-to-a-file-in-android
     * slightly edited by Kyle
     * @param context
     * context for the function, normally given with getBaseContext()
     * @return
     * A String, holds all lines of plan.txt
     */
    public static String readFromFile(Context context) {

        String ret = "";

        try {
            InputStream inputStream = context.openFileInput("plan.txt");

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";
                StringBuilder stringBuilder = new StringBuilder();

                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    stringBuilder.append("\n").append(receiveString);
                }

                inputStream.close();
                ret = stringBuilder.toString();
            }
        }
        catch (FileNotFoundException e) {
            Log.e("login activity", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("login activity", "Can not read file: " + e.toString());
        }

        return ret;
    }
}
