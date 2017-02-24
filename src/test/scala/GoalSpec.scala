import org.scalatest._
import io.gartner.gameai._

class GoalSpec extends FlatSpec with Matchers {

  "Goals" should "have a name" in {
    val g = new Goal("Get money")

    assert(g.name == "Get money")
  }

}
