package Utils;

public class XcelutilsDemo {


	public static void main(String[] args) {
		String Path= System.getProperty("user.dir");

		XcelUtils excel = new XcelUtils(Path+"/excel/data.xlsx", "Sheet1");
		excel.Getrowcount();
		excel.Getcolcount();
		excel.Getrowdata(0, 0);
		excel.Getnumericdata(1, 1);
	}
}
