package util;

import app1.Browser;
import app1.Chrome;
import app1.FireFox;
import app1.MicroSoftEdge;
import app1.OperaBrowser;

public class BrowserUtil extends Browser{
	public void run(Browser browser)
	{
		Browser browser2 = new Browser();
		browser2.getTypeOfBrowser();
		
		if(browser instanceof Chrome)
		{
			Browser chrome = new Chrome();
			chrome.getTypeOfBrowser();
			
			Chrome chrome2=(Chrome)chrome;//Converting (parent class)Browser of browser type to (sub class)Chrome
			chrome2.getCompanyName();
		}
		
		if(browser instanceof FireFox)
		{
			Browser fireFox=new FireFox();
			fireFox.getTypeOfBrowser();
			
			FireFox fireFox2=(FireFox)fireFox;
			fireFox2.getCompanyName();
		}
		
		if(browser instanceof OperaBrowser)
		{
			Browser opera=new Browser();
			opera.getTypeOfBrowser();
			
			OperaBrowser opera2=new OperaBrowser();
			opera2.getCompanyName();
		}
		
		if(browser instanceof MicroSoftEdge)
		{
			Browser micro=new Browser();
			micro.getTypeOfBrowser();
			
			MicroSoftEdge micro2=new MicroSoftEdge();
			micro2.getCompanyName();
		}
	}
	
}
