/**
 * Copyright (c) 2014, Quirin Götz <codeworks@supercable.onl>
 * 
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package de.qg.java.datain;

import java.io.IOException;

/**
 * The Class Demo.
 * 
 * @author Quirin Götz
 * @version 1.1.0
 */
public class Demo {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws IOException {
		// Here there's everytime a string what should be entered
		System.out.println(DataIn.getBoolean("boolean", "y", "n"));
		System.out.println(DataIn.getBoolean("boolean", "j", "n",
				DataIn.BoolPrefered.TRUEPREF));
		System.out.println(DataIn.getBoolean("boolean", "yes", "no",
				DataIn.BoolPrefered.FALSEPREF));
		System.out.println(DataIn.getByte("byte"));
		System.out.println(DataIn.getShort("short"));
		System.out.println(DataIn.getInt("int"));
		System.out.println(DataIn.getLong("long"));
		System.out.println(DataIn.getFloat("float"));
		System.out.println(DataIn.getDouble("double"));
		System.out.println(DataIn.getChar("char"));
		System.out.println(DataIn.getString("String"));

		// Just use this methods for getting the input without further
		// management
		// Type in directly, you won't be asked for anything
		System.out.println(DataIn.getBoolean());
		System.out.println(DataIn.getByte());
		System.out.println(DataIn.getShort());
		System.out.println(DataIn.getInt());
		System.out.println(DataIn.getLong());
		System.out.println(DataIn.getFloat());
		System.out.println(DataIn.getDouble());
		System.out.println(DataIn.getChar());
		System.out.println(DataIn.getString());
	}

}
