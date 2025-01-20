package gr.aueb.cf.ch16.interfaces;

import java.time.LocalDateTime;

public interface IOrderService {
    void insertOrder(String address, String lastname, String firstname, String phoneNumber,
                     LocalDateTime timestamp, int quantity);

    void updateOrder(Long id, String address, String lastname, String firstname, String phoneNumber,
                     LocalDateTime timestamp, int quantity);

    void deleteOrder(Long id);
    String getOrder(Long id);
}
