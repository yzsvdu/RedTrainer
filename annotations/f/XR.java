/* 1 */ package f;public final class XR { public Zf0[] Bc0; public int RS; public XR oy0; public final Object VV(Object paramObject) { Zf0 zf0; Zf0[] arrayOfZf0; while ((arrayOfZf0 = this.Bc0) == null || (zf0 = (Zf0)gy0.Hr0((gy0[])arrayOfZf0, paramObject)) == null) { if ((this = this.oy0) == null) { zf0 = null; break; }  }  if (zf0 != null)
/* 2 */       return zf0.Sc;  return null; } public final Object HC(Object paramObject1, Object paramObject2) { if (paramObject1 != null) { Zf0 zf0; Object object = null; Zf0[] arrayOfZf0; if ((arrayOfZf0 = this.Bc0) != null) { Zf0 zf01; if ((zf01 = (Zf0)gy0.Hr0((gy0[])arrayOfZf0, paramObject1)) != null) { zf01.Sc = paramObject2; return zf01.Sc; }  XR xR; if ((xR = this.oy0) != null) object = xR.VV(paramObject1);  }  if (this.Bc0 == null) this.Bc0 = new Zf0[16];  int i = this.RS + 1; this.Bc0 = (Zf0[])gy0.else((gy0[])this.Bc0, i); this(paramObject1, paramObject2); int j; this.FK0 = (gy0)paramObject1[j = this.ks & paramObject1.length - 1]; (paramObject1 = this.Bc0)[j] = this; return object; }
/* 3 */      throw new NullPointerException("key"); } public final void Xd0(XR paramXR) { XR xR; if ((xR = this.oy0) != null) while (true) { Zf0[] arrayOfZf0; if ((arrayOfZf0 = xR.Bc0) != null) { byte b; int i; for (b = 0, i = arrayOfZf0.length; b < i; ) { for (Zf0 zf0 = arrayOfZf0[b]; zf0 != null; ) { if (gy0.Hr0((gy0[])this.Bc0, zf0.NF) == null) { Zf0 zf01; Object object1 = zf0.NF, object2 = zf0.Sc; if (this.Bc0 == null) this.Bc0 = new Zf0[16];  int k = this.RS + 1; this.Bc0 = (Zf0[])gy0.else((gy0[])this.Bc0, k); this(object1, object2); int j; zf01.FK0 = (gy0)object1[j = zf01.ks & object1.length - 1]; (object1 = this.Bc0)[j] = zf01; }
/* 4 */                zf0 = (Zf0)zf0.FK0; }  b++; }  }  if ((xR = xR.oy0) == null) { this
/* 5 */             .oy0 = null; break; }  }   this.oy0 = paramXR; }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/XR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */