object NonogramRow extends App {
def sumsOfRows(an: Array[Int]):Array[Int] = {
  an
    .mkString("")
    .split("0+")
    .dropWhile(_.isBlank)
    .map(_.length)
}
}
