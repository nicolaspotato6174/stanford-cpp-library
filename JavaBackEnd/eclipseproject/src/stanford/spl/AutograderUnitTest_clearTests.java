package stanford.spl;

import acm.util.TokenScanner;

class AutograderUnitTest_clearTests extends JBECommand {

	public void execute(TokenScanner paramTokenScanner, JavaBackEnd paramJavaBackEnd) {
		paramTokenScanner.verifyToken("(");
		boolean isStyleCheck = nextBoolean(paramTokenScanner);
		paramTokenScanner.verifyToken(")");
		
		AutograderUnitTestGUI gui = AutograderUnitTestGUI.getInstance(isStyleCheck);
		gui.clearTests();
	}
}