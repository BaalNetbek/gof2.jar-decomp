public final class t {
   private static int[] a = new int[]{80, 255, 95, 254, 32, 240, 63, 239};
   private int a = 60;
   private int[] b;
   private int[] c;
   private int[] d;
   private ag a;
   private cc a = new cc();
   private boolean a = false;

   public t(int var1) {
      int var2 = var1 == 0 ? 16 : 13;
      this.a = ag.a(0, var2, (byte)2);
      this.a.a(bo.a(0));
      this.a.a(2);
      this.c = new int[var2 * 12];
      this.b = new int[var2 * 12];
      int var3 = var1 << 2;
      int var4 = a[var3 + 1];
      int var5 = a[var3 + 3];
      this.d = new int[var2 * 8];

      for(var2 = 0; var2 < this.d.length; var2 += 8) {
         this.d[var2] = a[var3];
         this.d[var2 + 1] = var4;
         this.d[var2 + 2] = a[var3 + 2];
         this.d[var2 + 3] = var4;
         this.d[var2 + 4] = a[var3 + 2];
         this.d[var2 + 5] = var5;
         this.d[var2 + 6] = a[var3];
         this.d[var2 + 7] = var5;
         if (var1 == 1) {
            --var4;
            --var5;
         } else {
            var4 -= 2;
            var5 -= 2;
         }
      }

   }

   public final void a() {
      this.a.a();
      this.a = null;
   }

   public final void a(int var1) {
      this.a = var1;
   }

   public final void a(cc var1) {
      if (this.a) {
         this.a.a(var1);
         this.a = false;
      }

      int var8 = this.a.c;
      int var7 = this.a.b;
      int var6 = this.a.a;
      int var5 = var1.c;
      int var4 = var1.b;
      int var3 = var1.a;
      t var2 = this;
      this.c[0] = var3 - this.a;
      this.c[1] = var4;
      this.c[2] = var5;
      this.c[3] = var3 + this.a;
      this.c[4] = var4;
      this.c[5] = var5;
      this.c[6] = var6 + this.a;
      this.c[7] = var7;
      this.c[8] = var8;
      this.c[9] = var6 - this.a;
      this.c[10] = var7;
      this.c[11] = var8;

      for(var6 = this.c.length - 1; var6 >= 23; var6 -= 12) {
         var2.c[var6] = var2.c[var6 - 12];
         var2.c[var6 - 1] = var2.c[var6 - 13];
         var2.c[var6 - 2] = var2.c[var6 - 14];
         var2.c[var6 - 3] = var2.c[var6 - 15];
         var2.c[var6 - 4] = var2.c[var6 - 16];
         var2.c[var6 - 5] = var2.c[var6 - 17];
         var2.c[var6 - 6] = var2.c[var6 - 18];
         var2.c[var6 - 7] = var2.c[var6 - 19];
         var2.c[var6 - 8] = var2.c[var6 - 20];
         var2.c[var6 - 9] = var2.c[var6 - 21];
         var2.c[var6 - 10] = var2.c[var6 - 22];
         var2.c[var6 - 11] = var2.c[var6 - 23];
      }

      for(var6 = 0; var6 < var2.c.length; var6 += 3) {
         var2.b[var6] = var2.c[var6] - var3;
         var2.b[var6 + 1] = var2.c[var6 + 1] - var4;
         var2.b[var6 + 2] = var2.c[var6 + 2] - var5;
      }

      var2.a.c(var3, var4, var5);
      ((k)var2.a).a(var2.b, var2.d);
      this.a.a(var1);
   }

   public final void b(cc var1) {
      for(int var2 = 0; var2 < this.c.length; var2 += 3) {
         this.c[var2] = var1.a;
         this.c[var2 + 1] = var1.b;
         this.c[var2 + 2] = var1.c;
      }

      this.a.a(var1);
      this.a = true;
   }

   public final void b() {
      at.a.a((ah)this.a);
   }
}
