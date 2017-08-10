package model;

import java.io.Serializable;

/**
 * Created by XC on 2017/3/8.
 */
public class PriceInModel implements Serializable
{
    private static final long serialVersionUID = 1L;
    //出发省份名称
    private String sendProvinceName;
    //出发城市名称
    private String sendCityName;
    //出发区县名称
    private String sendCountyName;
    //到达省份名称
    private String arrivalProvinceName;
    //到达城市名称
    private String arrivalCityName;
    //到达区县名称
    private String arrivalCountyName;
    //重量
    private double weightNo;
    //体积
    private double volumNo;
    //运输类型
    private String transportType;
    public double getWeightNo()
    {
        return weightNo;
    }

    public void setWeightNo(double weightNo)
    {
        this.weightNo = weightNo;
    }

    public double getVolumNo()
    {
        return volumNo;
    }

    public void setVolumNo(double volumNo)
    {
        this.volumNo = volumNo;
    }

    public String getTransportType()
    {
        return transportType;
    }

    public void setTransportType(String transportType)
    {
        this.transportType = transportType;
    }

    public String getSendProvinceName()
    {
        return sendProvinceName;
    }

    public void setSendProvinceName(String sendProvinceName)
    {
        this.sendProvinceName = sendProvinceName;
    }

    public String getSendCityName()
    {
        return sendCityName;
    }

    public void setSendCityName(String sendCityName)
    {
        this.sendCityName = sendCityName;
    }

    public String getSendCountyName()
    {
        return sendCountyName;
    }

    public void setSendCountyName(String sendCountyName)
    {
        this.sendCountyName = sendCountyName;
    }

    public String getArrivalProvinceName()
    {
        return arrivalProvinceName;
    }

    public void setArrivalProvinceName(String arrivalProvinceName)
    {
        this.arrivalProvinceName = arrivalProvinceName;
    }

    public String getArrivalCityName()
    {
        return arrivalCityName;
    }

    public void setArrivalCityName(String arrivalCityName)
    {
        this.arrivalCityName = arrivalCityName;
    }

    public String getArrivalCountyName()
    {
        return arrivalCountyName;
    }

    public void setArrivalCountyName(String arrivalCountyName)
    {
        this.arrivalCountyName = arrivalCountyName;
    }
}
