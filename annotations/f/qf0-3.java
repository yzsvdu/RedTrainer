/*  1 */ package f;public abstract class qf0 { public static String Sz(int paramInt, LPT1... paramVarArgs) { String str; byte[] arrayOfByte; R8 r8; if ((r8 = km.u4) != null) r8.QL();  byte b = (byte)(paramInt >> 28); if (Ml0.nW
/*  2 */       .return(paramInt)) { if (paramVarArgs != null && paramVarArgs.length > 
/*  3 */         0) { String[] arrayOfString; byte b1; for (arrayOfByte = new byte[paramVarArgs.length], arrayOfString = new String[paramVarArgs.length], b1 = 0; b1 < paramVarArgs.length; ) { arrayOfByte[
/*  4 */               b1] = (paramVarArgs[b1]).IM;
/*  5 */           arrayOfString[b1] = paramVarArgs[b1].Na(); b1++; }  str = Ml0.Nq0(paramInt, arrayOfByte, arrayOfString); } else { str = Ml0.OH0(paramInt); }  } else if (Mk0.sz0(arrayOfByte)) { F40 f40 = F40.ZD0((byte)(paramInt >> 27 & 0x1)); int i = paramInt >> 16 & 0x3FF, j = paramInt & 0xFFFF; str = Ml0.tm0(arrayOfByte, f40, i, j, (LPT1[])str); } else { if (str != null) {
/*  6 */         int i; byte b1; for (i = str.length, b1 = 0; b1 < i; )
/*  7 */         { byte b2 = ((LPT1)str[b1]).IM;
/*  8 */           String str1 = str[b1].Na();
/*  9 */           ed.CZ.VF(b2, str1); b1++; } 
/* 10 */       }  s40 s401 = km.mI0.UG0, s402 = km.mI0.UI0;
/* 11 */       str = ed.fj(paramInt, true, s401, s402); }  if (str
/* 12 */       .contains("{KEY_")) { String str2 = km.Lpt1.am(h1.NC); String str1; if ((str1 = km.Lpt1.am(h1.nUL)) == null) str1 = "???";  if (str2 == null) str2 = "???";  str = str.replaceAll("\\{KEY_B\\}", Matcher.quoteReplacement(str1)).replaceAll("\\{KEY_GAMEMENU\\}", Matcher.quoteReplacement(str2)); }  Xj0 xj0; if ((xj0 = Yb0).Wr0(paramInt)) { paramInt = xj0.xC(paramInt);
/* 13 */       str = Ml0.mz0(str, paramInt + "", "[0-9０-９,]{2,10}"); }  return str; }
/*    */ 
/*    */   
/*    */   public static final LPT1[] Qb0 = new LPT1[0];
/*    */   public static final Xj0 Yb0;
/*    */   
/*    */   static {
/*    */     (Yb0 = new Xj0()).B3(1647351, Bh0.tp((byte)0, (byte)2, null));
/*    */     (new Xj0()).B3(1667879, Bh0.tp((byte)0, (byte)4, null));
/*    */     (new Xj0()).B3(1685242, Bh0.tp((byte)0, (byte)6, null));
/*    */     (new Xj0()).B3(270520488, Bh0.tp((byte)1, (byte)2, null));
/*    */     (new Xj0()).B3(270529369, Bh0.tp((byte)1, (byte)4, null));
/*    */     (new Xj0()).B3(270626583, Bh0.tp((byte)1, (byte)6, null));
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qf0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */