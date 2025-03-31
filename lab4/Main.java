package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(HeightTriangle26(3, 4));
    }
    public static double HeightTriangle26(double a, double b) {
        // a, b - катеты
        // Вычисление гипотенузы по теореме Пифагора
        double gip = Math.sqrt(a * a + b * b);
        // Вычисление высоты
        double h;
        h = (int) (a * b) / gip;

        return h;
    }

    public static double HeightMeter36(double v0, double M, double R) {
        double G = 6.674; // Гравитационная постоянная, м^3/(кг•с^2)
        // Вычисляем максимальную высоту
        double h;
        h = (double) Math.round(10 * (R - (G * M * Math.pow(10, 13) / (0.5 * Math.pow(v0, 2) + (G * M * Math.pow(10, 13) / R))))) / 10;

        return h;
    }

    public static double MultHeightTriangle37(double a, double b, double c) {
        // Воспользуемся формулой Герона, для нахождения полупериметра (p) и площади (s)
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        double h1 = 2 * s / a;
        double h2 = 2 * s / b;
        double h3 = 2 * s / c;

        double worksOfHeights;
        worksOfHeights = (double) Math.round(h1 * h2 * h3 * 10) / 10;
        return worksOfHeights;
    }

    static double[] Square55(double A, double B, double C) {
        // Вычисление дискриминанта
        double D = (B * B) - (4 * A * C);
        double x1 = (-B + Math.sqrt(D)) / (2 * A);
        double x2 = (-B - Math.sqrt(D)) / (2 * A);

        // Выводим меньший и больший корень
        double[] mass = new double[2];
        if (x1 < x2) {
            mass[0] = x1;
            mass[1] = x2;
            return mass;
        } else {
            mass[0] = x2;
            mass[1] = x1;
            return mass;
        }
    }


    public static double Ball80(double S, double distance) {
        double R = Math.sqrt(S / (4 * Math.PI));  // Радиус шара
        double r1 = R * R - distance * distance;  // Радиус сечения в квадрате
        double r = Math.sqrt(r1);  // Радиус сечения
        double crossSecArea; // Площадь поперечного сечения
        crossSecArea = (double) Math.round(10 * Math.PI * r * r) / 10;

        return crossSecArea;
    }
}
