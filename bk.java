public final class bk extends ag {
   private ax a;
   private boolean d;
   private boolean e;

   private bk(aq var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, byte var10) {
      this.a = new ax(var6, var1, 256, var2, var3, var4, var5, var9, var7, var8, (byte)2);
      this.a.a.a(2);
      this.d = true;
      this.e = var6 > 1;
   }

   public bk(aq var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this(var1, 33, 225, 63, 255, 10, 700, 100, 500, (byte)2);
   }

   public final void c(int var1, int var2, int var3) {
      this.a.a.c(var1, var2, var3);
   }

   public final void c(cc var1) {
      int var4 = var1.c;
      int var3 = var1.b;
      int var2 = var1.a;
      this.a.a.c(var2, var3, var4);
      this.a.a();
      this.d = false;
   }

   public final void a(long var1) {
      if (!this.d) {
         this.a.a((int)var1);
      }
   }

   public final void b() {
      if (!this.d) {
         at.a.a((ah)this.a.a);
      }
   }

   public final ah a() {
      return null;
   }

   public final void a(aq var1) {
   }

   public final void a() {
      ax var1;
      if ((var1 = this.a).a != null) {
         var1.a.a();
      }

      var1.a = null;
   }
}
