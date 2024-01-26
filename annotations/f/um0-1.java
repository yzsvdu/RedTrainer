/*  1 */ package f;public final class um0 { public static final eo YA = new eo(0.0F, 0.0F, 0.0F); public static final zh0[] rg0; public static final Color A40 = Color.valueOf("#c2141d"); public static um0 Kt0 = new um0(); public static short xJ0 = 0; public Ut0 ZJ0 = new Ut0(); public Ut0 O90 = new Ut0(); public Ut0 zW = new Ut0(); public Ut0 MI = null; public U70 Z2 = null; public zh0[] O3 = null; public Uf0[] da = new Uf0[3]; public ig RJ0; public static void T90(ZH paramZH, Color paramColor) { this(); V6 v6; paramZH.getClass(); float f1 = paramColor.g, f2 = paramColor.b, f3 = paramColor.a; paramZH.coM6 = Color.rgba8888(paramColor.r, f1, f2, f3); byte b = 0; while (b < 
/*  2 */       paramZH.Con
/*  3 */       .Og0) { byte b1 = 0; Gdx2DPixmap gdx2DPixmap; while (b1 < 
/*  4 */         (gdx2DPixmap = paramZH.Con)
/*  5 */         .ju) { if ((gdx2DPixmap
/*  6 */           .Fl(b1, b) & 0xFF) == 0) for (byte b2 = -1; b2 < 2; ) { for (byte b3 = -1; b3 < 2; ) { int j = b1 + b3, k = b + b2; if ((paramZH
/*  7 */                 .Con.Fl(j, k) & 0xFF) != 0) v6
/*  8 */                   .uX(b1 | b << 16);  b3++; }  b2++; }   b1++; }  b++; }  KC0 kC0 = paramZH::N5;
/*  9 */     byte[] arrayOfByte = v6.JO; int arrayOfInt[], i = (arrayOfInt = v6.n20).length; do {  } while (i-- > 0 && (arrayOfByte[i] != 1 || kC0.rG(arrayOfInt[i]))); } public final UA0 vt(byte paramByte, short paramShort, boolean paramBoolean1, boolean paramBoolean2) { int j = paramShort * 20 + 18 + paramBoolean2; if (paramShort > 800 && paramShort < 817) { j = (paramShort - 800) * 2 + 14251 + paramBoolean2; paramShort = 493; }  this(this.RJ0.zz(j)); vJ vJ; ek0 ek0; byte b1, b2, b4, b3, b5; ig ig2 = this.RJ0; j = paramShort * 20; if (paramBoolean1) { b1 = 11; } else { b1 = 2; }  int i = j + b1; if (paramByte == 1) { b1 = 1; } else { b1 = 0; }  T7 t7; if ((t7 = ig2.zz(i + b1)).zu0 == 0) { byte b; ig ig6 = this.RJ0; if (paramBoolean1) { b = 11; } else { b = 2; }  t7 = ig6.zz(j + b); }  this(t7, true); LD lD = new LD(); ig ig3 = this.RJ0; if (paramBoolean1) { b2 = 13; } else { b2 = 4; }  this(ig3.zz(j + b2), false); jJ jJ2 = new jJ(); ig ig4 = this.RJ0; if (paramBoolean1) { b4 = 14; } else { b4 = 5; }
/*    */     
/* 11 */     this(ig4.zz(j + b4), true); Y3 y3 = new Y3(); ig ig5 = this.RJ0; if (paramBoolean1) { b5 = 15; } else { b5 = 6; }
/*    */     
/* 13 */     this(ig5.zz(j + b5)); jJ jJ1 = new jJ(); ig ig1 = this.RJ0; if (paramBoolean1) { b3 = 16; } else { b3 = 7; }
/*    */     
/* 15 */     this(ig1.zz(j + b3), false); return new UA0(vJ, ek0, lD, jJ2, y3, this); }
/*    */ 
/*    */   
/*    */   public static um0 TK0() {
/*    */     return Kt0;
/*    */   }
/*    */   
/*    */   public static int EY(short paramShort, boolean paramBoolean1, boolean paramBoolean2, byte paramByte, boolean paramBoolean3, boolean paramBoolean4) {
/*    */     if (paramBoolean2 && paramShort > 800 && paramShort < 817)
/*    */       paramShort = 493; 
/*    */     if (paramBoolean1) {
/*    */       int j = 65536;
/*    */     } else {
/*    */       paramBoolean1 = false;
/*    */     } 
/*    */     int i = paramShort + paramBoolean1;
/*    */     if (paramBoolean2) {
/*    */       int j = 131072;
/*    */     } else {
/*    */       paramBoolean1 = false;
/*    */     } 
/*    */     i += paramBoolean1;
/*    */     if (paramByte == 1) {
/*    */       int j = 262144;
/*    */     } else {
/*    */       paramBoolean1 = false;
/*    */     } 
/*    */     i += paramBoolean1;
/*    */     if (paramBoolean3) {
/*    */       int j = 524288;
/*    */     } else {
/*    */       paramBoolean1 = false;
/*    */     } 
/*    */     i += paramBoolean1;
/*    */     if (paramBoolean4) {
/*    */       int j = 1048576;
/*    */     } else {
/*    */       paramBoolean1 = false;
/*    */     } 
/*    */     return i + paramBoolean1;
/*    */   }
/*    */   
/*    */   public static short yw0() {
/*    */     return xJ0;
/*    */   }
/*    */   
/*    */   public static short HZ(byte paramByte, short paramShort) {
/*    */     if (paramShort == 1023)
/*    */       return 697; 
/*    */     if (paramByte < 1)
/*    */       return paramShort; 
/*    */     switch (paramShort) {
/*    */       default:
/*    */         return paramShort;
/*    */       case 649:
/*    */         return (short)(paramByte + 707);
/*    */       case 648:
/*    */         return 707;
/*    */       case 586:
/*    */         return (short)(paramByte + 703);
/*    */       case 585:
/*    */         return (short)(paramByte + 700);
/*    */       case 555:
/*    */         return 700;
/*    */       case 550:
/*    */         return 699;
/*    */       case 493:
/*    */         return (short)(paramByte + 800);
/*    */       case 492:
/*    */         return 698;
/*    */       case 487:
/*    */         return 697;
/*    */       case 479:
/*    */         return (short)(paramByte + 691);
/*    */       case 423:
/*    */         return 691;
/*    */       case 422:
/*    */         return 690;
/*    */       case 421:
/*    */         return 689;
/*    */       case 413:
/*    */         return (short)(paramByte + 686);
/*    */       case 412:
/*    */         return (short)(paramByte + 684);
/*    */       case 386:
/*    */         return (short)(paramByte + 681);
/*    */       case 351:
/*    */         return (short)(paramByte + 678);
/*    */       case 201:
/*    */         break;
/*    */     } 
/*    */     return (short)(paramByte + 651);
/*    */   }
/*    */   
/*    */   public final boolean F7(byte paramByte, short paramShort, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     int i = EY(paramShort, paramBoolean1, false, paramByte, paramBoolean2, false);
/*    */     Sp0 sp0;
/*    */     return ((sp0 = (Sp0)this.zW.Z6(i)) != null) ? ln() : false;
/*    */   }
/*    */   
/*    */   public final int[] Hr(byte paramByte, short paramShort, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     int i = EY(paramShort, paramBoolean1, false, paramByte, paramBoolean2, false);
/*    */     Sp0 sp0;
/*    */     return ((sp0 = (Sp0)this.zW.Z6(i)) != null) ? pL0() : new int[1];
/*    */   }
/*    */   
/*    */   public final boolean rE0(byte paramByte, short paramShort, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     if (paramShort >= 1000)
/*    */       return true; 
/*    */     return this.zW.return(EY(paramShort, paramBoolean1, false, paramByte, paramBoolean2, false));
/*    */   }
/*    */   
/*    */   public final zh0[] H9(byte paramByte, short paramShort, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     // Byte code:
/*    */     //   0: iload_3
/*    */     //   1: ifeq -> 103
/*    */     //   4: iload_2
/*    */     //   5: aload_0
/*    */     //   6: iload_2
/*    */     //   7: iconst_1
/*    */     //   8: iconst_0
/*    */     //   9: iload_1
/*    */     //   10: iload #4
/*    */     //   12: iconst_0
/*    */     //   13: invokestatic EY : (SZZBZZ)I
/*    */     //   16: istore_1
/*    */     //   17: getfield zW : Lf/Ut0;
/*    */     //   20: iload_1
/*    */     //   21: invokevirtual Z6 : (I)Ljava/lang/Object;
/*    */     //   24: checkcast f/Sp0
/*    */     //   27: astore_2
/*    */     //   28: sipush #1000
/*    */     //   31: if_icmple -> 50
/*    */     //   34: aload_2
/*    */     //   35: ifnonnull -> 50
/*    */     //   38: aload_0
/*    */     //   39: getfield zW : Lf/Ut0;
/*    */     //   42: iconst_0
/*    */     //   43: invokevirtual Z6 : (I)Ljava/lang/Object;
/*    */     //   46: checkcast f/Sp0
/*    */     //   49: astore_2
/*    */     //   50: aload_2
/*    */     //   51: ifnull -> 89
/*    */     //   54: aload_2
/*    */     //   55: invokevirtual fD0 : ()[Lf/zh0;
/*    */     //   58: dup
/*    */     //   59: astore_2
/*    */     //   60: ifnull -> 89
/*    */     //   63: aload_2
/*    */     //   64: arraylength
/*    */     //   65: istore_0
/*    */     //   66: iconst_0
/*    */     //   67: istore_1
/*    */     //   68: iload_1
/*    */     //   69: iload_0
/*    */     //   70: if_icmpge -> 101
/*    */     //   73: aload_2
/*    */     //   74: iload_1
/*    */     //   75: aaload
/*    */     //   76: getfield jh0 : Lf/U70;
/*    */     //   79: iconst_1
/*    */     //   80: putfield Gd0 : Z
/*    */     //   83: iinc #1, 1
/*    */     //   86: goto -> 68
/*    */     //   89: aload_0
/*    */     //   90: getfield ZJ0 : Lf/Ut0;
/*    */     //   93: iload_1
/*    */     //   94: invokevirtual Z6 : (I)Ljava/lang/Object;
/*    */     //   97: checkcast [Lf/zh0;
/*    */     //   100: astore_2
/*    */     //   101: aload_2
/*    */     //   102: areturn
/*    */     //   103: aload_0
/*    */     //   104: iload_2
/*    */     //   105: iload #4
/*    */     //   107: iload_1
/*    */     //   108: invokevirtual T00 : (SZB)[Lf/zh0;
/*    */     //   111: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 13
/*    */     //   #2	-> 17
/*    */     //   #3	-> 76
/*    */     //   #4	-> 80
/*    */     //   #5	-> 90
/*    */     //   #6	-> 108
/*    */   }
/*    */   
/*    */   public final zh0[] T00(short paramShort, boolean paramBoolean, byte paramByte) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: aload_0
/*    */     //   2: iload_1
/*    */     //   3: iconst_0
/*    */     //   4: iconst_0
/*    */     //   5: iload_3
/*    */     //   6: iload_2
/*    */     //   7: iconst_0
/*    */     //   8: invokestatic EY : (SZZBZZ)I
/*    */     //   11: istore_1
/*    */     //   12: getfield zW : Lf/Ut0;
/*    */     //   15: iload_1
/*    */     //   16: invokevirtual Z6 : (I)Ljava/lang/Object;
/*    */     //   19: checkcast f/Sp0
/*    */     //   22: astore_2
/*    */     //   23: sipush #1000
/*    */     //   26: if_icmple -> 45
/*    */     //   29: aload_2
/*    */     //   30: ifnonnull -> 45
/*    */     //   33: aload_0
/*    */     //   34: getfield zW : Lf/Ut0;
/*    */     //   37: iconst_0
/*    */     //   38: invokevirtual Z6 : (I)Ljava/lang/Object;
/*    */     //   41: checkcast f/Sp0
/*    */     //   44: astore_2
/*    */     //   45: aload_2
/*    */     //   46: ifnull -> 86
/*    */     //   49: aload_2
/*    */     //   50: invokevirtual fD0 : ()[Lf/zh0;
/*    */     //   53: dup
/*    */     //   54: astore_2
/*    */     //   55: ifnull -> 86
/*    */     //   58: aload_2
/*    */     //   59: arraylength
/*    */     //   60: istore_0
/*    */     //   61: iconst_0
/*    */     //   62: istore_1
/*    */     //   63: iload_1
/*    */     //   64: iload_0
/*    */     //   65: if_icmpge -> 84
/*    */     //   68: aload_2
/*    */     //   69: iload_1
/*    */     //   70: aaload
/*    */     //   71: getfield jh0 : Lf/U70;
/*    */     //   74: iconst_1
/*    */     //   75: putfield Gd0 : Z
/*    */     //   78: iinc #1, 1
/*    */     //   81: goto -> 63
/*    */     //   84: aload_2
/*    */     //   85: areturn
/*    */     //   86: aload_0
/*    */     //   87: getfield ZJ0 : Lf/Ut0;
/*    */     //   90: iload_1
/*    */     //   91: invokevirtual Z6 : (I)Ljava/lang/Object;
/*    */     //   94: checkcast [Lf/zh0;
/*    */     //   97: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 8
/*    */     //   #2	-> 12
/*    */     //   #3	-> 71
/*    */     //   #4	-> 75
/*    */     //   #5	-> 87
/*    */   }
/*    */   
/*    */   public final zh0[] lb(short paramShort, boolean paramBoolean, byte paramByte) {
/*    */     int i = EY(paramShort, false, true, paramByte, false, paramBoolean);
/*    */     Sp0 sp0;
/*    */     if ((sp0 = (Sp0)this.zW.Z6(EY(paramShort, false, true, paramByte, false, false))) != null) {
/*    */       zh0[] arrayOfZh01;
/*    */       if ((arrayOfZh01 = (zh0[])this.O90.Z6(i)) != null)
/*    */         return arrayOfZh01; 
/*    */       byte b1;
/*    */       U70[] arrayOfU70 = new U70[b1 = 2];
/*    */       zh0[] arrayOfZh02 = new zh0[2];
/*    */       for (byte b2 = 0; b2 < b1; b2++) {
/*    */         U70 u70;
/*    */         zh0 zh01;
/*    */         this(new OK0(sp0, b2, paramBoolean));
/*    */         arrayOfU70[b2] = u70;
/*    */         this(arrayOfU70[b2], 0, 0, -1, -1);
/*    */         arrayOfZh02[b2] = zh01;
/*    */       } 
/*    */       this.O90.A3(i, arrayOfZh02);
/*    */       return arrayOfZh02;
/*    */     } 
/*    */     zh0[] arrayOfZh0;
/*    */     return ((arrayOfZh0 = (zh0[])this.ZJ0.Z6(i)) != null) ? this : rg0;
/*    */   }
/*    */   
/*    */   public final void AR(short paramShort, boolean paramBoolean1, boolean paramBoolean2, byte paramByte, Sp0 paramSp0) {
/*    */     Ut0 ut0;
/*    */     int i;
/*    */     boolean bool = false;
/*    */     if (paramByte > 1 || paramByte < 0) {
/*    */       this.zW.A3(EY(paramShort, paramBoolean1, false, (byte)0, paramBoolean2, false), paramSp0);
/*    */       ut0 = this.zW;
/*    */       i = EY(paramShort, paramBoolean1, false, (byte)1, paramBoolean2, false);
/*    */     } else {
/*    */       ut0 = ((um0)super).zW;
/*    */       i = EY(i, paramBoolean1, bool, paramByte, paramBoolean2, false);
/*    */     } 
/*    */     A3(i, paramSp0);
/*    */   }
/*    */   
/*    */   static {
/*    */     zh0 zh01 = zh0.Ac0;
/*    */     rg0 = new zh0[] { zh01, zh01, zh01 };
/*    */   }
/*    */   
/*    */   static {
/*    */     C00.gd(um0.class);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/um0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */