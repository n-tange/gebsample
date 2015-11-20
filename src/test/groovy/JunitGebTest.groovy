import org.junit.Test
import geb.Browser

class JunitGebTest {

    @Test
    void simpleGebTest() {
      Browser.drive {
          go "http://gebish.org"
          reportGroup 'gebish.org'

          assert title == "Geb - Very Groovy Browser Automation"

          report '01_Geb_Top'

          $("#sidebar .sidemenu a", text: "jQuery-like API").click()

          assert $("#main h1")*.text() == ["Navigating Content", "Form Control Shortcuts"] 
          assert $("#sidebar .sidemenu a", text: "jQuery-like API").parent().hasClass("selected")
          report '02_Geb_Navigating_Content'
      }
    }
}
