import math


def HeightTriangle26(a, b):
    '''вычислить длину h, опущенную на гипотенузу треугольника с катетами a,b'''

    # S=0.5*a*b or S=0.5*h*gip => h=a*b/gip; gip получим из теоремы пифагора
    gip = (a ** 2 + b ** 2) ** (1 / 2)
    h = a * b / gip

    return h


def HeightMeter36(v0, M, R):
    """Произвести по формуле расчет функции f(x)= ..."""
    G = 6.674  # Гравитационная постоянная, м^3/(кг•с^2)

    # Вычисляем максимальную высоту
    h = round(R - (G * M * 10 ** 13 / (0.5 * v0 ** 2 + (G * M * 10 ** 13 / R))), 1)
    return h


def MultHeightTriangle37(a, b, c):
    """Произвести по формуле расчет функции f(x)= ..."""
    # воспользуемся формулой Герона, для нахождения полупириметра (p), и площади (s)
    p = (a + b + c) / 2
    s = (p * (p - a) * (p - b) * (p - c)) ** 0.5

    h1 = 2 * s / a
    h2 = 2 * s / b
    h3 = 2 * s / c

    works_of_heights = round(h1 * h2 * h3, 1)

    return works_of_heights


def Square55(A, B, C):
    D = (B ** 2) - 4 * A * C
    x1 = (-B + D ** (1 / 2)) / (2 * A)
    x2 = (-B - D ** (1 / 2)) / (2 * A)
    if x1 < x2:
        mass = [x1, x2]
    else:
        mass = [x2, x1]
    return mass


def Ball80(S, distance):
    R = math.sqrt(S / (4 * math.pi))  # Радиус шара
    r1 = R ** 2 - distance ** 2  # Радиус сечения в квадрате
    r = math.sqrt(r1)  # Радиус сечения
    cross_sec_area = round(math.pi * r ** 2, 1)

    return cross_sec_area
