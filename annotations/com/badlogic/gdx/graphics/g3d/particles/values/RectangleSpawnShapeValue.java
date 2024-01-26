package com.badlogic.gdx.graphics.g3d.particles.values;

import f.eo;

public final class RectangleSpawnShapeValue extends PrimitiveSpawnShapeValue {
  public RectangleSpawnShapeValue(RectangleSpawnShapeValue paramRectangleSpawnShapeValue) {
    super(paramRectangleSpawnShapeValue);
    load(paramRectangleSpawnShapeValue);
  }
  
  public RectangleSpawnShapeValue() {}
  
  public void spawnAux(eo parameo, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: dup2
    //   3: dup2
    //   4: dup2
    //   5: dup2
    //   6: getfield spawnWidth : F
    //   9: fstore_0
    //   10: getfield spawnWidthDiff : F
    //   13: fstore_3
    //   14: getfield spawnWidthValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValue;
    //   17: fload_2
    //   18: fload_3
    //   19: fload_0
    //   20: invokestatic Zn : (Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValue;FFF)F
    //   23: fstore_0
    //   24: getfield spawnHeight : F
    //   27: fstore_3
    //   28: getfield spawnHeightDiff : F
    //   31: fstore #4
    //   33: getfield spawnHeightValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValue;
    //   36: fload_2
    //   37: fload #4
    //   39: fload_3
    //   40: invokestatic Zn : (Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValue;FFF)F
    //   43: fstore_3
    //   44: getfield spawnDepth : F
    //   47: fstore #4
    //   49: getfield spawnDepthDiff : F
    //   52: fstore #5
    //   54: getfield spawnDepthValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValue;
    //   57: fload_2
    //   58: fload #5
    //   60: fload #4
    //   62: invokestatic Zn : (Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValue;FFF)F
    //   65: fstore_2
    //   66: getfield edges : Z
    //   69: ifeq -> 357
    //   72: getstatic f/nx0.Mc0 : Lf/W60;
    //   75: iconst_3
    //   76: invokevirtual nextInt : (I)I
    //   79: iconst_m1
    //   80: iadd
    //   81: dup
    //   82: istore #4
    //   84: iconst_m1
    //   85: if_icmpne -> 163
    //   88: iconst_1
    //   89: invokestatic cOM9 : (I)I
    //   92: ifne -> 103
    //   95: fload_0
    //   96: fneg
    //   97: fconst_2
    //   98: fdiv
    //   99: fstore_0
    //   100: goto -> 107
    //   103: fload_0
    //   104: fconst_2
    //   105: fdiv
    //   106: fstore_0
    //   107: fload_0
    //   108: fconst_0
    //   109: fcmpl
    //   110: ifne -> 142
    //   113: iconst_1
    //   114: invokestatic cOM9 : (I)I
    //   117: ifne -> 128
    //   120: fload_3
    //   121: fneg
    //   122: fconst_2
    //   123: fdiv
    //   124: fstore_3
    //   125: goto -> 132
    //   128: fload_3
    //   129: fconst_2
    //   130: fdiv
    //   131: fstore_3
    //   132: iconst_1
    //   133: invokestatic cOM9 : (I)I
    //   136: ifne -> 314
    //   139: goto -> 306
    //   142: fload_2
    //   143: fload_3
    //   144: invokestatic pq0 : (F)F
    //   147: fload_3
    //   148: fconst_2
    //   149: fdiv
    //   150: fsub
    //   151: fstore_3
    //   152: invokestatic pq0 : (F)F
    //   155: fload_2
    //   156: fconst_2
    //   157: fdiv
    //   158: fsub
    //   159: fstore_2
    //   160: goto -> 339
    //   163: iload #4
    //   165: ifne -> 255
    //   168: iconst_1
    //   169: invokestatic cOM9 : (I)I
    //   172: ifne -> 183
    //   175: fload_2
    //   176: fneg
    //   177: fconst_2
    //   178: fdiv
    //   179: fstore_2
    //   180: goto -> 187
    //   183: fload_2
    //   184: fconst_2
    //   185: fdiv
    //   186: fstore_2
    //   187: fload_2
    //   188: fconst_0
    //   189: fcmpl
    //   190: ifne -> 234
    //   193: iconst_1
    //   194: invokestatic cOM9 : (I)I
    //   197: ifne -> 208
    //   200: fload_3
    //   201: fneg
    //   202: fconst_2
    //   203: fdiv
    //   204: fstore_3
    //   205: goto -> 212
    //   208: fload_3
    //   209: fconst_2
    //   210: fdiv
    //   211: fstore_3
    //   212: iconst_1
    //   213: invokestatic cOM9 : (I)I
    //   216: ifne -> 227
    //   219: fload_0
    //   220: fneg
    //   221: fconst_2
    //   222: fdiv
    //   223: fstore_0
    //   224: goto -> 339
    //   227: fload_0
    //   228: fconst_2
    //   229: fdiv
    //   230: fstore_0
    //   231: goto -> 339
    //   234: fload_0
    //   235: fload_3
    //   236: invokestatic pq0 : (F)F
    //   239: fload_3
    //   240: fconst_2
    //   241: fdiv
    //   242: fsub
    //   243: fstore_3
    //   244: invokestatic pq0 : (F)F
    //   247: fload_0
    //   248: fconst_2
    //   249: fdiv
    //   250: fsub
    //   251: fstore_0
    //   252: goto -> 339
    //   255: iconst_1
    //   256: invokestatic cOM9 : (I)I
    //   259: ifne -> 270
    //   262: fload_3
    //   263: fneg
    //   264: fconst_2
    //   265: fdiv
    //   266: fstore_3
    //   267: goto -> 274
    //   270: fload_3
    //   271: fconst_2
    //   272: fdiv
    //   273: fstore_3
    //   274: fload_3
    //   275: fconst_0
    //   276: fcmpl
    //   277: ifne -> 321
    //   280: iconst_1
    //   281: invokestatic cOM9 : (I)I
    //   284: ifne -> 295
    //   287: fload_0
    //   288: fneg
    //   289: fconst_2
    //   290: fdiv
    //   291: fstore_0
    //   292: goto -> 299
    //   295: fload_0
    //   296: fconst_2
    //   297: fdiv
    //   298: fstore_0
    //   299: iconst_1
    //   300: invokestatic cOM9 : (I)I
    //   303: ifne -> 314
    //   306: fload_2
    //   307: fneg
    //   308: fconst_2
    //   309: fdiv
    //   310: fstore_2
    //   311: goto -> 339
    //   314: fload_2
    //   315: fconst_2
    //   316: fdiv
    //   317: fstore_2
    //   318: goto -> 339
    //   321: fload_2
    //   322: fload_0
    //   323: invokestatic pq0 : (F)F
    //   326: fload_0
    //   327: fconst_2
    //   328: fdiv
    //   329: fsub
    //   330: fstore_0
    //   331: invokestatic pq0 : (F)F
    //   334: fload_2
    //   335: fconst_2
    //   336: fdiv
    //   337: fsub
    //   338: fstore_2
    //   339: aload_1
    //   340: dup
    //   341: dup
    //   342: fload_0
    //   343: putfield x : F
    //   346: fload_3
    //   347: putfield y : F
    //   350: fload_2
    //   351: putfield z : F
    //   354: goto -> 393
    //   357: aload_1
    //   358: fload_2
    //   359: aload_1
    //   360: fload_3
    //   361: aload_1
    //   362: fload_0
    //   363: invokestatic pq0 : (F)F
    //   366: fload_0
    //   367: fconst_2
    //   368: fdiv
    //   369: fsub
    //   370: putfield x : F
    //   373: invokestatic pq0 : (F)F
    //   376: fload_3
    //   377: fconst_2
    //   378: fdiv
    //   379: fsub
    //   380: putfield y : F
    //   383: invokestatic pq0 : (F)F
    //   386: fload_2
    //   387: fconst_2
    //   388: fdiv
    //   389: fsub
    //   390: putfield z : F
    //   393: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 20
    //   #2	-> 24
    //   #3	-> 40
    //   #4	-> 44
    //   #5	-> 62
    //   #6	-> 66
    //   #7	-> 72
    //   #8	-> 89
  }
  
  public SpawnShapeValue copy() {
    return new RectangleSpawnShapeValue(this);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/RectangleSpawnShapeValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */