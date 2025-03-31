import pytest

from ОКИС.PYTHON.main import *


def test_HeightTriangle26():
    number1 = 3
    number2 = 4
    expectedResult = 2.4
    actualResult = HeightTriangle26(number1, number2)
    assert expectedResult == actualResult


def test_HeightMeter36():
    number1 = 10
    number2 = 5.9742
    number3 = 6378000
    expectedResult = 5.1
    actualResult = HeightMeter36(number1, number2, number3)
    assert expectedResult == actualResult


def test_MultHeightTriangle37():
    number1 = 3
    number2 = 4
    number3 = 5
    expectedResult = 28.8
    actualResult = MultHeightTriangle37(number1, number2, number3)
    assert expectedResult == actualResult


@pytest.mark.parametrize("a, b, c, expectedResult", [
    (1, -3, 2, [1.0, 2.0]),
    (1, -2, 1, [1.0, 1.0]),
    (1, -1, -6, [-2.0, 3.0]),
    (1, 0, -4, [-2.0, 2.0]),
    (1, 2, 1, [-1.0, -1.0])
])
def test_Square55(a, b, c, expectedResult):
    actualResult = Square55(a, b, c)
    assert actualResult == expectedResult


def test_Ball80():
    number1 = 100
    number2 = 2
    expectedResult = 12.4
    actualResult = Ball80(number1, number2)
    assert expectedResult == actualResult
