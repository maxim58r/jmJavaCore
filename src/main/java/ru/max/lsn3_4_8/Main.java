package ru.max.lsn3_4_8;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(Double.NaN, 0.0);
        ComplexNumber b = new ComplexNumber(Double.NaN, 0.0);

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(b.hashCode() == a.hashCode());
        System.out.println(b.equals(a));

    }

    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ComplexNumber)) {
                return false;
            }
            if (!(o.getClass() == this.getClass())) {
                return false;
            }
            ComplexNumber cn = (ComplexNumber) o;
            return (Double.compare(this.getRe(), cn.getRe()) == 0) &&
                    (Double.compare(this.getIm(), cn.getIm()) == 0);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + Double.hashCode(getRe());
            result = prime * result + Double.hashCode(getIm());
            return result;
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

    }
}
