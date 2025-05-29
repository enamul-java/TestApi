/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.BillPayment.dto.res;

/**
 *
 * @author macpc4
 */
public class BillTypeRes {
    String billName,amount,date,outMessage;

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOutMessage() {
        return outMessage;
    }

    public void setOutMessage(String outMessage) {
        this.outMessage = outMessage;
    }

    @Override
    public String toString() {
        return "BillTypeRes{" + "billName=" + billName + ", amount=" + amount + ", date=" + date + ", outMessage=" + outMessage + '}';
    }

   
    
}
