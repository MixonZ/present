public class InPersonPayment implements PaymentInterface {
    @Override
    public void payForOrder() {
        //Client pay logic
    }
}

public class OnlinePayment implements PaymentInterface {
    @Override
    public void payForOrder() {
        //Client pay logic
    }
}

public class WalkInOrder implements OrderInterface {
    @Override
    public void placeOrder() {
        //Client order logic
    }
}

public class TelephoneOrder implements OrderInterface {
    @Override
    public void placeOrder() {
        //Client order logic
    }
}

public class OnlineOrder implements OrderInterface {
    @Override
    public void placeOrder() {
        //Client order logic
    }
}
