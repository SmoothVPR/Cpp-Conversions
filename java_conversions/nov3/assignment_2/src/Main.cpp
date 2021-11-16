#include <iostream>
#include <fstream>

void getInputAndAppend(const char* input, const char* target);

int main(int argc, char* argv[]) 
{
  // Handle command line arguments
  if (argc != 2) { return -1; }

  const char* file_path = argv[1];

  // Open file and begin prompt
  //File target = new File(input);
  //try
  //{
      // getInputAndAppend(input, target);
  //}
  //catch (IOException e)
  //{
      // IOExecption
  //}
  //catch (Exception e)
  //{
      // Unknown exception
  //}
}

/*
 *void getInputAndAppend(const char* input, const char* target)
 *{
 *  if (!target.exists())
 *  {
 *      System.err.println("File '" + input + "' not found.");
 *      System.exit(1);
 *  }
 *
 *  System.out.println("Enter the text you would like to append to the file '" + input + "': \n");
 *  Scanner s = new Scanner(System.in);
 *  String textToAppend = s.nextLine();
 *  s.close();
 *
 *  FileWriter fw = new FileWriter(target, true);
 *  fw.write(textToAppend);
 *  fw.close();
 *}
 */
