package dss;

public class Dewangga {
   double Height;
   int Weight;

   void setHeight(int Penjumlahan) {
      this.Height += (double)Penjumlahan;
   }

   double getHeight() {
      return this.Height / 100.0D;
   }

   void setWeight(int Penjumlahan) {
      this.Weight += Penjumlahan;
   }

   int getWeight() {
      return this.Weight;
   }

   double getStunting() {
      return (double)this.Weight / (this.Height / 100.0D * this.Height / 100.0D);
   }
}
