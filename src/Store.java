public class Store {
    public static void main(String[] args) {
       
        final int PRICE_PRODUCT_1= 15;
        final int PRICE_PRODUCT_2 = 10;
        final int PRICE_PRODUCT_3 = 5;

        final int QUANTITY_PRODUCT_1= 2;
        final int QUANTITY_PRODUCT_2= 3;
        final int QUANTITY_PRODUCT_3= 4;

        final int PROMEDIO_VENTAS= 50;

        int[] productsPrices = {PRICE_PRODUCT_1, PRICE_PRODUCT_2, PRICE_PRODUCT_3};
        int[] productsQuantities = {QUANTITY_PRODUCT_1, QUANTITY_PRODUCT_2, QUANTITY_PRODUCT_3};

         int totalSales = 0;

        for (int i = 0; i<productsPrices.length; i++ ){
            totalSales += productsPrices[i]* productsQuantities[i];
        }


        if (totalSales > PROMEDIO_VENTAS) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
