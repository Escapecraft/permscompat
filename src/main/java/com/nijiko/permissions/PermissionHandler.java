// $Id$
/*
 * Copyright (C) 2011 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.nijiko.permissions;

import org.bukkit.entity.Player;

public class PermissionHandler {
    
    public boolean has(Player player, String perm) {
        throw new UnsupportedOperationException("Not implemented");
    }
    
    public boolean has(String worldName, String player, String perm) {
        throw new UnsupportedOperationException("Not implemented");
    }
    
    public boolean permission(Player player, String perm) {
        throw new UnsupportedOperationException("Not implemented");
    }
    
    public boolean inGroup(String name, String group) {
        throw new UnsupportedOperationException("Not implemented");
    }
    
    public boolean inGroup(String worldName, String name, String group) {
        throw new UnsupportedOperationException("Not implemented");
    }
    
    public String getGroup(String worldName, String name) {
        throw new UnsupportedOperationException("Not implemented");
    }
    
    public String getGroup(String name) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public String[] getGroups(String world, String name) {
        throw new UnsupportedOperationException("Not implemented");
    }
    
}
