/*
 * Copyright (C) 2013 Arix
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.arix.data;

import com.arix.utils.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arix
 */
public class ArxParser {

    static Scanner lineIterator;

    public static ArxFile readArxFile(File f) {
        HashMap<String, String> result = new HashMap();
        try {

            BufferedReader br = new BufferedReader(new FileReader(f));

            String line;

            String tag;
            String value;

            while ((line = br.readLine()) != null) {
                
                if (!line.startsWith("#") || !line.startsWith(" ") || !line.isEmpty()) {
                    String[] splittedLine = line.split(":");
                    tag = splittedLine[0];
                    value = splittedLine[1];

                    result.put(tag.trim(), value.trim());
                }
            }
        } catch (FileNotFoundException ioe) {
            Log.error("Cannot read Arx file: '" + f.getName() + "'\nReason: " + ioe.getMessage());
        } catch (IOException ex) {
            Log.error("Cannot read Arx file: '" + f.getName() + "'\nReason: " + ex.getMessage());
        }
        return new ArxFile(result);
    }

    public static void writeArxFile(HashMap<String, String> map, File dest) {

        try {
            if (!dest.exists()) {
                dest.mkdirs();
                dest.createNewFile();
            }

            String output = "";
            Set<String> keySet = map.keySet();
            String[] keys = keySet.toArray(new String[0]);
            System.out.println(keys.toString());

            for (String key : keys) {

                output += key + ": " + map.get(key) + "\n";

            }
            FileWriter fw = new FileWriter(dest);
            fw.write(output);
            fw.close();
        } catch (IOException ioe) {
            Log.error("Cannot write Arx file: '" + dest.getName() + "'\nReason: " + ioe.getMessage());
        }
    }

}
