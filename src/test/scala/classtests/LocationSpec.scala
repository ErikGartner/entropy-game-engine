import org.scalatest._
import io.gartner.entropy._

class LocationSpec extends FlatSpec with Matchers {

  "A Location" should "have a name" in new BarLocation {
    assert(theBar.name == "The Bar")
  }
}
