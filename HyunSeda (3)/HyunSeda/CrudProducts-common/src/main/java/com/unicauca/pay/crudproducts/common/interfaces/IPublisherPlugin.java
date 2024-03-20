package com.unicauca.pay.crudproducts.common.interfaces;

import java.util.Properties;

/**
 *
 * @author ahurtado, wpantoja
 */
public interface IPublisherPlugin {

    /**
     *
     * @param msg Mensaje a ser publicado a trav�s de un servicio de mensajer�a
     */
    public void publish(String msg);

    public void setProperties(Properties publisherProperties);
}
