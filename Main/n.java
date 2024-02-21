package Main;

import java.util.Random;
import javax.microedition.lcdui.game.GameCanvas;

public final class n extends GameCanvas {
   private GOF2MIDlet a;
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private .au a = null;
   private .ao a;
   private boolean a;
   private boolean b;
   private boolean c;
   private long a;
   private long b;

   n(GOF2MIDlet var1) {
      super(false);
      .at.b();
      this.b = true;
      this.c = false;
      this.a = var1;
      this.a = false;
      this.a = 0L;
      this.b = 0L;
      .at.a = var1.getDisplay();
      .at.a = new Random();

      try {
         .at.a = "v " + var1.getAppProperty("MIDlet-Version");
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public final void a() {
      if (this.a.a() == .at.a[2]) {
         ((Main.o)((Main.o).at.a[2])).c();
      }

      .at.a.b();
      .at.G = true;
   }

   protected final void hideNotify() {
      this.a.pause();
   }

   final synchronized void b() {
      if (this.b) {
         this.b = false;
         .at.f = this.getWidth();
         .at.g = this.getHeight();
         this.setFullScreenMode(true);
         this.flushGraphics();
         .at.f = this.getWidth();
         .at.g = this.getHeight();
         this.setFullScreenMode(true);
      } else if (!this.c) {
         this.c = true;
         .at.a = this.getGraphics();
         .at.f = this.getWidth();
         .at.g = this.getHeight();
         (.at.a = new .co()).a(.at.c);
         .at.f = this.getWidth();
         .at.g = this.getHeight();
         this.setFullScreenMode(true);
         .q.a(.at.a);
         .q.a((String)"/data/interface/font_w.png", 0, 15, 16);
         .q.a(0);
         .q.b(11);
         .q.a(-2, 0);
         .q.a((String)"/data/interface/font_g.png", 1, 15, 16);
         .q.b(0, 1);
         .q.c(11, 1);
         .q.a(-2, 1);
         .q.a((String)"/data/interface/font_r.png", 2, 15, 16);
         .q.b(0, 2);
         .q.c(11, 2);
         .q.a(-2, 2);
         .q.a((String)"/data/interface/font_void.png", 2, 15, 16);
         .q.b(0, 3);
         .q.c(11, 3);
         .q.a(-2, 3);
         .a.b();
         this.a = new .ao();
         this.a.a(this);
         this.a.a(true);
         .at.a = this.a;
         .at.a();
         (new .ab()).a();
         .at.a = false;
         .at.a = new .cg();
         (.at.a = new .af(.at.a)).b();
         .at.a.b();
         .at.a.b();
         .at.a = new .bs();
         .ad.b();
         .ad.a();
         .bl.p(0);
         this.a = new .au(this.a, this.a);
         .at.a = this.a;
         (.at.a = new .as[4])[3] = new Main.f();
         .at.a[0] = new Main.a();
         .at.a[1] = new Main.p();
         .at.a[2] = new Main.o();
         .bl.i();
         this.a.a(.at.a[3]);
      } else {
         .a.e();
         this.a.b(this.a);
         if (this.e == 16384) {
            .a.a(true);
            this.f = this.e;
         } else if (this.e == 8192) {
            .a.a(false);
            this.f = this.e;
         }

         if (.a.c()) {
            this.a.a(this.f);
            this.f = -1;
         }

         if (this.e != -1 && this.f == -1) {
            this.a.a(this.e);
         }

         this.e = -1;
         this.d = -1;
         this.flushGraphics();
      }
   }

   final void c() {
      this.a.a().a();
      .ad.c();
      .a.a();
      .q.a();
      .at.a.a();
      .bo.a();
      this.a.b();
      this.a = null;
   }

   public final void d() {
      .a.d();
      .q.a((String[]).q.a(.at.a.a(81), .at.f - 20), .at.f >> 1, .at.g >> 1, 1, 24);
      if (this.b == 0L) {
         this.b = System.currentTimeMillis();
      }

      long var1 = System.currentTimeMillis();
      this.a += var1 - this.b;
      this.b = var1;
      if (this.e == 256) {
         if (.bl.a() > this.a) {
            .bl.b(-this.a);
         }

         this.a = 0L;
         this.b = 0L;
         this.a.resume();
         this.e = 0;
         this.d = 0;
         this.b = 0;
         this.c = 0;
         this.a = 0;
      }

      this.flushGraphics();
   }

   final synchronized void e() {
      this.a = this.b;
   }

   public final void keyPressed(int var1) {
      this.c = this.b;
      if (var1 == -7) {
         this.b |= 8192;
      }

      if (var1 == -6) {
         this.b |= 16384;
      }

      if (var1 == 49 || var1 == 101 || var1 == 114) {
         this.b |= 32768;
      }

      if (var1 == 51 || var1 == 105 || var1 == 117) {
         this.b |= 65536;
      }

      if (var1 == 48 || var1 == 32) {
         this.b |= 131072;
      }

      if (var1 == -11) {
         this.b |= 262144;
      }

      if (var1 == -8) {
         this.b |= 524288;
      }

      if (var1 == -1 || var1 == 50 || var1 == 121 || var1 == 116) {
         this.b |= 2;
      }

      if (var1 == -2 || var1 == 56 || var1 == 98 || var1 == 118) {
         this.b |= 64;
      }

      if (var1 == -3 || var1 == 52 || var1 == 100 || var1 == 102) {
         this.b |= 4;
      }

      if (var1 == -4 || var1 == 54 || var1 == 106 || var1 == 107) {
         this.b |= 32;
      }

      if (var1 == -5 || var1 == 53 || var1 == 103 || var1 == 104) {
         this.b |= 256;
      }

      if (var1 == 55 || var1 == 99 || var1 == 120) {
         this.b |= 512;
      }

      if (var1 == 57 || var1 == 109 || var1 == 110) {
         this.b |= 1024;
      }

      if (var1 == 42) {
         this.b |= 2048;
      }

      if (var1 == 35) {
         this.b |= 4096;
      }

      this.e = this.b & ~this.c;
   }

   public final void keyRepeated(int var1) {
      this.keyPressed(var1);
   }

   public final void keyReleased(int var1) {
      this.c = this.b;
      if (var1 == -7) {
         this.b &= -8193;
      }

      if (var1 == -6) {
         this.b &= -16385;
      }

      if (var1 == 49 || var1 == 101 || var1 == 114) {
         this.b &= -32769;
      }

      if (var1 == 51 || var1 == 105 || var1 == 117) {
         this.b &= -65537;
      }

      if (var1 == 48 || var1 == 32) {
         this.b &= -131073;
      }

      if (var1 == -11) {
         this.b &= -262145;
      }

      if (var1 == -8) {
         this.b &= -524289;
      }

      if (var1 == -1 || var1 == 50 || var1 == 121 || var1 == 116) {
         this.b &= -3;
      }

      if (var1 == -2 || var1 == 56 || var1 == 98 || var1 == 118) {
         this.b &= -65;
      }

      if (var1 == -3 || var1 == 52 || var1 == 100 || var1 == 102) {
         this.b &= -5;
      }

      if (var1 == -4 || var1 == 54 || var1 == 106 || var1 == 107) {
         this.b &= -33;
      }

      if (var1 == -5 || var1 == 53 || var1 == 103 || var1 == 104) {
         this.b &= -257;
      }

      if (var1 == 55 || var1 == 99 || var1 == 120) {
         this.b &= -513;
      }

      if (var1 == 57 || var1 == 109 || var1 == 110) {
         this.b &= -1025;
      }

      if (var1 == 42) {
         this.b &= -2049;
      }

      if (var1 == 35) {
         this.b &= -4097;
      }

      this.d = ~this.b & this.c;
   }
}
