package features.BillPayment.dao;

import features.BillPayment.dto.req.BillTypeReq;
import features.BillPayment.dto.res.BillTypeRes;

public class BillPaymentDao {
    
    public BillTypeRes doLogin(BillTypeReq req) {
        BillTypeRes res = new BillTypeRes();
        try {
            // Validate Token
            if (!"12345".equals(req.getToken())) {
                res.setOutMessage("Invalid Token!");
                return res;
            }

            // Validate User ID
            if (!"1234".equals(req.getId())) {
                res.setOutMessage("Invalid User ID!");
                return res;
            }

            // Process Bill Type
            String billType = req.getBillType();
            switch (billType) {
                case "Electricity":
                    res.setBillName("DESCO");
                    res.setAmount("1500 BDT");
                    res.setDate("15-02-2025");
                    res.setOutMessage("Success!");
                    break;
                case "Gas":
                    res.setBillName("Titas Gas");
                    res.setAmount("900 BDT");
                    res.setDate("16-02-2025");
                    res.setOutMessage("Success!");
                    break;
                case "Water":
                    res.setBillName("WASA");
                    res.setAmount("500 BDT");
                    res.setDate("17-02-2025");
                    res.setOutMessage("Success!");
                    break;
                case "Internet":
                    res.setBillName("BDCom");
                    res.setAmount("1200 BDT");
                    res.setDate("18-02-2025");
                    res.setOutMessage("Success!");
                    break;
                default:
                    res.setOutMessage("Invalid Bill Type!");
                    break;
            }
        } catch (Exception e) {
            res.setOutMessage("Login Problem! " + e.toString());
        }
        return res;
    }
}
