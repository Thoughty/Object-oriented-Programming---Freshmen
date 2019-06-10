

public class LinearContextSearcher extends ContextSearcher{

	LinearContextSearcher(String filename) {
		super(filename);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String find(Word query, int window) {
		// TODO Auto-generated method stub
		for(Word D : sortedWords)
		{
			if(query.equals(D))
			{
				return getSnippet(D, window);
			}
		}
		return null;
	}

}
