/*  1 */ package f;public final class gh extends Sp0 { public static final ik Oc0 = C00.gd(gh.class); public static final ik od = C00.R4("mod"); public static final int[] Gt0 = new int[0]; public gh(RD0 paramRD0, int[] paramArrayOfint) { super(paramRD0); this.ZI0 = Gt0; this.dq0 = null; this.G00 = null; if (paramArrayOfint != null) { int[] arrayOfInt; im0 im0 = h60(); if (paramArrayOfint.length == 1) { this.ZI0 = arrayOfInt; Arrays.fill(arrayOfInt = new int[im0.w30()], paramArrayOfint[0]); } else if (paramArrayOfint.length == arrayOfInt.w30()) { this.ZI0 = paramArrayOfint; } else { throw new IllegalArgumentException(B40.df("Invalid frame times length. Expected: ")
/*  2 */             .append(arrayOfInt.w30()).append(" Has: ").append(paramArrayOfint.length).toString()); }  }
/*  3 */      } public int[] ZI0; public rF dq0; public zh0[] G00; public final zh0[] fD0() { zh0[] arrayOfZh01; rF rF2; if ((arrayOfZh01 = this.G00) != null && (rF2 = this.dq0) != null && !rF2.DA) { rF2.mk = zm0.u20; return arrayOfZh01; }
/*  4 */      this(); rF rF1; ArrayList<im0> arrayList; arrayList.add(im0); im0 im0; int i; zh0[] arrayOfZh02;
/*    */     byte b;
/*  6 */     for (arrayOfZh02 = new zh0[i = (im0 = h60()).Ee], b = 0; b < i; ) { U70 u70; zh0 zh01; this(new Ng(im0, b)); this(u70, 0, 0, -1, -1); arrayOfZh02[b] = zh01; arrayList.add(u70); arrayList.add(arrayOfZh02[b]); b++; }  this(arrayList); this.dq0 = this; this.G00 = arrayOfZh02; return arrayOfZh02; } public final im0 h60() { try { this(); im0.mk = zm0.u20; im0 im0; int i = (im0 = new im0()).pe(this.YL0.hQ(2048)); if (this.ZI0.length == 0) { byte b; int[] arrayOfInt; for (this.ZI0 = new int[im0.Ee], b = 0; b < (arrayOfInt = this.ZI0).length; ) { im0.FA0 = -1; if (b >= 0 && b < im0.Ee) im0.FA0 = ((oA)im0.RZ.elementAt(b)).Wr;  arrayOfInt[b] = im0.FA0;
/*  7 */           b++; }  }  if (i == 0) return im0;  } catch (Exception exception) { Oc0
/*    */         
/*  9 */         .error(B40.df("Error loading gif ").append(this.YL0.rw()).toString(), exception); od
/*    */         
/* 11 */         .error(B40.df("Error loading gif ").append(this.YL0.rw()).toString(), exception); JU jU = (JU)exception; km.VH.getClass(); if (Yj.LpT5(this)) throw exception;  }  return null; }
/*    */ 
/*    */   
/*    */   public final int[] pL0() {
/*    */     return this.ZI0;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */