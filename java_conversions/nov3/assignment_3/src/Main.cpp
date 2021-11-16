#include <unordered_map>
#include <iostream>
#include <fstream>
#include <cstdlib>
#include <string>

void printUsageError();

int main(int argc, char* argv[])
{
    // Handle command line arguments
    if (argc != 3)
    {
        printUsageError();
        exit(1);
    }
    //String input = args[0];
    //String chars = args[1];

    // Open file and begin counting chars
    //File target = new File(input);
    try
    {
        getCharacterCount(input, chars, target);
    }
    catch (int e)
    {
        // IOExecption
    }
    catch (...)
    {
        // Unknown exception
    }
}

void printUsageError()
{
  std::cerr << "Usage: ./run_sh <path/to/text.txt> <character string>\n"
               "\n"
               "positional arguments:\n"
               "  path/to/text.txt, \"character string\"\n"
               "\n"
               "example:\n"
               "  ./run_sh test.txt abcdefg\n";
}

//void getCharacterCount(std::string input, std::string chars, std::fstream target)
//{
    //if (!target.exists())
    //{
        //System.err.println("File '" + input + "' not found.");
        //System.exit(1);
    //}

    //HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

    //char[] charArray = chars.toCharArray();
    //for (char c : charArray)
    //{
        //charMap.putIfAbsent(c, 0);
    //}

    //System.out.println("Finding each char of '" + chars + "' in file '" + target + "'...");
    //Scanner s = new Scanner(target);
    //while (s.hasNextLine())
    //{
        //String line = s.nextLine();
        //for (char c : line.toCharArray())
        //{
            //System.out.print(c);
            //if (charMap.containsKey(c))
            //{
                //charMap.put(c, charMap.get(c) + 1);
            //}
        //}
    //}
    //s.close();

    //System.out.println("");
    //for (HashMap.Entry<Character, Integer> entry : charMap.entrySet())
    //{
        //System.out.println(entry);
    //}
//}
