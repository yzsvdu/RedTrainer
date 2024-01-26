/*  1 */ package f;public final class ij extends gT { public final Object Kx0(int paramInt1, int paramInt2) { U40[] arrayOfU40; String str; byte b1; Date[] arrayOfDate; Q20 q201; int i; VP[] arrayOfVP; StringBuilder stringBuilder; Q20 q202; byte b2; c60 c60; Jj0 jj0 = this.S6[paramInt1]; switch (paramInt2) { default: return "";case 3: if ((arrayOfDate = this.OL0)[paramInt1] == null)
/*  2 */         { Date date; this(jj0.mM * 1000L); arrayOfDate[paramInt1] = date; }  return J10.format(this.OL0[paramInt1]);
/*    */       case 2:
/*  4 */         return NumberFormat.getInstance().format(jj0.Jo0);case 1: if ((q201 = this.v1[paramInt1]) != null) return q201; 
/*  5 */         this
/*  6 */           .Jf
/*  7 */           .getClass();
/*  8 */         arrayOfVP = new VP[i = (arrayOfU40 = Arrays.<U40>copyOf(jj0.Uu, 4)).length]; this(); if (km.XU()) { stringBuilder.append("       "); } else { stringBuilder.append("  "); }  for (b2 = 0; b2 < arrayOfU40.length; ) { FV fV; U40 u402; if ((u402 = arrayOfU40[b2]) == null) { u402 = null; }
/*  9 */           else { fV = u402.X; }
/* 10 */            if (km.XU()) { VP vP; this(24, 80, fV); arrayOfVP[b2] = vP;
/* 11 */             vP.X70
/* 12 */               .Dd = 2; }
/* 13 */           else { VP vP; this(12, 24, fV); arrayOfVP[b2] = vP; }  U40 u401; if ((u401 = arrayOfU40[b2]) == null) { arrayOfVP[b2].wI0(false); } else { stringBuilder
/*    */ 
/*    */               
/* 16 */               .append(u401.X.Pb); if (b2 != arrayOfU40.length - 1 && arrayOfU40[b2 + 1] != null) stringBuilder.append(", ");  }  b2++; }  str = stringBuilder.toString(); if (km.XU()) { b2 = 60; } else { b2 = 43; }  if (str.length() > b2) { this(); StringBuilder stringBuilder1; str = (stringBuilder1 = new StringBuilder()).append(str.substring(0, b2 - 1)).append("..").toString(); this.NH0[paramInt1] = stringBuilder.toString(); }  this(1); this(str); (new c60()).Xu("label"); for ((new c60())
/* 17 */           .zI0 = false, b1 = 0; b1 < i; )
/* 18 */         { VP vP = arrayOfVP[b1];
/* 19 */           q202.si(vP, q202.Ub()); b1++; }  q202.si(c60, q202.Ub()); this
/* 20 */           .v1[paramInt1] = q202; return q202;case 0: break; }  return Integer.toString(paramInt1 + 1); }
/*    */ 
/*    */   
/*    */   public static final SimpleDateFormat J10 = new SimpleDateFormat("dd/MM/yyyy hh:mm a z");
/*    */   public final oD0 Jf;
/*    */   public final Jj0[] S6;
/*    */   public final String[] iU;
/*    */   public final Q20[] v1;
/*    */   public final Date[] OL0;
/*    */   public final String[] NH0;
/*    */   
/*    */   public ij(oD0 paramoD0, Jj0[] paramArrayOfJj0) {
/*    */     this.Jf = paramoD0;
/*    */     this.S6 = paramArrayOfJj0;
/*    */     this.v1 = new Q20[paramArrayOfJj0.length];
/*    */     this.OL0 = new Date[paramArrayOfJj0.length];
/*    */     this.NH0 = new String[paramArrayOfJj0.length];
/*    */     this.iU = new String[] { "", Ml0.OH0(1130), Ml0.OH0(1131), Ml0.OH0(5837) };
/*    */   }
/*    */   
/*    */   public final int Z80() {
/*    */     return this.S6.length;
/*    */   }
/*    */   
/*    */   public final int ED0() {
/*    */     return this.iU.length;
/*    */   }
/*    */   
/*    */   public final String zd(int paramInt) {
/*    */     return this.iU[paramInt];
/*    */   }
/*    */   
/*    */   public final Object ms(int paramInt1, int paramInt2) {
/*    */     String str;
/*    */     return ((str = this.NH0[paramInt1]) != null) ? this : "";
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ij.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */