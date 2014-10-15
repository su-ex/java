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
 * Simplified terminal input with java.
 * 
 * @author Quirin Götz
 * @version 3.0.1
 */
public class DataIn {

	/**
	 * Instantiates a new data in.
	 */
	public DataIn() {

	}

	/**
	 * Define special {@code true|false} characters and set prefered answer.
	 * 
	 * @param sy
	 *            The String that should be entered for true.
	 * @param sn
	 *            The String that should be entered for false.
	 * @param bp
	 *            Should something be prefered?
	 * @return the boolean
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static boolean getBoolean(String sy, String sn, BoolPrefered bp)
			throws IOException {
		boolean b;
		
		String s = InStream.read();
		
		sy.toLowerCase();
		sn.toLowerCase();
		s.toLowerCase();

		if (bp == BoolPrefered.NOTHINGPREF || !s.equals("")) {
			if (s.equals(sy)) {
				b = true;
			} else if (s.equals(sn)) {
				b = false;
			} else {
				throw new NumberFormatException();
			}
		} else if (bp != BoolPrefered.NOTHINGPREF && s.equals("")) {
			if (bp == BoolPrefered.TRUEPREF) {
				b = true;
			} else if (bp == BoolPrefered.FALSEPREF) {
				b = false;
			} else {
				throw new NumberFormatException();
			}
		} else {
			throw new NumberFormatException();
		}

		return b;
	}

	/**
	 * Define special {@code true|false} characters and set prefered answer and
	 * what to ask for.
	 * 
	 * @param o
	 *            The string to be displayed - what should be entered?
	 * @param sy
	 *            The String that should be entered for true.
	 * @param sn
	 *            The String that should be entered for false.
	 * @param bp
	 *            Should something be prefered?
	 * @return the boolean
	 */
	public static boolean getBoolean(String o, String sy, String sn,
			BoolPrefered bp) {
		boolean b;

		while (true) {
			System.out.print(o + " ("
					+ (bp == BoolPrefered.TRUEPREF ? sy.toUpperCase() : sy)
					+ "|"
					+ (bp == BoolPrefered.FALSEPREF ? sn.toUpperCase() : sn)
					+ "): ");
			try {
				b = getBoolean(sy, sn, bp);
				break;
			} catch (NumberFormatException e) {

			} catch (Exception e) {
				System.err.println("Error: " + e.getStackTrace());
			}
		}

		return b;
	}

	/**
	 * Gets the boolean probably just for testing purposes with <i>y|n</i> choose.
	 * 
	 * @return the boolean
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static boolean getBoolean() throws IOException {
		return getBoolean("y", "n", BoolPrefered.NOTHINGPREF);
	}

	/**
	 * Define special {@code true|false} characters and what to ask for.
	 * 
	 * @param o
	 *            the o
	 * @param ys
	 *            the ys
	 * @param ns
	 *            the ns
	 * @return the boolean
	 */
	public static boolean getBoolean(String o, String ys, String ns) {
		return getBoolean(o, ys, ns, BoolPrefered.NOTHINGPREF);
	}

	/**
	 * Gets the byte.
	 * 
	 * @return the byte
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws NumberFormatException
	 *             the number format exception
	 */
	public static byte getByte() throws IOException, NumberFormatException {
		return Byte.parseByte(InStream.read());
	}

	/**
	 * Gets the byte.
	 * 
	 * @param o
	 *            The string to be displayed - what should be entered?
	 * @return the byte
	 */
	public static byte getByte(String o) {
		byte b;

		while (true) {
			System.out.print(o);
			try {
				b = getByte();
				break;
			} catch (NumberFormatException e) {

			} catch (Exception e) {
				System.err.println("Error: " + e.getStackTrace());
			}
		}

		return b;
	}

	/**
	 * Gets the short.
	 * 
	 * @return the short
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws NumberFormatException
	 *             the number format exception
	 */
	public static short getShort() throws IOException, NumberFormatException {
		return Short.parseShort(InStream.read());
	}

	/**
	 * Gets the short.
	 * 
	 * @param o
	 *            The string to be displayed - what should be entered?
	 * @return the short
	 */
	public static short getShort(String o) {
		short s;

		while (true) {
			System.out.print(o);
			try {
				s = getShort();
				break;
			} catch (NumberFormatException e) {

			} catch (Exception e) {
				System.err.println("Error: " + e.getStackTrace());
			}
		}

		return s;
	}

	/**
	 * Gets the int.
	 * 
	 * @return the int
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws NumberFormatException
	 *             the number format exception
	 */
	public static int getInt() throws IOException, NumberFormatException {
		return Integer.parseInt(InStream.read());
	}

	/**
	 * Gets the int.
	 * 
	 * @param o
	 *            The string to be displayed - what should be entered?
	 * @return the int
	 */
	public static int getInt(String o) {
		int i;

		while (true) {
			System.out.print(o);
			try {
				i = getInt();
				break;
			} catch (NumberFormatException e) {

			} catch (Exception e) {
				System.err.println("Error: " + e.getStackTrace());
			}
		}

		return i;
	}

	/**
	 * Gets the long.
	 * 
	 * @return the long
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws NumberFormatException
	 *             the number format exception
	 */
	public static long getLong() throws IOException, NumberFormatException {
		return Long.parseLong(InStream.read());
	}

	/**
	 * Gets the long.
	 * 
	 * @param o
	 *            The string to be displayed - what should be entered?
	 * @return the long
	 */
	public static long getLong(String o) {
		long l;

		while (true) {
			System.out.print(o);
			try {
				l = getLong();
				break;
			} catch (NumberFormatException e) {

			} catch (Exception e) {
				System.err.println("Error: " + e.getStackTrace());
			}
		}

		return l;
	}

	/**
	 * Gets the float.
	 * 
	 * @return the float
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws NumberFormatException
	 *             the number format exception
	 */
	public static float getFloat() throws IOException, NumberFormatException {
		return Float.parseFloat(InStream.read());
	}

	/**
	 * Gets the float.
	 * 
	 * @param o
	 *            The string to be displayed - what should be entered?
	 * @return the float
	 */
	public static float getFloat(String o) {
		float f;

		while (true) {
			System.out.print(o);
			try {
				f = getFloat();
				break;
			} catch (NumberFormatException e) {

			} catch (Exception e) {
				System.err.println("Error: " + e.getStackTrace());
			}
		}

		return f;
	}

	/**
	 * Gets the double.
	 * 
	 * @return the double
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws NumberFormatException
	 *             the number format exception
	 */
	public static double getDouble() throws IOException, NumberFormatException {
		return Double.parseDouble(InStream.read());
	}

	/**
	 * Gets the double.
	 * 
	 * @param o
	 *            The string to be displayed - what should be entered?
	 * @return the double
	 */
	public static double getDouble(String o) {
		double d;

		while (true) {
			System.out.print(o);
			try {
				d = getDouble();
				break;
			} catch (NumberFormatException e) {

			} catch (Exception e) {
				System.err.println("Error: " + e.getStackTrace());
			}
		}

		return d;
	}

	/**
	 * Gets the char.
	 * 
	 * @return the char
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws NumberFormatException
	 *             the number format exception
	 */
	public static char getChar() throws IOException, NumberFormatException {
		String s = InStream.read();
		char c;

		if (s.length() == 1) {
			c = s.charAt(0);
		} else {
			throw new NumberFormatException();
		}

		return c;
	}

	/**
	 * Gets the char.
	 * 
	 * @param o
	 *            The string to be displayed - what should be entered?
	 * @return the char
	 */
	public static char getChar(String o) {
		char c;

		while (true) {
			System.out.print(o);
			try {
				c = getChar();
				break;
			} catch (NumberFormatException e) {

			} catch (Exception e) {
				System.err.println("Error: " + e.getStackTrace());
			}
		}

		return c;
	}

	/**
	 * Gets the string.
	 * 
	 * @return the string
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static String getString() throws IOException {
		return InStream.read();
	}

	/**
	 * Gets the string.
	 * 
	 * @param o
	 *            The string to be displayed - what should be entered?
	 * @return the string
	 */
	public static String getString(String o) {
		String s = "";

		System.out.print(o);
		try {
			s = getString();
		} catch (Exception e) {
			System.err.println("Error: " + e.getStackTrace());
		}

		return s;
	}

	/**
	 * Choose what is prefered by asking a boolean
	 */
	public enum BoolPrefered {
		/** {@code true} prefered. */
		TRUEPREF,
		/** {@code false} prefered. */
		FALSEPREF,
		/** Nothing prefered. */
		NOTHINGPREF
	}
}
