import javax.microedition.lcdui.Image;

public final class da {
   private int[] a;
   private Image a;
   public static cc a;
   public static cc b;

   public da() {
      a = new cc();
      b = new cc();

      try {
         String var1 = "/data/interface/hud_crosshair_png24.png";
         this.a = ai.a("/data/interface/hud_crosshair_png24.png", true);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      this.a = new int[3];
   }

   public final void a(cm var1, ap var2) {
      this.a[0] = var1.a() + 5 * var1.d();
      this.a[1] = var1.b() + 5 * var1.e();
      this.a[2] = var1.c() + 5 * var1.f();
      a.a(this.a[0], this.a[1], this.a[2]);
      b.a(a);
      var2.a(b);
   }

   public final void a() {
      this.a = null;
      b = null;
      this.a = null;
   }

   public final void b() {
      at.a.drawImage(this.a, b.a, b.b, 3);
   }
}
