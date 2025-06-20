package badri.sandbox.spring.LessonOne;

public class OrderService {
    private FoodProvider foodProvider;

    public OrderService(FoodProvider foodProvider) {
        this.foodProvider = foodProvider;
    }

    public void processOrder() {
        String food = foodProvider.getFood();
        System.out.println("Order processed: " + food);
    }
}
