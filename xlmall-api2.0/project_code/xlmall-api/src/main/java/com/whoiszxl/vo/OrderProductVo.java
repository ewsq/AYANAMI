package com.whoiszxl.vo;

import java.math.BigDecimal;
import java.util.List;

import com.whoiszxl.entity.Shipping;

/**
 * 
 * @author whoiszxl
 * 订单中商品的vo对象
 */
public class OrderProductVo {

	/**
	 * 订单中商品的vo集合
	 */
	private List<OrderItemVo> orderItemVoList;
	
	/**
	 * 订单中商品总价
	 */
    private BigDecimal productTotalPrice;
    
    /**
     * 订单缩略图
     */
    private String imageHost;
    
    /**
     * 一個默認地址
     */
    private ShippingVo shippingVo;
    

	public ShippingVo getShippingVo() {
		return shippingVo;
	}

	public void setShippingVo(ShippingVo shippingVo) {
		this.shippingVo = shippingVo;
	}

	public List<OrderItemVo> getOrderItemVoList() {
		return orderItemVoList;
	}

	public void setOrderItemVoList(List<OrderItemVo> orderItemVoList) {
		this.orderItemVoList = orderItemVoList;
	}

	public BigDecimal getProductTotalPrice() {
		return productTotalPrice;
	}

	public void setProductTotalPrice(BigDecimal productTotalPrice) {
		this.productTotalPrice = productTotalPrice;
	}

	public String getImageHost() {
		return imageHost;
	}

	public void setImageHost(String imageHost) {
		this.imageHost = imageHost;
	}
    
    
    
    
}
