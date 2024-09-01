package assignments;

public class BrowserCommands extends BaseEdge {

	public void browserCommands()
	{
		String title=Driver.getTitle();
		System.out.println(title);
		String url=Driver.getCurrentUrl();
		System.out.println(url);
		String pagesource=Driver.getPageSource();
		System.out.println(pagesource);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	BrowserCommands browsercommands=new BrowserCommands();
	browsercommands.intializeBrowser();
	browsercommands.browserCommands();
	browsercommands.driverQuitAndClose();
	}

}
