public final class bi extends bx {
   private boolean m;

   public bi(int var1, ag var2, int var3, int var4, int var5, boolean var6) {
      super(15, var2, var3, var4, var5);
      this.b(var6);
      if (var6) {
         this.a = new y[1];
         this.a[0] = new bb(var3, var4, var5, 0, 0, 0, 15000);
         this.a.f(100);
         this.a.a(1, 20);
         this.a.a((byte)2);
      }

      this.m = false;
   }

   public final void g() {
      if (!this.m) {
         this.a.f(50);
         this.a.a(21, 79);
         this.a.a((byte)1);
         this.m = true;
      }

   }

   public final void a(int var1, int var2, int var3) {
      this.l = var1;
      this.m = var2;
      this.n = var3;
      this.a.c(var1, var2, var3);
   }

   public final void a(long var1) {
      if (this.a.i() == 79) {
         this.a.f(100);
         this.a.a(38, 60);
         this.a.a((byte)2);
      }

      super.a(var1);
   }
}
