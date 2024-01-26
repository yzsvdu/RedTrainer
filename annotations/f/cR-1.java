/*  1 */ package f;public class cR { public final cR g8; public final NF z0; public Object[] LPt1; public final cR bw0(e00 parame00) { if (!parame00.V3) return this; 
/*  2 */     int i = parame00.x10; while (true)
/*  3 */     { cR cR1; if ((cR1 = this.g8) != null)
/*  4 */       { Object[] arrayOfObject; if ((arrayOfObject = this.LPt1) != null) { Object object = arrayOfObject[i]; } else { arrayOfObject = null; }  if (arrayOfObject == null) { this = cR1; continue; }  }  return this; }  }
/*  5 */   public cR() { this(null, null); } public cR(cR paramcR, NF paramNF) { this.g8 = paramcR; this.z0 = paramNF; } public cR(cR paramcR) { this.g8 = paramcR.g8; this.z0 = paramcR.z0; Object[] arrayOfObject; if ((arrayOfObject = paramcR.LPt1) != null) { arrayOfObject = (Object[])arrayOfObject.clone(); } else { arrayOfObject = null; }  this.LPt1 = arrayOfObject; } public final Object rI(e00 parame00) { Object object; int i = parame00.x10; Object[] arrayOfObject; if ((arrayOfObject = this.LPt1) != null) { object = arrayOfObject[i]; } else { object = null; }  if (this == null && this == null) return parame00.b10;  return parame00.Tw0.cast(this); } public final void Ul0(e00 parame00, Object paramObject) { if (parame00 != null) { if (paramObject == null) { if (this.LPt1 == null) return;  } else if (parame00.Tw0.isInstance(paramObject)) { if (this.LPt1 == null)
/*  6 */           this.LPt1 = new Object[e00.Jk()];  } else { throw new IllegalArgumentException(
/*  7 */             B40.df("value is a ")
/*  8 */             .append(paramObject.getClass()).append(" but must be a ")
/*    */             
/* 10 */             .append(parame00.Tw0).toString()); }  this.LPt1[parame00.x10] = paramObject; return; }  throw new IllegalArgumentException("attribute is null"); }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */