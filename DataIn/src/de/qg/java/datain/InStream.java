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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The Class InStream.
 * 
 * @author Quirin Götz
 * @version 1.0.1
 */
public class InStream {

	/** The in. */
	private volatile static BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in));

	/**
	 * Read.
	 * 
	 * @return Input
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static String read() throws IOException {
		return in.readLine();
	}

}
