package features.BillPayment.api;

import features.BillPayment.dao.BillPaymentDao;
import features.BillPayment.dto.req.BillTypeReq;
import features.BillPayment.dto.res.BillTypeRes;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;

/**
 *
 * @author macpc4
 */
@WebServlet(name = "BillPaymentApi", urlPatterns = {"/v1/billPayment"})
public class BillPaymentApi extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String token = request.getParameter("token");
        String id = request.getParameter("id");
        String billType = request.getParameter("billType");

        System.out.println("Received BillPayment POST with: token=" + token + ", id=" + id + ", billType=" + billType);

        BillTypeReq reqModel = new BillTypeReq();
        reqModel.setToken(token);
        reqModel.setId(id);
        reqModel.setBillType(billType);

        BillPaymentDao dao = new BillPaymentDao();
        BillTypeRes res = dao.doLogin(reqModel);

        JSONObject json = new JSONObject();
        json.put("billName", res.getBillName());
        json.put("amount", res.getAmount());
        json.put("date", res.getDate());
        json.put("outMessage", res.getOutMessage());

        response.setContentType("application/json");
        response.getWriter().write(json.toJSONString());
    }

    @Override
    public String getServletInfo() {
        return "Handles Bill Payment requests";
    }
}
