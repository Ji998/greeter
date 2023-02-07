public class Greeter {

	private Language language = Language.ENGLISH;

	public void setEnglish() {
		language = Language.ENGLISH;
	}

	public void setGerman() {
		language = Language.GERMAN;
	}
public void setChinese(){
		language=Language.CHINESE;
}

	public void setPolish() {
		language = Language.POLISH;
	}

	public String greet() {
		switch (language) {
		case ENGLISH:
			return "Hello world!";
		case GERMAN:
			return "Hallo Welt!";
			case CHINESE:
				return "你好";
			case POLISH:
				return "Witaj świecie";
		default:
			return "UNKOWN LANGUAGE";
		}
	}
}
