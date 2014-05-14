package com.example.phonicsapp.boxGame;

import com.example.phonicsapp.R;

public class LevelObject
{

	public static void loadObjects(int i) 
	{
		// TODO Auto-generated method stub
		
		//Mo
		if(i == 1)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mMoTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mMo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mMo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mMo3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mMo4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mMo5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mMo6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWMo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWMo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ma;
			BoxGameActivity.obj2Sound = R.raw.megh;
			BoxGameActivity.obj3Sound = R.raw.mohis;
			BoxGameActivity.obj4Sound = R.raw.moi;
			BoxGameActivity.obj5Sound = R.raw.mula;
			BoxGameActivity.obj6Sound = R.raw.mama;
			BoxGameActivity.wrongObj1Sound = R.raw.kola;
			BoxGameActivity.wrongObj2Sound = R.raw.keram;
			BoxGameActivity.letterSound = R.raw.mo;
		}
		//Aa
		else if(i == 2)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mAaTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mAa1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mAa2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mAa3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mAa4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mAa5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mAa6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWAa1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWAa2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ma;
			BoxGameActivity.obj2Sound = R.raw.megh;
			BoxGameActivity.obj3Sound = R.raw.mohis;
			BoxGameActivity.obj4Sound = R.raw.moi;
			BoxGameActivity.obj5Sound = R.raw.mula;
			BoxGameActivity.obj6Sound = R.raw.mama;
			BoxGameActivity.wrongObj1Sound = R.raw.kola;
			BoxGameActivity.wrongObj2Sound = R.raw.keram;
			BoxGameActivity.letterSound = R.raw.mo;
		}
		//E
		else if(i == 3)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mETextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mE1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mE2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mE3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mE4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mE5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mE6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWE1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWE2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ma;
			BoxGameActivity.obj2Sound = R.raw.megh;
			BoxGameActivity.obj3Sound = R.raw.mohis;
			BoxGameActivity.obj4Sound = R.raw.moi;
			BoxGameActivity.obj5Sound = R.raw.mula;
			BoxGameActivity.obj6Sound = R.raw.mama;
			BoxGameActivity.wrongObj1Sound = R.raw.kola;
			BoxGameActivity.wrongObj2Sound = R.raw.keram;
			BoxGameActivity.letterSound = R.raw.mo;
		}
		//Raw
		else if(i == 4)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mRawTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mRaw1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mRaw2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mRaw3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mRaw4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mRaw5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mRaw6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWRaw1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWRaw2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ruimach;
			BoxGameActivity.obj2Sound = R.raw.rocket;
			BoxGameActivity.obj3Sound = R.raw.robi;
			BoxGameActivity.obj4Sound = R.raw.rongdhonu;
			BoxGameActivity.obj5Sound = R.raw.rani;
			BoxGameActivity.obj6Sound = R.raw.rana;
			BoxGameActivity.wrongObj1Sound = R.raw.mohis;
			BoxGameActivity.wrongObj2Sound = R.raw.boi;
			BoxGameActivity.letterSound = R.raw.raw;
		}
		//Ko
		else if(i == 5)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mKoTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mKo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mKo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mKo3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mKo4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mKo5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mKo6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWKo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWKo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ruimach;
			BoxGameActivity.obj2Sound = R.raw.rocket;
			BoxGameActivity.obj3Sound = R.raw.robi;
			BoxGameActivity.obj4Sound = R.raw.rongdhonu;
			BoxGameActivity.obj5Sound = R.raw.rani;
			BoxGameActivity.obj6Sound = R.raw.rana;
			BoxGameActivity.wrongObj1Sound = R.raw.mohis;
			BoxGameActivity.wrongObj2Sound = R.raw.boi;
			BoxGameActivity.letterSound = R.raw.raw;
		}
		//Bo
		else if(i == 6)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mBoTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mBo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mBo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mBo3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mBo4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mBo5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mBo6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWBo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWBo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
			BoxGameActivity.obj1Sound = R.raw.balish;
			BoxGameActivity.obj2Sound = R.raw.belun;
			BoxGameActivity.obj3Sound = R.raw.boi;
			BoxGameActivity.obj4Sound = R.raw.bok;
			BoxGameActivity.obj5Sound = R.raw.begun;
			BoxGameActivity.obj6Sound = R.raw.boll;
			BoxGameActivity.wrongObj1Sound = R.raw.robi;
			BoxGameActivity.wrongObj2Sound = R.raw.rocket; 
			BoxGameActivity.letterSound = R.raw.bo;
		}
		else if(i == 7)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mTalibashaTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mTalibasha1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mTalibasha2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mTalibasha3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mTalibasha4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mTalibasha5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mTalibasha6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWTalibasha1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWTalibasha2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ruimach;
			BoxGameActivity.obj2Sound = R.raw.rocket;
			BoxGameActivity.obj3Sound = R.raw.robi;
			BoxGameActivity.obj4Sound = R.raw.rongdhonu;
			BoxGameActivity.obj5Sound = R.raw.rani;
			BoxGameActivity.obj6Sound = R.raw.rana;
			BoxGameActivity.wrongObj1Sound = R.raw.mohis;
			BoxGameActivity.wrongObj2Sound = R.raw.boi;
			BoxGameActivity.letterSound = R.raw.raw;
		}
		//Lo
		else if(i == 8)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mLoTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mLo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mLo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mLo3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mLo4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mLo5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mLo6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWLo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWLo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ruimach;
			BoxGameActivity.obj2Sound = R.raw.rocket;
			BoxGameActivity.obj3Sound = R.raw.robi;
			BoxGameActivity.obj4Sound = R.raw.rongdhonu;
			BoxGameActivity.obj5Sound = R.raw.rani;
			BoxGameActivity.obj6Sound = R.raw.rana;
			BoxGameActivity.wrongObj1Sound = R.raw.mohis;
			BoxGameActivity.wrongObj2Sound = R.raw.boi;
			BoxGameActivity.letterSound = R.raw.raw;
		}
		//Po
		else if(i == 9)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mPoTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mPo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mPo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mPo3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mPo4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mPo5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mPo6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWPo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWPo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ruimach;
			BoxGameActivity.obj2Sound = R.raw.rocket;
			BoxGameActivity.obj3Sound = R.raw.robi;
			BoxGameActivity.obj4Sound = R.raw.rongdhonu;
			BoxGameActivity.obj5Sound = R.raw.rani;
			BoxGameActivity.obj6Sound = R.raw.rana;
			BoxGameActivity.wrongObj1Sound = R.raw.mohis;
			BoxGameActivity.wrongObj2Sound = R.raw.boi;
			BoxGameActivity.letterSound = R.raw.raw;
		}
		//Go
		else if(i == 10)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mGoTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mGo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mGo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mGo3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mGo4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mGo5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mGo6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWGo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWGo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ruimach;
			BoxGameActivity.obj2Sound = R.raw.rocket;
			BoxGameActivity.obj3Sound = R.raw.robi;
			BoxGameActivity.obj4Sound = R.raw.rongdhonu;
			BoxGameActivity.obj5Sound = R.raw.rani;
			BoxGameActivity.obj6Sound = R.raw.rana;
			BoxGameActivity.wrongObj1Sound = R.raw.mohis;
			BoxGameActivity.wrongObj2Sound = R.raw.boi;
			BoxGameActivity.letterSound = R.raw.raw;
		}
		//Ho
		else if(i == 11)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mHoTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mHo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mHo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mHo3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mHo4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mHo5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mHo6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWHo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWHo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ruimach;
			BoxGameActivity.obj2Sound = R.raw.rocket;
			BoxGameActivity.obj3Sound = R.raw.robi;
			BoxGameActivity.obj4Sound = R.raw.rongdhonu;
			BoxGameActivity.obj5Sound = R.raw.rani;
			BoxGameActivity.obj6Sound = R.raw.rana;
			BoxGameActivity.wrongObj1Sound = R.raw.mohis;
			BoxGameActivity.wrongObj2Sound = R.raw.boi;
			BoxGameActivity.letterSound = R.raw.raw;
		}
		//Kho
		else if(i == 12)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mKhoTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mKho1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mKho2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mKho3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mKho4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mKho5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mKho6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWKho1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWKho2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ruimach;
			BoxGameActivity.obj2Sound = R.raw.rocket;
			BoxGameActivity.obj3Sound = R.raw.robi;
			BoxGameActivity.obj4Sound = R.raw.rongdhonu;
			BoxGameActivity.obj5Sound = R.raw.rani;
			BoxGameActivity.obj6Sound = R.raw.rana;
			BoxGameActivity.wrongObj1Sound = R.raw.mohis;
			BoxGameActivity.wrongObj2Sound = R.raw.boi;
			BoxGameActivity.letterSound = R.raw.raw;
		}
		//Cho
		else if(i == 13)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mChoTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mCho1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mCho2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mCho3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mCho4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mCho5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mCho6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWCho1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWCho2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ruimach;
			BoxGameActivity.obj2Sound = R.raw.rocket;
			BoxGameActivity.obj3Sound = R.raw.robi;
			BoxGameActivity.obj4Sound = R.raw.rongdhonu;
			BoxGameActivity.obj5Sound = R.raw.rani;
			BoxGameActivity.obj6Sound = R.raw.rana;
			BoxGameActivity.wrongObj1Sound = R.raw.mohis;
			BoxGameActivity.wrongObj2Sound = R.raw.boi;
			BoxGameActivity.letterSound = R.raw.raw;
		}
		//No
		else if(i == 14)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mNoTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mNo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mNo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mNo3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mNo4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mNo5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mNo6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWNo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWNo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ruimach;
			BoxGameActivity.obj2Sound = R.raw.rocket;
			BoxGameActivity.obj3Sound = R.raw.robi;
			BoxGameActivity.obj4Sound = R.raw.rongdhonu;
			BoxGameActivity.obj5Sound = R.raw.rani;
			BoxGameActivity.obj6Sound = R.raw.rana;
			BoxGameActivity.wrongObj1Sound = R.raw.mohis;
			BoxGameActivity.wrongObj2Sound = R.raw.boi;
			BoxGameActivity.letterSound = R.raw.raw;
		}
		//Letter-A
		else if(i == 15)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mATextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mA1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mA2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mA3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mA4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mA5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mA6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWA1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWA2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ruimach;
			BoxGameActivity.obj2Sound = R.raw.rocket;
			BoxGameActivity.obj3Sound = R.raw.robi;
			BoxGameActivity.obj4Sound = R.raw.rongdhonu;
			BoxGameActivity.obj5Sound = R.raw.rani;
			BoxGameActivity.obj6Sound = R.raw.rana;
			BoxGameActivity.wrongObj1Sound = R.raw.mohis;
			BoxGameActivity.wrongObj2Sound = R.raw.boi;
			BoxGameActivity.letterSound = R.raw.raw;
		}
		//Do
		else if(i == 16)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mDoTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mDo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mDo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mDo3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mDo4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mDo5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mDo6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWDo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWDo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ruimach;
			BoxGameActivity.obj2Sound = R.raw.rocket;
			BoxGameActivity.obj3Sound = R.raw.robi;
			BoxGameActivity.obj4Sound = R.raw.rongdhonu;
			BoxGameActivity.obj5Sound = R.raw.rani;
			BoxGameActivity.obj6Sound = R.raw.rana;
			BoxGameActivity.wrongObj1Sound = R.raw.mohis;
			BoxGameActivity.wrongObj2Sound = R.raw.boi;
			BoxGameActivity.letterSound = R.raw.raw;
		}
		//U
		else if(i == 17)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mUTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mU1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mU2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mU3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mU4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mU5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mU6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWU1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWU2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.ruimach;
			BoxGameActivity.obj2Sound = R.raw.rocket;
			BoxGameActivity.obj3Sound = R.raw.robi;
			BoxGameActivity.obj4Sound = R.raw.rongdhonu;
			BoxGameActivity.obj5Sound = R.raw.rani;
			BoxGameActivity.obj6Sound = R.raw.rana;
			BoxGameActivity.wrongObj1Sound = R.raw.mohis;
			BoxGameActivity.wrongObj2Sound = R.raw.boi;
			BoxGameActivity.letterSound = R.raw.raw;
		}
		//To
		else if(i == 18)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mToTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mTo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mTo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mTo3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mTo4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mTo5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mTo6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWTo1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWTo2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
							
			BoxGameActivity.obj1Sound = R.raw.kola;
			BoxGameActivity.obj2Sound = R.raw.langol;
			BoxGameActivity.obj3Sound = R.raw.mula;
			BoxGameActivity.obj4Sound = R.raw.shorea;
			BoxGameActivity.obj5Sound = R.raw.ma;
			BoxGameActivity.obj6Sound = R.raw.mohis;
			BoxGameActivity.wrongObj1Sound = R.raw.aam;
			BoxGameActivity.wrongObj2Sound = R.raw.keram;
			BoxGameActivity.letterSound = R.raw.akar;
		}
		//Toh
		else if(i == 19)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mTohTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mToh1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mToh2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mToh3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mToh4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mToh5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mToh6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWToh1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWToh2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
					
			BoxGameActivity.obj1Sound = R.raw.tebil;
			BoxGameActivity.obj2Sound = R.raw.taka;
			BoxGameActivity.obj3Sound = R.raw.tin;
			BoxGameActivity.obj4Sound = R.raw.tob;
			BoxGameActivity.obj5Sound = R.raw.tomato;
			BoxGameActivity.obj6Sound = R.raw.tomtom;
			BoxGameActivity.wrongObj1Sound = R.raw.begun;
			BoxGameActivity.wrongObj2Sound = R.raw.rongdhonu;
			BoxGameActivity.letterSound = R.raw.toh;
		}
		//Doh
		else if(i == 20)
		{
			BoxGameActivity.letter = new Letter(BoxGameActivity.letterX, BoxGameActivity.letterY, 80, 80, BoxGameActivity.mDohTextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			
			BoxGameActivity.obj1 = new Objects(BoxGameActivity.obj1X, BoxGameActivity.obj1Y, BoxGameActivity.mDoh1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj2 = new Objects(BoxGameActivity.obj2X, BoxGameActivity.obj2Y, BoxGameActivity.mDoh2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj3 = new Objects(BoxGameActivity.obj3X, BoxGameActivity.obj3Y, BoxGameActivity.mDoh3TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj4 = new Objects(BoxGameActivity.obj4X, BoxGameActivity.obj4Y, BoxGameActivity.mDoh4TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj5 = new Objects(BoxGameActivity.obj5X, BoxGameActivity.obj5Y, BoxGameActivity.mDoh5TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.obj6 = new Objects(BoxGameActivity.obj6X, BoxGameActivity.obj6Y, BoxGameActivity.mDoh6TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj1 = new Objects(BoxGameActivity.wrongObj1X, BoxGameActivity.wrongObj1Y, BoxGameActivity.mWDoh1TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
			BoxGameActivity.wrongObj2 = new Objects(BoxGameActivity.wrongObj2X, BoxGameActivity.wrongObj2Y, BoxGameActivity.mWDoh2TextureRegion, BoxGameActivity.boxGameActivityInstance.getVertexBufferObjectManager());
							
			BoxGameActivity.obj1Sound = R.raw.kola;
			BoxGameActivity.obj2Sound = R.raw.langol;
			BoxGameActivity.obj3Sound = R.raw.mula;
			BoxGameActivity.obj4Sound = R.raw.shorea;
			BoxGameActivity.obj5Sound = R.raw.ma;
			BoxGameActivity.obj6Sound = R.raw.mohis;
			BoxGameActivity.wrongObj1Sound = R.raw.aam;
			BoxGameActivity.wrongObj2Sound = R.raw.keram;
			BoxGameActivity.letterSound = R.raw.akar;
		}
	}
}
