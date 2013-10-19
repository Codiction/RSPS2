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

package com.arix;

/**
 *
 * @author Arix
 */
public class Boot {

    /**
     * Starts the whole thing keeping arguments in mind
     * @param arguments given arguments on JVM start (array:String)
     */
    public static void main(String[] arguments) {
        Server.init();
    }
    
}
