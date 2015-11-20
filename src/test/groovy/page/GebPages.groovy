import geb.Page
import geb.Module

class TopPage extends Page{
  static url = "http://www.gebish.org/"
  static at = { $("#main h1", 0).text() == "What is it?"}
  static content = {
    //sidemenu_2{$("#sidebar .sidemenu a", text: "jQuery-like API")}
    sidemenu { module SidemenuModule }
  }
}

class JqueryLikePage extends Page{
  static at = { $("#main h1")*.text() == ["Navigating Content", "Form Control Shortcuts"] }
  static content = {
    //sidemenu_2{$("#sidebar .sidemenu a", text: "jQuery-like API")}
    sidemenu { module SidemenuModule }
  }
}

class SidemenuModule extends Module{
  static content = {
    idx2{$("#sidebar .sidemenu a", text: "jQuery-like API")}
  }
}
