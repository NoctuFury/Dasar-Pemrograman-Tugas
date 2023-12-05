package dss;

public class Dewangga0 {
   public static void main(String[] args) {
      Dewangga bmi = new Dewangga();
      bmi.setHeight(190);
      bmi.setWeight(90);
      int result = (int)bmi.getStunting();
      System.out.println("=====BMI=====");
      System.out.println("Height = " + bmi.getHeight());
      System.out.println("Weight = " + bmi.getWeight());
      System.out.println("Result = " + Math.round(bmi.getStunting()));
      System.out.println("====Suggestion====");
      if (result == 0) {
         System.out.println("Kamu belum memasukkan data hasil rata rata berat dan tinggi anda");
      } else if ((double)result <= 18.5) {
         System.out.println("Kamu berada dalam kategori underweight");
      } else if (result <= 25) {
         System.out.println("Kamu berada dalam kategori normal");
      } else if (result <= 30) {
         System.out.println("Kamu berada dalam kategori overweight");
      }

   }
}
