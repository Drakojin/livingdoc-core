/**
 * Copyright (c) 2009 Pyxis Technologies inc.
 * 
 * This is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This software is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin St, Fifth Floor, Boston, MA 02110-1301 USA, or see the FSF site:
 * http://www.fsf.org.
 */
package info.novatec.testit.livingdoc.interpreter.flow.scenario;

import info.novatec.testit.livingdoc.converter.AbstractTypeConverter;


public class OwnerTypeConverter extends AbstractTypeConverter {
    @Override
    public boolean canConvertTo(Class< ? > type) {
        return Owner.class.isAssignableFrom(type);
    }

    @Override
    protected Object doConvert(String value) {
        String[] names = value.split("\\s");
        return new Owner(names[0], names.length > 1 ? names[1] : null);
    }
}
