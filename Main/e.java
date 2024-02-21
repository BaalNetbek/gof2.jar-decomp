package Main;

import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public final class e extends Main.h {
   private Sprite a;

   public e(String[] var1, String var2) {
      super(var1, var2);
      String var5 = "/data/interface/medals.png";
      Image var6 = .ai.a("/data/interface/medals.png", true);
      this.a = new Sprite(var6, 31, 15);
      this.a(17);
      int[] var7 = .ba.a();
      int var8 = 0;
      if (var7 != null) {
         for(int var3 = 0; var3 < var7.length; ++var3) {
            if (var7[var3] > 0) {
               ++var8;
            }
         }

         .ce[] var9 = new .ce[var7.length];

         for(int var4 = 0; var4 < var7.length; ++var4) {
            var9[var4] = new .ce(var4, var7[var4]);
         }

         super.a(1, var9);
      }

      this.a = .at.a.a(63) + ": " + var8 + "/" + .ba.a.length;
   }

   public final void a() {
      super.a();
      if (this.g == 1) {
         this.b();
      }

   }

   public final void b() {
      .at.a.setColor(.a.c);
      .at.a.fillRect(this.a + 2, this.b + this.d - 14, this.c - 4, 12);
      .at.a.setColor(0);
      .at.a.drawLine(this.a + 3, this.b + this.d - 15, this.c - 3, this.b + this.d - 15);
      .at.a.drawLine(this.a + 3, this.b + this.d - 1, this.c - 3, this.b + this.d - 1);
      .at.a.drawRect(this.a + 3, this.b + this.d - 13, this.c - 6, 10);
      .at.a.setColor(.a.a);
      .at.a.drawRect(this.a + 2, this.b + this.d - 14, this.c - 4, 12);
      .q.a((String)this.a, this.a + this.c - 3, this.b + this.d - 13, 1, 18);
   }

   public final void a(Object var1, int var2) {
      .ce var3 = (.ce)var1;
      this.a.setFrame(var3.a);
      this.a.setPosition(this.k + 4, this.l + (var2 - this.i) * this.m + 1);
      this.a.paint(.at.a);
      .a.b(.at.a.a(745 + var3.b), this.k + 4 + 31 + 5, this.l + (var2 - this.i) * this.m + 2, this.c - this.k - 31 - 4 - 5 - this.f - 2, this.h == var2 ? 2 : 1);
   }
}
