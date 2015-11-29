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
      txtSummary {$("#field-summary")}
      txtReporter {$("#field-reporter")}
      txtDescription {$("#field-description")}
  }
}
