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

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileOutputStream;

/**
 *
 * @author Arix
 */
public class XMLManager {
    
    private XMLEncoder xmlEncoder;
    private XMLDecoder xmlDecoder;
    
    public XMLManager() {}
    
    public void encode(Class<?> cl, FileOutputStream fos) {
       
    }
}
