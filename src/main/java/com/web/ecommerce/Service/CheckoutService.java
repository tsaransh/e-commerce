package com.web.ecommerce.Service;

import com.web.ecommerce.dto.Purchase;
import com.web.ecommerce.dto.PurchaseResponse;

;


public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
