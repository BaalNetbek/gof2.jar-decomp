public final class ci {
   private static boolean a;
   private static final char[][] a = new char[][]{{'A', 'B', 'C', '2'}, {'D', 'E', 'F', '3'}, {'G', 'H', 'I', '4'}, {'J', 'K', 'L', '5'}, {'M', 'N', 'O', '6'}, {'P', 'Q', 'R', 'S', '7'}, {'T', 'U', 'V', '8'}, {'W', 'X', 'Y', 'Z', '9'}, {'0'}, {'1', '@', '.', '-', '_'}, {' '}};
   private static final char[][] b;
   private int a = 10;
   private int b = 0;
   private int c;
   private int d;
   private int e;
   private char a = ' ';
   private String a = "";
   private int f;
   private boolean b = true;

   public ci(int var1) {
   }

   private static int b(int var0) {
      switch(var0) {
      case 2:
         return 0;
      case 4:
         return 2;
      case 32:
         return 4;
      case 64:
         return 6;
      case 256:
         return 3;
      case 512:
         return 5;
      case 1024:
         return 7;
      case 2048:
         return -2;
      case 4096:
         return 10;
      case 32768:
         return 9;
      case 65536:
         return 1;
      case 131072:
         return 8;
      default:
         return -1;
      }
   }

   public final void a(int var1) {
      this.e = 0;
      if (b(var1) == -2) {
         a = !a;
      } else {
         this.f = var1;
         if (var1 != 8192 && var1 != 524288) {
            if (var1 != this.b && this.a != ' ' && this.a.length() < this.a - 1) {
               this.a = this.a + this.a;
               this.c = 0;
            }

            this.d = b(var1);
            if (this.d < 0) {
               return;
            }

            if (this.c >= a[this.d].length) {
               this.c = 0;
            }

            if (a) {
               this.a = b[this.d][this.c++];
            } else {
               this.a = a[this.d][this.c++];
            }

            if (!this.b && this.a == '@') {
               if (a) {
                  this.a = b[this.d][this.c++];
               } else {
                  this.a = a[this.d][this.c++];
               }
            }

            if (this.a.length() > 0 && this.a.charAt(this.a.length() - 1) != ' ') {
               this.a = String.valueOf(this.a).charAt(0);
            }

            this.b = var1;
         } else if (this.a.length() > 0) {
            this.e = 0;
            this.a = ' ';
            this.c = 0;
            this.a = this.a.substring(0, this.a.length() - 1);
            return;
         }

      }
   }

   public final int a(int var1) {
      this.e += var1;
      if (this.f == 16384) {
         return 0;
      } else if (this.a.length() >= this.a - 1) {
         return 2;
      } else if ((this.e > 1000 || this.a == ' ') && this.f != 0 && this.f != 8192 && this.f != 524288) {
         this.e = 0;
         this.b = 0;
         this.a = this.a + this.a;
         this.a = ' ';
         this.f = 0;
         this.c = 0;
         return 0;
      } else {
         return 2;
      }
   }

   public final char a() {
      return this.a;
   }

   public final String a() {
      return this.a;
   }

   static {
      b = new char[][]{{'a', 'b', 'c', '2'}, {'d', 'e', 'f', '3'}, {'g', 'h', 'i', '4'}, {'j', 'k', 'l', '5'}, {'m', 'n', 'o', '6'}, {'p', 'q', 'r', 's', '7'}, {'t', 'u', 'v', '8'}, {'w', 'x', 'y', 'z', '9'}, a[8], a[9], a[10]};
   }
}
