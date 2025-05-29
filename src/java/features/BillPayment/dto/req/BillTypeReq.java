/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.BillPayment.dto.req;

/**
 *
 * @author macpc4
 */
public class BillTypeReq {
    String token,id,billType;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    @Override
    public String toString() {
        return "BillTypeReq{" + "token=" + token + ", id=" + id + ", billType=" + billType + '}';
    }
    
    
}
