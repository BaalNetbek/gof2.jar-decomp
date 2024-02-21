public final class am {
   public cc a;
   public int a;

   private am(int var1, int var2, int var3, int var4) {
      this.a = new cc(0, 0, 0);
      this.a = 0;
   }

   public am() {
      this(0, 0, 0, 0);
   }

   public final void a(am var1) {
      if (this.a == 0) {
         this.b(var1);
      } else if (var1.a == 0) {
         this.b(this);
      } else {
         int var4 = var1.a.a - this.a.a;
         int var5 = var1.a.b - this.a.b;
         int var6 = var1.a.c - this.a.c;
         int var7;
         int var8 = (var7 = var1.a - this.a) * var7;
         int var9 = var4 * var4 + var5 * var5 + var6 * var6;
         if (var8 >= var9) {
            if (var7 >= 0) {
               this.a(var1.a, var1.a);
            } else {
               this.a(this.a, this.a);
            }
         } else {
            var8 = g.a((long)var9 << 12);
            var7 = (int)(((long)((var7 << 12) + var8) << 12) / (long)(var8 * 2));
            this.a(this.a.a + (int)((long)var7 * ((long)var4 << 12) >> 24), this.a.b + (int)((long)var7 * ((long)var5 << 12) >> 24), this.a.c + (int)((long)var7 * ((long)var6 << 12) >> 24), (var8 >> 12) + var1.a + this.a >> 1);
         }
      }

   }

   private void b(am var1) {
      this.a.a(var1.a);
      this.a = var1.a;
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.a.a = var1;
      this.a.b = var2;
      this.a.c = var3;
      this.a = var4;
   }

   private void a(cc var1, int var2) {
      this.a.a(var1);
      this.a = var2;
   }

   public final String toString() {
      return "AEBoundingSphere | x: " + this.a.a + " y: " + this.a.b + " z: " + this.a.c + " r: " + this.a;
   }
}
