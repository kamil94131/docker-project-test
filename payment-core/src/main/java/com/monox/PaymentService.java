package com.monox;

import java.util.Arrays;
import java.util.List;

public class PaymentService implements IPaymentService {

    @Override
    public List<String> getPayments() {
        return Arrays.asList("payment10", "payment9", "payment8", "payment7");
    }
}
