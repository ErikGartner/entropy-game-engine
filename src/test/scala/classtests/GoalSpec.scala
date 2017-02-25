import org.scalatest._
import io.gartner.entropy._

class GoalSpec extends FlatSpec with Matchers {

  "A Goal" should "have a name" in new BorisGetRichGoal {
    assert(borisGetRich.name == "Get the money")
  }

  it should "have a list of conditions" in new BorisGetRichGoal {
    assert(borisGetRich.conditions == Seq(borisHasTheMoney))
  }

}
