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

import java.util.HashMap;

/**
 *
 * @author Arix
 */
public class ArxFile {

    private final HashMap<String, String> data;

    public ArxFile() {
        data = new HashMap();
    }
    
    public ArxFile(HashMap<String, String> da) {
        data = da;
    }

    public String getString(String key) {
        return data.get(key);
    }

    public int getInt(String key) {
        return Integer.parseInt(data.get(key));
    }

    public boolean getBoolean(String key) {
        return Boolean.parseBoolean(data.get(key));
    }

    public void setString(String key, String val) {
        data.put(key, val);
    }

    public void setInt(String key, int i) {
        data.put(key, String.valueOf(i));
    }

    public void setBoolean(String key, boolean flag) {
        data.put(key, String.valueOf(flag));
    }

    public HashMap<String, String> getData() {
        return data;
    }

}
