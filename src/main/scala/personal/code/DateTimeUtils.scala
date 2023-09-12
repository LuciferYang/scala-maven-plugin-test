package personal.code

import sun.util.calendar.ZoneInfo

import java.util.{Date, TimeZone}

object DateTimeUtils {

  def rebaseGregorianToJulianDays(days: Int): Int = 100

  def toJavaDate(days: Int): Date = {
    val rebasedDays = rebaseGregorianToJulianDays(days)
    val localMillis = Math.multiplyExact(rebasedDays, 86400000)
    val timeZoneOffset = TimeZone.getDefault match {
      case zoneInfo: ZoneInfo => zoneInfo.getOffsetsByWall(localMillis, null)
      case timeZone: TimeZone => timeZone.getOffset(localMillis - timeZone.getRawOffset)
    }
    new Date(localMillis - timeZoneOffset)
  }
}
