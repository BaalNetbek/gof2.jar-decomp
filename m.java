public final class m {
   private int a;
   private int b;
   private int c;
   private int d;

   public m(int var1, int var2) {
      this.a = var1;
      this.b = var2 - var1;
      this.c = 3072;
   }

   public final void a(int var1) {
      this.c += var1;
      this.c = this.c > 5120 ? 5120 : this.c;
      this.d = (((g.a(this.c) >> 1) + 2048) * this.b >> 12) + this.a;
   }

   public final void a(int var1, int var2) {
      this.a = var1;
      this.b = var2 - var1;
      this.c = 3072;
   }

   public final int a() {
      return this.d;
   }

   public final boolean a(boolean var1) {
      return this.c == 5120;
   }
}
