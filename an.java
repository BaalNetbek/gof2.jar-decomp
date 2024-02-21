import javax.microedition.lcdui.Image;

public final class an {
   private bq[] a;
   private bq a;
   private String[] a;
   private byte[] a;
   private long a;
   private int a;
   private String a;
   private long b;
   private Image[] a;
   private int b;

   public final void a() {
      this.a = null;
      this.a = null;
   }

   public final void a(bq[] var1) {
      this.a = var1;
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2].a(this);
         }
      }

   }

   public final void a(bq var1) {
      this.a = var1;
   }

   public final bq a(int var1) {
      return this.a[var1];
   }

   public final void b() {
      this.b = 501L;
   }

   public final void a(long var1, long var3, cr var5) {
      int var13;
      if (this.a == null) {
         this.b += var3;
         if (this.b > 500L) {
            this.b = 0L;
            cr var2 = var5;
            long var8 = var1;
            an var11 = this;
            if (this.a == null) {
               return;
            }

            var13 = 0;

            while(true) {
               if (var13 >= var11.a.length) {
                  return;
               }

               if (var11.a[var13].a(var8, var2)) {
                  int var12;
                  if ((var12 = var11.a[var13].b()) >= 21) {
                     int var4 = var12 == 24 ? 2 : (var12 == 23 ? 0 : (var12 == 21 ? 3 : 1));
                     var11.a = e.a(true, var4);
                  } else {
                     var11.a = ad.a[var12];
                  }

                  var11.a = e.a(var11.a);
                  var11.b = var12 == 19 ? 3 : 1;
                  var11.a = q.a(at.a.a(var11.a[var13].a()), at.f - 10, var11.b, e.c + 3, e.d + 3);
                  var11.a = var8;
                  var11.a = var11.a.length * (int)(2000.0F * (float)at.f / 240.0F) + 1500;
                  break;
               }

               ++var13;
            }
         }
      } else if (var1 > this.a + 2000L) {
         try {
            var13 = this.a.b();
            this.a = at.a.a(var13 + 819);
            a.a(this.a, 0, 0, at.f - 1, g.b(e.d + 21, (this.a.length + 2) * q.a()), true);
         } catch (Exception var10) {
            var10.printStackTrace();
         }

         e.a(this.a, 5, 17, 0);
         q.a(this.a, 7, 17, this.b, e.c + 3, e.d + 3);
         if (var1 > this.a + 2000L + (long)this.a) {
            this.a = 0L;
            this.a.a();
            this.a = null;
         }
      }

   }
}
