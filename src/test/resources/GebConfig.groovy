import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver

waiting {
  timeout = 2
}

environments {
  chrome {
    driver = {
      def driverInstance = new ChromeDriver()
      driverInstance.manage().window().maximize()
      driverInstance
    }
  }

  firefox {
    driver = {
      def driverInstance = new FirefoxDriver()
      driverInstance.manage().window().maximize()
      driverInstance
    }
  }

  htmlunit {
    def driverInstance = new HtmlUnitDriver()
    driverInstance.manage().window().maximize()
    driverInstance.javascriptEnabled = true
    driverInstance
  }
}

baseUrl = System.getProperty('BASE_URL')
