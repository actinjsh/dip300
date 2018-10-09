def square(x: Double) = x * x
def isGoodEnough(x: Double, y: Double) = if (Math.abs(square(y)-x) < 0.001) true else false
def improve(x: Double, y: Double) = (y + x/y) / 2
def sqrtIter(x: Double, y: Double):Double = if (isGoodEnough(x, y)) y else sqrtIter(x, improve(x, y))
def sqrt(x: Double) = sqrtIter(x, 1)


sqrt(9)
sqrt(81)
