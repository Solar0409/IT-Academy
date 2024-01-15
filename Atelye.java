public class Atelye {
  public void dressWoman(Cloths[] cloths){
      for (Cloths s : cloths){
          if (s instanceof WomanCloths){
              ((WomanCloths) s ).dressWoman();
          }
      }

  }



    @Override
    public void dressMan() {
        System.out.println("Men's T-shirt size " + size + ", color " + color + ", price " + price);
    }

    @Override
    public void dressWoman() {
        System.out.println("Women's T-shirt size " + size + ", color " + color + ", price " + price);
    }

    public void dressMan(Cloths[] clothes) {
    }
}

public class Pants extends Clothing implements MensClothing, WomensClothing {
    // Similar implementation to TShirt
}

public class Skirt extends Clothing implements WomensClothing {
    // Similar implementation to TShirt, but only for WomensClothing
}

public class Tie extends Clothing implements MensClothing {
    // Similar implementation to TShirt, but only for MensClothing
}
