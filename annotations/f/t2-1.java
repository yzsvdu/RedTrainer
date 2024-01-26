/*  1 */ package f;public final class t2 extends dQ { public t2(M60 paramM60, String paramString, hR paramhR, j40 paramj40) { super(paramString); } public final boolean i2(oa0 paramoa0) { int k; if (!km.zg0(8) || 
/*  2 */       !B8.Pg(k = paramoa0.cz0) || k != 3 || paramoa0
/*  3 */       .vl != 1)
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 21 */       return super.i2(paramoa0); }  j40 j401; if ((j401 = km.u4.s40(aq0.LI).de0(this.ip.E30)) == null) return super.i2(paramoa0);  short s = j401.Zs.Tl0; this(Ml0.OH0(1849)); hu hu; byte b1; String[] arrayOfString; int[] arrayOfInt; byte b2; for ((arrayOfString = new String[b1 = 5])[0] = "31", (new String[b1 = 5])[1] = "28", (new String[b1 = 5])[2] = "15", (new String[b1 = 5])[3] = "0", (new String[b1 = 5])[4] = "Random", (arrayOfInt = new int[5])[0] = 31, (new int[5])[1] = 28, (new int[5])[2] = 15, (new int[5])[3] = 0, (new int[5])[4] = xi0.qX(31), b2 = 0; b2 < b1; ) { Hk0 hk0; String str = XD0.SD0("//setivs ", s); byte b = 0; while (b < hR.ka.length) { if (b == this.vK0.dL) { str = zw.vz(str, " ").append(arrayOfInt[b2]).toString(); } else { str = zw.vz(str, " ").append(this.v80.Zs.Hc(hR.aU(b))).toString(); }  b = (byte)(b + 1); }  str = arrayOfString[b2]; this(str, str::iJ0); hu.aV.add(hk0); b2++; }  M60 m60 = this.ip; int i = paramoa0.aK; int j = paramoa0.gk0; F7.T1(hu, this, i, j); return true; }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/t2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */