public final class aj extends ar {
   private cu[] a = null;

   public final void a(cu var1) {
      if (this.a == null) {
         this.a = new cu[1];
         this.a[0] = var1;
      } else {
         cu[] var2 = new cu[this.a.length + 1];
         System.arraycopy(this.a, 0, var2, 0, this.a.length);
         var2[this.a.length] = var1;
         this.a = var2;
      }
   }

   public final void b(boolean var1) {
      ah var2;
      if (this.a != null) {
         if (this.c || var1) {
            if (this.b || var1) {
               if (this.a != null) {
                  this.c = this.a.c.a(this.b, this.c);
               } else {
                  this.c.a(this.b);
               }
            }

            var2 = this.b;

            while(true) {
               if (var2 == null) {
                  this.a.a(this.c.a(), this.c.b(), this.c.c(), 0);

                  for(var2 = this.b; var2 != null; var2 = var2.a) {
                     this.a.a(var2.a);
                  }

                  this.c = false;
                  this.b = false;
                  break;
               }

               var2.b(this.b || var1);
               var2 = var2.a;
            }
         }

         for(int var3 = this.a.length - 1; var3 >= 0; --var3) {
            if (this.a[var3].a()) {
               this.a[var3].c();
            }
         }
      }

      if (this.c || var1) {
         if (this.b || var1) {
            if (this.a != null) {
               this.c = this.a.c.a(this.b, this.c);
            } else {
               this.c.a(this.b);
            }
         }

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
}
