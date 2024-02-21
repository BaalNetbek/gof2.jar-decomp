package Main;

public final class q extends Main.i {
   private boolean a;

   public q(int var1, int var2, int var3, int var4, String[] var5) {
      super(var1, var2, var3, var4, (String[])null, "");
      this.c = false;
      this.k = var1;
      this.a = false;
   }

   public final void a() {
      this.l();
      this.m();
   }

   protected final void n() {
   }

   public final void i() {
      if (this.a[this.g][this.h + 1] != null) {
         ++this.h;
      } else {
         this.i = 0;
         this.h = 0;
      }

      if (this.h > this.i + this.j) {
         ++this.i;
      }

      this.j();
   }

   public final void h() {
      if (this.h > 0) {
         --this.h;
      } else {
         int var1 = 1;

         while(this.a[this.g][var1++] != null) {
         }

         this.h = var1 - 2;
         this.i = var1 - 1 - this.j;
      }

      if (this.i > 0) {
         --this.i;
      }

      this.j();
   }

   public final void l() {
      for(int var1 = this.i; var1 < this.a[this.g].length && this.a[this.g][var1] != null && var1 < this.i + this.j + 1; ++var1) {
         this.a(this.a[this.g][var1], var1);
      }

   }

   protected final void a(Object var1, int var2) {
      .a.a(var1.toString(), this.k, this.l + (var2 - this.i) * this.m, this.e > 0 ? this.c - 7 : this.c, var2 == this.h && this.c);
   }

   public final int a() {
      return this.a != null && this.a[0] != null ? this.a[0] : 0;
   }
}
