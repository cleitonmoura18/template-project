package com.template.common.util.string;

/**
 * 
 * Utility methods for working with String
 * 
 * @author
 */
public class StringUtil {

	/**
	 * @param text
	 *            Text
	 * @return True if the text is not null or empty
	 */
	public static boolean isEmpty(String text) {
		return text == null || text.trim().isEmpty();
	}

}
