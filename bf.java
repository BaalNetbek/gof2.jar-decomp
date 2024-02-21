public final class bf {
   private ck[] a;
   private boolean a = false;
   private int a = 0;

   public bf(int[] var1) {
      this.a = new ck[var1.length / 3];

      for(int var2 = 0; var2 < var1.length; var2 += 3) {
         this.a[var2 / 3] = new ck(var1[var2], var1[var2 + 1], var1[var2 + 2], this);
      }

   }

   public final void a() {
      this.a = null;
   }

   public final void a(cc var1) {
      this.a[0].l = var1.a;
      this.a[0].m = var1.b;
      this.a[0].n = var1.c;
   }

   public final void b() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1].g();
      }

      this.a = 0;
   }

   public final void a(boolean var1) {
      this.a = var1;
   }

   public final ck a(int var1) {
      return var1 < this.a.length ? this.a[var1] : null;
   }

   public final ck a() {
      return this.a < this.a.length ? this.a[this.a] : null;
   }

   public final ck b() {
      return this.a[this.a.length - 1];
   }

   public final int a() {
      return this.a;
   }

   public final void a(int var1) {
      if (this.a < this.a.length - 1) {
         this.a = 1;
      }

      this.a[0].d(false);
      this.a[0].m = true;
   }

   public final int b() {
      return this.a.length;
   }

   public final void a(int var1, int var2, int var3) {
      if (this.a < this.a.length && var1 - this.a[this.a].l < 2000 && var1 - this.a[this.a].l > -2000 && var2 - this.a[this.a].m < 2000 && var2 - this.a[this.a].m > -2000 && var3 - this.a[this.a].n < 2000 && var3 - this.a[this.a].n > -2000) {
         this.a[this.a].d(false);
         this.a[this.a].m = true;
         ++this.a;
         if (this.a && this.a > this.a.length - 1) {
            this.a = 0;

            for(var1 = 0; var1 < this.a.length; ++var1) {
               this.a[var1].g();
            }
         }

         if (this.a < this.a.length) {
            this.a[this.a].d(true);
         }
      }

   }

   public final boolean a() {
      return this.a;
   }

   public final bf a() {
      bf var1 = this.b();

      for(int var2 = 0; var2 < var1.a.length; ++var2) {
         if (this.a[var2].m) {
            var1.a[var2].m = true;
         }
      }

      var1.a = this.a;
      return var1;
   }

   public final bf b() {
      int[] var1 = new int[this.a.length * 3];

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         var1[var2 * 3] = this.a[var2].l;
         var1[var2 * 3 + 1] = this.a[var2].m;
         var1[var2 * 3 + 2] = this.a[var2].n;
      }

      bf var4;
      bf var10000 = var4 = new bf(var1);
      boolean var3 = this.a;
      var10000.a = var3;
      return var4;
   }
}
