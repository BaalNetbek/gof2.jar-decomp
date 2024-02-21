import java.io.InputStream;
import javax.microedition.lcdui.AlertType;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

public final class bs implements PlayerListener {
   private static final String[] a = new String[]{"/data/sound/gof2_theme.mid", "/data/sound/gof2_hangar.mid", "/data/sound/gof2_bar.mid", "/data/sound/gof2_gaction.mid", "/data/sound/gof2_gneutral.mid"};
   private static final String[] b = new String[]{"/data/sound/fx_boost_01.wav", "/data/sound/fx_explosion_01.wav", "/data/sound/fx_message_03.wav", "/data/sound/fx_message_02.wav", "/data/sound/fx_menu_04.wav", "/data/sound/fx_explosion_03.wav", "/data/sound/fx_mining_05.wav", "/data/sound/fx_boost_02.wav", "/data/sound/wpn_rocket_02.wav", "/data/sound/wpn_rocket_03.wav", "/data/sound/wpn_rocket_04.wav", "/data/sound/fx_thunder_01.wav", "/data/sound/wpn_nuke_02.wav", "/data/sound/fx_message_05.wav"};
   private static int a;
   private static long a;
   private static final long[] a = new long[]{1663L, 1542L, 297L, 551L, 50L, 790L, 2147L, 3087L, 576L, 884L, 892L, 3194L, 1697L, 215L};
   private static short[] a = new short[]{100, 95, 60, 70, 50, 80, 100, 100, 60, 60, 60, 100, 100, 80};
   private static Player a;
   private Player[] a;
   private VolumeControl a;
   private int b = 100;
   private int c = 100;
   private boolean a = false;
   private int d;

   public bs() {
      this.a = new Player[b.length];
   }

   public final void a(int var1) {
      if (a != null && a.getState() != 0) {
         this.a = (VolumeControl)a.getControl("VolumeControl");
         this.a.setLevel(var1);
      }

      this.b = var1;
   }

   public final void b(int var1) {
      if (this.a != null) {
         for(int var2 = 0; var2 < this.a.length; ++var2) {
            if (this.a[var2] != null && this.a[var2].getState() != 0) {
               this.a = (VolumeControl)this.a[var2].getControl("VolumeControl");
               this.a.setLevel(var1);
            }
         }
      }

      this.c = var1;
   }

   public final int a() {
      return this.b;
   }

   public final void a() {
      if (a != null) {
         if (a.getState() != 0) {
            a.deallocate();
         }

         a.close();
         a = null;
      }

      this.a = null;
   }

   public static boolean a() {
      if (!at.a) {
         return false;
      } else {
         return a != null && a.getState() == 400;
      }
   }

   public final void c(int var1) {
      if (at.a && at.e != var1) {
         d();

         try {
            (a = Manager.createPlayer(this.getClass().getResourceAsStream(a[var1]), "audio/midi")).addPlayerListener(this);
            a.setLoopCount(-1);
            a.start();
            at.e = var1;
            VolumeControl var5 = (VolumeControl)a.getControl("VolumeControl");

            try {
               var5.setMute(false);
            } catch (Exception var3) {
            }

            at.F = false;
         } catch (Exception var4) {
            at.F = true;
            if (a != null) {
               a.deallocate();
               a.close();
            }

            a = null;
         }
      }
   }

   public final void a(int var1, int var2) {
      if (at.b) {
         if (System.currentTimeMillis() > a + a[a] || a[var1] >= a[a]) {
            try {
               if (this.a[var1] == null) {
                  try {
                     InputStream var3 = this.getClass().getResourceAsStream(b[var1]);
                     this.a[var1] = Manager.createPlayer(var3, "audio/x-wav");
                     this.a[var1].setLoopCount(1);
                     this.a[var1].prefetch();
                  } catch (Exception var4) {
                     var4.printStackTrace();
                  }
               }

               ((VolumeControl)this.a[var1].getControl("VolumeControl")).setLevel(var2 > this.c ? this.c : var2);
               this.a[var1].stop();
               this.a[var1].setMediaTime(0L);
               this.a[var1].start();
               a = var1;
               a = System.currentTimeMillis();
               return;
            } catch (Exception var5) {
               var5.printStackTrace();
            }
         }

      }
   }

   public final void d(int var1) {
      this.a(var1, this.c);
   }

   public final void b() {
      try {
         try {
            VolumeControl var1 = (VolumeControl)a.getControl("VolumeControl");
            this.d = var1.getLevel();
            var1.setMute(true);
         } catch (Exception var2) {
         }

         a.stop();

         for(int var4 = 0; var4 < this.a.length; ++var4) {
            if (this.a[var4] != null) {
               this.a[var4].stop();
            }
         }

      } catch (Exception var3) {
      }
   }

   public final void c() {
      try {
         if (at.a) {
            try {
               VolumeControl var1;
               (var1 = (VolumeControl)a.getControl("VolumeControl")).setMute(false);
               AlertType.ERROR.playSound(at.a);
               var1.setLevel(this.d);
            } catch (Exception var3) {
            }

            a.start();
         }

         at.F = false;
      } catch (Exception var4) {
         at.F = true;
         if (a != null) {
            try {
               a.deallocate();
               a.close();
            } catch (Exception var2) {
            }
         }

         a = null;
      }
   }

   public static void d() {
      try {
         if (a.getState() == 400) {
            a.stop();
            a.deallocate();
            a.close();
         }

      } catch (Exception var0) {
      }
   }

   public final void playerUpdate(Player var1, String var2, Object var3) {
      if (var2.compareTo("deviceUnavailable") == 0 && a != null && a.getState() != 0) {
         this.a = true;
      }

      if (var2.compareTo("deviceAvailable") == 0 && this.a) {
         this.a = false;
         at.F = true;
      }

   }
}
