package com.example.phonicsapp.boxGame;

import com.example.phonicsapp.R;

public class LevelObject
{

	public static void loadObjects(int i) 
	{
		// TODO Auto-generated method stub
		
		//Letter-Mo
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
		//Letter-Bo
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
		//Letter-Raw
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
		//Letter-Toh
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
		
		//Letter-To
		else if(i == 500)
		{
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
	}
}
