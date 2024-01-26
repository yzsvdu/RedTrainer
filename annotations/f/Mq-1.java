/*    */ package f;public final class Mq extends SI0 { public final void p4(kf paramkf) {
/*  2 */     QZ qZ = paramkf.AD.wB(this.p9);
/*    */     
/*  4 */     LPT3 lPT3 = Of.eH.On0(this.V); F40 f40 = F40.ef0; arrayOfString[0] = qZ.dy(); String[] arrayOfString; (arrayOfString = new String[2])[
/*  5 */         1] = Ml0.OH0(lPT3.Iu);
/*    */ 
/*    */     
/*  8 */     paramkf.Kq(Ml0.tG((byte)2, f40, 15, 33, arrayOfString)); short s; if ((s = this.V) == 5064 || s == 5063) return;  if (this.p9 == paramkf
/*  9 */       .AD
/* 10 */       .hG0())
/* 11 */       paramkf.AD
/*    */         
/* 13 */         .uh0 = this.sW;  b60[] arrayOfB60;
/* 14 */     if ((arrayOfB60 = this.M90).length == 0) { paramkf.Kq(Ml0.Qf0(f40, 15, 68)); return; }  int i; byte b; for (i = arrayOfB60.length, b = 0; b < i; ) { String str; b60 b601 = arrayOfB60[b];
/*    */       
/*    */       hm0 hm0;
/* 17 */       if ((hm0 = paramkf.AD.fa(b601.a0)) == null)
/*    */       { j40 j40;
/* 19 */         if ((j40 = km.u4.s40(aq0.LI).de0(b601.a0)) != null) { str = j40.m(); } else if (!this.Qa.isEmpty()) { str = this.Qa; } else { str = Ml0.OH0(this.dB + 150000); }  } else { str = hm0.fA(); }  if (hm0 != null) { LV lV; this((byte)0, (new Y90(hm0)).SK(hm0)); paramkf
/* 20 */           .YP.add(lV); }  boolean bool = false;
/*    */       
/* 22 */       for (null = b601.JX.iterator(); null.hasNext();) { if (((GS)null.next()).YG0() == 84) bool = true;  }  for (GS gS : b601
/* 23 */         .JX)
/* 24 */       { String str1; if (hm0 == null && gS.Lt()) { if (gS.YG0() == 0) { if (bool) { F40 f401 = F40.ef0;
/*    */               
/* 26 */               int j = paramkf.AD.ex(3, hm0); String[] arrayOfString1; (arrayOfString1 = new String[1])[0] = str;
/* 27 */               str1 = Ml0.tG((byte)2, f401, 14, j, arrayOfString1); }
/* 28 */             else { String[] arrayOfString1; (arrayOfString1 = new String[1])[0] = str;
/* 29 */               str1 = Ml0.tG((byte)2, F40.ef0, 14, 387, arrayOfString1); }  paramkf
/* 30 */               .Kq(str1); }  continue; }  paramkf.j90(hm0, hm0, (GS)str1, false, false, (short)0, true, b601); }  b++; }
/*    */   
/*    */   }
/*    */   
/*    */   public byte p9;
/*    */   public byte sW;
/*    */   public short V;
/*    */   public short dB;
/*    */   public String Qa;
/*    */   public b60[] M90;
/*    */   
/*    */   public Mq(byte paramByte1, short paramShort1, byte paramByte2, short paramShort2, String paramString, b60[] paramArrayOfb60) {
/*    */     this.p9 = paramByte1;
/*    */     this.V = paramShort1;
/*    */     this.sW = paramByte2;
/*    */     this.dB = paramShort2;
/*    */     this.Qa = paramString;
/*    */     this.M90 = paramArrayOfb60;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Mq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */