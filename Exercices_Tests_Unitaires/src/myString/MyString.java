package myString;

public class MyString {
    // instance variables
    private StringBuffer _sb;
    
    

    /**
     * Constructor for objects of class MyString
     */
    public MyString(String s) {
        // initialize instance variables
        _sb = new StringBuffer(s);
    }

    public String getString() {
    	return _sb.toString();
    }
    
    public void setString(String s) {
    	this._sb = new StringBuffer(s);
    }

    public void toUpperCase() {
    	char[] value = _sb.toString().toCharArray();
    	
    	for(int i = 0; i < value.length; i++) {
    		if(value[i] >= 97 && value[i] <= 122) {
    			value[i] = (char) (value[i] - 32);
    			_sb.setCharAt(i, value[i]);
    		}
    	}
    	
    }

    public int numberOfChar(char c) {
		int nbChar = 0;
		char[] value = _sb.toString().toCharArray();
		
		for (int i = 0; i < value.length; i++) {
			if(value[i] == c) {
				nbChar++;
			}
		}
		
    	return nbChar;
    }

    public int numberOfVoyelles() {
		int nbVoyelles = 0;
		char[] value = _sb.toString().toCharArray();
		
		for(int i = 0; i <value.length; i++) {
			if(value[i] == 'a' 
			|| value[i] == 'e'
			|| value[i] == 'i'
			|| value[i] == 'o'
			|| value[i] == 'u'
			|| value[i] == 'A'
			|| value[i] == 'E'
			|| value[i] == 'I'
			|| value[i] == 'O'
			|| value[i] == 'U') {
				nbVoyelles++;
			}
		}
		
    	return nbVoyelles;
		}

    public String getFirstWord() {
    	String sb = _sb.toString();
    	StringBuffer sbModifie = _sb;
    	boolean b = false;
    	
    	while (b == false){
    		if(sbModifie.charAt(0) != ' ') {
    			b = true;
    		} else {
    			sbModifie.deleteCharAt(0);
    		}
    	}
		sb = sbModifie.toString();
    	if(sb.contains(" ")){
            sb = sb.substring(0, sb.indexOf(" "));
            }
		return sb;
		}
}
