import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public final class ab {
   private RecordStore a = null;
   private cl a;
   private ca a;

   public final z[] a() {
      z[] var1 = new z[4];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = this.b(var2);
      }

      return var1;
   }

   public final void a() {
      try {
         this.a = RecordStore.openRecordStore("GOF2_Options", false);
         this.a.closeRecordStore();
      } catch (RecordStoreException var5) {
      }

      try {
         this.a = RecordStore.openRecordStore("GOF2_Options", false);
         byte[] var1 = this.a.getRecord(this.a.getNextRecordID() - 1);
         ByteArrayInputStream var6 = new ByteArrayInputStream(var1);
         DataInputStream var2;
         at.a = (var2 = new DataInputStream(var6)).readBoolean();
         at.c = var2.readBoolean();
         at.d = var2.readBoolean();
         at.a = var2.readInt();
         at.b = var2.readInt();
         at.b = var2.readBoolean();
         var2.close();
         var6.close();
         this.a.closeRecordStore();
         this.a = null;
      } catch (RecordStoreException var3) {
      } catch (IOException var4) {
      }
   }

   public final void b() {
      try {
         RecordStore.deleteRecordStore("GOF2_Options");
      } catch (RecordStoreException var6) {
      }

      try {
         this.a = RecordStore.openRecordStore("GOF2_Options", true);
      } catch (RecordStoreException var5) {
      }

      ByteArrayOutputStream var1 = null;
      DataOutputStream var2 = null;

      try {
         var1 = new ByteArrayOutputStream();
         (var2 = new DataOutputStream(var1)).writeBoolean(at.a);
         var2.writeBoolean(at.c);
         var2.writeBoolean(at.d);
         var2.writeInt(at.a);
         var2.writeInt(at.b);
         var2.writeBoolean(at.b);
         var2.close();
         var1.close();
         this.a.addRecord(var1.toByteArray(), 0, var1.toByteArray().length);
         this.a.closeRecordStore();
         this.a = null;
      } catch (IOException var3) {
      } catch (RecordStoreException var4) {
         var4.printStackTrace();
      }
   }

   private z a(byte[] var1) {
      ByteArrayInputStream var16 = new ByteArrayInputStream(var1);
      DataInputStream var2 = new DataInputStream(var16);
      z var3 = new z();

      try {
         int var4;
         for(var4 = 0; var4 < var3.a.length; ++var4) {
            var3.a[var4] = var2.readBoolean();
         }

         var3.a = var2.readInt();
         var3.b = var2.readInt();
         var3.a = var2.readLong();
         var3.c = var2.readInt();
         var3.d = var2.readInt();
         var3.e = var2.readInt();
         var3.f = var2.readInt();
         var3.g = var2.readInt();
         var3.l = var2.readInt();
         var3.m = var2.readInt();
         var3.a = this.a(var2);
         var3.b = this.a(var2);
         var3.i = var2.readInt();
         var3.j = var2.readInt();
         var3.k = var2.readInt();
         var3.h = var2.readInt();
         var3.n = var2.readInt();
         var3.o = var2.readInt();
         var3.p = var2.readInt();
         var3.q = var2.readInt();

         for(var4 = 0; var4 < bl.b.length; ++var4) {
            var3.b[var4] = var2.readBoolean();
         }

         for(var4 = 0; var4 < bl.c.length; ++var4) {
            var3.c[var4] = var2.readBoolean();
         }

         var3.r = var2.readInt();
         var3.s = var2.readInt();
         var3.t = var2.readInt();
         var3.u = var2.readInt();

         for(var4 = 0; var4 < bl.d.length; ++var4) {
            var3.d[var4] = var2.readBoolean();
         }

         var3.v = var2.readInt();

         for(var4 = 0; var4 < bl.e.length; ++var4) {
            var3.e[var4] = var2.readBoolean();
         }

         var3.w = var2.readInt();
         var3.b = var2.readLong();
         var3.x = var2.readInt();
         var3.y = var2.readInt();
         var3.z = var2.readInt();
         var3.A = var2.readInt();
         var2.readInt();
         var3.B = var2.readInt();
         var3.C = var2.readInt();
         var3.D = var2.readInt();
         var3.E = var2.readInt();
         var3.F = var2.readInt();
         var3.G = var2.readInt();
         var4 = var2.readInt();
         var3.a = new int[var4];

         for(var4 = 0; var4 < var3.a.length; ++var4) {
            var3.a[var4] = var2.readInt();
         }

         var3.a = ad.a()[var2.readInt()].a();
         var3.a.a(var2.readInt());
         var4 = var2.readInt();
         v[] var5 = null;
         int var6;
         int var7;
         int var8;
         if (var4 > 0) {
            var5 = new v[var4];

            for(var6 = 0; var6 < var4; ++var6) {
               if ((var7 = var2.readInt()) == -1) {
                  var5[var6] = null;
               } else {
                  var8 = var2.readInt();
                  var5[var6] = ad.a()[var7].a(var8, ad.a()[var7].g());
                  var5[var6].a(var2.readBoolean());
               }
            }

            var3.a.c(var5);
         }

         var6 = var2.readInt();
         v[] var19 = null;
         int var9;
         int var17;
         if (var6 > 0) {
            var19 = new v[var6];

            for(var8 = 0; var8 < var6; ++var8) {
               var4 = var2.readInt();
               var17 = var2.readInt();
               var9 = var2.readInt();
               boolean var10 = var2.readBoolean();
               var19[var8] = ad.a()[var4].a(var17, ad.a()[var4].g());
               var19[var8].a(var9);
               var19[var8].a(var10);
            }

            var3.a.a(var19);
         }

         bd[] var21 = new bd[3];

         int var11;
         int var12;
         for(var4 = 0; var4 < var21.length + 1; ++var4) {
            var5 = null;
            bd var18;
            short var22;
            if ((var22 = var2.readShort()) == -1) {
               var18 = null;
            } else {
               var18 = bv.a(var22);
               var6 = var2.readInt();
               v[] var26 = null;
               if (var6 > 0) {
                  var26 = new v[var6];

                  for(var7 = 0; var7 < var6; ++var7) {
                     var9 = var2.readInt();
                     var11 = var2.readInt();
                     var12 = var2.readInt();
                     boolean var13 = var2.readBoolean();
                     var26[var7] = ad.a()[var9].a(var11, ad.a()[var9].g());
                     var26[var7].a(var12);
                     var26[var7].a(var13);
                  }

                  var18.a(var26);
               }

               var7 = var2.readInt();
               ch[] var25 = null;
               if (var7 > 0) {
                  var25 = new ch[var7];

                  for(var11 = 0; var11 < var7; ++var11) {
                     var12 = var2.readInt();
                     var25[var11] = ad.a()[var12].a();
                     var25[var11].a(var2.readInt());
                  }

                  var18.a(var25);
               }

               var11 = var2.readInt();
               ca[] var31 = null;
               if (var11 > 0) {
                  var31 = new ca[var11];

                  for(int var32 = 0; var32 < var11; ++var32) {
                     var31[var32] = this.a(var2);
                  }

                  var18.a(var31);
               }
            }

            if (var4 == var21.length) {
               var3.a = var18;
            } else {
               var21[var4] = var18;
            }
         }

         var3.a = var21;
         int[] var23 = bl.a().a();

         for(var17 = 0; var17 < var23.length; ++var17) {
            var23[var17] = var2.readInt();
         }

         var2.readInt();
         var2.readInt();
         var3.a = new cs();
         var3.a.a(var23);
         h[] var20 = new h[bl.a().length];

         for(var9 = 0; var9 < var20.length; ++var9) {
            var20[var9] = new h(bl.a()[var9].a());
            h var27 = var20[var9];

            for(var7 = 0; var7 < var27.a.length; ++var7) {
               var27.a[var7] = var2.readInt();
            }

            var27.b = var2.readInt();
            var27.a = var2.readBoolean();
            var27.c = var2.readInt();
            var27.d = var2.readInt();
            String var24;
            if ((var24 = var2.readUTF()).equals("")) {
               var24 = null;
            }

            var27.a = var24;
         }

         var3.a = var20;
         if ((var9 = var2.readInt()) <= 0) {
            var3.a = null;
         } else {
            bp[] var28 = new bp[var9];

            for(var7 = 0; var7 < var28.length; ++var7) {
               var9 = var2.readInt();
               var11 = var2.readInt();
               var12 = var2.readInt();
               String var33;
               if ((var33 = var2.readUTF()).equals("")) {
                  var33 = null;
               }

               var28[var7] = new bp(var9, var33, var12, var11);
            }

            var3.a = var28;
         }

         int var30;
         if ((var30 = var2.readInt()) <= 0) {
            var3.a = null;
         } else {
            String[] var29 = new String[var30];

            for(var9 = 0; var9 < var30; ++var9) {
               var29[var9] = var2.readUTF();
            }

            var3.a = var29;
            var3.H = var2.readInt();
            var3.I = var2.readInt();
            var9 = var2.readInt();
            var3.a = new byte[var9];

            for(var11 = 0; var11 < var3.a.length; ++var11) {
               var3.a[var11] = var2.readByte();
            }
         }

         var3.J = var2.readInt();
         var3.f = new boolean[bl.a.length];

         for(var7 = 0; var7 < bl.a.length; ++var7) {
            var3.f[var7] = var2.readBoolean();
         }

         var3.c = new int[bl.b.length];

         for(var7 = 0; var7 < bl.b.length; ++var7) {
            var3.c[var7] = var2.readInt();
         }

         var3.b = new int[bl.a.length];

         for(var7 = 0; var7 < bl.a.length; ++var7) {
            var3.b[var7] = var2.readInt();
         }

         var3.c = new byte[bl.c.length];

         for(var7 = 0; var7 < bl.c.length; ++var7) {
            var3.c[var7] = var2.readByte();
         }

         var3.b = new byte[bl.b.length];

         for(var7 = 0; var7 < bl.b.length; ++var7) {
            var3.b[var7] = var2.readByte();
         }

         var3.a = new ca[bl.a().length];

         for(var7 = 0; var7 < var3.a.length; ++var7) {
            var3.a[var7] = this.a(var2);
         }

         var3.a = var2.readBoolean();
         var3.b = var2.readBoolean();
         var3.c = var2.readBoolean();
         var3.d = var2.readBoolean();
         var3.e = var2.readBoolean();
         var3.f = var2.readBoolean();
         var3.g = var2.readBoolean();
         var3.h = var2.readBoolean();
         var3.i = var2.readBoolean();
         var3.j = var2.readBoolean();
         var3.k = var2.readBoolean();
         var3.l = var2.readBoolean();
         var3.m = var2.readBoolean();
         var3.n = var2.readBoolean();
         var3.o = var2.readBoolean();
         var3.p = var2.readBoolean();
         var3.q = var2.readBoolean();
         var3.r = var2.readBoolean();
         var3.s = var2.readBoolean();
         var3.t = var2.readBoolean();
         var3.u = var2.readBoolean();
         var3.v = var2.readBoolean();
         var3.w = var2.readBoolean();
         var3.x = var2.readBoolean();
         var3.y = var2.readBoolean();
         var3.c = var2.readLong();
         var3.d = var2.readLong();

         try {
            var3.z = var2.readBoolean();
            var3.A = var2.readBoolean();
         } catch (Exception var14) {
         }

         var2.close();
         var16.close();
      } catch (Exception var15) {
         System.err.println("Error in readRecordFromByteArray!");
      }

      return var3;
   }

   public final z a(int var1) {
      this.a = null;
      this.a = null;
      z var2 = null;

      try {
         this.a = RecordStore.openRecordStore("GOF2_" + var1, false);
         this.a.closeRecordStore();
      } catch (RecordStoreException var4) {
      }

      try {
         this.a = RecordStore.openRecordStore("GOF2_" + var1, false);
         byte[] var5 = this.a.getRecord(this.a.getNextRecordID() - 1);
         var2 = this.a(var5);
         this.a.closeRecordStore();
         this.a = null;
      } catch (Exception var3) {
         var2 = null;
      }

      return var2;
   }

   public final void a(int var1) {
      this.a = null;
      this.a = null;

      try {
         RecordStore.deleteRecordStore("GOF2_" + var1);
      } catch (RecordStoreException var10) {
      }

      try {
         this.a = RecordStore.openRecordStore("GOF2_" + var1, true);
      } catch (RecordStoreException var9) {
      }

      try {
         byte[] var2 = this.a();
         this.a.addRecord(var2, 0, var2.length);
         this.a.closeRecordStore();
         this.a = null;
         int var12 = var1;
         ab var11 = this;

         try {
            RecordStore.deleteRecordStore("GOF2_Preview_" + var12);
         } catch (RecordStoreException var7) {
         }

         try {
            var11.a = RecordStore.openRecordStore("GOF2_Preview_" + var12, true);
         } catch (RecordStoreException var6) {
         }

         ByteArrayOutputStream var3 = null;
         DataOutputStream var13 = null;

         try {
            var3 = new ByteArrayOutputStream();
            (var13 = new DataOutputStream(var3)).writeLong(bl.a());
            var13.writeInt(bl.f());
            var13.writeUTF(bl.a().a());
            var13.writeUTF(bl.a().a());
            var13.writeInt(bl.a());
            var13.close();
            var3.close();
            var11.a.addRecord(var3.toByteArray(), 0, var3.toByteArray().length);
            var11.a.closeRecordStore();
            var11.a = null;
         } catch (IOException var4) {
         } catch (RecordStoreException var5) {
            return;
         }
      } catch (Exception var8) {
      }

   }

   private byte[] a() {
      ByteArrayOutputStream var1 = null;
      DataOutputStream var2 = null;

      try {
         var1 = new ByteArrayOutputStream();
         var2 = new DataOutputStream(var1);
         boolean[] var3 = bv.a();

         int var4;
         for(var4 = 0; var4 < var3.length; ++var4) {
            var2.writeBoolean(var3[var4]);
         }

         var2.writeInt(bl.f());
         var2.writeInt(bl.h());
         var2.writeLong(bl.a());
         var2.writeInt(bl.j());
         var2.writeInt(bl.l());
         var2.writeInt(bl.m());
         var2.writeInt(bl.i());
         var2.writeInt(bl.g());
         var2.writeInt(bl.e());
         var2.writeInt(bl.a());
         this.a(var2, bl.b());
         this.a(var2, bl.c());
         var2.writeInt(bl.b());
         var2.writeInt(bl.c());
         var2.writeInt(bl.d());
         var2.writeInt(bl.k());
         var2.writeInt(bl.h);
         var2.writeInt(bl.g);
         var2.writeInt(bl.i);
         var2.writeInt(bl.j);

         for(var4 = 0; var4 < bl.b.length; ++var4) {
            var2.writeBoolean(bl.b[var4]);
         }

         for(var4 = 0; var4 < bl.c.length; ++var4) {
            var2.writeBoolean(bl.c[var4]);
         }

         var2.writeInt(bl.k);
         var2.writeInt(bl.l);
         var2.writeInt(bl.m);
         var2.writeInt(bl.n);

         for(var4 = 0; var4 < bl.d.length; ++var4) {
            var2.writeBoolean(bl.d[var4]);
         }

         var2.writeInt(bl.o);

         for(var4 = 0; var4 < bl.e.length; ++var4) {
            var2.writeBoolean(bl.e[var4]);
         }

         var2.writeInt(bl.p);
         var2.writeLong(bl.d);
         var2.writeInt(bl.q);
         var2.writeInt(bl.r);
         var2.writeInt(bl.s);
         var2.writeInt(bl.t);
         var2.writeInt(1);
         var2.writeInt(bl.u);
         var2.writeInt(bl.v);
         var2.writeInt(bl.w);
         var2.writeInt(bl.x);
         var2.writeInt(bl.y);
         var2.writeInt(bl.z);
         int[] var15 = ba.a();
         var2.writeInt(var15.length);

         int var9;
         for(var9 = 0; var9 < var15.length; ++var9) {
            var2.writeInt(var15[var9]);
         }

         var2.writeInt(bl.a().b());
         var2.writeInt(bl.a().a());
         v[] var10;
         if ((var10 = bl.a().a()) == null) {
            var2.writeInt(0);
         } else {
            var2.writeInt(var10.length);

            for(var4 = 0; var4 < var10.length; ++var4) {
               if (var10[var4] != null) {
                  var2.writeInt(var10[var4].a());
                  var2.writeInt(var10[var4].l());
                  var2.writeBoolean(var10[var4].c());
               } else {
                  var2.writeInt(-1);
               }
            }
         }

         v[] var18;
         if ((var18 = bl.a().b()) == null) {
            var2.writeInt(0);
         } else {
            var2.writeInt(var18.length);

            for(var9 = 0; var9 < var18.length; ++var9) {
               var2.writeInt(var18[var9].a());
               var2.writeInt(var18[var9].l());
               var2.writeInt(var18[var9].e());
               var2.writeBoolean(var18[var9].c());
            }
         }

         int var6;
         int var7;
         ca[] var19;
         for(var9 = 0; var9 < bl.a().length + 1; ++var9) {
            bd var5 = null;
            if (var9 == bl.a().length) {
               var5 = bl.a();
            } else {
               var5 = bl.a()[var9];
            }

            if (var5 == null) {
               var2.writeShort(-1);
            } else {
               var2.writeShort(var5.b());
               if ((var18 = var5.a()) == null) {
                  var2.writeInt(0);
               } else {
                  var2.writeInt(var18.length);

                  for(var6 = 0; var6 < var18.length; ++var6) {
                     var2.writeInt(var18[var6].a());
                     var2.writeInt(var18[var6].l());
                     var2.writeInt(var18[var6].e());
                     var2.writeBoolean(var18[var6].c());
                  }
               }

               ch[] var14;
               if ((var14 = var5.a()) == null) {
                  var2.writeInt(0);
               } else {
                  var2.writeInt(var14.length);

                  for(var4 = 0; var4 < var14.length; ++var4) {
                     var2.writeInt(var14[var4].b());
                     var2.writeInt(var14[var4].a());
                  }
               }

               if ((var19 = var5.a()) == null) {
                  var2.writeInt(0);
               } else {
                  var2.writeInt(var19.length);

                  for(var7 = 0; var7 < var19.length; ++var7) {
                     ca var12 = var19[var7];
                     this.a(var2, var12);
                  }
               }
            }
         }

         int[] var11 = bl.a().a();

         for(int var13 = 0; var13 < var11.length; ++var13) {
            var2.writeInt(var11[var13]);
         }

         var2.writeInt(1);
         var2.writeInt(1);
         h[] var16 = bl.a();

         for(var6 = 0; var6 < var16.length; ++var6) {
            h var20 = var16[var6];

            for(var7 = 0; var7 < var20.a.length; ++var7) {
               var2.writeInt(var20.a[var7]);
            }

            var2.writeInt(var20.b);
            var2.writeBoolean(var20.a);
            var2.writeInt(var20.c);
            var2.writeInt(var20.d);
            if (var20.a == null) {
               var2.writeUTF("");
            } else {
               var2.writeUTF(var20.a);
            }
         }

         bp[] var17;
         if ((var17 = bl.a()) == null) {
            var2.writeInt(-1);
         } else {
            var4 = 0;

            for(var7 = 0; var7 < var17.length; ++var7) {
               if (var17[var7] != null) {
                  ++var4;
               }
            }

            if (var4 == 0) {
               var2.writeInt(-1);
            } else {
               var2.writeInt(var4);

               for(var7 = 0; var7 < var17.length; ++var7) {
                  if (var17[var7] != null) {
                     var2.writeInt(var17[var7].c);
                     var2.writeInt(var17[var7].b);
                     var2.writeInt(var17[var7].a);
                     if (var17[var7].a == null) {
                        var2.writeUTF("");
                     } else {
                        var2.writeUTF(var17[var7].a);
                     }
                  }
               }
            }
         }

         if (bl.a == null) {
            var2.writeInt(-1);
         } else {
            var2.writeInt(bl.a.length);

            for(var4 = 0; var4 < bl.a.length; ++var4) {
               var2.writeUTF(bl.a[var4]);
            }

            var2.writeInt(bl.a);
            var2.writeInt(bl.b);
            var2.writeInt(bl.a.length);

            for(var4 = 0; var4 < bl.a.length; ++var4) {
               var2.writeByte(bl.a[var4]);
            }
         }

         var2.writeInt(bl.c);

         for(var4 = 0; var4 < bl.a.length; ++var4) {
            var2.writeBoolean(bl.a[var4]);
         }

         for(var4 = 0; var4 < bl.b.length; ++var4) {
            var2.writeInt(bl.b[var4]);
         }

         for(var4 = 0; var4 < bl.a.length; ++var4) {
            var2.writeInt(bl.a[var4]);
         }

         for(var4 = 0; var4 < bl.c.length; ++var4) {
            var2.writeByte(bl.c[var4]);
         }

         for(var4 = 0; var4 < bl.b.length; ++var4) {
            var2.writeByte(bl.b[var4]);
         }

         var19 = bl.a();

         for(var7 = 0; var7 < var19.length; ++var7) {
            this.a(var2, var19[var7]);
         }

         var2.writeBoolean(at.e);
         var2.writeBoolean(at.f);
         var2.writeBoolean(at.g);
         var2.writeBoolean(at.h);
         var2.writeBoolean(at.i);
         var2.writeBoolean(at.j);
         var2.writeBoolean(at.k);
         var2.writeBoolean(at.l);
         var2.writeBoolean(at.m);
         var2.writeBoolean(at.n);
         var2.writeBoolean(at.o);
         var2.writeBoolean(at.p);
         var2.writeBoolean(at.q);
         var2.writeBoolean(at.r);
         var2.writeBoolean(at.s);
         var2.writeBoolean(at.t);
         var2.writeBoolean(at.u);
         var2.writeBoolean(at.v);
         var2.writeBoolean(at.w);
         var2.writeBoolean(at.x);
         var2.writeBoolean(at.y);
         var2.writeBoolean(at.z);
         var2.writeBoolean(at.A);
         var2.writeBoolean(at.B);
         var2.writeBoolean(at.C);
         var2.writeLong(bl.c);
         var2.writeLong(bl.b);
         var2.writeBoolean(at.D);
         var2.writeBoolean(at.E);
         var2.close();
         var1.close();
      } catch (Exception var8) {
         var8.printStackTrace();
      }

      return var1.toByteArray();
   }

   private void a(DataOutputStream var1, ca var2) {
      var1.writeInt(var2.i());
      var1.writeInt(var2.g());
      var1.writeInt(var2.h());
      var1.writeInt(var2.f());
      var1.writeInt(var2.a());
      var1.writeInt(var2.b());
      var1.writeInt(var2.c());
      var1.writeInt(var2.k());
      var1.writeInt(var2.m());
      var1.writeInt(var2.l());
      var1.writeInt(var2.e());
      var1.writeInt(var2.d());
      var1.writeInt(var2.a);
      var1.writeBoolean(var2.a());
      var1.writeBoolean(var2.f());
      var1.writeBoolean(var2.e());
      var1.writeBoolean(var2.a);
      var1.writeBoolean(var2.b);
      if (var2.a() != null) {
         var1.writeInt(var2.a().length);

         for(int var3 = 0; var3 < var2.a().length; ++var3) {
            var1.writeByte(var2.a()[var3]);
         }
      } else {
         var1.writeInt(-1);
      }

      if (var2.b() == null) {
         var1.writeUTF("");
      } else {
         var1.writeUTF(var2.b());
      }

      if (var2.a == null) {
         var1.writeUTF("");
      } else {
         var1.writeUTF(var2.a);
      }

      if (var2.c() == null) {
         var1.writeUTF("");
      } else {
         var1.writeUTF(var2.c());
      }

      if (var2.d == null) {
         var1.writeUTF("");
      } else {
         var1.writeUTF(var2.d);
      }

      if (var2.b == null) {
         var1.writeUTF("");
      } else {
         var1.writeUTF(var2.b);
      }

      if (var2.c == null) {
         var1.writeUTF("");
      } else {
         var1.writeUTF(var2.c);
      }

      this.a = var2;
      if (var2.a() != null && this.a != var2.a()) {
         var1.writeInt(1);
         this.a(var1, var2.a());
      } else {
         var1.writeInt(-1);
      }
   }

   private ca a(DataInputStream var1) {
      int var2 = var1.readInt();
      int var3 = var1.readInt();
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      int var6 = var1.readInt();
      int var7 = var1.readInt();
      int var8 = var1.readInt();
      int var9 = var1.readInt();
      int var10 = var1.readInt();
      int var11 = var1.readInt();
      int var12 = var1.readInt();
      int var13 = var1.readInt();
      int var14 = var1.readInt();
      boolean var15 = var1.readBoolean();
      boolean var16 = var1.readBoolean();
      boolean var17 = var1.readBoolean();
      boolean var18 = var1.readBoolean();
      boolean var19 = var1.readBoolean();
      int var20 = var1.readInt();
      byte[] var21 = null;
      if (var20 > 0) {
         var21 = new byte[var20];

         for(var20 = 0; var20 < var21.length; ++var20) {
            var21[var20] = var1.readByte();
         }
      }

      String var28 = var1.readUTF();
      String var22 = var1.readUTF();
      String var23 = var1.readUTF();
      String var24 = var1.readUTF();
      String var25 = var1.readUTF();
      String var26 = var1.readUTF();
      if (var25.equals("")) {
         var25 = null;
      }

      if (var26.equals("")) {
         var26 = null;
      }

      cl var27 = null;
      if (var1.readInt() > 0) {
         var27 = this.a(var1);
      }

      ca var29;
      (var29 = new ca(var6, var22, var12, var13, var8, var15, var3, var4, var10)).c(var2);
      var29.a(var5);
      var29.b(var7);
      var29.a(var9, var11, var10);
      var29.b = var25;
      var29.c = var26;
      var29.a = var14;
      var29.b(var16);
      var29.a(var17);
      var29.a(var21);
      var29.a(var28);
      var29.b(var23);
      var29.c(var24);
      var29.a(var27);
      var29.a = var18;
      var29.b = var19;
      return var29;
   }

   private void a(DataOutputStream var1, cl var2) {
      var1.writeInt(var2.d());
      if (!var2.a()) {
         if (var2.a() == null) {
            var1.writeUTF("");
         } else {
            var1.writeUTF(var2.a());
         }

         if (var2.c() == null) {
            var1.writeUTF("");
         } else {
            var1.writeUTF(var2.c());
         }

         if (var2.b() == null) {
            var1.writeUTF("");
         } else {
            var1.writeUTF(var2.b());
         }

         var1.writeBoolean(var2.g());
         if (var2.a() != null) {
            var1.writeInt(var2.a().length);

            for(int var3 = 0; var3 < var2.a().length; ++var3) {
               var1.writeByte(var2.a()[var3]);
            }
         } else {
            var1.writeInt(-1);
         }

         var1.writeInt(var2.e());
         var1.writeInt(var2.g());
         var1.writeInt(var2.f());
         var1.writeInt(var2.h());
         var1.writeInt(var2.i());
         var1.writeInt(var2.a());
         var1.writeInt(var2.b());
         var1.writeInt(var2.c());
         var1.writeBoolean(var2.b());
         this.a = var2;
         if (var2.a() != null && this.a != var2.a()) {
            var1.writeInt(1);
            this.a(var1, var2.a());
         } else {
            var1.writeInt(-1);
         }
      }
   }

   private cl a(DataInputStream var1) {
      int var2;
      if ((var2 = var1.readInt()) == -1) {
         return cl.a;
      } else {
         String var3;
         if ((var3 = var1.readUTF()).equals("")) {
            var3 = null;
         }

         String var4;
         if ((var4 = var1.readUTF()).equals("")) {
            var4 = null;
         }

         var1.readUTF().equals("");
         boolean var5 = var1.readBoolean();
         byte[] var6 = null;
         int var7;
         int var8;
         if ((var7 = var1.readInt()) > 0) {
            var6 = new byte[var7];

            for(var8 = 0; var8 < var7; ++var8) {
               var6[var8] = var1.readByte();
            }
         }

         var8 = var1.readInt();
         var7 = var1.readInt();
         int var9 = var1.readInt();
         int var10 = var1.readInt();
         int var11 = var1.readInt();
         int var12 = var1.readInt();
         int var13 = var1.readInt();
         int var14 = var1.readInt();
         boolean var15 = var1.readBoolean();
         int var16 = var1.readInt();
         ca var17 = null;
         if (var16 > 0) {
            var17 = this.a(var1);
         }

         var1 = null;
         cl var18;
         if (var5) {
            var18 = new cl(var2, var9, var10);
         } else {
            var18 = new cl(var2, var3, var6, var8, var9, var10, var11);
         }

         var18.b(var7);
         var18.a(var12, var13);
         var18.a(var14);
         var18.a(var15);
         var18.a(var17);
         var18.a(var4);
         return var18;
      }
   }

   public final z b(int var1) {
      z var2 = null;

      try {
         this.a = RecordStore.openRecordStore("GOF2_Preview_" + var1, false);
         this.a.closeRecordStore();
      } catch (RecordStoreException var5) {
      }

      try {
         this.a = RecordStore.openRecordStore("GOF2_Preview_" + var1, false);
         byte[] var7 = this.a.getRecord(this.a.getNextRecordID() - 1);
         ByteArrayInputStream var6 = new ByteArrayInputStream(var7);
         DataInputStream var3 = new DataInputStream(var6);
         (var2 = new z()).a = var3.readLong();
         var2.a = var3.readInt();
         var2.a = var3.readUTF();
         var3.readUTF();
         var2.m = var3.readInt();
         var3.close();
         var6.close();
         this.a.closeRecordStore();
         this.a = null;
      } catch (Exception var4) {
         var2 = null;
      }

      return var2;
   }
}
