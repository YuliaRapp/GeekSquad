package GeekSquad.grouptask2;

interface RemoteWebDriver{
    void navigate();
    public interface WebDriver extends RemoteWebDriver {
        void open();
        void close();
        String getTitle();
    }
    public interface  TakesScreenshot extends WebDriver {
        void getScreenshot();
    }
    public  class ChromeDrive implements TakesScreenshot {
        @Override
        public void navigate() {
            System.out.println("navigate Chrome browser");
        }
        @Override
        public void open() {
            System.out.println("Open Chrome browser");
        }
        @Override
        public void close() {
            System.out.println("close Chrome browser");
        }
        @Override
        public String getTitle() {
            return null;
        }
        @Override
        public void getScreenshot() {
            System.out.println("getting Screen shot ");
        }
    }
    public class FirefoxDriver implements TakesScreenshot{
        @Override
        public void navigate() {
            System.out.println("navigate FireFox browser");
        }
        @Override
        public void open() {
            System.out.println("Open FireFox browser");
        }
        @Override
        public void close() {
            System.out.println("close FireFox browser");
        }
        @Override
        public String getTitle() {
            return null;
        }
        @Override
        public void getScreenshot() {
            System.out.println("getting Screen shot ");
        }
    }
    public class SafariDriver implements TakesScreenshot{
        @Override
        public void navigate() {
            System.out.println("navigate Safari browser");
        }
        @Override
        public void open() {
            System.out.println("Open Safari browser");
        }
        @Override
        public void close() {
            System.out.println("close Safari browser");
        }
        @Override
        public String getTitle() {
            return null;
        }
        @Override
        public void getScreenshot() {
            System.out.println("getting Screen shot ");
        }
    }
    public class Main{
        public static void main(String[] args) {
            TakesScreenshot chromeDrive = new ChromeDrive();
            chromeDrive.getScreenshot();
            chromeDrive.close();
            chromeDrive.open();
            chromeDrive.navigate();
            chromeDrive.getScreenshot();
            TakesScreenshot FirefoxDriver = new FirefoxDriver();
            FirefoxDriver.getScreenshot();
            FirefoxDriver.close();
            FirefoxDriver.open();
            FirefoxDriver.navigate();
            FirefoxDriver.getScreenshot();
            TakesScreenshot SafariDriver = new SafariDriver();
            SafariDriver.getScreenshot();
            SafariDriver.close();
            SafariDriver.open();
            SafariDriver.navigate();
            SafariDriver.getScreenshot();
        }}}
