/* 1 */ package f;public final class dt { public static v2 cj(Object paramObject, String paramString) { if (paramObject != null) { HashMap<?, v2> hashMap; synchronized (paramObject.getClass()) { Object object; v2 v21; if ((v21 = (hashMap = jB).get(paramString)) != null) { if (v21.dn == null) { if ((object = v21.NA0) == paramObject || (object != null && object
/* 2 */               .equals(paramObject))) {  } else {  }  if (false) { /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap<[Wildcard{?}, ObjectType{f/v2}]>}, name=null} */ }
/* 3 */             else { throw new IllegalStateException("type '" + paramString + "' already registered but different"); }  } else { throw new IllegalStateException("type '" + paramString + "' already registered but different"); }  } else { int i = hashMap.size(); this(paramString, (Class)object, paramObject, i); hashMap.put(paramString, v21); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashMap<[Wildcard{?}, ObjectType{f/v2}]>}, name=null} */ }  return v21; }  }
/* 4 */      throw new NullPointerException("defaultValue"); }
/*   */ 
/*   */   
/*   */   public static final HashMap jB = new HashMap<>();
/*   */   public static final v2 Zn0 = cj(Integer.valueOf(11), "size");
/*   */   public static final v2 l80 = cj(Integer.valueOf(-1), "size_cjk");
/*   */   public static final v2 Ym;
/*   */   public static final v2 CL0 = cj(pD0.do0, "hinting");
/*   */   public static final v2 AT = cj(pD0.Gh0, "hinting_cjk");
/*   */   public static final v2 qQ = cj(Float.valueOf(1.8F), "gamma");
/*   */   public static final v2 S50 = cj(Integer.valueOf(2), "render_count");
/*   */   public static final v2 lo = cj(Float.valueOf(0.0F), "border_width");
/*   */   public static final v2 R7 = cj(pRn.BLACK, "border_color");
/*   */   public static final v2 oz0 = cj(Boolean.FALSE, "border_straight");
/*   */   public static final v2 iN = cj(Float.valueOf(1.8F), "border_gamma");
/*   */   public static final v2 M80 = cj(Integer.valueOf(0), "shadow_offset_x");
/*   */   public static final v2 Nl0 = cj(Integer.valueOf(0), "shadow_offset_y");
/*   */   public static final v2 Rf0 = cj(new pRn((byte)0, (byte)0, (byte)0, (byte)-65), "shadow_color");
/*   */   public static final v2 Wy0 = cj(Integer.valueOf(0), "space_x");
/*   */   public static final v2 rK0 = cj(Integer.valueOf(0), "space_y");
/*   */   public static final v2 pW;
/*   */   public static final v2 vw = cj(cu0.Fh, "min_filter");
/*   */   public static final v2 CN = cj(cu0.Fh, "mag_filter");
/*   */   public static final v2 Tw = cj(pRn.WHITE, "color");
/*   */   public static final v2 kC0 = cj(pRn.WHITE, "font_color");
/*   */   public static final v2 Dq0;
/*   */   public static final v2 RU;
/*   */   public static final v2 j10 = cj("\000ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890\"!`?'.,;:()[]{}<>|/@\\^$€-%+=#_&~* ¡¢£¤¥¦§¨©ª«¬­®¯°±²³´µ¶·¸¹º»¼½¾¿ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõö÷øùúûüýþÿ", "characters");
/*   */   public static final v2 cL0;
/*   */   public static final v2 Or = cj("", "faces");
/*   */   public static final v2 pc0 = cj(Boolean.FALSE, "unique_atlas");
/*   */   public static final v2 jj0 = cj(Boolean.FALSE, "markup");
/*   */   public Object[] pH0 = new Object[8];
/*   */   
/*   */   public dt() {}
/*   */   
/*   */   public dt(dt paramdt) {}
/*   */   
/*   */   public final void nC(v2 paramv2, Object paramObject) {
/*   */     if (paramv2 != null) {
/*   */       if (paramObject == null || paramv2.dn.isInstance(paramObject)) {
/*   */         int i;
/*   */         int j;
/*   */         if ((i = paramv2.IX) >= (j = this.pH0.length)) {
/*   */           System.arraycopy(this.pH0, 0, arrayOfObject, 0, j);
/*   */           Object[] arrayOfObject = new Object[Math.max(i + 1, j * 2)];
/*   */         } 
/*   */         this.pH0[i] = paramObject;
/*   */         return;
/*   */       } 
/*   */       throw new ClassCastException("value");
/*   */     } 
/*   */     throw new NullPointerException("type");
/*   */   }
/*   */   
/*   */   public final Object xD(v2 paramv2) {
/*   */     Object[] arrayOfObject;
/*   */     Object object;
/*   */     int i;
/*   */     return ((i = paramv2.IX) < (arrayOfObject = this.pH0).length && (object = this[i]) != null) ? paramv2.dn.cast(this) : paramv2.NA0;
/*   */   }
/*   */   
/*   */   static {
/*   */     Boolean bool1;
/*   */     Ym = cj(bool1 = Boolean.FALSE, "mono");
/*   */   }
/*   */   
/*   */   static {
/*   */     pW = cj(bool2, "kerning");
/*   */   }
/*   */   
/*   */   static {
/*   */     Dq0 = cj(bool1, "underline");
/*   */     RU = cj(bool1, "linethrough");
/*   */   }
/*   */   
/*   */   static {
/*   */     Boolean bool2;
/*   */     cL0 = cj(bool2 = Boolean.TRUE, "incremental");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */