package class23;

public interface Hw2WebDriver {
    /*
    Create a WebDriver Interface that will have the following
    unimplemented behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements Hw2WebDriver{

    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }
}
class FirefoxDriver implements Hw2WebDriver{

    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }
}