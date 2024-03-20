package com.unicauca.pay.crudproducts.common.interfaces;

import com.unicauca.pay.crudproducts.common.Delivery;

public interface IDeliveryPlugin {

    /**
     * Establece el costo de envi�o en dolares.
     *
     * @param delivery envi�o
     * @return costo del envi�o
     */
    double calculateCost(Delivery delivery);

}
