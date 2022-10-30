package class22;
//จดไม่เสร็จ
public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void test(){
        System.out.println("Perform the Testing");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser(){
        System.out.println("Starting the Google chrome");
    }
    @Override
    public void test(){
        System.out.println("Perform the Testing on Google chrome");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Closing the Google chrome");
    }
}
class FireFox extends WebDriver{
    @Override
    public void startBrowser(){
        System.out.println("Starting the FireFox");
    }
    @Override
    public void test(){
        System.out.println("Perform the Testing on FireFox");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Closing the FireFox");
    }
}
class Safari extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting the Safari");
    }
    public void test(){
        System.out.println("Perform the testing on Safari");
    }
    public void closeBrowser(){
        System.out.println("Closing the Safari");
    }
}