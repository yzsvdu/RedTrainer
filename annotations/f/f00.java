/* 1 */ package f;public final class f00 extends Ar0 { public jh Ki; public final Object loadSync(sz0 paramsz0, String paramString, RD0 paramRD0, wP paramwP) { Texture texture; kd0 kd0 = (kd0)paramwP; jh jh1; if ((jh1 = this.Ki) == null) { this = null; } else { Texture texture1; if ((texture1 = jh1.wc0) != null) { texture1.load(jh1.CU); texture = texture1; } else { Texture texture2; this(((f00)super).Ki.CU); texture = texture2; }  if (kd0 != null) { cu0 cu0 = kd0.Ok0; setFilter(cu0, kd0.Xd0); A00 a00 = kd0.f9; setWrap(a00, kd0.UC); }  }  return this; } public f00(Xt0 paramXt0) { super(paramXt0); jh jh1; this(); this.Ki = this; } public final void loadAsync(sz0 paramsz0, String paramString, RD0 paramRD0, wP paramwP) { Uc uc; this.Ki.getClass(); kd0 kd0; Bu0 bu0; if ((kd0 = (kd0)paramwP) == null || (bu0 = kd0.h30) == null) { bu0 = null; boolean bool = false; jh jh1; (jh1 = this.Ki).wc0 = null; if (kd0 != null) { uc = kd0.kv0; bool = kd0.ER; jh1.wc0 = kd0.mJ; }  jh1.CU = W7.xi(paramRD0, uc, bool); } else { this.Ki.CU = (Bu0)uc; this.Ki.wc0 = kd0.mJ; }  if (!this.Ki.CU.aF0()) this.Ki.CU.zr0();  }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/f00.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */