import jcodelib.diffutil.TreeDiff;

public class Main {

	public static void main(String[] args) {

        File src = new File("changes/change001/old/PropertiesSettingsLoader.java");
        File dst = new File("changes/change001/new/PropertiesSettingsLoader.java");

        System.out.println(diffGumTreeWithGrouping(src, dst));
    }
}
