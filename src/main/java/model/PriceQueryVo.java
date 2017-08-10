package model;

/**
 * Created by XC on 2017/3/23.
 */
public class PriceQueryVo
{
    /**
     * 目的城市
     */
    private String endCity;
    /**
     * 目的区县
     */
    private String endCounty;
    /**
     * 发货城市
     */
    private String shipperCity;
    /**
     * 发货区县
     */
    private String shipperCounty;
    /**
     *  产品类型： 这里直接是ID
     *	定日达：100000
     *	经济快运：100001（公路零担）
     *  易入户：100002
     *	易安装：100003
     *	易包裹：100004
     */
    private String productTypeId;
    /**
     * 重量
     */
    private Double weight;
    /**
     * 体积
     */
    private Double volumn;
    /**
     * 保价
     */
    private Double insurancePrice;
    /**
     * 代收货款
     */
    private Double collDeliveryAmount;

    public String getEndCity()
    {
        return endCity;
    }

    public void setEndCity(String endCity)
    {
        this.endCity = endCity;
    }

    public String getEndCounty()
    {
        return endCounty;
    }

    public void setEndCounty(String endCounty)
    {
        this.endCounty = endCounty;
    }

    public String getShipperCity()
    {
        return shipperCity;
    }

    public void setShipperCity(String shipperCity)
    {
        this.shipperCity = shipperCity;
    }

    public String getShipperCounty()
    {
        return shipperCounty;
    }

    public void setShipperCounty(String shipperCounty)
    {
        this.shipperCounty = shipperCounty;
    }

    public String getProductTypeId()
    {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId)
    {
        this.productTypeId = productTypeId;
    }

    public Double getWeight()
    {
        return weight;
    }

    public void setWeight(Double weight)
    {
        this.weight = weight;
    }

    public Double getVolumn()
    {
        return volumn;
    }

    public void setVolumn(Double volumn)
    {
        this.volumn = volumn;
    }

    public Double getInsurancePrice()
    {
        return insurancePrice;
    }

    public void setInsurancePrice(Double insurancePrice)
    {
        this.insurancePrice = insurancePrice;
    }

    public Double getCollDeliveryAmount()
    {
        return collDeliveryAmount;
    }

    public void setCollDeliveryAmount(Double collDeliveryAmount)
    {
        this.collDeliveryAmount = collDeliveryAmount;
    }
}
