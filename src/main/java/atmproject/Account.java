package atmproject;

import java.util.Scanner;

public class Account {

    private int accountNumber;// hesap no
    private int pinNumber; //sifre

    private double checkingBalance; //vadesiz hesap bakiyesi
    private double savingBalance; //vadeli hesap bakiyesi

    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }



    //para cekme => paraCekmeIslemindenSonraKalanMiktar  amount: miktar

    private double calculateCheckingBalancefterWithdraw(double amount){

        checkingBalance = checkingBalance - amount;

        return checkingBalance;

    }

    //para yatirma isleminden sonra kalan bakiyeyi hesapla
    private double calculateCheckingBalanceAfterDeposit(double amount){

       checkingBalance =  checkingBalance + amount;

       return checkingBalance;
    }

    //pr cekme: sving hesabindan para cekildikten sonra kalan bakiye
    private double calculateSavingBalanceAfterWithdraw(double amount) {


        savingBalance = savingBalance - amount;
        return savingBalance;

    }

    //para yatirma: saving hesabina para yatirdiktan sonra geri kalan bakiyeyi hesaplayiniz
    private double





}
