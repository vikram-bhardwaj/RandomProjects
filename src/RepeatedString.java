
public class RepeatedString
{

	public static void main(String[] args)
	{
		String s = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
		Long n = new Long("736778906400");
		repeatedString(s, n);
	}
	
	
	static long repeatedString(String s, long n)
    {
        int strLen = s.length();
        long loopLen = n/strLen;
        long loopRem = n%strLen;
        int temp = (int)loopRem;
        long counter = 0;

        //for(long i = 0; i < loopLen; i++)
        //{
            for(int i = 0; i < strLen; i++)
            {
                if(s.charAt(i) == 'a')
                {
                    counter++;
                }
            }
        //}
        counter = counter * loopLen;
        String subStr = s.substring(0,temp);

        if(subStr.length() > 0)
        {
            for(int j = 0; j < subStr.length(); j++)
            {
                if(subStr.charAt(j) == 'a')
                {
                    counter++;
                }
            }
        }
        return counter;
    }

}
