import java.util.Random;

public final class ax {
   public ag a;
   private int[] a;
   private int a;
   private int b;
   private int c;

   public ax(int var1, aq var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, byte var11) {
      this.b = var8;
      this.a = var9;
      this.c = var10;
      this.a = new int[var1];
      this.a = ag.a(var4, var5, var6, var7, var8, var1, var11);
      this.a.a(var2);
      ac var12;
      int[] var14 = (var12 = (ac)this.a).a();
      int[] var13 = var12.b();
      Random var15 = new Random();

      for(var5 = 0; var5 < var1; ++var5) {
         var14[var5 * 3] = var15.nextInt(var8 >> 1) - (var8 >> 2);
         var14[var5 * 3 + 1] = var15.nextInt(var8 >> 1) - (var8 >> 2);
         var14[var5 * 3 + 2] = var15.nextInt(var8 >> 1) - (var8 >> 2);
         var13[var5] = 0;
         this.a[var5] = var15.nextInt(var10) - (var10 >> 1) + this.a;
      }

   }

   public final void a() {
      ac var1;
      int[] var2 = (var1 = (ac)this.a).a();
      int[] var5 = var1.b();
      Random var3 = new Random();

      for(int var4 = 0; var4 < var5.length; ++var4) {
         var2[var4 * 3] = var3.nextInt(this.b >> 1) - (this.b >> 2);
         var2[var4 * 3 + 1] = var3.nextInt(this.b >> 1) - (this.b >> 2);
         var2[var4 * 3 + 2] = var3.nextInt(this.b >> 1) - (this.b >> 2);
         var5[var4] = 0;
         this.a[var4] = var3.nextInt(this.c) - (this.c >> 1) + this.a;
      }

   }

   public final void a(int var1) {
      int[] var2 = ((ac)this.a).b();
      int var3 = var1 * this.b / this.a;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         if (this.a[var4] > 0 && this.a[var4] < this.a) {
            var2[var4] += var3;
         } else {
            var2[var4] = 0;
         }

         int[] var10000 = this.a;
         var10000[var4] -= var1;
      }

   }
}
