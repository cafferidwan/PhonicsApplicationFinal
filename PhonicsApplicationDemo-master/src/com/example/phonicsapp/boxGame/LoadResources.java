package com.example.phonicsapp.boxGame;

import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource;
import org.andengine.opengl.texture.atlas.buildable.builder.BlackPawnTextureAtlasBuilder;
import org.andengine.opengl.texture.atlas.buildable.builder.ITextureAtlasBuilder.TextureAtlasBuilderException;
import org.andengine.util.debug.Debug;

import com.example.phonicsapp.MenuPage;

public class LoadResources 
{

	public static void loadAllObjects()
	{
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("Assets/");
		
		//if letter are mo, aa, lo, ko, to
		if(MenuPage.letterNumber==1||MenuPage.letterNumber==2||MenuPage.letterNumber==8||
				MenuPage.letterNumber==5||MenuPage.letterNumber==18)
		{
			BoxGameActivity.mBitmapTextureAtlasJungleBackGround = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
			BoxGameActivity.mJungleBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasJungleBackGround, BoxGameActivity.boxGameActivityInstance,
					"JungleBG.png", 0, 0,  1, 1);
			BoxGameActivity.mBitmapTextureAtlasJungleBackGround.load();
			
			BoxGameActivity.mJungleBitmapTextureAtlasBoxOpen = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mJungleBoxOpenTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mJungleBitmapTextureAtlasBoxOpen, BoxGameActivity.boxGameActivityInstance,
					"JungleBoxOpen.png", 0, 0,  1, 1);
			BoxGameActivity.mJungleBitmapTextureAtlasBoxClose = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mJungleBoxCloseTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mJungleBitmapTextureAtlasBoxClose, BoxGameActivity.boxGameActivityInstance,
					"JungleBoxClose.png", 0, 0,  1, 1);
			BoxGameActivity.mJungleBitmapTextureAtlasBoxOpen.load();
			BoxGameActivity.mJungleBitmapTextureAtlasBoxClose.load();
			
			
			BoxGameActivity.mAnimatedJungleParrotBitmapTextureAtlas = new BuildableBitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 806, 806, TextureOptions.REPEATING_BILINEAR_PREMULTIPLYALPHA);
			BoxGameActivity.mJungleParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.
					createTiledFromAsset(BoxGameActivity.mAnimatedJungleParrotBitmapTextureAtlas, BoxGameActivity.boxGameActivityInstance, "JungleParrot.png", 2, 2);
			try 
			{
				BoxGameActivity.mAnimatedJungleParrotBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
				BoxGameActivity.mAnimatedJungleParrotBitmapTextureAtlas.load();
			} 
			catch (TextureAtlasBuilderException e) 
			{
				Debug.e(e);
			}
		}
		//if letter are bo, no, cho, e, po
		else if(MenuPage.letterNumber==6||MenuPage.letterNumber==14||MenuPage.letterNumber==13||
				MenuPage.letterNumber==3||MenuPage.letterNumber==9)
		{
			BoxGameActivity.mBitmapTextureAtlasBeachBackGround = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
			BoxGameActivity.mBeachBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBeachBackGround, BoxGameActivity.boxGameActivityInstance,
					"BeachBG.png", 0, 0,  1, 1);
			BoxGameActivity.mBitmapTextureAtlasBeachBackGround.load();
			
			
			BoxGameActivity.mBeachBitmapTextureAtlasBoxOpen = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mBeachBoxOpenTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBeachBitmapTextureAtlasBoxOpen, BoxGameActivity.boxGameActivityInstance,
					"BeachBoxOpen.png", 0, 0,  1, 1);
			BoxGameActivity.mBeachBitmapTextureAtlasBoxClose = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mBeachBoxCloseTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBeachBitmapTextureAtlasBoxClose, BoxGameActivity.boxGameActivityInstance,
					"BeachBoxClose.png", 0, 0,  1, 1);
			BoxGameActivity.mBeachBitmapTextureAtlasBoxOpen.load();
			BoxGameActivity.mBeachBitmapTextureAtlasBoxClose.load();
			
			
			BoxGameActivity.mAnimatedBeachParrotBitmapTextureAtlas = new BuildableBitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 806, 806, TextureOptions.REPEATING_BILINEAR_PREMULTIPLYALPHA);
			BoxGameActivity.mBeachParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.
					createTiledFromAsset(BoxGameActivity.mAnimatedBeachParrotBitmapTextureAtlas, BoxGameActivity.boxGameActivityInstance, "BeachParrot.png", 2, 2);
			try 
			{
				BoxGameActivity.mAnimatedBeachParrotBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
				BoxGameActivity.mAnimatedBeachParrotBitmapTextureAtlas.load();
			} 
			catch (TextureAtlasBuilderException e) 
			{
				Debug.e(e);
			}
		}
		//if letter are raw, talibasha, do, a, doh
		else if(MenuPage.letterNumber==4||MenuPage.letterNumber==7||MenuPage.letterNumber==16||
				MenuPage.letterNumber==15||MenuPage.letterNumber==20)
		{
			BoxGameActivity.mBitmapTextureAtlasUnderWaterBackGround = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
			BoxGameActivity.mUnderWaterBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasUnderWaterBackGround, BoxGameActivity.boxGameActivityInstance,
					"UnderWaterBG.png", 0, 0,  1, 1);
			BoxGameActivity.mBitmapTextureAtlasUnderWaterBackGround.load();
			
			
			BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxOpen = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mUnderWaterBoxTextureOpenRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxOpen, BoxGameActivity.boxGameActivityInstance,
					"UnderWaterBoxOpen.png", 0, 0,  1, 1);
			BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxClose = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mUnderWaterBoxCloseTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxClose, BoxGameActivity.boxGameActivityInstance,
					"UnderWaterBoxClose.png", 0, 0,  1, 1);
			BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxOpen.load();
			BoxGameActivity.mUnderWaterBitmapTextureAtlasBoxClose.load();
			
			
			BoxGameActivity.mAnimatedUnderWaterParrotBitmapTextureAtlas = new BuildableBitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 806, 806, TextureOptions.REPEATING_BILINEAR_PREMULTIPLYALPHA);
			BoxGameActivity.mUnderWaterParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.
					createTiledFromAsset(BoxGameActivity.mAnimatedUnderWaterParrotBitmapTextureAtlas, BoxGameActivity.boxGameActivityInstance, "UnderWaterParrot.png", 2, 2);
			try 
			{
				BoxGameActivity.mAnimatedUnderWaterParrotBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
				BoxGameActivity.mAnimatedUnderWaterParrotBitmapTextureAtlas.load();
			} 
			catch (TextureAtlasBuilderException e) 
			{
				Debug.e(e);
			}
		}
		//if letter are toh, kho, u, go, ho
		else if(MenuPage.letterNumber==19||MenuPage.letterNumber==12||MenuPage.letterNumber==17||
				MenuPage.letterNumber==10||MenuPage.letterNumber==11)
		{
			BoxGameActivity.mBitmapTextureAtlasPlanetBackGround = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 1600, 864, TextureOptions.BILINEAR);
			BoxGameActivity.mPlanetBackGroundTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasPlanetBackGround, BoxGameActivity.boxGameActivityInstance,
					"PlanetBG.png", 0, 0,  1, 1);
			BoxGameActivity.mBitmapTextureAtlasPlanetBackGround.load();
			
			
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxOpen = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mPlanetBoxOpenTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mPlanetBitmapTextureAtlasBoxOpen, BoxGameActivity.boxGameActivityInstance,
					"PlanetBoxOpen.png", 0, 0,  1, 1);
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxClose = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 180, 248, TextureOptions.BILINEAR);
			BoxGameActivity.mPlanetBoxCloseTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mPlanetBitmapTextureAtlasBoxClose, BoxGameActivity.boxGameActivityInstance,
					"PlanetBoxClose.png", 0, 0,  1, 1);
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxOpen.load();
			BoxGameActivity.mPlanetBitmapTextureAtlasBoxClose.load();
			
			
			BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas = new BuildableBitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 806, 806, TextureOptions.REPEATING_BILINEAR_PREMULTIPLYALPHA);
			BoxGameActivity.mPlanetParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.
					createTiledFromAsset(BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas, BoxGameActivity.boxGameActivityInstance, "PlanetParrot.png", 2, 2);
			try 
			{
				BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
				BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas.load();
			} 
			catch (TextureAtlasBuilderException e) 
			{
				Debug.e(e);
			}
		}
		
		//Mo
		if( MenuPage.letterNumber == 1)
		{
			//Letter-Mo
			BoxGameActivity.mBitmapTextureAtlasMo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo1, BoxGameActivity.boxGameActivityInstance,
					"ma.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo2, BoxGameActivity.boxGameActivityInstance,
					"megh.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo3, BoxGameActivity.boxGameActivityInstance,
					"mohish.png", 0, 0,  1, 1); 
			
			BoxGameActivity.mBitmapTextureAtlasMo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo4, BoxGameActivity.boxGameActivityInstance,
					"moi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo5, BoxGameActivity.boxGameActivityInstance,
					"mula.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo6, BoxGameActivity.boxGameActivityInstance,
					"mama.png", 0, 0,  1, 1); 
			
			BoxGameActivity.mBitmapTextureAtlasMo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mMoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasMo, BoxGameActivity.boxGameActivityInstance,
					"Letters/mo.png", 0, 0,  1, 1);
			 
			BoxGameActivity.mBitmapTextureAtlasWMo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWMo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWMo1, BoxGameActivity.boxGameActivityInstance,
					"tomtom.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWMo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWMo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWMo2, BoxGameActivity.boxGameActivityInstance,
					"bol.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasMo1.load();
			BoxGameActivity.mBitmapTextureAtlasMo2.load();
			BoxGameActivity.mBitmapTextureAtlasMo3.load();
			BoxGameActivity.mBitmapTextureAtlasMo4.load();
			BoxGameActivity.mBitmapTextureAtlasMo5.load();
			BoxGameActivity.mBitmapTextureAtlasMo6.load();
			BoxGameActivity.mBitmapTextureAtlasMo.load();
			BoxGameActivity.mBitmapTextureAtlasWMo1.load();
			BoxGameActivity.mBitmapTextureAtlasWMo2.load();
		}
		//Aa
		else if( MenuPage.letterNumber == 2)
		{
			//Letter-Aa
			BoxGameActivity.mBitmapTextureAtlasAa1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mAa1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasAa1, BoxGameActivity.boxGameActivityInstance,
					"ada.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasAa2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mAa2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasAa2, BoxGameActivity.boxGameActivityInstance,
					"alu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasAa3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mAa3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasAa3, BoxGameActivity.boxGameActivityInstance,
					"am.png", 0, 0,  1, 1); 
			
			BoxGameActivity.mBitmapTextureAtlasAa4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mAa4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasAa4, BoxGameActivity.boxGameActivityInstance,
					"anarosh.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasAa5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mAa5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasAa5, BoxGameActivity.boxGameActivityInstance,
					"angur.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasAa6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mAa6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasAa6, BoxGameActivity.boxGameActivityInstance,
					"apple.png", 0, 0,  1, 1); 
			
			BoxGameActivity.mBitmapTextureAtlasAa = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mAaTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasAa, BoxGameActivity.boxGameActivityInstance,
					"Letters/aa.png", 0, 0,  1, 1);
			 
			BoxGameActivity.mBitmapTextureAtlasWAa1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWAa1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWAa1, BoxGameActivity.boxGameActivityInstance,
					"moi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWAa2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWAa2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWAa2, BoxGameActivity.boxGameActivityInstance,
					"bol.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasAa1.load();
			BoxGameActivity.mBitmapTextureAtlasAa2.load();
			BoxGameActivity.mBitmapTextureAtlasAa3.load();
			BoxGameActivity.mBitmapTextureAtlasAa4.load();
			BoxGameActivity.mBitmapTextureAtlasAa5.load();
			BoxGameActivity.mBitmapTextureAtlasAa6.load();
			BoxGameActivity.mBitmapTextureAtlasAa.load();
			BoxGameActivity.mBitmapTextureAtlasWAa1.load();
			BoxGameActivity.mBitmapTextureAtlasWAa2.load();
		}
		//E
		else if( MenuPage.letterNumber == 3)
		{
			//Letter-E
			BoxGameActivity.mBitmapTextureAtlasE1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mE1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasE1, BoxGameActivity.boxGameActivityInstance,
					"idur.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasE2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mE2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasE2, BoxGameActivity.boxGameActivityInstance,
					"iftar.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasE3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mE3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasE3, BoxGameActivity.boxGameActivityInstance,
					"ilish.png", 0, 0,  1, 1); 
			
			BoxGameActivity.mBitmapTextureAtlasE4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mE4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasE4, BoxGameActivity.boxGameActivityInstance,
					"imam.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasE5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mE5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasE5, BoxGameActivity.boxGameActivityInstance,
					"it.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasE6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mE6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasE6, BoxGameActivity.boxGameActivityInstance,
					"imarot.png", 0, 0,  1, 1); 
			
			BoxGameActivity.mBitmapTextureAtlasE = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mETextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasE, BoxGameActivity.boxGameActivityInstance,
					"Letters/e.png", 0, 0,  1, 1);
			 
			BoxGameActivity.mBitmapTextureAtlasWE1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWE1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWE1, BoxGameActivity.boxGameActivityInstance,
					"am.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWE2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWE2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWE2, BoxGameActivity.boxGameActivityInstance,
					"tomato.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasE1.load();
			BoxGameActivity.mBitmapTextureAtlasE2.load();
			BoxGameActivity.mBitmapTextureAtlasE3.load();
			BoxGameActivity.mBitmapTextureAtlasE4.load();
			BoxGameActivity.mBitmapTextureAtlasE5.load();
			BoxGameActivity.mBitmapTextureAtlasE6.load();
			BoxGameActivity.mBitmapTextureAtlasE.load();
			BoxGameActivity.mBitmapTextureAtlasWE1.load();
			BoxGameActivity.mBitmapTextureAtlasWE2.load();
		}
		//Raw
		else if( MenuPage.letterNumber == 4)
		{
			//Letter-Raw
			BoxGameActivity.mBitmapTextureAtlasRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw1, BoxGameActivity.boxGameActivityInstance,
					"rakhal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw2, BoxGameActivity.boxGameActivityInstance,
					"rana.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw3, BoxGameActivity.boxGameActivityInstance,
					"rani.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw4, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw5, BoxGameActivity.boxGameActivityInstance,
					"roket.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw6, BoxGameActivity.boxGameActivityInstance,
					"robi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRawTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw, BoxGameActivity.boxGameActivityInstance,
					"Letters/raw.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw1, BoxGameActivity.boxGameActivityInstance,
					"mohish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw2, BoxGameActivity.boxGameActivityInstance,
					"baba.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasRaw2.load();
			BoxGameActivity.mBitmapTextureAtlasRaw3.load();
			BoxGameActivity.mBitmapTextureAtlasRaw4.load();
			BoxGameActivity.mBitmapTextureAtlasRaw5.load();
			BoxGameActivity.mBitmapTextureAtlasRaw6.load();
			BoxGameActivity.mBitmapTextureAtlasRaw.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw2.load();
		}
		//Ko
		else if( MenuPage.letterNumber == 5)
		{
			//Letter-Ko
			BoxGameActivity.mBitmapTextureAtlasKo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKo1, BoxGameActivity.boxGameActivityInstance,
					"rakhal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKo2, BoxGameActivity.boxGameActivityInstance,
					"rana.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKo3, BoxGameActivity.boxGameActivityInstance,
					"rani.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKo4, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKo5, BoxGameActivity.boxGameActivityInstance,
					"roket.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKo6, BoxGameActivity.boxGameActivityInstance,
					"robi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasKo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mKoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasKo, BoxGameActivity.boxGameActivityInstance,
					"Letters/raw.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWKo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWKo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWKo1, BoxGameActivity.boxGameActivityInstance,
					"mohish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWKo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWKo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWKo2, BoxGameActivity.boxGameActivityInstance,
					"baba.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasKo1.load();
			BoxGameActivity.mBitmapTextureAtlasKo2.load();
			BoxGameActivity.mBitmapTextureAtlasKo3.load();
			BoxGameActivity.mBitmapTextureAtlasKo4.load();
			BoxGameActivity.mBitmapTextureAtlasKo5.load();
			BoxGameActivity.mBitmapTextureAtlasKo6.load();
			BoxGameActivity.mBitmapTextureAtlasKo.load();
			BoxGameActivity.mBitmapTextureAtlasWKo1.load();
			BoxGameActivity.mBitmapTextureAtlasWKo2.load();
		}
		//Bo
		else if( MenuPage.letterNumber == 6)
		{
			//Letter-Bo
			BoxGameActivity.mBitmapTextureAtlasBo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo1, BoxGameActivity.boxGameActivityInstance,
					"balish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo2, BoxGameActivity.boxGameActivityInstance,
					"belun.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo3, BoxGameActivity.boxGameActivityInstance,
					"baba.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo4, BoxGameActivity.boxGameActivityInstance,
					"bok.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo5, BoxGameActivity.boxGameActivityInstance,
					"begun.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo6, BoxGameActivity.boxGameActivityInstance,
					"bol.png", 0, 0,  1, 1); 
			
			BoxGameActivity.mBitmapTextureAtlasBo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mBoTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasBo, BoxGameActivity.boxGameActivityInstance,
					"Letters/bo.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWBo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWBo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWBo1, BoxGameActivity.boxGameActivityInstance,
					"robi.png", 0, 0,  1, 1);
			 
			BoxGameActivity.mBitmapTextureAtlasWBo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWBo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWBo2, BoxGameActivity.boxGameActivityInstance,
					"moi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasBo1.load();
			BoxGameActivity.mBitmapTextureAtlasBo2.load();
			BoxGameActivity.mBitmapTextureAtlasBo3.load();
			BoxGameActivity.mBitmapTextureAtlasBo4.load();
			BoxGameActivity.mBitmapTextureAtlasBo5.load();
			BoxGameActivity.mBitmapTextureAtlasBo6.load();
			BoxGameActivity.mBitmapTextureAtlasBo.load();
			BoxGameActivity.mBitmapTextureAtlasWBo1.load();
			BoxGameActivity.mBitmapTextureAtlasWBo2.load();
		}
		//Talibasha
		else if( MenuPage.letterNumber == 7)
		{
			//Letter-Raw
			BoxGameActivity.mBitmapTextureAtlasRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw1, BoxGameActivity.boxGameActivityInstance,
					"rakhal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw2, BoxGameActivity.boxGameActivityInstance,
					"rana.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw3, BoxGameActivity.boxGameActivityInstance,
					"rani.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw4, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw5, BoxGameActivity.boxGameActivityInstance,
					"roket.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw6, BoxGameActivity.boxGameActivityInstance,
					"robi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRawTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw, BoxGameActivity.boxGameActivityInstance,
					"Letters/raw.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw1, BoxGameActivity.boxGameActivityInstance,
					"mohish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw2, BoxGameActivity.boxGameActivityInstance,
					"baba.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasRaw2.load();
			BoxGameActivity.mBitmapTextureAtlasRaw3.load();
			BoxGameActivity.mBitmapTextureAtlasRaw4.load();
			BoxGameActivity.mBitmapTextureAtlasRaw5.load();
			BoxGameActivity.mBitmapTextureAtlasRaw6.load();
			BoxGameActivity.mBitmapTextureAtlasRaw.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw2.load();
		}
		//Lo
		else if( MenuPage.letterNumber == 8)
		{
			//Letter-Raw
			BoxGameActivity.mBitmapTextureAtlasRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw1, BoxGameActivity.boxGameActivityInstance,
					"rakhal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw2, BoxGameActivity.boxGameActivityInstance,
					"rana.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw3, BoxGameActivity.boxGameActivityInstance,
					"rani.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw4, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw5, BoxGameActivity.boxGameActivityInstance,
					"roket.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw6, BoxGameActivity.boxGameActivityInstance,
					"robi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRawTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw, BoxGameActivity.boxGameActivityInstance,
					"Letters/raw.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw1, BoxGameActivity.boxGameActivityInstance,
					"mohish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw2, BoxGameActivity.boxGameActivityInstance,
					"baba.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasRaw2.load();
			BoxGameActivity.mBitmapTextureAtlasRaw3.load();
			BoxGameActivity.mBitmapTextureAtlasRaw4.load();
			BoxGameActivity.mBitmapTextureAtlasRaw5.load();
			BoxGameActivity.mBitmapTextureAtlasRaw6.load();
			BoxGameActivity.mBitmapTextureAtlasRaw.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw2.load();
		}
		//Po
		else if( MenuPage.letterNumber == 9)
		{
			//Letter-Raw
			BoxGameActivity.mBitmapTextureAtlasRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw1, BoxGameActivity.boxGameActivityInstance,
					"rakhal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw2, BoxGameActivity.boxGameActivityInstance,
					"rana.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw3, BoxGameActivity.boxGameActivityInstance,
					"rani.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw4, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw5, BoxGameActivity.boxGameActivityInstance,
					"roket.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw6, BoxGameActivity.boxGameActivityInstance,
					"robi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRawTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw, BoxGameActivity.boxGameActivityInstance,
					"Letters/raw.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw1, BoxGameActivity.boxGameActivityInstance,
					"mohish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw2, BoxGameActivity.boxGameActivityInstance,
					"baba.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasRaw2.load();
			BoxGameActivity.mBitmapTextureAtlasRaw3.load();
			BoxGameActivity.mBitmapTextureAtlasRaw4.load();
			BoxGameActivity.mBitmapTextureAtlasRaw5.load();
			BoxGameActivity.mBitmapTextureAtlasRaw6.load();
			BoxGameActivity.mBitmapTextureAtlasRaw.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw2.load();
		}
		//Go
		else if( MenuPage.letterNumber == 10)
		{
			//Letter-Raw
			BoxGameActivity.mBitmapTextureAtlasRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw1, BoxGameActivity.boxGameActivityInstance,
					"rakhal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw2, BoxGameActivity.boxGameActivityInstance,
					"rana.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw3, BoxGameActivity.boxGameActivityInstance,
					"rani.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw4, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw5, BoxGameActivity.boxGameActivityInstance,
					"roket.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw6, BoxGameActivity.boxGameActivityInstance,
					"robi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRawTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw, BoxGameActivity.boxGameActivityInstance,
					"Letters/raw.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw1, BoxGameActivity.boxGameActivityInstance,
					"mohish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw2, BoxGameActivity.boxGameActivityInstance,
					"baba.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasRaw2.load();
			BoxGameActivity.mBitmapTextureAtlasRaw3.load();
			BoxGameActivity.mBitmapTextureAtlasRaw4.load();
			BoxGameActivity.mBitmapTextureAtlasRaw5.load();
			BoxGameActivity.mBitmapTextureAtlasRaw6.load();
			BoxGameActivity.mBitmapTextureAtlasRaw.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw2.load();
		}
		//Ho
		else if( MenuPage.letterNumber == 11)
		{
			//Letter-Raw
			BoxGameActivity.mBitmapTextureAtlasRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw1, BoxGameActivity.boxGameActivityInstance,
					"rakhal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw2, BoxGameActivity.boxGameActivityInstance,
					"rana.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw3, BoxGameActivity.boxGameActivityInstance,
					"rani.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw4, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw5, BoxGameActivity.boxGameActivityInstance,
					"roket.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw6, BoxGameActivity.boxGameActivityInstance,
					"robi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRawTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw, BoxGameActivity.boxGameActivityInstance,
					"Letters/raw.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw1, BoxGameActivity.boxGameActivityInstance,
					"mohish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw2, BoxGameActivity.boxGameActivityInstance,
					"baba.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasRaw2.load();
			BoxGameActivity.mBitmapTextureAtlasRaw3.load();
			BoxGameActivity.mBitmapTextureAtlasRaw4.load();
			BoxGameActivity.mBitmapTextureAtlasRaw5.load();
			BoxGameActivity.mBitmapTextureAtlasRaw6.load();
			BoxGameActivity.mBitmapTextureAtlasRaw.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw2.load();
		}
		//Kho
		else if( MenuPage.letterNumber == 12)
		{
			//Letter-Raw
			BoxGameActivity.mBitmapTextureAtlasRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw1, BoxGameActivity.boxGameActivityInstance,
					"rakhal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw2, BoxGameActivity.boxGameActivityInstance,
					"rana.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw3, BoxGameActivity.boxGameActivityInstance,
					"rani.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw4, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw5, BoxGameActivity.boxGameActivityInstance,
					"roket.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw6, BoxGameActivity.boxGameActivityInstance,
					"robi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRawTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw, BoxGameActivity.boxGameActivityInstance,
					"Letters/raw.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw1, BoxGameActivity.boxGameActivityInstance,
					"mohish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw2, BoxGameActivity.boxGameActivityInstance,
					"baba.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasRaw2.load();
			BoxGameActivity.mBitmapTextureAtlasRaw3.load();
			BoxGameActivity.mBitmapTextureAtlasRaw4.load();
			BoxGameActivity.mBitmapTextureAtlasRaw5.load();
			BoxGameActivity.mBitmapTextureAtlasRaw6.load();
			BoxGameActivity.mBitmapTextureAtlasRaw.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw2.load();
		}
		//Cho
		else if( MenuPage.letterNumber == 13)
		{
			//Letter-Raw
			BoxGameActivity.mBitmapTextureAtlasRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw1, BoxGameActivity.boxGameActivityInstance,
					"rakhal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw2, BoxGameActivity.boxGameActivityInstance,
					"rana.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw3, BoxGameActivity.boxGameActivityInstance,
					"rani.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw4, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw5, BoxGameActivity.boxGameActivityInstance,
					"roket.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw6, BoxGameActivity.boxGameActivityInstance,
					"robi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRawTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw, BoxGameActivity.boxGameActivityInstance,
					"Letters/raw.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw1, BoxGameActivity.boxGameActivityInstance,
					"mohish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw2, BoxGameActivity.boxGameActivityInstance,
					"baba.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasRaw2.load();
			BoxGameActivity.mBitmapTextureAtlasRaw3.load();
			BoxGameActivity.mBitmapTextureAtlasRaw4.load();
			BoxGameActivity.mBitmapTextureAtlasRaw5.load();
			BoxGameActivity.mBitmapTextureAtlasRaw6.load();
			BoxGameActivity.mBitmapTextureAtlasRaw.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw2.load();
		}
		//A
		else if( MenuPage.letterNumber == 14)
		{
			//Letter-Raw
			BoxGameActivity.mBitmapTextureAtlasRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw1, BoxGameActivity.boxGameActivityInstance,
					"rakhal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw2, BoxGameActivity.boxGameActivityInstance,
					"rana.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw3, BoxGameActivity.boxGameActivityInstance,
					"rani.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw4, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw5, BoxGameActivity.boxGameActivityInstance,
					"roket.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw6, BoxGameActivity.boxGameActivityInstance,
					"robi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRawTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw, BoxGameActivity.boxGameActivityInstance,
					"Letters/raw.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw1, BoxGameActivity.boxGameActivityInstance,
					"mohish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw2, BoxGameActivity.boxGameActivityInstance,
					"baba.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasRaw2.load();
			BoxGameActivity.mBitmapTextureAtlasRaw3.load();
			BoxGameActivity.mBitmapTextureAtlasRaw4.load();
			BoxGameActivity.mBitmapTextureAtlasRaw5.load();
			BoxGameActivity.mBitmapTextureAtlasRaw6.load();
			BoxGameActivity.mBitmapTextureAtlasRaw.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw2.load();
		}
		//A
		else if( MenuPage.letterNumber == 15)
		{
			//Letter-A
			BoxGameActivity.mBitmapTextureAtlasA1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mA1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasA1, BoxGameActivity.boxGameActivityInstance,
					"ek.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasA2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mA2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasA2, BoxGameActivity.boxGameActivityInstance,
					"ekar.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasA3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mA3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasA3, BoxGameActivity.boxGameActivityInstance,
					"ekhat.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasA4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mA4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasA4, BoxGameActivity.boxGameActivityInstance,
					"ekmuto.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasA5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mA5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasA5, BoxGameActivity.boxGameActivityInstance,
					"ektara.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasA6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mA6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasA6, BoxGameActivity.boxGameActivityInstance,
					"elach.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasA = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mATextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasA, BoxGameActivity.boxGameActivityInstance,
					"Letters/a.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWA1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWA1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWA1, BoxGameActivity.boxGameActivityInstance,
					"ada.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWA2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWA2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWA2, BoxGameActivity.boxGameActivityInstance,
					"idur.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasA1.load();
			BoxGameActivity.mBitmapTextureAtlasA2.load();
			BoxGameActivity.mBitmapTextureAtlasA3.load();
			BoxGameActivity.mBitmapTextureAtlasA4.load();
			BoxGameActivity.mBitmapTextureAtlasA5.load();
			BoxGameActivity.mBitmapTextureAtlasA6.load();
			BoxGameActivity.mBitmapTextureAtlasA.load();
			BoxGameActivity.mBitmapTextureAtlasWA1.load();
			BoxGameActivity.mBitmapTextureAtlasWA2.load();
		}
		//Do
		else if( MenuPage.letterNumber == 16)
		{
			//Letter-Raw
			BoxGameActivity.mBitmapTextureAtlasRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw1, BoxGameActivity.boxGameActivityInstance,
					"rakhal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw2, BoxGameActivity.boxGameActivityInstance,
					"rana.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw3, BoxGameActivity.boxGameActivityInstance,
					"rani.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw4, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw5, BoxGameActivity.boxGameActivityInstance,
					"roket.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw6, BoxGameActivity.boxGameActivityInstance,
					"robi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRawTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw, BoxGameActivity.boxGameActivityInstance,
					"Letters/raw.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw1, BoxGameActivity.boxGameActivityInstance,
					"mohish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw2, BoxGameActivity.boxGameActivityInstance,
					"baba.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasRaw2.load();
			BoxGameActivity.mBitmapTextureAtlasRaw3.load();
			BoxGameActivity.mBitmapTextureAtlasRaw4.load();
			BoxGameActivity.mBitmapTextureAtlasRaw5.load();
			BoxGameActivity.mBitmapTextureAtlasRaw6.load();
			BoxGameActivity.mBitmapTextureAtlasRaw.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw2.load();
		}
		//U
		else if( MenuPage.letterNumber == 17)
		{
			//Letter-Raw
			BoxGameActivity.mBitmapTextureAtlasRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw1, BoxGameActivity.boxGameActivityInstance,
					"rakhal.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw2, BoxGameActivity.boxGameActivityInstance,
					"rana.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw3, BoxGameActivity.boxGameActivityInstance,
					"rani.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw4, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw5, BoxGameActivity.boxGameActivityInstance,
					"roket.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRaw6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw6, BoxGameActivity.boxGameActivityInstance,
					"robi.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasRaw = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mRawTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasRaw, BoxGameActivity.boxGameActivityInstance,
					"Letters/raw.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw1, BoxGameActivity.boxGameActivityInstance,
					"mohish.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWRaw2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWRaw2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWRaw2, BoxGameActivity.boxGameActivityInstance,
					"baba.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasRaw2.load();
			BoxGameActivity.mBitmapTextureAtlasRaw3.load();
			BoxGameActivity.mBitmapTextureAtlasRaw4.load();
			BoxGameActivity.mBitmapTextureAtlasRaw5.load();
			BoxGameActivity.mBitmapTextureAtlasRaw6.load();
			BoxGameActivity.mBitmapTextureAtlasRaw.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw1.load();
			BoxGameActivity.mBitmapTextureAtlasWRaw2.load();
		}
		//To
		else if( MenuPage.letterNumber == 18)
		{
			//Letter-To 
			BoxGameActivity.mBitmapTextureAtlasTo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo1, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/ma.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo2, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/megh.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 150, 152, TextureOptions.BILINEAR);
			BoxGameActivity.mTo3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo3, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/mohis-2.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 150, 153, TextureOptions.BILINEAR);
			BoxGameActivity.mTo4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo4, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/moi-2.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 150, 153, TextureOptions.BILINEAR);
			BoxGameActivity.mTo5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo5, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/mula-2.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 150, 152, TextureOptions.BILINEAR);
			BoxGameActivity.mTo6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo6, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/mama-2.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasTo = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasTo, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/mo.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWTo1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 120, 120, TextureOptions.BILINEAR);
			BoxGameActivity.mWTo1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWTo1, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/kola-1.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWTo2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 120, 122, TextureOptions.BILINEAR);
			BoxGameActivity.mWTo2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWTo2, BoxGameActivity.boxGameActivityInstance,
					"LetterTo/keramBoard1.png", 0, 0,  1, 1);
			
			
			BoxGameActivity.mBitmapTextureAtlasTo1.load();
			BoxGameActivity.mBitmapTextureAtlasTo2.load();
			BoxGameActivity.mBitmapTextureAtlasTo3.load();
			BoxGameActivity.mBitmapTextureAtlasTo4.load();
			BoxGameActivity.mBitmapTextureAtlasTo5.load();
			BoxGameActivity.mBitmapTextureAtlasTo6.load();
			BoxGameActivity.mBitmapTextureAtlasTo.load();
			BoxGameActivity.mBitmapTextureAtlasWTo1.load();
			BoxGameActivity.mBitmapTextureAtlasWTo2.load();
			
			BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas = new BuildableBitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 806, 806, TextureOptions.REPEATING_BILINEAR_PREMULTIPLYALPHA);
			BoxGameActivity.mPlanetParrotTextureRegion = BitmapTextureAtlasTextureRegionFactory.
					createTiledFromAsset(BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas, BoxGameActivity.boxGameActivityInstance, "planetParrot.png", 2, 2);
			try 
			{
				BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(0, 0, 0));
				BoxGameActivity.mAnimatedPlanetParrotBitmapTextureAtlas.load();
			} 
			catch (TextureAtlasBuilderException e) 
			{
				Debug.e(e);
			}
			
		}
		//Toh
		else if( MenuPage.letterNumber == 19)
		{
			//Letter-Toh
			BoxGameActivity.mBitmapTextureAtlasToh1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh1, BoxGameActivity.boxGameActivityInstance,
					"table.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh2, BoxGameActivity.boxGameActivityInstance,
					"taka.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh3, BoxGameActivity.boxGameActivityInstance,
					"tin.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh4, BoxGameActivity.boxGameActivityInstance,
					"tob.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh5, BoxGameActivity.boxGameActivityInstance,
					"tomato.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh6, BoxGameActivity.boxGameActivityInstance,
					"tomtom.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTohTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh, BoxGameActivity.boxGameActivityInstance,
					"Letters/toh.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWToh1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWToh1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWToh1, BoxGameActivity.boxGameActivityInstance,
					"begun.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWToh2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWToh2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWToh2, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh1.load();
			BoxGameActivity.mBitmapTextureAtlasToh2.load();
			BoxGameActivity.mBitmapTextureAtlasToh3.load();
			BoxGameActivity.mBitmapTextureAtlasToh4.load();
			BoxGameActivity.mBitmapTextureAtlasToh5.load();
			BoxGameActivity.mBitmapTextureAtlasToh6.load();
			BoxGameActivity.mBitmapTextureAtlasToh.load();
			BoxGameActivity.mBitmapTextureAtlasWToh1.load();
			BoxGameActivity.mBitmapTextureAtlasWToh2.load();
		}
		//Doh
		else if( MenuPage.letterNumber == 20)
		{
			//Letter-Doh
			BoxGameActivity.mBitmapTextureAtlasToh1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh1, BoxGameActivity.boxGameActivityInstance,
					"table.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh2, BoxGameActivity.boxGameActivityInstance,
					"taka.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh3 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh3TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh3, BoxGameActivity.boxGameActivityInstance,
					"tin.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh4 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh4TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh4, BoxGameActivity.boxGameActivityInstance,
					"tob.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh5 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh5TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh5, BoxGameActivity.boxGameActivityInstance,
					"tomato.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh6 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mToh6TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh6, BoxGameActivity.boxGameActivityInstance,
					"tomtom.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mTohTextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasToh, BoxGameActivity.boxGameActivityInstance,
					"Letters/toh.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWToh1 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWToh1TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWToh1, BoxGameActivity.boxGameActivityInstance,
					"begun.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasWToh2 = new BitmapTextureAtlas(BoxGameActivity.boxGameActivityInstance.getTextureManager(), 200, 200, TextureOptions.BILINEAR);
			BoxGameActivity.mWToh2TextureRegion = BitmapTextureAtlasTextureRegionFactory.createTiledFromAsset(BoxGameActivity.mBitmapTextureAtlasWToh2, BoxGameActivity.boxGameActivityInstance,
					"rondhonu.png", 0, 0,  1, 1);
			
			BoxGameActivity.mBitmapTextureAtlasToh1.load();
			BoxGameActivity.mBitmapTextureAtlasToh2.load();
			BoxGameActivity.mBitmapTextureAtlasToh3.load();
			BoxGameActivity.mBitmapTextureAtlasToh4.load();
			BoxGameActivity.mBitmapTextureAtlasToh5.load();
			BoxGameActivity.mBitmapTextureAtlasToh6.load();
			BoxGameActivity.mBitmapTextureAtlasToh.load();
			BoxGameActivity.mBitmapTextureAtlasWToh1.load();
			BoxGameActivity.mBitmapTextureAtlasWToh2.load();
		}

	}
}
