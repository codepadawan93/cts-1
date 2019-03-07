package ro.ase.csie.cts.g1078.erik.kovacs.robert;

import java.io.*;
import java.util.ArrayList;

public class Utility {

    static public double getValueFromObject(Object value) {
        double receivedValue = 0;
        if(value instanceof Double)
            receivedValue = (Double)value;
        else
            throw new UnsupportedOperationException("Wrong type");
        return receivedValue;
    }

    static public String getRandomString(int n) {
        // Template string
        String chars = "0123456789abcdefghijklmnopqrstuvxyz";

        // create StringBuilder length of n
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between 0 and n
            int index = (int) (chars.length() * Math.random());

            // add Character one by one to end of sb
            sb.append(chars.charAt(index));
        }
        return sb.toString();
    }

    static public void serializeToFile(String file, Object object){
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(file));
            outputStream.writeObject(object);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static Object deserializeFromFile(String file) {
        ArrayList<Object> data1 = null;
        try {
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            try {
                data1 = (ArrayList) in.readObject();
            } catch (ClassNotFoundException ex) {
               ex.printStackTrace();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return data1;
    }
}