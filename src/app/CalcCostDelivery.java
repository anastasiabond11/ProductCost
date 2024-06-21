package app;

public class CalcCostDelivery extends CalcCostBase {
    private final static double deliveryPrice = 7.0; // Призначення значення вартості доставки

    @Override
    public double calcCost(Product product) {
        return super.calcCost(product) + deliveryPrice;
    }
}
