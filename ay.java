public final class ay {
   private int a;
   private int b;
   private int c;
   private int d;
   private String[] a;
   private int e;
   private boolean a;
   private boolean b;

   public ay(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = at.g / 2;
   }

   public ay() {
      this(at.f < 176 ? 10 : 20, at.g / 2, at.f - (at.f < 176 ? 20 : 40));
   }

   public final void a(String var1) {
      this.a(var1, false);
   }

   public final void a(String var1, boolean var2) {
      this.a = true;
      this.b = var2;
      this.a = q.a(var1, this.c - 14);
      this.b = (at.g >> 1) - (q.a(this.a) + 2 * q.a() + 4 >> 1);
      this.e = this.b + this.a.length * q.a() + 4 + 14 + 2;
      this.d = this.e + q.a() + 7 - this.b;
   }

   public final boolean a() {
      return this.b ? this.a : false;
   }

   public final void a() {
      if (!this.a && this.b) {
         this.a = true;
      }

   }

   public final void b() {
      if (this.a && this.b) {
         this.a = false;
      }

   }

   public final void c() {
      a.c();
      a.a("", this.a, this.b, this.c, this.d, true);
      q.a((String[])this.a, this.a + 7, this.b + 14 + 4, 0);
      at.a.setColor(a.a);
      if (this.b) {
         q.a((String)at.a.a(38), this.a + this.c / 3, this.e, this.a ? 2 : 1, 24);
         q.a((String)at.a.a(39), this.a + this.c - this.c / 3, this.e, this.a ? 1 : 2, 24);
      } else {
         int var10001 = this.a + this.c / 2;
         String var1 = "OK";
         q.b("OK", var10001 - q.a("OK", 0) / 2, this.e, 2);
      }
   }
}
