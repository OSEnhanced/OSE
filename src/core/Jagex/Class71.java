package core.Jagex;
import netscape.javascript.JSObject;

import java.applet.Applet;

public class Class71 {

	Class71() throws Throwable {
		throw new Error();
	}

	public static void method980(Applet var0, String var1, int var2) throws Throwable {
		JSObject.getWindow(var0).eval(var1);
	}

	public static Object method985(Applet var0, String var1, Object[] var2, int var3) throws Throwable {
		return JSObject.getWindow(var0).call(var1, var2);
	}

}
