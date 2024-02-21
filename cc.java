public final class cc {
   public int a;
   public int b;
   public int c;

   public cc(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public cc() {
      this.a = this.b = this.c = 0;
   }

   public cc(cc var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
   }

   public final void a(cc var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
   }

   public final void a(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final int a(cc var1) {
      return (this.a * var1.a >> 12) + (this.b * var1.b >> 12) + (this.c * var1.c >> 12);
   }

   public final int b(cc var1) {
      return (int)(((long)this.a * (long)var1.a >> 12) + ((long)this.b * (long)var1.b >> 12) + ((long)this.c * (long)var1.c >> 12));
   }

   public final cc a(cc var1, cc var2) {
      var2.a = (this.b * var1.c >> 12) - (this.c * var1.b >> 12);
      var2.b = (this.c * var1.a >> 12) - (this.a * var1.c >> 12);
      var2.c = (this.a * var1.b >> 12) - (this.b * var1.a >> 12);
      return var2;
   }

   public final cc b(cc var1, cc var2) {
      var2.a = this.a + var1.a;
      var2.b = this.b + var1.b;
      var2.c = this.c + var1.c;
      return var2;
   }

   public final void b(cc var1) {
      this.a += var1.a;
      this.b += var1.b;
      this.c += var1.c;
   }

   public final cc c(cc var1, cc var2) {
      var2.a = this.a - var1.a;
      var2.b = this.b - var1.b;
      var2.c = this.c - var1.c;
      return var2;
   }

   public final void c(cc var1) {
      this.a -= var1.a;
      this.b -= var1.b;
      this.c -= var1.c;
   }

   public final void a(int var1) {
      this.a = (int)((long)var1 * (long)this.a >> 12);
      this.b = (int)((long)var1 * (long)this.b >> 12);
      this.c = (int)((long)var1 * (long)this.c >> 12);
   }

   public final void a() {
      int var3 = g.d((int)(((long)this.a * (long)this.a >> 12) + ((long)this.b * (long)this.b >> 12) + ((long)this.c * (long)this.c >> 12)));
      this.a = this.a * var3 >> 12;
      this.b = this.b * var3 >> 12;
      this.c = this.c * var3 >> 12;
   }

   public final int a() {
      return g.a(((long)this.a * (long)this.a >> 12) + ((long)this.b * (long)this.b >> 12) + ((long)this.c * (long)this.c >> 12));
   }

   public final String toString() {
      return "AEVector3D | " + this.a + ",\t" + this.b + ",\t" + this.c;
   }
}
