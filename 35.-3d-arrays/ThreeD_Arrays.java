public class ThreeD_Arrays {
    public static void main(String[] args) {

        //String[] fruit = {"apple", "orange", "banana"};
        //String[] vegtables = {"potato", "onion", "carrot"};
        //String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "beef", "fish"}};

        groceries[0][1] = "pineapple";

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println("");
        }
    }
}