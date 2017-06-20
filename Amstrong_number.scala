// Implementation #1
var number = 371
number.toString.toList.map(_.asDigit).map(_.toDouble).map(pow(_,3)).sum.toInt.equals(number)

Result
res*: Boolean = true

// Implementation #2
number.toString.map(_.toChar.asDigit.toDouble).map(x=>pow(x,3)).sum.toInt.equals(number)

Result
res*: Boolean = true


