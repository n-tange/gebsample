package gebtest.page

import geb.Page
import geb.Module

class TopPage extends Page{
  static url = "http://www.sansou-dev.jp/trac/sansou-dev"
  static at = { $("#mainnav ul li a").text() == "Wiki"}
  static content = {}
}

class TicketRegPage extends Page{
  static at = { $("#mainnav a", href: endsWith("newticket")).parent().hasClass("active") }
  static content = {
<<<<<<< HEAD:src/test/groovy/page/GebPages.groovy
      txtSummary {$("#field-summary")}
      txtReporter {$("#field-reporter")}
      txtDescription {$("#field-description")}
=======
    crossBrower{$("#sidebar .sidemenu a", text: "Cross Brower")}
    jQueryLike{$("#sidebar .sidemenu a", text: "jQuery-like API")}
>>>>>>> upstream/master:src/test/groovy/gebtest/page/GebPages.groovy
  }
}
