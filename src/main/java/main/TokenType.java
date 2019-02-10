package main;

/**
 * @author Patrick Ubelhor
 * @version 08/31/2018
 */
public enum TokenType {
	
	WHITESPACE("\\s"),
	COMMAND("^![a-zA-Z]+"),
	LINK("https?://.+"),
	WORD("[a-zA-Z]+[\\w\\.]*"),
	NUMBER("-?[0-9]+"),
	QUOTE("\".*\""),
	AMP("&$"),
	REMAINDER(".+$");
	
	public final String pattern;
	
	TokenType(String pattern) {
		this.pattern = pattern;
	}
	
}