/*
 * Copyright (C) 2013 Admin
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

import java.io.File;

/**
 *
 * @author Arix
 */
public class StructureSetup {

    private static final File DATA_FOLDER = new File("./data");
    private static final File PLUGIN_FOLDER = new File("./plugins");
    private static final File SAVE_FOLDER = new File("./data/players");
    private static final File CONFIG_FOLDER = new File("./data/configurations");

    /**
     * Checks and validates if the file/folder structure is healthy.
     */
    public static void checkStructureIntegrity() {
        
    }
}
