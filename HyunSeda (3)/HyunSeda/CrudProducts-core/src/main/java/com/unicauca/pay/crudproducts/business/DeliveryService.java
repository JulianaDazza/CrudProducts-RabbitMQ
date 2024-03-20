package com.unicauca.pay.crudproducts.business;

import com.unicauca.pay.crudproducts.common.Delivery;
import com.unicauca.pay.crudproducts.common.interfaces.IDeliveryPlugin;
import com.unicauca.pay.crudproducts.manager.PluginManager;

public class DeliveryService {

    public double calculateDeliveryCost(Delivery deliveryData) throws Exception {

        String countryCode = deliveryData.getCountryCode();
        PluginManager manager = PluginManager.getInstance();
        IDeliveryPlugin plugin = manager.getDeliveryPlugin(countryCode);

        if (plugin == null) {
            throw new Exception("No hay un plugin disponible para el país indicado: " + countryCode);
        }

        return plugin.calculateCost(deliveryData);

    }

}
