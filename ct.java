public final class ct extends y {
   private int g;
   private int h;
   private int i;

   public ct(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3, var4, var5, var6);
      this.g = var7 >> 1;
      this.h = var8 >> 1;
      this.i = var9 >> 1;
   }

   public final boolean a(int var1, int var2, int var3) {
      return this.b(var1, var2, var3) ? super.a(var1, var2, var3) : false;
   }

   public final boolean b(int var1, int var2, int var3) {
      return var1 > this.a + this.d - (this.g < 0 ? -this.g : this.g) && var1 < this.a + this.d + (this.g < 0 ? -this.g : this.g) && var2 > this.b + this.e - (this.h < 0 ? -this.h : this.h) && var2 < this.b + this.e + (this.h < 0 ? -this.h : this.h) && var3 > this.c + this.f - (this.i < 0 ? -this.i : this.i) && var3 < this.c + this.f + (this.i < 0 ? -this.i : this.i);
   }

   public final void a(int var1, int var2, int var3) {
      super.a(var1, var2, var3);
   }
}
