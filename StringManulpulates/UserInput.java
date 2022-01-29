package StringManulpulates;

public class UserInput {
    static String s="";
  
    public static class TextInput {
    	public void add (char c) {
    		s = s+c;
    	}
    	public String getValue() {
    	    	return s;
    	}
    }

    public static class NumericInput extends TextInput {
    	public void add (char c) {
    		if (Character.isDigit(c)) {
    			s=s+c;
    		}
    		
    		//System.out.println(c+ " numeric " +s);
    	}
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
