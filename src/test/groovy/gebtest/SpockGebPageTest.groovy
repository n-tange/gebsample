package gebtest

import geb.spock.GebReportingSpec
import gebtest.page.*

class SpockGebPageTest extends GebReportingSpec{
    def "Spockを使用したテストケース"(){
      setup:
        reportGroup 'gebish.org_3'
      
      when:
        to TopPage

      then:
        waitFor{ at TopPage }
        assert title == "Geb - Very Groovy Browser Automation"
        report '01_Geb_Top'

      when:
        sidemenu.jQueryLike.click()
      then:
        waitFor{ at JqueryLikePage }
        assert sidemenu.jQueryLike.parent().hasClass("selected")
        report '02_Geb_Navigating_Content'
    }
}
