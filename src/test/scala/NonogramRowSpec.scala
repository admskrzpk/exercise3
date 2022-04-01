import NonogramRow._
import org.scalatest._
import flatspec._
import org.scalatest.matchers.should
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class NonogramRowSpec extends AnyFlatSpec{

it should "check if input is an nonogram" in  {
  sumsOfRows(Array()) shouldBe Array()
  sumsOfRows(Array(0,0,0,0,0)) shouldBe Array()
  sumsOfRows(Array(1,1,1,1,1)) shouldBe Array(5)
  sumsOfRows(Array(0,1,1,1,1,1,0,1,1,1,1)) shouldBe Array(5,4)
  sumsOfRows(Array(1,1,0,1,0,0,1,1,1,0,0)) shouldBe Array(2,1,3)
  sumsOfRows(Array(0,0,0,0,1,1,0,0,1,0,1,1,1)) shouldBe Array(2,1,3)
  sumsOfRows(Array(1,0,1,0,1,0,1,0,1,0,1,0,1,0,1)) shouldBe Array(1,1,1,1,1,1,1,1)

}

}
