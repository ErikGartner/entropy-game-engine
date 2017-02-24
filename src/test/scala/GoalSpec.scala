import org.scalatest._
import io.gartner.gameai._

class GoalSpec extends FlatSpec with Matchers {

  trait GetRichGoal {
    val goal = new Goal("Get money")
  }

  "Goals" should "have names" in new GetRichGoal {
    assert(goal.name == "Get money")
  }

}
