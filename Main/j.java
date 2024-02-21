package Main;

import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public final class j {
   private int a;
   private int b;
   private int c;
   private int d;
   private String[] a;
   private String[] b;
   private int e;
   private int f;
   private Sprite a;

   private j(int var1, int var2, int var3) {
      this.a = 10;
      this.b = var2;
      this.c = var3;
      this.d = .at.g / 2;
   }

   public j() {
      this(10, .at.g / 2, .at.f - 20);
   }

   public final void a(int var1, int var2) {
      this.f = var2;
      String var3 = "/data/interface/medals.png";
      Image var4 = .ai.a("/data/interface/medals.png", true);
      this.a = new Sprite(var4, 31, 15);
      this.a = .q.a(.at.a.a(var1 + 745), this.c - 14 - 31 - 4);
      this.b = .q.a(.bl.a(.at.a.a(var1 + 782), .ba.a[var1][var2 - 1] + ""), this.c - 14);
      this.b = (.at.g >> 1) - (.q.a(this.b) + 15 + 4 + 2 * .q.a() >> 1);
      this.e = this.b + this.b.length * .q.a() + 15 + 4 + 14 + 2;
      this.d = this.e + .q.a() + 7 - this.b;
   }

   public final void a() {
      .a.c();
      .a.a(.at.a.a(178), this.a, this.b, this.c, this.d, true);
      this.a.setFrame(this.f);
      this.a.setPosition(this.a + 7, this.b + 14 + 2);
      this.a.paint(.at.a);
      .q.a((String[])this.a, this.a + 7 + 31 + 4, this.b + 14 + 2, 1);
      .q.a((String[])this.b, this.a + 7, this.b + 15 + 2 + 14, 0);
      .at.a.setColor(.a.a);
      int var10001 = this.a + this.c / 2;
      String var1 = "OK";
      .q.b("OK", var10001 - .q.a("OK", 0) / 2, this.e, 2);
   }
}
