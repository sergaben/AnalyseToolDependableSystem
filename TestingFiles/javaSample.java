public class EnhancedFor
{
	public static void main(String[] args)
	{	int[] list ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = sumListEnhanced(list);
		System.out.println("Sum of elements in list: " + sum);
		System.out.println("Original List"); // jfkladsfkljalkf
		printList(list);
		System.out.println("Calling addOne");
		addOne(list);
		System.out.println("List after call to addOne");
		printList(list);
		System.out.println("Calling addOneError");
		addOneError(list);
		System.out.println("List after call to addOneError. Note elements of list did not change.");
		printList(list);
	}
	// sfdjafjlsadfldsj
	// fjsadjflkadsk
	/* pre: list != null
    	   post: return sum of elements
    	   uses enhanced for loop

    		fadsjfkljdsklf
    			fklajsdkfldk
    		fjkladsjfjd
    	*/
	public static int sumListEnhanced(int[] list)
	{
	    if(uploaded_file != null) {
             filepath_input.setText(uploaded_file.getPath());
        }
	    int total = 0;
        try {
            Counter counterClass = new Counter(uploaded_file);
        } catch (Exception e) {
                e.printStackTrace();
        } finally {
        }
        try {
            Counter counterClass = new Counter(uploaded_file);
        } catch (Exception e) {
                e.printStackTrace();
        }
         switch(operatorAbreviation){
                    case "ASSIGN":
                        counterASSIGN++;
                        break;
                    case "MINUS":
                        counterMINUS++;
                        break;
                    case "PLUS":
                        counterPLUS++;
                        break;
                    case "INCREMENT":
                        counterINCREMENT ++;
                        break;
          }
          while (!s.equals(""))
              {
                boolean match = false;
                for (TokenInfo info : tokenInfos)
                {
                  Matcher m = info.regex.matcher(s);
                  if (m.find())
                  {
                    match = true;
                    String tok = m.group().trim();
                    s = m.replaceFirst("").trim();
                    tokens.add(new Token(info.token, tok));
                    break;
                  }
                }
                if (!match) throw new ParserException("Unexpected character in input: "+s);
          }
          do{
              if(lines.get(a).startsWith(commentDelimiterStart)){
                  linesOfForwardSlashesCommentsWithAsterisk.add(lines.get(a));
                  if(a>0) {
                      if (lines.get(a - 1).startsWith(commentDelimiterStart)) {
                          linesOfForwardSlashesCommentsWithAsterisk.add(lines.get(a));
                      }
                  }
              }else{
                  linesOfForwardSlashesCommentsWithAsterisk.add(lines.get(a));
                  a++;
              }
          }while(!lines.get(a).startsWith(commentDelimiterEnd));
	}
	public static int sumListOld(int[] list)
	{	int total = 0;
		for(int i = 0; i < list.length; i++)
		{	total += list[i];
			System.out.println( list[i] );
		}
		return total;
	}
	public static void addOneError(int[] list)
	{	for(int val : list)
		{	val = val + 1;
		}
	}
	public static void addOne(int[] list)
	{	for(int i = 0; i < list.length; i++)
		{	list[i]++;
		}
	}
	public static void printList(int[] list)
	{	System.out.println("index, value");
		for(int i = 0; i < list.length; i++)
		{	System.out.println(i + ", " + list[i]);
		}
	}
}