public final class h {
   int a;
   private int f;
   public int[] a;
   public int b;
   public boolean a;
   public int c;
   public int d;
   public String a;
   int e;

   public h(int var1) {
      this.a = var1;
      this.f = ad.a()[var1].b() == 1 ? 10 : 1;
      this.d = -1;
      v var2 = ad.a()[var1];
      int[] var3 = ad.a()[var1].b();
      if (var2.a() != null) {
         this.a = new int[var2.a().length];

         for(int var4 = 0; var4 < this.a.length; ++var4) {
            this.a[var4] = var3[var4];
         }
      }

      this.a = false;
      this.c = 0;
      this.e = this.f;
   }

   public final void a(v var1, int var2, int var3) {
      if (this.d < 0 && var3 >= 0) {
         this.d = var3;
         this.a = bl.a().a();
      }

      var1.e(0);
      int[] var5;
      if ((var5 = this.a()) != null) {
         for(int var4 = 0; var4 < var5.length; ++var4) {
            if (var5[var4] == var1.a()) {
               int[] var10000 = this.a;
               var10000[var4] -= var2;
               this.b += var1.e() * var2;
               return;
            }
         }
      }

   }

   public final boolean a() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         if (this.a[var1] > 0) {
            return false;
         }
      }

      return true;
   }

   public final int a() {
      return this.a;
   }

   public final int[] a() {
      return ad.a()[this.a].a();
   }

   private int[] b() {
      return ad.a()[this.a].b();
   }

   public final int a(int var1) {
      int[] var2 = this.a();
      int[] var3 = this.b();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         if (var2[var4] == var1) {
            return var3[var4];
         }
      }

      return 0;
   }

   public final int b(int var1) {
      return this.a(var1) - this.c(var1);
   }

   public final int c(int var1) {
      int[] var2 = this.a();

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if (var2[var3] == var1) {
            return this.a[var3];
         }
      }

      return 0;
   }

   public final float a() {
      float var1 = 0.0F;
      int[] var2 = this.b();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         var1 += (float)(var2[var3] - this.a[var3]) / (float)var2[var3] / (float)this.a.length;
      }

      return var1;
   }

   public final int b() {
      return this.d;
   }

   public final String a() {
      return this.a;
   }

   public final int c() {
      return this.f;
   }

   public final int d() {
      return this.e;
   }

   public final void a() {
      this.a = true;
   }

   public final boolean b() {
      return this.b == 0;
   }

   public final void b() {
      ++this.c;
      bl.m(1);
      int[] var1 = this.b();

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = var1[var2];
      }

      this.b = 0;
      this.d = -1;
      this.e = this.f;
   }
}
