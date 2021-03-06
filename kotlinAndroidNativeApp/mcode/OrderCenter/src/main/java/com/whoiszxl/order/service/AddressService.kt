package com.whoiszxl.order.service

import com.whoiszxl.order.data.protocol.AddressList
import com.whoiszxl.order.data.protocol.ShipAddress
import rx.Observable

interface AddressService {
    /**
     * 添加收货地址
     */
    fun addressAdd(
            authorization: String,
            receiverName: String,
            receiverProvince: String,
            receiverCity: String,
            receiverAddress: String,
            receiverPhone: String,
            receiverZip: String): Observable<Boolean>

    /**
     * 删除收货地址
     */
    fun addressDelete(
            authorization: String,
            shippingId: Int
    ): Observable<Boolean>

    /**
     * 修改收货地址
     */
    fun addressUpdate(
            authorization: String,
            receiverName: String,
            receiverProvince: String,
            receiverCity: String,
            receiverAddress: String,
            receiverPhone: String,
            receiverZip: String,
            id: String): Observable<Boolean>

    /**
     * 查询收货地址列表
     */
    fun addressList(
            authorization: String,
            pageSize: Int
    ): Observable<AddressList>


    /**
     * 通过id查询地址
     */
    fun addressSelects(
            authorization: String,
            shippingId: Int
    ): Observable<ShipAddress>

    /**
     * 设置默认地址
     */
    fun addressSetDefault(
            authorization: String,
            shippingId: Int
    ): Observable<Boolean>
}