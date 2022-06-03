package basic;

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
        Scanner a = new Scanner(System.in);
        System.out.print("Input numerator: ");
        tuSo = a.nextInt();
        System.out.print("Input denominator: ");
        mauSo = a.nextInt();
    }

    public void userOutput() {
        System.out.print(+tuSo + "/" + mauSo + "\n");
    }

//    public Fraction fractionSum(int tuSo2, int mauSo2) {
//        int tmp1 = tuSo * mauSo2 + mauSo * tuSo2;
//        int tmp2 = mauSo * mauSo2;
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

    public Fraction fractionSub(int tuSo2, int mauSo2) {
        int tmp1 = tuSo * mauSo2 - mauSo * tuSo2;
        int tmp2 = mauSo * mauSo2;
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
    public Fraction fractionMul(int tuSo2, int mauSo2) {
        int tmp1 = tuSo * tuSo2;
        int tmp2 = mauSo * mauSo2;
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
//    public Fraction fractionDiv(int tuSo2, int mauSo2) {
//        int tmp1 = tuSo * mauSo2;
//        int tmp2 = mauSo * tuSo2;
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
