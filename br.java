public final class br {
   private int a;
   private int b;
   private int c;
   private db a;

   public br(int var1, int var2, db var3) {
      this.a = var1;
      this.b = var2;
      this.a = var3;
   }

   public br(int var1, int var2, int var3, db var4) {
      this(var1, var2, var4);
      this.c = var3;
   }

   public final boolean a(int var1) {
      int var2;
      int var3;
      p[] var4;
      p[] var5;
      p[] var6;
      switch(this.a) {
      case 0:
         if (this.a.b() == 0) {
            return true;
         }

         return false;
      case 1:
         if (this.a.a()[this.b].e()) {
            return true;
         }

         return false;
      case 2:
         if (this.a.a().b().m) {
            return true;
         }

         return false;
      case 3:
         if (var1 > this.b) {
            return true;
         }

         return false;
      case 4:
         if (this.a.a()[this.b].b()) {
            return true;
         }

         return false;
      case 5:
         if (this.a.c() == 0) {
            return true;
         }

         return false;
      case 6:
         if (this.a.a()[this.b].e()) {
            return true;
         }

         return false;
      case 7:
         var6 = this.a.a();
         var1 = 0;

         for(var3 = 0; var3 < this.b; ++var3) {
            if (var6[var3].e()) {
               ++var1;
            }
         }

         if (var1 == this.b) {
            return true;
         }

         return false;
      case 8:
         var5 = this.a.c();
         var1 = 0;

         for(var2 = 0; var2 < var5.length; ++var2) {
            if (var5[var2].e()) {
               ++var1;
            }
         }

         if (var1 > this.b) {
            return true;
         }

         return false;
      case 9:
         var6 = this.a.c();

         for(var1 = 0; var1 < var6.length; ++var1) {
            if (var1 >= this.b) {
               if (0 >= this.b) {
                  return true;
               }

               return false;
            }
         }

         return false;
      case 10:
         var4 = this.a.c();

         for(var2 = 0; var2 < var4.length; ++var2) {
            if (var2 >= this.b) {
               return false;
            }
         }

         return false;
      case 11:
         return ((bh)this.a.a()[this.b]).a();
      case 12:
         return ((bh)this.a.a()[this.b]).h();
      case 13:
         return false;
      case 14:
         if (this.a.a() >= this.b) {
            return true;
         }

         return false;
      case 15:
         return this.a.a()[this.b].a.d();
      case 16:
         var6 = this.a.a();

         for(var1 = 0; var1 < var6.length; ++var1) {
            if (!((bh)var6[var1]).a()) {
               return false;
            }
         }

         return true;
      case 17:
         var4 = this.a.a();

         for(var2 = 0; var2 < var4.length; ++var2) {
            if (((bh)var4[var2]).h()) {
               return true;
            }
         }

         return false;
      case 18:
         var5 = this.a.a();
         var1 = 0;

         for(var2 = this.b; var2 < this.c; ++var2) {
            if (var5[var2].e()) {
               ++var1;
            }
         }

         if (var1 == this.c - this.b) {
            return true;
         }

         return false;
      case 19:
         return this.a.b();
      case 20:
      case 21:
         var4 = this.a.a();
         var2 = 0;

         for(var3 = this.b; var3 < this.c; ++var3) {
            if (var4[var3].e() && var4[var3].d == 8) {
               ++var2;
            }
         }

         if (this.a == 20) {
            if (var2 == this.c - this.b && this.a.c > this.a.b) {
               return true;
            }

            return false;
         } else {
            if (var2 == this.c - this.b && this.a.c <= this.a.b) {
               return true;
            }

            return false;
         }
      case 22:
         if (this.a.a()[this.a.a().length - 1].b()) {
            return true;
         }

         return false;
      case 23:
         return this.a.a()[this.b].j;
      case 24:
      default:
         return false;
      case 25:
         if (this.a.a()[this.b].a == 0) {
            return true;
         } else {
            return false;
         }
      }
   }

   public final boolean a() {
      return this.a == 3;
   }
}
