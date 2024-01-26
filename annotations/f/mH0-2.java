/*    */ package f;public final class mH0 extends GS implements Np0 { public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) { int j; String str2; int i; String str1; LV lV; String[] arrayOfString1;
/*  2 */     F40 f40 = F40.ef0; Gp0 gp0; int k = (gp0 = paramkf.AD).ex(1080, paramhm02); arrayOfString2[0] = paramhm02.fA(); String[] arrayOfString2; (arrayOfString2 = new String[2])[
/*    */         
/*  4 */         1] = Ml0.OH0(this.Wr0 + 110000);
/*  5 */     String str3 = Ml0.lz((byte)2, f40, 14, k, arrayOfString2);
/*  6 */     int m = paramkf.AD.ex(1080, paramhm02); arrayOfString3[0] = paramhm02.fA(); String[] arrayOfString3; (arrayOfString3 = new String[2])[
/*    */         
/*  8 */         1] = Ml0.OH0(this.Wr0 + 110000);
/*  9 */     String str4 = Ml0.lz((byte)2, f40, 14, m, arrayOfString3);
/* 10 */     if (this.Lo != this.Xb0)
/* 11 */     { boolean bool; if (gp0.yx0() ? (h1.ak0 >= 1) : (h1.ak0 >= 2)) { bool = true; } else { bool = false; }  if (bool)
/* 12 */       { String str; this(); stringBuilder.append("( "); StringBuilder stringBuilder; (stringBuilder = new StringBuilder()).append(paramhm02.coM1()).append(" "); double d; if ((d = (LF.ri(this.Xb0, this.le) - LF.ri(this.Lo, this.le)) * -1.0D) > 0.0D) { str = "+"; } else { str = ""; }  stringBuilder.append(str).append(NumberFormat.getInstance().format(d)).append("%"); stringBuilder.append(" )"); str4 = str4 + " " + stringBuilder.toString(); }  }  paramkf
/* 13 */       .RV(str3, str4, null);
/* 14 */     switch (this.Pj0) { default: return;case 3: j = gp0.ex(210, paramhm02); (arrayOfString1 = new String[1])[0] = paramhm02.fA();
/* 15 */         str2 = Ml0.lz((byte)2, f40, 14, j, arrayOfString1);
/*    */         
/* 17 */         paramkf
/* 18 */           .Kq(this);case 2: paramkf.Kq(Ml0.Qf0(f40, 15, 71));case 1: i = gp0.ex(213, paramhm02); (arrayOfString1 = new String[1])[0] = paramhm02.fA(); str1 = Ml0.lz((byte)2, f40, 14, i, arrayOfString1); paramkf.Kq(this);case 0: break; }  if (((mH0)super).Wr0 == 353) { this((byte)0, (new w9((hm0)arrayOfString1)).SK(paramhm02)); } else { this((byte)0, (new al((hm0)arrayOfString1)).SK(paramhm02)); }  paramkf
/* 19 */       .YP.add(this); }
/*    */ 
/*    */   
/*    */   public final short Wr0;
/*    */   public final byte Pj0;
/*    */   public short Lo;
/*    */   public short Xb0;
/*    */   public short le;
/*    */   
/*    */   public mH0(byte paramByte, short paramShort1, short paramShort2, short paramShort3, short paramShort4) {
/*    */     this.Lo = paramShort2;
/*    */     this.Xb0 = paramShort3;
/*    */     this.le = paramShort4;
/*    */     this.Wr0 = paramShort1;
/*    */     this.Pj0 = paramByte;
/*    */   }
/*    */   
/*    */   public final byte YG0() {
/*    */     return 43;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mH0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */