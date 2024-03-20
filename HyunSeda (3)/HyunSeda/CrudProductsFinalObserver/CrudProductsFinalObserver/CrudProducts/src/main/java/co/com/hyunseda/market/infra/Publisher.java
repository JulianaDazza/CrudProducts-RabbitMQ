package co.com.hyunseda.market.infra;

import com.unicauca.pay.crudproducts.common.interfaces.IPublisherPlugin;
import com.unicauca.pay.crudproducts.manager.PluginManager;

/**
 *
 * @author ahurtado, wpantoja
 */
public class Publisher {

    public Publisher() {
    }

    public void publish(String msg) {
        PluginManager manager = PluginManager.getInstance();
        IPublisherPlugin publisher = manager.getPublisherPlugin("publisherTech");
        publisher.publish(msg);
        System.out.println("PUBLICANDO EL MENSAJE"+ msg);
        System.out.println("PUBLICANDO EL MENSAJE"+ msg);
        System.out.println("PUBLICANDO EL MENSAJE"+ msg);
        
    }
}
