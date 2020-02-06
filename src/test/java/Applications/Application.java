package Applications;

public interface Application {
    void Launch(String applicationType, String proxyIP);
    void Launch(String applicationType);
    void LoadUrl(String URL);
    void MoveToNewWindow();
    void CloseCurrentWindow();
    void Close();

}
