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
package com.arix.utils;

import com.arix.Server;

/**
 *
 * @author Arix
 */
public class Log {

    /**
     * Displays a default INFO message in System.out.
     * The caller is automatically identified and is used in the message.
     * @param msg the message to be sent
     */
    public static void info(String msg) {
        StackTraceElement elem = Thread.currentThread().getStackTrace()[2];
        System.out.println("[INFO] " + elem + " - " + msg);
    }

    public static void error(String msg) {
        StackTraceElement elem = Thread.currentThread().getStackTrace()[2];
        System.out.println("## [ERROR] " + elem + " - " + msg);
    }

    public static void debug(String msg) {
        StackTraceElement elem = Thread.currentThread().getStackTrace()[2];
        System.out.println("[DEBUG] " + elem + " - " + msg);
    }

    public static void warning(String msg) {
        StackTraceElement elem = Thread.currentThread().getStackTrace()[2];
        System.out.println("!! [WARNING] " + elem + " - " + msg);
    }

}
