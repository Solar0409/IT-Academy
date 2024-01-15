import static javax.swing.text.StyleConstants.Size;

public class Main {



    public static void main(String[] args) {
        Cloths[] clothes = {
                new TShirt(Size.M, 1000.0, "blue"),
                new Pants(Size.S, 1500.0, "black"),
                new Skirt(Size.XS, 800.0, "red"),
                new Tie(Size.L, 400.0, "green")
        };

        Atelye tailorShop = new Atelye();
        tailorShop.dressWoman(clothes);
        tailorShop.dressMan(clothes);
    }

    private static class TShirt extends Cloths {
        public TShirt(Object p0, double v, String blue) {
            super();
        }
    }
        System.out.println();
    }
