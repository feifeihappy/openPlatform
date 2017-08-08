package model;

import java.util.Date;

/**
 * 订单实体
 * @ClassName: OrderModel 
 * @Description: TODO 
 * @author mt_king mail:hyssmt@vip.qq.com
 * @date 2015年4月20日 上午9:30:23 
 *
 */
public class OrderModel {
	/**********华宇提供，注：所有金额均保留两位小数**********/
	//华宇订单号    varchar(32)
	private String orderNo;
	//华宇运单号   varchar(32)
	private String transNo;
	//短信通知费用  double
	private Double smsNotifyPrice;
	//燃油附加   需要：YES、不需要：NO   varchar(10)
	private String fuelSurcharge;
	//燃油附加费   double
	private Double fuelSurchargePrice;
	//签收回单费用  double
	private Double backSignBillPrice;
	//运输费用   double
	private Double transportPrice;
	//保价费   double
	private Double insurancePrice;
	//上门接货费用    double
	private Double vistReceivePrice;
	//代收货款费   double
	private Double codPrice;
	//送货费用    double
	private Double deliveryPrice;
	//等通知发货费用    double
	private Double waitNotifySendPrice;
	//包装服务费   double
	private Double packageServicePrice;
	//工本费用   double
	private Double materialCostPrice;
	//其他费用  double
	private Double otherprice;
	//是否工本需要工本费  是：YES、否：NO
	private String materialCost;
	//安装费用
	private Double installPrice;
	/**********华宇提供**********/
	/**********客户提供**********/
	//公司编号  varchar(64)      是
	private String companyCode;
	//客户订单号   varchar(50)    是
	private String customerOrderNo;
	//公司名称    varchar(50)
	private String companyName;
	//用户唯一ID号   varchar(16)   字母或数字
	private String customEbcuId;
	//会员类型    varchar(50)
	private String memberType;
	//营业网点编号    varchar(20)
	private String businessNetworkNo;
	//发货人公司     nvarchar(200)
	private String senderCompanyname;
	//发货人名称    nvarchar(200)   是
	private String senderName;
	//发货人邮编   varchar(32)
	private String senderPostcode;
	//发货人电话   varchar(50)     手机和电话必选一项
	private String senderPhone;
	//发货人手机   varchar(50)
	private String senderMobile;
	//发货人省份  varchar(40)     是
	private String senderProvince;
	//发货人城市  varchar(50)    是
	private String senderCity;
	//发货人县/区  varchar(50)   是
	private String senderCounty;
	//发货详细地址   varchar(512)    是
	private String senderAddress;
	//收货人公司  nvarchar(200)
	private String receiverCompanyname;
	//收货人名称  nvarchar(200)    是
	private String receiverName;
	//收货人邮编  varchar(32)
	private String receiverPostcode;
	//收货人电话   varchar(50)     电话和手机必选一项
	private String receiverPhone;
	//收货人手机   varchar(50)
	private String receiverMobile;
	//收货人省份   varchar(40)     是
	private String receiverProvince;
	//收货人城市  varchar(50)     是
	private String receiverCity;
	//收货人县/区   varchar(50)    是
	private String receiverCounty;
	//收货详细地址   varchar(512)   是
	private String receiverAddress;
	//提交时间  date
	private Date gmtcommit;
	//货物名称  varchar(256)     是
	private String cargoname;
	//总重量(单位：kg)  double
	private Double totalWeight;
	//总体积(单位m3)  double
	private Double totalVolume;
	//总价格  double
	private Double totalPrice;
	//总件数  integer
	private Integer totalNumber;
	//支付方式   现付：CASH,到付：ARRIVE_PAYMENT、月结：Monthly_Statement   varchar(20)
	private String payType;
	//运输方式  定日达：DRD、普通零担：PTLD、偏线：PX、整车：ZC   varchar(20)       是
	private String transportType;
	//保价金额  double
	private Double insuranceValue;
	//上门接货  需要上门接货：YES、客户自送：NO  varchar(20)     是
	private String vistReceive;
	//送货方式  送货上门：DOORSTEP、客户自提：SELF_TAKE、送货上楼：UPSTAIR   varchar(20)     是
	private String deliveryType;
	//是否安装，安装：YES、不安装：NO
	private String install;
	//代收货款类型  三天返回货款：THREEDAY   varchar(20)
	private String codType;
	//代收货款   double
	private Double codValue;
	//签收回单  客户出库单传真返回：CUSTCOPY、客户出库单原件返回：CUSTORIGINAL、无需返单：NOBACK、到货签收单传真返回：SIGNCOPY、到货签收单原件返回：SIGNORIGINAL  varchar(20)
	private String backSignBill;
	//包装（直接用中文）   varchar(30)
	private String packageService;
	//等通知发货   是：YES、否：NO   varchar(10)
	private String waitNotifySend;
	//短信通知   是：YES、否：NO  varchar(10)
	private String smsNotify;
	//注意事项（备注）  varchar(1024)
	private String remark;
	//业务类型   根据客户需要提供   varchar(50)
	private String bizType;
	//订单状态					varchar(32)
	private String orderStatus;
	/**********客户提供**********/
	//预开单(1，预开单  0，不预开单)
	private Integer batchOrder;
	
	private String tmallOrderNo;
		
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getTransNo() {
		return transNo;
	}
	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}
	public Double getSmsNotifyPrice() {
		return smsNotifyPrice;
	}
	public void setSmsNotifyPrice(Double smsNotifyPrice) {
		this.smsNotifyPrice = smsNotifyPrice;
	}
	public String getFuelSurcharge() {
		return fuelSurcharge;
	}
	public void setFuelSurcharge(String fuelSurcharge) {
		this.fuelSurcharge = fuelSurcharge;
	}
	public Double getFuelSurchargePrice() {
		return fuelSurchargePrice;
	}
	public void setFuelSurchargePrice(Double fuelSurchargePrice) {
		this.fuelSurchargePrice = fuelSurchargePrice;
	}
	public Double getBackSignBillPrice() {
		return backSignBillPrice;
	}
	public void setBackSignBillPrice(Double backSignBillPrice) {
		this.backSignBillPrice = backSignBillPrice;
	}
	public Double getTransportPrice() {
		return transportPrice;
	}
	public void setTransportPrice(Double transportPrice) {
		this.transportPrice = transportPrice;
	}
	public Double getInsurancePrice() {
		return insurancePrice;
	}
	public void setInsurancePrice(Double insurancePrice) {
		this.insurancePrice = insurancePrice;
	}
	public Double getVistReceivePrice() {
		return vistReceivePrice;
	}
	public void setVistReceivePrice(Double vistReceivePrice) {
		this.vistReceivePrice = vistReceivePrice;
	}
	public Double getCodPrice() {
		return codPrice;
	}
	public void setCodPrice(Double codPrice) {
		this.codPrice = codPrice;
	}
	public Double getDeliveryPrice() {
		return deliveryPrice;
	}
	public void setDeliveryPrice(Double deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}
	public Double getWaitNotifySendPrice() {
		return waitNotifySendPrice;
	}
	public void setWaitNotifySendPrice(Double waitNotifySendPrice) {
		this.waitNotifySendPrice = waitNotifySendPrice;
	}
	public Double getPackageServicePrice() {
		return packageServicePrice;
	}
	public void setPackageServicePrice(Double packageServicePrice) {
		this.packageServicePrice = packageServicePrice;
	}
	public Double getMaterialCostPrice() {
		return materialCostPrice;
	}
	public void setMaterialCostPrice(Double materialCostPrice) {
		this.materialCostPrice = materialCostPrice;
	}
	public Double getOtherprice() {
		return otherprice;
	}
	public void setOtherprice(Double otherprice) {
		this.otherprice = otherprice;
	}
	public String getMaterialCost() {
		return materialCost;
	}
	public void setMaterialCost(String materialCost) {
		this.materialCost = materialCost;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	public String getCustomerOrderNo() {
		return customerOrderNo;
	}
	public void setCustomerOrderNo(String customerOrderNo) {
		this.customerOrderNo = customerOrderNo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCustomEbcuId() {
		return customEbcuId;
	}
	public void setCustomEbcuId(String customEbcuId) {
		this.customEbcuId = customEbcuId;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public String getBusinessNetworkNo() {
		return businessNetworkNo;
	}
	public void setBusinessNetworkNo(String businessNetworkNo) {
		this.businessNetworkNo = businessNetworkNo;
	}
	public String getSenderCompanyname() {
		return senderCompanyname;
	}
	public void setSenderCompanyname(String senderCompanyname) {
		this.senderCompanyname = senderCompanyname;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSenderPostcode() {
		return senderPostcode;
	}
	public void setSenderPostcode(String senderPostcode) {
		this.senderPostcode = senderPostcode;
	}
	public String getSenderPhone() {
		return senderPhone;
	}
	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}
	public String getSenderMobile() {
		return senderMobile;
	}
	public void setSenderMobile(String senderMobile) {
		this.senderMobile = senderMobile;
	}
	public String getSenderProvince() {
		return senderProvince;
	}
	public void setSenderProvince(String senderProvince) {
		this.senderProvince = senderProvince;
	}
	public String getSenderCity() {
		return senderCity;
	}
	public void setSenderCity(String senderCity) {
		this.senderCity = senderCity;
	}
	public String getSenderCounty() {
		return senderCounty;
	}
	public void setSenderCounty(String senderCounty) {
		this.senderCounty = senderCounty;
	}
	public String getSenderAddress() {
		return senderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}
	public String getReceiverCompanyname() {
		return receiverCompanyname;
	}
	public void setReceiverCompanyname(String receiverCompanyname) {
		this.receiverCompanyname = receiverCompanyname;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverPostcode() {
		return receiverPostcode;
	}
	public void setReceiverPostcode(String receiverPostcode) {
		this.receiverPostcode = receiverPostcode;
	}
	public String getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public String getReceiverMobile() {
		return receiverMobile;
	}
	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}
	public String getReceiverProvince() {
		return receiverProvince;
	}
	public void setReceiverProvince(String receiverProvince) {
		this.receiverProvince = receiverProvince;
	}
	public String getReceiverCity() {
		return receiverCity;
	}
	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}
	public String getReceiverCounty() {
		return receiverCounty;
	}
	public void setReceiverCounty(String receiverCounty) {
		this.receiverCounty = receiverCounty;
	}
	public String getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public Date getGmtcommit() {
		return gmtcommit;
	}
	public void setGmtcommit(Date gmtcommit) {
		this.gmtcommit = gmtcommit;
	}
	public String getCargoname() {
		return cargoname;
	}
	public void setCargoname(String cargoname) {
		this.cargoname = cargoname;
	}
	public Double getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(Double totalWeight) {
		this.totalWeight = totalWeight;
	}
	public Double getTotalVolume() {
		return totalVolume;
	}
	public void setTotalVolume(Double totalVolume) {
		this.totalVolume = totalVolume;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(Integer totalNumber) {
		this.totalNumber = totalNumber;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getTransportType() {
		return transportType;
	}
	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}
	public Double getInsuranceValue() {
		return insuranceValue;
	}
	public void setInsuranceValue(Double insuranceValue) {
		this.insuranceValue = insuranceValue;
	}
	public String getVistReceive() {
		return vistReceive;
	}
	public void setVistReceive(String vistReceive) {
		this.vistReceive = vistReceive;
	}
	public String getDeliveryType() {
		return deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
	public String getCodType() {
		return codType;
	}
	public void setCodType(String codType) {
		this.codType = codType;
	}
	public Double getCodValue() {
		return codValue;
	}
	public void setCodValue(Double codValue) {
		this.codValue = codValue;
	}
	public String getBackSignBill() {
		return backSignBill;
	}
	public void setBackSignBill(String backSignBill) {
		this.backSignBill = backSignBill;
	}
	public String getPackageService() {
		return packageService;
	}
	public void setPackageService(String packageService) {
		this.packageService = packageService;
	}
	public String getWaitNotifySend() {
		return waitNotifySend;
	}
	public void setWaitNotifySend(String waitNotifySend) {
		this.waitNotifySend = waitNotifySend;
	}
	public String getSmsNotify() {
		return smsNotify;
	}
	public void setSmsNotify(String smsNotify) {
		this.smsNotify = smsNotify;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getBizType() {
		return bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Double getInstallPrice() {
		return installPrice;
	}
	public void setInstallPrice(Double installPrice) {
		this.installPrice = installPrice;
	}
	public String getInstall() {
		return install;
	}
	public void setInstall(String install) {
		this.install = install;
	}
	public Integer getBatchOrder() {
		return batchOrder;
	}
	public void setBatchOrder(Integer batchOrder) {
		this.batchOrder = batchOrder;
	}
	public String getTmallOrderNo() {
		return tmallOrderNo;
	}
	public void setTmallOrderNo(String tmallOrderNo) {
		this.tmallOrderNo = tmallOrderNo;
	}
	
}
