/*  1 */ package f;public final class Bp extends GS implements Np0 { public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) { if (this.Yj0[0] == hR.zh) { String str; F40 f40 = F40.ef0; byte b = 14;
/*  2 */       int j = paramkf.AD.ex(676, paramhm01); String[] arrayOfString = new String[1]; boolean bool = false; if (paramhm01 == null) { str = ""; } else { str = paramhm01.fA(); }  arrayOfString[bool] = str; paramkf
/*    */         
/*  4 */         .Kq(Ml0.lz((byte)2, f40, b, j, arrayOfString)); }  if (this.Yj0[0] == hR.kq) { String str; F40 f40 = F40.ef0; byte b = 14;
/*    */       
/*  6 */       int j = paramkf.AD.ex(679, paramhm01); String[] arrayOfString = new String[1]; boolean bool = false; if (paramhm01 == null) { str = ""; } else { str = paramhm01.fA(); }  arrayOfString[bool] = str; paramkf
/*    */         
/*  8 */         .Kq(Ml0.lz((byte)2, f40, b, j, arrayOfString)); }  hR[] arrayOfHR; for (int i = (arrayOfHR = this.Yj0).length; paramBoolean2 < i; ) { hR hR1 = this[paramBoolean2];
/*    */ 
/*    */       
/* 11 */       byte b1, arrayOfByte[], b2 = (arrayOfByte = paramhm01.wt)[b1 = hR1.dL];
/* 12 */       arrayOfByte[
/* 13 */           b1] = paramhm02.wt[b1];
/* 14 */       paramhm02.wt[b1] = b2; paramBoolean2++; }
/*    */      Wl wl;
/* 16 */     if ((wl = km.wI0.K7) != null) { this
/* 17 */         .LW
/* 18 */         .oD(paramhm01).Eh();
/* 19 */       this.LW
/* 20 */         .oD(paramhm02).Eh(); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final hR[] Yj0;
/*    */   
/*    */   public Bp(hR[] paramArrayOfhR) {
/*    */     this.Yj0 = paramArrayOfhR;
/*    */   }
/*    */   
/*    */   public final byte YG0() {
/*    */     return 124;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Bp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */