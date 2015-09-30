package core.Jagex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class141 {

	public static final int anInt1634 = 78;
	public static final int anInt1635 = 2;
	public List aList1631;
	public static Comparator aComparator1636 = new Class136();
	public static Comparator aComparator1632;
	public static Comparator aComparator1633;
	public static Comparator aComparator1630;

	public Class141(Class117_Sub14 var1, boolean var2) {
		int var6 = var1.method2012(1053511631);
		boolean var3 = var1.method2010(-1439707937) == 1;
		byte var5;
		if (var3) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var4 = var1.method2012(1053511631);
		aList1631 = new ArrayList(var4);

		for (int var7 = 0; var7 < var4; var7++) {
			aList1631.add(new Class133(var1, var5, var6));
		}

	}

	static {
		new Class139();
		aComparator1632 = new Class140();
		aComparator1633 = new Class131();
		aComparator1630 = new Class144();
	}

	public void method1767(Comparator var1, boolean var2, int var3) {
		if (var2) {
			Collections.sort(aList1631, var1);
		} else {
			Collections.sort(aList1631, Collections.reverseOrder(var1));
		}

	}

}
