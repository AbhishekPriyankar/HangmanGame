package game;


public class IncompleteWord {

	private WordInUpperCase word;
	private String wordWithDashes;

	public IncompleteWord(WordInUpperCase word) {
		super();
		this.word = word;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.getLetters().length(); i++) {
			sb.append("-");
		}
		wordWithDashes = sb.toString();
	}

	public String getWordWithDashes() {
		return wordWithDashes;
	}

	public boolean isPresent(Character input) {
		return word.getLetters().contains(input.toString().toUpperCase());
	}

	public void replaceAllOccurrences (Character input) {	
		for(int i = 0; i < wordWithDashes.length(); i++) {
			if(word.getLetters().charAt(i) == input){
				replaceDashWith(input, i);
			}
		}
	}
			
	private void replaceDashWith(Character input, int index){
		char[] characters = wordWithDashes.toCharArray();
		characters[index] = input;
		wordWithDashes = characters.toString();
	}
	public void replaceDashWith(String input) {
		StringBuilder st = new StringBuilder();
		for (Character character : word.getLetters().toCharArray()) {
			if (character == input.toUpperCase().charAt(0)) {
				st.append(input.toUpperCase().charAt(0));
			} else {
				st.append("-");
			}
		}
		wordWithDashes = st.toString();
	}
	
	public boolean isDashPresent(){
		return wordWithDashes.contains("-");
	}
}
