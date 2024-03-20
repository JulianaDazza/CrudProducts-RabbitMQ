package co.unicauca.subscriber.deliveryproducts.infra;

/**
 *
 * @author ahurtado, wpantoja
 */
public interface ISubscriber {

    public void onMessage(String msg);
}
