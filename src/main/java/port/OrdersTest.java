package port;


import model.OrderModel;
import util.HttpUtil;
import util.JsonUtils;

import java.net.MalformedURLException;
import java.util.Date;

/**
 * 2、新增订单接口
 *
 * @author zpf
 * @mail zhaopengfeihappy@gmail.com
 * @createtime 2017/8/3 15:51
 */

public class OrdersTest {


    public static void main(String[] args) {
        /**
         * 秘钥key
         */
        String keyString = "2FE0IESO586feleisFED";
        /**
         *  客户id
         */
        String companyId = "LEFANGWANG";

        /**
         * 测试服务器:
         * 接口地址
         */
        String requestUrl = "http://10.39.251.213:8080/open-web/rs/order/v1/add";
        /**
         * 订单对象转json
         */
        String content = orderAssignment(companyId);

        /**
         * post网络请求
         */
        try {
            String result =  HttpUtil.httpPost(keyString, companyId, requestUrl, content);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    /**
     * 订单实体
     *
     * @param companyId
     * @return
     */
    private static String orderAssignment(String companyId) {
        String orderNoString = "JM" + new Date().getTime();
        OrderModel model = new OrderModel();

        model.setCustomerOrderNo(orderNoString);

        model.setVistReceive("YES");

        model.setDeliveryType("UPSTAIR");
        model.setReceiverMobile("18321893025");
        model.setReceiverName("张家瑞");
        model.setReceiverProvince("福建省");
        model.setReceiverCity("泉州市");
        model.setReceiverCounty("晋江市");
        model.setReceiverAddress("福建泉州市晋江市英林镇福建省晋江市英林镇龙西新西湖村33号");
        model.setCompanyCode(companyId);
        model.setCustomEbcuId("11111111");
        model.setCodPrice(0d);
        model.setSenderName("乔安娜");
        model.setSenderMobile("13671538008");
        model.setSenderProvince("上海市");
        model.setSenderCity("上海市");
        model.setSenderCounty("浦东新区");
        model.setSenderAddress("上海浦东新区博华路(成山路)498弄14号803室");
        model.setCargoname("AS02AB1287MD");
        model.setTransportType("YAZ");
        //这里写全参数，地址写比较实际
        model.setTotalNumber(1);


        return JsonUtils.toJson(model);
    }


}
