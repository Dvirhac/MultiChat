
public class test {
	public static void main(String[] args) {
		String st= "[dvir] hey";
		String Target=""; int counter=1;
		System.out.println(st);
		while (st.charAt(counter)!=']') {
				Target+=st.charAt(counter);
				counter++;
			}
		String newMess = st.substring(counter+2, st.length());
		System.out.println(newMess);
		System.out.println(Target);
	}
}
