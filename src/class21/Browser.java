package class21;
//Override
//Related to BrowserTester
public class Browser {
    void openBrowser(){
        System.out.println("Opening a Browser");
    }
    void navigate(){
        System.out.println("Opening the URL");
    }
    void test(){
        System.out.println("Testing the webpage");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class Chrome extends Browser{
    @Override    //so it will help you check the Override rule
    void openBrowser(){
        System.out.println("Opening a Browser in less then 1sec");
    }
}
class FireFox extends Browser{
    @Override
    void openBrowser (){
        System.out.println("Opening a Browser in less then 2sec");
    }
}