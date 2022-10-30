package class22;
//Related to WebDriver
//  ไม่เข้าใจเลย ต้องกลับมาทวน
public class WebDriverTester {
    public static void main(String[] args) {

   /*     Safari safari=new Safari();
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();
        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();
        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.test();
        fireFox.closeBrowser();*/

          /* Chrome chrome=new Chrome();
        FireFox fireFox=new FireFox();
        Safari safari=new Safari();
        WebDriver[] browsers={chrome,fireFox,safari};
        */


        /*
        Creating objects of all Child classes and storing them in an array of
        type Webdriver we can do this bcause upcasting allows us to do this
         */

        WebDriver[] browsers={new Chrome(),new Safari(),new FireFox()}; // <= will be stored inside "browser" mean All methods of each class will be stored in "browser"
        for (WebDriver browser:browsers) {   //Enhanced //mean All methods of each class will be stored in "browser"
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }
        for(int i=0; i< browsers.length;i++){   //another way using For loop
            browsers[i].startBrowser();
            browsers[i].test();
            browsers[i].closeBrowser();
        }

    }
}