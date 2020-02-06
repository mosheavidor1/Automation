package Actions;

import Applications.Application;
import Applications.SeleniumBrowser;

public abstract class TestActions {
	
	private Application application;
	
	public TestActions() {
		application = SeleniumBrowser.GetInstance();
	}

    public void SetApplicationUrl(String Url)
    {
        application.LoadUrl(Url);
    }

    public void CloseApplication()
    {
        application.Close();
    }

    public void LaunchApplication(String ApplicationType, String proxyIP)
    {
        application.Launch(ApplicationType, proxyIP);
    }

    public void LaunchApplication(String ApplicationType)
    {
        application.Launch(ApplicationType);
    }

    public void CloseCurrentWindow()
    {
        application.CloseCurrentWindow();
    }

}
