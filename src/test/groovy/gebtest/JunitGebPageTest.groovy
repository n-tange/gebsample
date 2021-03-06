package gebtest

import org.junit.Test
import geb.Browser
import gebtest.page.*

class JunitGebPageTest {

    @Test
    void simpleGebTest2() {
      Browser.drive{
        reportGroup 'gebish.org_2'

        to TopPage
        assert title == "Geb - Very Groovy Browser Automation"
        report '01_Geb_Top'

        //sidemenu_2.click()
        sidemenu.jQueryLike.click()

        waitFor{ at JqueryLikePage }
        //assert sidemenu_2.parent().hasClass("selected")
        assert sidemenu.jQueryLike.parent().hasClass("selected")
        report '02_Geb_Navigating_Content'
      }
    }
}
