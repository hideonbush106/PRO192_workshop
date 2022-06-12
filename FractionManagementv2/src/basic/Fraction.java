package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Asus
 */
public class Fraction {

    public int tuSo, mauSo;

    public Fraction() {
        tuSo = 0;
        mauSo = 0;
    }

    public Fraction(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void userInput() {
        Scanner a = null;
        boolean cont = false;
        do {
            try {
                a = new Scanner(System.in);
                System.out.print("Input numerator: ");
                tuSo = a.nextInt();
                cont = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid");
            }
        } while (!cont);
        cont = false;
        do {
            try {
                a = new Scanner(System.in);
                System.out.print("Input denominator: ");
                mauSo = a.nextInt();
                cont = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid");
            }
        } while (!cont);
    }

    public void userOutput() {
        System.out.print(+tuSo + "/" + mauSo + "\n");
    }

//    public Fraction fractionSum(int tuSo, int mauSo) {
//        int tmp1 = this.tuSo * mauSo + this.mauSo * tuSo;
//        int tmp2 = this.mauSo * mauSo;
//        Fraction result = new Fraction();
//        result.tuSo = tmp1;
//        result.mauSo = tmp2;
//        return result;
//    }
    public Fraction fractionSum(Fraction B) {
        int tmp1 = tuSo * B.mauSo + mauSo * B.tuSo;
        int tmp2 = mauSo * B.mauSo;
        Fraction result = new Fraction();
        result.tuSo = tmp1;
        result.mauSo = tmp2;
        return result;
    }

    public Fraction fractionSub(int tuSo, int mauSo) {
        int tmp1 = this.tuSo * mauSo - this.mauSo * tuSo;
        int tmp2 = this.mauSo * mauSo;
        Fraction result = new Fraction();
        result.tuSo = tmp1;
        result.mauSo = tmp2;
        return result;
    }

//    public Fraction fractionSub(Fraction B) {
//        int tmp1 = tuSo * B.mauSo - mauSo * B.tuSo;
//        int tmp2 = mauSo * B.mauSo;
//        Fraction result = new Fraction();
//        result.tuSo = tmp1;
//        result.mauSo = tmp2;
//        return result;
//    }
    public Fraction fractionMul(int tuSo, int mauSo) {
        int tmp1 = this.tuSo * tuSo;
        int tmp2 = this.mauSo * mauSo;
        Fraction result = new Fraction();
        result.tuSo = tmp1;
        result.mauSo = tmp2;
        return result;
    }

//    public Fraction fractionMul(Fraction B) {
//        int tmp1 = tuSo * B.tuSo;
//        int tmp2 = mauSo * B.mauSo;
//        Fraction result = new Fraction();
//        result.tuSo = tmp1;
//        result.mauSo = tmp2;
//        return result;
//    }
//    public Fraction fractionDiv(int tuSo, int mauSo) {
//        int tmp1 = this.tuSo * mauSo;
//        int tmp2 = this.mauSo * tuSo;
//        Fraction result = new Fraction();
//        result.tuSo = tmp1;
//        result.mauSo = tmp2;
//        return result;
//    }
    public Fraction fractionDiv(Fraction B) {
        int tmp1 = tuSo * B.mauSo;
        int tmp2 = mauSo * B.tuSo;
        Fraction result = new Fraction();
        result.tuSo = tmp1;
        result.mauSo = tmp2;
        return result;
    }
}
