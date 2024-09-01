package assignments;

public class NavigationCommands extends BaseEdge {
	
	public void navigationCommands()
	{
		Driver.navigate().to("https://www.flipkart.com");
		Driver.navigate().back();
		Driver.navigate().forward();
		Driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NavigationCommands navigationcommands=new NavigationCommands();
navigationcommands.intializeBrowser();
navigationcommands.navigationCommands();
navigationcommands.driverQuitAndClose();

	}

}
