/*  1 */ package f;public final class Sf { public j40 Of0; public static short zo(hR paramhR, byte paramByte1, short paramShort, byte paramByte2, nV paramnV, int paramInt) { double d2; int i = paramInt * 2 + paramByte1;
/*    */     
/*  3 */     double d1 = ((paramShort / 4 + i + paramhR.bw0) * paramByte2 / 100 + paramhR.Sw0);
/*  4 */     if (paramhR == paramnV.t3) { d2 = 1.1D; } else if (paramhR == paramnV
/*  5 */       .Qc0) { d2 = 0.9D; } else { d2 = 1.0D; }  return (short)(int)(d1 * d2); } public Sf(j40 paramj40) { this.Of0 = paramj40; } public final short Mm(hR paramhR) { Q90 q90; byte b2 = (q90 = this.Of0.Zs).od; byte b1 = q90.Hc(paramhR);
/*    */     
/*  7 */     short s2 = this.Of0.Zs.Uu0(paramhR);
/*    */     
/*  9 */     nV nV = this.Of0.Zs.k0;
/*    */     
/* 11 */     int i = this.Of0.LPT4.qC(paramhR); short s1; if ((paramhR == hR.Gg && q90.Cw0 == 292) || (s1 = zo(paramhR, b1, s2, b2, this, i)) < 1) s1 = 1;  return s1; }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Sf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */