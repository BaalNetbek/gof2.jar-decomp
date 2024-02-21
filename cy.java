public abstract class cy extends ah {
   private static cc a = new cc();
   protected int e = 0;

   public void b(boolean var1) {
      if (this.b || var1) {
         if (this.a != null) {
            this.c = this.a.c.a(this.b, this.c);
         } else {
            this.c.a(this.b);
         }

         int var2 = g.b(g.b(g.e((a = this.c.e(a)).a), g.e(a.b)), g.e(a.c)) * this.e >> 12;
         a = this.c.a(a);
         this.a.a(a.a, a.b, a.c, var2);
         this.b = false;
         this.c = false;
      }

   }

   public final void g(int var1) {
      this.e = 5000;
   }

   protected final String a(String var1, int var2) {
      for(int var3 = 0; var3 < var2; ++var3) {
         var1 = var1 + "  ";
      }

      return var1 + "\n";
   }
}
