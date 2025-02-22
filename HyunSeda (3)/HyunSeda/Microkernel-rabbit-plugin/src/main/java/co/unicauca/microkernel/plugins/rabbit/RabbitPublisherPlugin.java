package co.unicauca.microkernel.plugins.rabbit;

import com.unicauca.pay.crudproducts.common.interfaces.IPublisherPlugin;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Properties;

/**
 *
 * @author ahurtado,wpantoja
 */
public class RabbitPublisherPlugin implements IPublisherPlugin {

    private Properties properties;

    @Override
    public void publish(String msg) {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(properties.getProperty("hostName"));
        try {
            com.rabbitmq.client.Connection connection = factory.newConnection();
            com.rabbitmq.client.Channel channel = connection.createChannel();
            channel.queueDeclare(properties.getProperty("queueName"), false, false, false, null);
            channel.basicPublish("", properties.getProperty("queueName"), null, msg.getBytes(StandardCharsets.UTF_8));
            System.out.println(" [x] Sent '" + msg + "'");
        } catch (IOException | TimeoutException ex) {
            Logger.getLogger(RabbitPublisherPlugin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
