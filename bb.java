public final class bb extends y {
   private int g;
   private int h;
   private int i;
   private int j;

   public bb(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, 0, 0, 0);
      this.g = var7;
      this.a(var1, var2, var3);
   }

   public final boolean a(int var1, int var2, int var3) {
      return this.b(var1, var2, var3) ? true : super.a(var1, var2, var3);
   }

   public final boolean b(int var1, int var2, int var3) {
      return var1 - this.h < this.g && var1 - this.h > -this.g && var2 - this.i < this.g && var2 - this.i > -this.g && var3 - this.j < this.g && var3 - this.j > -this.g;
   }

   public final void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.h = var1 + this.d;
      this.i = var2 + this.e;
      this.j = var3 + this.f;
   }
}
