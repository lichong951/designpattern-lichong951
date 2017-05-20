package top.lc951.prototype;

import java.util.ArrayList;

public class WordDocument implements Cloneable {
	private String mText;

	public String getmText() {
		return mText;
	}

	public void setmText(String mText) {
		this.mText = mText;
	}

	private ArrayList<String> mImages = new ArrayList<String>();

	public ArrayList<String> getmImages() {
		return mImages;
	}

	public void addImage( String img) {
		mImages.add(img);
	}
	

	public WordDocument() {

	}

	protected WordDocument clone() {
		WordDocument doc;
		try {
			doc = (WordDocument) super.clone();
			doc.mText = this.mText;
			doc.mImages = (ArrayList<String>) this.mImages.clone();
			return doc;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void showDocument(){
		System.out.println("-------Word Content Start=---------------");
		System.out.println("Text:"+mText);
		System.out.println("Images list:");
		for(String imgName:mImages){
			System.out.println("image name:"+imgName);
		}
		
		System.out.println("-------Word Content End=---------------");
		
	}
}
