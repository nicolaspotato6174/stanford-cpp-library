package stanford.spl;

import acm.util.TokenScanner;

public class JBEConsole_getLine extends JBECommand {
	public void execute(TokenScanner paramTokenScanner, JavaBackEnd jbe) {
		paramTokenScanner.verifyToken("(");
		paramTokenScanner.verifyToken(")");
		jbe.println("result:" + jbe.getConsole());
	}
}
