package com.badlogic.gdx.graphics.g3d.particles.values;

import f.W60;
import f.eo;
import java.util.Random;

public final class RectangleSpawnShapeValueExt extends PrimitiveSpawnShapeValueExt {
  private final Random random;
  
  public RectangleSpawnShapeValueExt(RectangleSpawnShapeValueExt paramRectangleSpawnShapeValueExt) {
    super(paramRectangleSpawnShapeValueExt);
    W60 w60;
    this();
    this.random = (Random)this;
    load(paramRectangleSpawnShapeValueExt);
  }
  
  public RectangleSpawnShapeValueExt() {
    W60 w60;
    this();
    this.random = (Random)this;
  }
  
  public void reSeed() {
    super.reSeed();
    if (this.seed.isActive())
      this.random.setSeed(this.seed.getValue()); 
  }
  
  public void spawnAux(eo parameo, float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: dup2
    //   3: dup2
    //   4: dup2
    //   5: dup2
    //   6: getfield spawnWidth : F
    //   9: fstore_3
    //   10: getfield spawnWidthDiff : F
    //   13: fstore #4
    //   15: getfield spawnWidthValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValueExt;
    //   18: fload_2
    //   19: fload #4
    //   21: fload_3
    //   22: invokestatic COn : (Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValueExt;FFF)F
    //   25: fstore_3
    //   26: getfield spawnHeight : F
    //   29: fstore #4
    //   31: getfield spawnHeightDiff : F
    //   34: fstore #5
    //   36: getfield spawnHeightValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValueExt;
    //   39: fload_2
    //   40: fload #5
    //   42: fload #4
    //   44: invokestatic COn : (Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValueExt;FFF)F
    //   47: fstore #4
    //   49: getfield spawnDepth : F
    //   52: fstore #5
    //   54: getfield spawnDepthDiff : F
    //   57: fstore #6
    //   59: getfield spawnDepthValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValueExt;
    //   62: fload_2
    //   63: fload #6
    //   65: fload #5
    //   67: invokestatic COn : (Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValueExt;FFF)F
    //   70: fstore_2
    //   71: getfield edges : Z
    //   74: ifeq -> 468
    //   77: aload_0
    //   78: getfield random : Ljava/util/Random;
    //   81: iconst_3
    //   82: invokevirtual nextInt : (I)I
    //   85: iconst_m1
    //   86: iadd
    //   87: dup
    //   88: istore #5
    //   90: iconst_m1
    //   91: if_icmpne -> 206
    //   94: aload_0
    //   95: getfield random : Ljava/util/Random;
    //   98: iconst_2
    //   99: invokevirtual nextInt : (I)I
    //   102: ifne -> 113
    //   105: fload_3
    //   106: fneg
    //   107: fconst_2
    //   108: fdiv
    //   109: fstore_3
    //   110: goto -> 117
    //   113: fload_3
    //   114: fconst_2
    //   115: fdiv
    //   116: fstore_3
    //   117: fload_3
    //   118: fconst_0
    //   119: fcmpl
    //   120: ifne -> 173
    //   123: aload_0
    //   124: getfield random : Ljava/util/Random;
    //   127: iconst_2
    //   128: invokevirtual nextInt : (I)I
    //   131: ifne -> 144
    //   134: fload #4
    //   136: fneg
    //   137: fconst_2
    //   138: fdiv
    //   139: fstore #4
    //   141: goto -> 150
    //   144: fload #4
    //   146: fconst_2
    //   147: fdiv
    //   148: fstore #4
    //   150: aload_0
    //   151: getfield random : Ljava/util/Random;
    //   154: iconst_2
    //   155: invokevirtual nextInt : (I)I
    //   158: ifne -> 167
    //   161: fload #4
    //   163: fstore_0
    //   164: goto -> 404
    //   167: fload #4
    //   169: fstore_0
    //   170: goto -> 412
    //   173: aload_0
    //   174: dup
    //   175: getfield random : Ljava/util/Random;
    //   178: invokevirtual nextFloat : ()F
    //   181: fload #4
    //   183: fmul
    //   184: fload #4
    //   186: fconst_2
    //   187: fdiv
    //   188: fsub
    //   189: fstore_0
    //   190: getfield random : Ljava/util/Random;
    //   193: invokevirtual nextFloat : ()F
    //   196: fload_2
    //   197: fmul
    //   198: fload_2
    //   199: fconst_2
    //   200: fdiv
    //   201: fsub
    //   202: fstore_2
    //   203: goto -> 450
    //   206: iload #5
    //   208: ifne -> 333
    //   211: aload_0
    //   212: getfield random : Ljava/util/Random;
    //   215: iconst_2
    //   216: invokevirtual nextInt : (I)I
    //   219: ifne -> 230
    //   222: fload_2
    //   223: fneg
    //   224: fconst_2
    //   225: fdiv
    //   226: fstore_2
    //   227: goto -> 234
    //   230: fload_2
    //   231: fconst_2
    //   232: fdiv
    //   233: fstore_2
    //   234: fload_2
    //   235: fconst_0
    //   236: fcmpl
    //   237: ifne -> 300
    //   240: aload_0
    //   241: getfield random : Ljava/util/Random;
    //   244: iconst_2
    //   245: invokevirtual nextInt : (I)I
    //   248: ifne -> 261
    //   251: fload #4
    //   253: fneg
    //   254: fconst_2
    //   255: fdiv
    //   256: fstore #4
    //   258: goto -> 267
    //   261: fload #4
    //   263: fconst_2
    //   264: fdiv
    //   265: fstore #4
    //   267: aload_0
    //   268: getfield random : Ljava/util/Random;
    //   271: iconst_2
    //   272: invokevirtual nextInt : (I)I
    //   275: ifne -> 288
    //   278: fload_3
    //   279: fneg
    //   280: fconst_2
    //   281: fdiv
    //   282: fstore_0
    //   283: fload_0
    //   284: fstore_3
    //   285: goto -> 294
    //   288: fload_3
    //   289: fconst_2
    //   290: fdiv
    //   291: fstore_0
    //   292: fload_0
    //   293: fstore_3
    //   294: fload #4
    //   296: fstore_0
    //   297: goto -> 450
    //   300: aload_0
    //   301: dup
    //   302: getfield random : Ljava/util/Random;
    //   305: invokevirtual nextFloat : ()F
    //   308: fload #4
    //   310: fmul
    //   311: fload #4
    //   313: fconst_2
    //   314: fdiv
    //   315: fsub
    //   316: fstore_0
    //   317: getfield random : Ljava/util/Random;
    //   320: invokevirtual nextFloat : ()F
    //   323: fload_3
    //   324: fmul
    //   325: fload_3
    //   326: fconst_2
    //   327: fdiv
    //   328: fsub
    //   329: fstore_3
    //   330: goto -> 450
    //   333: aload_0
    //   334: getfield random : Ljava/util/Random;
    //   337: iconst_2
    //   338: invokevirtual nextInt : (I)I
    //   341: ifne -> 354
    //   344: fload #4
    //   346: fneg
    //   347: fconst_2
    //   348: fdiv
    //   349: fstore #4
    //   351: goto -> 360
    //   354: fload #4
    //   356: fconst_2
    //   357: fdiv
    //   358: fstore #4
    //   360: fload #4
    //   362: fconst_0
    //   363: fcmpl
    //   364: ifne -> 419
    //   367: aload_0
    //   368: getfield random : Ljava/util/Random;
    //   371: iconst_2
    //   372: invokevirtual nextInt : (I)I
    //   375: ifne -> 386
    //   378: fload_3
    //   379: fneg
    //   380: fconst_2
    //   381: fdiv
    //   382: fstore_3
    //   383: goto -> 390
    //   386: fload_3
    //   387: fconst_2
    //   388: fdiv
    //   389: fstore_3
    //   390: aload_0
    //   391: getfield random : Ljava/util/Random;
    //   394: iconst_2
    //   395: invokevirtual nextInt : (I)I
    //   398: ifne -> 167
    //   401: goto -> 161
    //   404: fload_2
    //   405: fneg
    //   406: fconst_2
    //   407: fdiv
    //   408: fstore_2
    //   409: goto -> 450
    //   412: fload_2
    //   413: fconst_2
    //   414: fdiv
    //   415: fstore_2
    //   416: goto -> 450
    //   419: aload_0
    //   420: dup
    //   421: getfield random : Ljava/util/Random;
    //   424: invokevirtual nextFloat : ()F
    //   427: fload_3
    //   428: fmul
    //   429: fload_3
    //   430: fconst_2
    //   431: fdiv
    //   432: fsub
    //   433: fstore_3
    //   434: getfield random : Ljava/util/Random;
    //   437: invokevirtual nextFloat : ()F
    //   440: fload_2
    //   441: fmul
    //   442: fload_2
    //   443: fconst_2
    //   444: fdiv
    //   445: fsub
    //   446: fstore_2
    //   447: fload #4
    //   449: fstore_0
    //   450: aload_1
    //   451: dup
    //   452: dup
    //   453: fload_3
    //   454: putfield x : F
    //   457: fload_0
    //   458: putfield y : F
    //   461: fload_2
    //   462: putfield z : F
    //   465: goto -> 521
    //   468: aload_1
    //   469: aload_0
    //   470: aload_1
    //   471: aload_0
    //   472: aload_1
    //   473: aload_0
    //   474: getfield random : Ljava/util/Random;
    //   477: invokevirtual nextFloat : ()F
    //   480: fload_3
    //   481: fmul
    //   482: fload_3
    //   483: fconst_2
    //   484: fdiv
    //   485: fsub
    //   486: putfield x : F
    //   489: getfield random : Ljava/util/Random;
    //   492: invokevirtual nextFloat : ()F
    //   495: fload #4
    //   497: fmul
    //   498: fload #4
    //   500: fconst_2
    //   501: fdiv
    //   502: fsub
    //   503: putfield y : F
    //   506: getfield random : Ljava/util/Random;
    //   509: invokevirtual nextFloat : ()F
    //   512: fload_2
    //   513: fmul
    //   514: fload_2
    //   515: fconst_2
    //   516: fdiv
    //   517: fsub
    //   518: putfield z : F
    //   521: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 22
    //   #2	-> 26
    //   #3	-> 44
    //   #4	-> 49
    //   #5	-> 67
    //   #6	-> 71
  }
  
  public SpawnShapeValueExt copy() {
    return new RectangleSpawnShapeValueExt(this);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/RectangleSpawnShapeValueExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */