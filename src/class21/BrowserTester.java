package class21;
//Related to Browser
public class BrowserTester {
    public static void main(String[] args) {
        Chrome chrome=new Chrome();
        chrome.openBrowser();   //Call from Chrome class(Child class)
        chrome.closeBrowser();  //Call from Browser (Parent class) bcuz in Chome class has no "closeBrowser" name so JAva will call from Parent class
    }
}
