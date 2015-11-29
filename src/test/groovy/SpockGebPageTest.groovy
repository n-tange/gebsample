package gebtest

import geb.spock.GebReportingSpec
import gebtest.page.*

class SpockGebPageTest extends GebReportingSpec{
    def "Spock版Tracのチケット登録テスト"(){
        setup:  // given:と記述しても同じ
        reportGroup 'sansou-dev.jp'

        when:
        to TopPage

        then:
        waitFor {at TopPage}
        report '01_Trac_Top'

        when:
        $("#mainnav a", href: endsWith("newticket")).click()

        then:
        waitFor{ at TicketRegPage }
        assert txtSummary.value() == ""
        assert txtReporter.value() == "anonymous"
        report '02_Ticket_Reg_Init'

        when:
        txtSummary.value("")
        txtDescription.value("")
        $("#propertyform input[name='submit']").click()
        report '03_Ticket_Reg_Submit'

        then:
        waitFor { at TicketRegPage }
        assert $("#warning").text() == "Warning: チケットの概要を記述する必要があります。"
        report '04_Ticket_Reg_Confirm_Warning'

        when:
        txtSummary.value("SpockGebサンプルのチケット")
        txtDescription.value("これはサンプルのチケットです。")

        report '05_Ticket_Reg_Input'

        $("#propertyform input[name='submit']").click()

        then:
        assert currentUrl.startsWith("http://www.sansou-dev.jp/trac/sansou-dev/ticket")
        assert $("#ticket h2.summary").text() == "SpockGebサンプルのチケット"

        report '04_Ticket_Reg_Complete'
    }
}
