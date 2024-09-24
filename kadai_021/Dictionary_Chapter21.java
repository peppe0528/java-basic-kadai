package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
		
		HashMap<String,String> Dic = new HashMap<String,String>();
		
		public Dictionary_Chapter21() {
		
		Dic.put("apple","りんご");
		Dic.put("peach", "桃");
		Dic.put("banana", "バナナ");
		Dic.put("lemon", "レモン");
		Dic.put("pear", "梨");
		Dic.put("kiwi", "キウィ");
		Dic.put("strawberry", "いちご");
		Dic.put("grape", "ぶどう");
		Dic.put("muscat", "マスカット");
		Dic.put("cherry", "さくらんぼ");
}

	public void searchWords(String... words) {
		for (String word : words) {
		
		if(Dic.containsKey(word)) {
			String meaning = Dic.get(word);
			System.out.println(word + "の意味は" + meaning + "です。");
		}else {
			System.out.println(word + "は辞書に含まれていません");
			}
		}
	}
}