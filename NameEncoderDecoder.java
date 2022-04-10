
public class NameEncoderDecoder {

	public String encode(String name) {
		String newName = name
				.replace("e", "1")
				.replace("u", "2")
				.replace("i", "3")
				.replace("o", "4")
				.replace("a", "5");
		
		return "NOTFORYOU" +newName+ "YESNOTFORYOU";
		
	}
	public String decode(String name) {
		return name 
				.replace("YESNOTFORYOU", "")
				.replace("1", "e")
				.replace("2", "u")
				.replace("3", "i")
				.replace("4", "o")
				.replace("5", "a")
				.replace("NOTFORYOU", "");	 
	}
	
	
	public static void main(String[] args) {
		NameEncoderDecoder code = new NameEncoderDecoder();
		
		String newEncode = code.encode("Crab");
		System.out.println(code.encode("Crab"));
		
		String newDecode = code.decode("NOTFORYOU");
		System.out.println(code.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));

	}

}
