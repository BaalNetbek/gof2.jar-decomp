public final class ad {
   public static String a = "/data/v3d/";
   private static String b = "/data/textures/";
   public static final short[][] a = new short[][]{{14025}, {14027, 14028}, {14029}};
   public static final short[] a = new short[]{14223, 14225, 14226, 14223, 14227, 14223, 14228, 14229};
   public static final short[][] b = new short[][]{{14007, 14008, 14009, 14010, 14011, 14012, 14013}, {14014, 14015, 14016, 14017, 14018, 14019}, {14020, 14021, 14022, 14023, 14024}};
   public static final short[] b = new short[]{6754, 6755, 6756, 6760, 6761, 6762, 6763, 6764, 6765, -1, -1, -1, 6788, 6789, 6790, 6791, 6792, 6793, 6794, 6795, 6796, 6797, 6798, 6799, 6800, 6801, 6802, 6803, 6781, 6781, 6781, 6791, 6789, 6788, 6790, 6792, 6797, 6794, 6791, 6796, 6788, -1, -1, -1, -1, -1, -1, 6784, 6785, 6786};
   public static final byte[] a;
   private static byte[] c;
   private static byte[] d;
   private static byte[] e;
   private static byte[] f;
   private static byte[] g;
   private static byte[] h;
   private static byte[] i;
   private static byte[] j;
   private static byte[] k;
   private static byte[] l;
   private static byte[] m;
   private static byte[] n;
   private static byte[] o;
   private static byte[] p;
   private static byte[] q;
   public static final byte[] b;
   private static byte[] r;
   private static byte[] s;
   private static byte[] t;
   private static byte[] u;
   private static byte[] v;
   public static final byte[][] a;
   private static ch[] a;
   private static v[] a;

   private ad() {
   }

   public static void a() {
      new av();
      a = av.a();
      a = av.a();
   }

   public static ch[] a() {
      return a;
   }

   public static v[] a() {
      return a;
   }

   public static String a(int var0) {
      return at.a.a(var0 + 569);
   }

   public static int[] a(int var0) {
      switch(var0) {
      case 2:
         return new int[]{2, 2};
      case 3:
         return new int[]{3, 3};
      case 8:
         return new int[]{0, 0};
      default:
         return new int[]{1, 1};
      }
   }

   public static String a(int var0, boolean var1) {
      new av();
      String[] var2 = av.a(var0, var1, true);
      String[] var3 = av.a(var0, var1, false);
      String var5 = var2 == null ? "" : var2[at.a.nextInt(var2.length)];
      String var4 = var3 == null ? "" : var3[at.a.nextInt(var3.length)];
      return var5 + " " + var4;
   }

   public static String a() {
      return (new av()).a(at.a.nextInt(100)).a();
   }

   public static int a(int var0) {
      boolean var1 = false;
      int var2;
      if (var0 == 9) {
         var2 = 8;
      } else if (var0 == 1) {
         var2 = 9;
      } else {
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while((var2 = at.a.nextInt(37)) == 0) {
                           }
                        } while(var2 == 9);
                     } while(var2 == 8);
                  } while(var2 == 10);
               } while(var2 == 13);
            } while(var2 == 14);
         } while(var2 == 15);
      }

      return var2;
   }

   public static ar a(int var0, int var1) {
      ar var2 = new ar();
      new av();
      int[] var3 = av.a(var0);
      int[] var6 = a(var1);

      for(int var4 = 0; var4 < var3.length; var4 += 10) {
         ag var5;
         if ((var5 = bo.a(var3[var4])).a() >= 13064 && var5.a() <= 13071) {
            var5.a((byte)2);
         } else {
            var5.a(var6[0], var6[1]);
            var5.e();
         }

         if (var0 == 28 && var5.a() == 13041 && var3[var4 + 4] == 0 && var3[var4 + 5] == 638 && var3[var4 + 6] == 1023) {
            var3[var4 + 5] = -1024;
            var3[var4 + 6] = -1024;
         } else if (var0 == 16 && var5.a() == 13021 && var3[var4 + 4] == 2048 && var3[var4 + 5] == 552 && var3[var4 + 6] == -2048) {
            var3[var4 + 4] = 0;
            var3[var4 + 5] = 1024;
            var3[var4 + 6] = 0;
         } else if (var0 == 16 && var5.a() == 13019 && var3[var4 + 4] == 2048 && var3[var4 + 5] == -552 && var3[var4 + 6] == -2048) {
            var3[var4 + 4] = 0;
            var3[var4 + 5] = -1024;
            var3[var4 + 6] = 0;
         }

         var5.c(var3[var4 + 1], var3[var4 + 2], var3[var4 + 3]);
         var5.e(var3[var4 + 4], var3[var4 + 5], var3[var4 + 6]);
         var5.f(var3[var4 + 7], var3[var4 + 8], var3[var4 + 9]);
         var5.a(2);
         var5.a(true);
         var2.a(var5);
      }

      return var2;
   }

   public static void a(ar var0, int var1) {
      new av();
      int[] var4;
      int var2 = (var4 = av.a(var1)).length - 10;

      for(ah var3 = var0.a(); var3 != null; var3 = var3.b()) {
         var3.c(var4[var2 + 1], var4[var2 + 2], var4[var2 + 3]);
         var3.e(var4[var2 + 4], var4[var2 + 5], var4[var2 + 6]);
         var3.f(var4[var2 + 7], var4[var2 + 8], var4[var2 + 9]);
         var2 -= 10;
      }

   }

   public static void b() {
      bo.a(0, b + "space");
      bo.a(9991, a + "skybox", 0);
      bo.a(18, a + "nuke", 2000, 0);
      bo.a(16, a + "emp", 2000, 0);
      bo.a(17, a + "box", 2000, 0);
      bo.a(15, a + "jumpgate", 5000, 0);
      bo.a(3301, a + "stat_arm0", 15000, 0);
      bo.a(3302, a + "stat_arm1", 15000, 0);
      bo.a(3303, a + "stat_bottom0", 15000, 0);
      bo.a(3304, a + "stat_bottom1", 15000, 0);
      bo.a(3305, a + "stat_bottom2", 15000, 0);
      bo.a(3306, a + "stat_bottom3", 15000, 0);
      bo.a(3307, a + "stat_bottom4", 15000, 0);
      bo.a(3308, a + "stat_bottom5", 15000, 0);
      bo.a(3309, a + "stat_bridge0", 15000, 0);
      bo.a(3310, a + "stat_bridge1", 15000, 0);
      bo.a(3311, a + "stat_bridge2", 15000, 0);
      bo.a(3312, a + "stat_connector0", 15000, 0);
      bo.a(3313, a + "stat_hangar0", 15000, 0);
      bo.a(3314, a + "stat_hangar1", 15000, 0);
      bo.a(3315, a + "stat_hangar2", 15000, 0);
      bo.a(3316, a + "stat_hangar3", 15000, 0);
      bo.a(3317, a + "stat_hangar4", 15000, 0);
      bo.a(3318, a + "stat_middle0", 15000, 0);
      bo.a(3319, a + "stat_middle1", 15000, 0);
      bo.a(3320, a + "stat_middle2", 15000, 0);
      bo.a(3321, a + "stat_middle3", 15000, 0);
      bo.a(3322, a + "stat_top0", 15000, 0);
      bo.a(3323, a + "stat_top1", 15000, 0);
      bo.a(3325, a + "stat_top2", 15000, 0);
      bo.a(3326, a + "stat_top3", 15000, 0);
      bo.a(3327, a + "stat_top4", 15000, 0);
      bo.a(3328, a + "stat_top5", 15000, 0);
      bo.a(3329, a + "stat_top6", 15000, 0);
      bo.a(3330, a + "stat_top7", 15000, 0);
      bo.a(3331, a + "stat_top8", 15000, 0);
      bo.a(3332, a + "stat_top9", 15000, 0);
      bo.a(3324, a + "stat_top10", 15000, 0);
      bo.a(3333, a + "stat_bridge3", 15000, 0);
      bo.a(3334, a + "stat_light0", 15000, 0);
      bo.a(3335, a + "stat_light1", 15000, 0);
      bo.a(3338, a + "stat_vossk_arm1", 15000, 0);
      bo.a(3340, a + "stat_vossk_bottom1", 15000, 0);
      bo.a(3339, a + "stat_vossk_bottom2", 15000, 0);
      bo.a(3341, a + "stat_vossk_middle1", 15000, 0);
      bo.a(3342, a + "stat_vossk_middle2", 15000, 0);
      bo.a(3343, a + "stat_vossk_top1", 15000, 0);
      bo.a(3337, a + "void_station", 32000, 0);
      bo.a(13001, a + "ship_00_head", 2000, 0);
      bo.a(13002, a + "ship_00_body", 2000, 0);
      bo.a(13003, a + "ship_00_engine", 2000, 0);
      bo.a(13004, a + "ship_00_wing_r", 2000, 0);
      bo.a(13005, a + "ship_00_wing_l", 2000, 0);
      bo.a(13006, a + "ship_01_head", 2000, 0);
      bo.a(13007, a + "ship_01_body_01", 2000, 0);
      bo.a(13008, a + "ship_01_body_02", 2000, 0);
      bo.a(13009, a + "ship_01_engine", 2000, 0);
      bo.a(13010, a + "ship_01_wing_r_01", 2000, 0);
      bo.a(13011, a + "ship_01_wing_r_02", 2000, 0);
      bo.a(13012, a + "ship_01_wing_l_01", 2000, 0);
      bo.a(13013, a + "ship_01_wing_l_02", 2000, 0);
      bo.a(13014, a + "ship_02_head_01", 2000, 0);
      bo.a(13015, a + "ship_02_head_02", 2000, 0);
      bo.a(13016, a + "ship_02_body_01", 2000, 0);
      bo.a(13017, a + "ship_02_body_02", 2000, 0);
      bo.a(13018, a + "ship_02_engine", 2000, 0);
      bo.a(13019, a + "ship_02_wing_r_01", 2000, 0);
      bo.a(13020, a + "ship_02_wing_r_02", 2000, 0);
      bo.a(13021, a + "ship_02_wing_l_01", 2000, 0);
      bo.a(13022, a + "ship_02_wing_l_02", 2000, 0);
      bo.a(13023, a + "ship_03_head", 2000, 0);
      bo.a(13024, a + "ship_03_body_01", 2000, 0);
      bo.a(13025, a + "ship_03_body_02", 2000, 0);
      bo.a(13026, a + "ship_03_engine", 2000, 0);
      bo.a(13027, a + "ship_03_wing_m", 2000, 0);
      bo.a(13028, a + "ship_03_wing_r", 2000, 0);
      bo.a(13029, a + "ship_03_wing_l", 2000, 0);
      bo.a(13030, a + "ship_04_body_01", 2000, 0);
      bo.a(13031, a + "ship_04_body_02", 2000, 0);
      bo.a(13032, a + "ship_04_body_03", 2000, 0);
      bo.a(13033, a + "ship_04_engine", 2000, 0);
      bo.a(13034, a + "ship_04_head_01", 2000, 0);
      bo.a(13035, a + "ship_04_head_02", 2000, 0);
      bo.a(13036, a + "ship_04_wing_r_01", 2000, 0);
      bo.a(13037, a + "ship_04_wing_r_02", 2000, 0);
      bo.a(13038, a + "ship_04_wing_l_01", 2000, 0);
      bo.a(13039, a + "ship_04_wing_l_02", 2000, 0);
      bo.a(13040, a + "ship_05_head", 2000, 0);
      bo.a(13041, a + "ship_05_body", 2000, 0);
      bo.a(13042, a + "ship_05_engine", 2000, 0);
      bo.a(13043, a + "ship_05_wing_m", 2000, 0);
      bo.a(13044, a + "ship_05_wing_r", 2000, 0);
      bo.a(13045, a + "ship_05_wing_l", 2000, 0);
      bo.a(13046, a + "ship_06_head", 2000, 0);
      bo.a(13047, a + "ship_06_body", 2000, 0);
      bo.a(13048, a + "ship_06_engine", 2000, 0);
      bo.a(13049, a + "ship_06_wing_r", 2000, 0);
      bo.a(13050, a + "ship_06_wing_l", 2000, 0);
      bo.a(13051, a + "ship_07_head", 2000, 0);
      bo.a(13052, a + "ship_07_body_01", 2000, 0);
      bo.a(13053, a + "ship_07_body_02", 2000, 0);
      bo.a(13054, a + "ship_07_engine", 2000, 0);
      bo.a(13055, a + "ship_07_wing_r_01", 2000, 0);
      bo.a(13056, a + "ship_07_wing_r_02", 2000, 0);
      bo.a(13057, a + "ship_07_wing_r_03", 2000, 0);
      bo.a(13058, a + "ship_07_wing_l_01", 2000, 0);
      bo.a(13059, a + "ship_07_wing_l_02", 2000, 0);
      bo.a(13060, a + "ship_07_wing_l_03", 2000, 0);
      bo.a(13061, a + "ship_void_body", 2000, 0);
      bo.a(13062, a + "ship_hsoc_body", 2000, 0);
      bo.a(13063, a + "ship_phantom_body", 2000, 0);
      bo.a(13064, a + "boost_red", 2000, 0);
      bo.a(13065, a + "boost_violet", 2000, 0);
      bo.a(13067, a + "boost_cyan", 2000, 0);
      bo.a(13068, a + "boost_green", 2000, 0);
      bo.a(13070, a + "boost_orange", 2000, 0);
      bo.a(13071, a + "boost_white", 2000, 0);
      bo.a(13072, a + "ship_vt_00", 2000, 0);
      bo.a(13073, a + "ship_vt_01", 2000, 0);
      bo.a(13074, a + "ship_vt_02", 2000, 0);
      bo.a(13075, a + "ship_vt_03", 2000, 0);
      bo.a(13076, a + "ship_vt_04", 2000, 0);
      bo.a(13077, a + "ship_vt_05", 2000, 0);
      bo.a(13078, a + "ship_tb_00", 2000, 0);
      bo.a(13079, a + "ship_tb_01", 2000, 0);
      bo.a(13080, a + "ship_tb_02", 2000, 0);
      bo.a(13081, a + "ship_tb_03", 2000, 0);
      bo.a(13082, a + "ship_tb_04", 2000, 0);
      bo.a(13083, a + "ship_tb_05", 2000, 0);
      bo.a(13084, a + "ship_tb_06", 2000, 0);
      bo.a(13085, a + "ship_tb_07", 2000, 0);
      bo.a(13086, a + "ship_tb_08", 2000, 0);
      bo.a(13087, a + "ship_tb_09", 2000, 0);
      bo.a(13088, a + "ship_tb_10", 2000, 0);
      bo.a(13089, a + "ship_tb_11", 2000, 0);
      bo.a(13090, a + "ship_tb_12", 2000, 0);
      bo.a(13091, a + "ship_tb_13", 2000, 0);
      bo.a(13092, a + "ship_tb_14", 2000, 0);
      bo.a(13093, a + "ship_tb_15", 2000, 0);
      bo.a(13094, a + "ship_tb_16", 2000, 0);
      bo.a(13095, a + "ship_tt_00", 2000, 0);
      bo.a(13096, a + "ship_tt_01", 2000, 0);
      bo.a(13097, a + "ship_tt_02", 2000, 0);
      bo.a(13098, a + "ship_tt_03", 2000, 0);
      bo.a(13999, a + "arrow", 2000, 0);
      bo.a(14007, a + "h1s1_", 15000, 0);
      bo.a(14008, a + "h1s2_", 15000, 0);
      bo.a(14009, a + "h1s3_", 15000, 0);
      bo.a(14010, a + "h1s4_", 15000, 0);
      bo.a(14011, a + "h1s5_", 15000, 0);
      bo.a(14012, a + "h1s6_", 15000, 0);
      bo.a(14013, a + "h1s7_", 15000, 0);
      bo.a(14014, a + "h2s1_", 15000, 0);
      bo.a(14015, a + "h2s2_", 15000, 0);
      bo.a(14016, a + "h2s3_", 15000, 0);
      bo.a(14017, a + "h2s4_", 15000, 0);
      bo.a(14018, a + "h2s5_", 15000, 0);
      bo.a(14019, a + "h2s6_", 15000, 0);
      bo.a(14020, a + "h3s1_", 15000, 0);
      bo.a(14021, a + "h3s2_", 15000, 0);
      bo.a(14022, a + "h3s3_", 15000, 0);
      bo.a(14023, a + "h3s4_", 15000, 0);
      bo.a(14024, a + "h3s5_", 15000, 0);
      bo.a(14025, a + "b1s1_", 15000, 0);
      bo.a(14027, a + "b2s1_", 15000, 0);
      bo.a(14028, a + "b2s2_", 15000, 0);
      bo.a(14029, a + "b3s1_", 15000, 0);
      bo.a(14223, a + "fig_terran_m", 2000, 0);
      bo.a(14224, a + "fig_terran_f", 2000, 0);
      bo.a(14225, a + "fig_vossk", 2000, 0);
      bo.a(14226, a + "fig_nivelian", 2000, 0);
      bo.a(14227, a + "fig_multipod", 2000, 0);
      bo.a(14228, a + "fig_bobolan", 2000, 0);
      bo.a(14229, a + "fig_grey", 2000, 0);
      bo.a(9992, a + "explosion", 2000, 0);
      bo.a(9996, a + "spacejunk", 2000, 0);
      bo.a(6767, a + "void_waste", 2000, 0);
      bo.a(6768, a + "planet_sun", 2000, 0);
      bo.a(6769, a + "asteroid", 2000, 0);
      bo.a(6804, a + "asteroid_alien", 2000, 0);
      bo.a(6770, a + "gun_0", 2000, 0);
      bo.a(6771, a + "gun_1", 2000, 0);
      bo.a(6772, a + "gun_2", 2000, 0);
      bo.a(6773, a + "gun_3", 2000, 0);
      bo.a(6774, a + "gun_4", 2000, 0);
      bo.a(6775, a + "gun_5", 2000, 0);
      bo.a(6778, a + "3d_planet", 2000, 0);
      bo.a(6779, a + "orbit", 2000, 0);
      bo.a(6781, a + "map_3d_sun", 2000, 0);
      bo.a(6782, a + "asteroid_explo", 2000, 0);
      bo.a(6783, a + "jump", 2000, 0);
      bo.a(6784, a + "gunshot_0", 2000, 0);
      bo.a(6785, a + "gunshot_1", 2000, 0);
      bo.a(6786, a + "gunshot_2", 2000, 0);
      bo.a(6805, a + "vortex", 32000, 0);
      bo.a(6806, a + "vortex_dust", 32000, 0);
      bo.a(6754, a + "laser0", 2000, 0);
      bo.a(6755, a + "laser1", 2000, 0);
      bo.a(6756, a + "laser2", 2000, 0);
      bo.a(6760, a + "laser3", 2000, 0);
      bo.a(6761, a + "laser4", 2000, 0);
      bo.a(6762, a + "laser5", 2000, 0);
      bo.a(6763, a + "laser6", 2000, 0);
      bo.a(6764, a + "laser7", 2000, 0);
      bo.a(6765, a + "laser8", 2000, 0);
      bo.a(6788, a + "blaster0", 2000, 0);
      bo.a(6789, a + "blaster1", 2000, 0);
      bo.a(6790, a + "blaster2", 2000, 0);
      bo.a(6791, a + "blaster3", 2000, 0);
      bo.a(6792, a + "blaster4", 2000, 0);
      bo.a(6793, a + "blaster5", 2000, 0);
      bo.a(6794, a + "blaster6", 2000, 0);
      bo.a(6795, a + "blaster7", 2000, 0);
      bo.a(6796, a + "blaster8", 2000, 0);
      bo.a(6797, a + "blaster9", 2000, 0);
      bo.a(6798, a + "cannon0", 2000, 0);
      bo.a(6799, a + "cannon1", 2000, 0);
      bo.a(6800, a + "cannon2", 2000, 0);
      bo.a(6801, a + "cannon3", 2000, 0);
      bo.a(6802, a + "cannon4", 2000, 0);
      bo.a(6803, a + "cannon5", 2000, 0);
   }

   public static void c() {
      a = null;
      a = null;
      bo.a();
   }

   static {
      short[][] var10000 = new short[][]{{11, 22, 28, 5, 7}, {4, 30}, {3, 14}, {9, 16}};
      var10000 = new short[][]{{11, 22, 28, 5, 7}, {4, 30}, {3, 14}, {9, 16}};
      a = new byte[]{0, 7, 7, 7, 7};
      c = new byte[]{0, 2, 2, 2, 2};
      d = new byte[]{2, 1, 1, 1, 1};
      e = new byte[]{0, 3, 3, 3, 3};
      f = new byte[]{4, 0, 0, 0, 0};
      g = new byte[]{0, 4, 4, 4, 4};
      h = new byte[]{10, 0, 0, 0, 0};
      i = new byte[]{1, 0, 0, 0, 0};
      j = new byte[]{0, 3, 2, 3, 1};
      k = new byte[]{0, 1, 2, 3, 4};
      l = new byte[]{0, 2, 3, 3, 5};
      m = new byte[]{0, 3, 4, 3, 6};
      n = new byte[]{0, 6, 0, 5, 1};
      o = new byte[]{10, 1, 2, 3, 4};
      p = new byte[]{2, 1, 2, 1, 2};
      q = new byte[]{11, 1, 0, 0, 0};
      b = new byte[]{11, 1, 0, 0, 0};
      r = new byte[]{11, 0, 0, 0, 0};
      s = new byte[]{0, 2, 4, 4, 4};
      t = new byte[]{9, 0, 0, 0, 0};
      u = new byte[]{7, 0, 0, 0, 0};
      v = new byte[]{2, 0, 0, 0, 0};
      a = new byte[][]{a, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, b, r, s, t, u, v};
   }
}
