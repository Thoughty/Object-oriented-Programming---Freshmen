import java.util.regex.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SimpleMovieDatabase {
	public Map<Integer, Movie> movies = null;
	int key1;
	String value=null,value2;
	String[] tag;
	public void importMovies(String movieFilename)
	{	//YOUR CODE GOES HERE
		movies = new HashMap<Integer,Movie>();
		File file = new File(movieFilename);
		try {
			BufferedReader Read = new BufferedReader(new FileReader(file));
			String line;
			while((line = Read.readLine())!=null )
			{	
				Pattern p1 = Pattern.compile("([0-9]+)");
				String[] part = line.split(",");
				Matcher m1 = p1.matcher(part[0]);
				
				
			if(m1.matches())
			{
				
					key1 = Integer.parseInt(part[0]);
					if(part[1].matches("\\s") == false)
					{
						value = part[1];
						value2 = part[2].replace("|",",");
						movies.put(key1, new Movie(key1,value));
						tag = value2.split(",");
						
						for(int i=0;i< tag.length;i++)
						{
							
							movies.get(key1).tags.add(tag[i]);
						}
						
					}
					
			}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	
	//-------------------BONUS----------------------
	public List<Movie> searchMovies(String query) 
	{
		List<Movie> A = new ArrayList<Movie>();
		Iterator<HashMap.Entry<Integer, Movie>> iterator = movies.entrySet().iterator();
		String TempName;
		while(iterator.hasNext())
		{
			Movie name = iterator.next().getValue();
			
			TempName = name.title;
			if(TempName.equalsIgnoreCase(query))
			{
				System.out.println("contain");
				A.add(name);
			}
			else if (TempName.toLowerCase().contains(query.toLowerCase()))
			{
				A.add(name);
			}
		}
		
		
		return A;
	}
	
	public List<Movie> getMoviesByTag(String tag)
	{
		//YOUR BONUS CODE GOES HERE
		List<Movie> A = new ArrayList<Movie>();
		Iterator<HashMap.Entry<Integer, Movie>> iterator = movies.entrySet().iterator();
		String TempTag;
		while(iterator.hasNext())
		{
			Movie name = iterator.next().getValue();
			
			TempTag = name.tags.toString();
			if(TempTag.equalsIgnoreCase(tag))
			{
				System.out.println("contain");
				A.add(name);
			}
			else if (TempTag.toLowerCase().contains(tag.toLowerCase()))
			{
				A.add(name);
			}
		}
		
		
		return A;
		
	}
	
	
	public static void main(String[] args)
	{
		SimpleMovieDatabase mdb = new SimpleMovieDatabase();
		mdb.importMovies("lab10_movies.txt");
		System.out.println("Done importing "+mdb.movies.size()+" movies");
		int[] mids = new int[]{139747, 141432, 139415, 139620, 141305};
		for(int mid: mids)
		{
			System.out.println("Retrieving movie ID "+mid+": "+mdb.movies.get(mid));
		}
		
		//Uncomment for bonus
		System.out.println("\n////////////////////////// BONUS ///////////////////////////////");
		String[] queries = new String[]{"america", "thai", "thailand"};
		for(String query: queries)
		{
			System.out.println("Results for movies that match: "+query);
			for(Movie m: mdb.searchMovies(query))
			{
				System.out.println("\t"+m.toString());
			}
			System.out.println();
		}
		
		String[] tags = new String[]{"Musical", "Action", "Thriller"};
		for(String tag: tags)
		{
			System.out.println("Results for movies in category: "+tag);
			for(Movie m: mdb.getMoviesByTag(tag))
			{
				System.out.println("\t"+m);
			}
			System.out.println();
		}
		
		
	}

}
