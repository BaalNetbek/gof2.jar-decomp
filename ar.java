public class ar extends ah {
   protected ah b = null;

   public final void a(ah var1) {
      if (var1 != null && var1 != this) {
         ah var3 = var1;
         ah var2 = this.b;

         boolean var10000;
         while(true) {
            if (var2 == null) {
               var10000 = false;
               break;
            }

            if (var2 == var3) {
               var10000 = true;
               break;
            }

            var2 = var2.a;
         }

         if (!var10000) {
            var1.a = this;
            var1.a = this.b;
            this.b = var1;
         }
      }

   }

   public final void b(ah var1) {
      if (var1 != null && this.b != null) {
         if (var1 == this.b) {
            this.b = this.b.a;
            var1.a = null;
            var1.a = null;
         } else {
            for(ah var2 = this.b; var2 != null; var2 = var2.a) {
               if (var2.a == var1) {
                  var2.a = var2.a.a;
                  var1.a = null;
                  var1.a = null;
                  return;
               }
            }

         }
      }
   }

   public final ah a() {
      return this.b;
   }

   public final void a(ap var1, af var2) {
      if (this.a) {
         ah var3;
         switch(var1.a(this.a)) {
         case 1:
            for(var3 = this.b; var3 != null; var3 = var3.a) {
               var3.a(var1, var2);
            }

            return;
         case 2:
            for(var3 = this.b; var3 != null; var3 = var3.a) {
               var3.b(var1, var2);
            }

            return;
         }
      }

   }

   public final void b(ap var1, af var2) {
      if (this.a) {
         for(ah var3 = this.b; var3 != null; var3 = var3.a) {
            var3.b(var1, var2);
         }
      }

   }

   public void b(boolean var1) {
      if (this.c || var1) {
         if (this.b || var1) {
            if (this.a != null) {
               this.c = this.a.c.a(this.b, this.c);
            } else {
               this.c.a(this.b);
            }
         }

         ah var2;
         for(var2 = this.b; var2 != null; var2 = var2.a) {
            var2.b(this.b || var1);
         }

         this.a.a(this.c.a(), this.c.b(), this.c.c(), 0);

         for(var2 = this.b; var2 != null; var2 = var2.a) {
            this.a.a(var2.a);
         }

         this.c = false;
         this.b = false;
      }

   }

   protected final String a(String var1, int var2) {
      for(int var3 = 0; var3 < var2; ++var3) {
         var1 = var1 + "  ";
      }

      var1 = var1 + " |\t" + this.a.a.a + "\t\t" + this.a.a.b + "\t\t" + this.a.a.c + "\t\t" + this.a.a + "\n";
      ++var2;

      for(ah var4 = this.b; var4 != null; var4 = var4.a) {
         var1 = var4.a(var1, var2);
      }

      return var1;
   }

   public final void a(int var1, int var2) {
      for(ah var3 = this.b; var3 != null; var3 = var3.a) {
         var3.a(var1, var2);
      }

   }

   public final void a(byte var1) {
      for(ah var2 = this.b; var2 != null; var2 = var2.a) {
         var2.a(var1);
      }

   }

   public final void e() {
      for(ah var1 = this.b; var1 != null; var1 = var1.a) {
         var1.e();
      }

   }

   public final boolean b() {
      boolean var1 = false;

      for(ah var2 = this.b; var2 != null; var2 = var2.a) {
         var1 |= var2.b();
      }

      return var1;
   }
}
