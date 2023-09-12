package personal.code

import sun.util.calendar.ZoneInfo

import java.util.TimeZone

object TestUtils {
  def doTest(): Boolean = TimeZone.getDefault.isInstanceOf[ZoneInfo]
}
