public class Cart implements HotelService {
    @Override
    public void performService() {
        System.out.println("Cart service is being performed.");
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Providing " + numberOfCarts + " luggage cart(s).");
    }
}