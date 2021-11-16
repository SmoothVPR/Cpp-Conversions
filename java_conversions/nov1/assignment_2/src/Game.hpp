#include <iostream>
#include <fstream>
#include <string>
#include <cmath>
#include <ctime>

class Game
{
  private:
  int targetValue;
  int userInput;
  int lives;

  public:
    Game(void)
    {
      srand(time(NULL));

      this->targetValue = (int)(rand() % 100);
      this->userInput = -1;
      this->lives = 5;

      //this.s = new Scanner(System.in);

      std::cout << "Welcome to SmoothVPR's Guessing Game!\n"
                   "\nThe rules are as follows:\n"
                   "- You must guess and enter a number between 1 and 100\n"
                   "- If the guess is NOT within 10 (+ or -) units of the correct answer,\n"
                   "  the game will continue\n"
                   "- You have 5 lives at the start of the game and every wrong guess costs\n"
                   "  you a life\n";
    }

    inline void start()
    {
      getFirstUserInput();
      playGame();
    }

    inline void getFirstUserInput()
    {
      std::cout << "Enter a number between 0 and 100: ";
      std::cin >> this->userInput;
    }

    inline void getNextUserInput()
    {
      std::string responses[6] = { "Nope", "Nah", "Wrong", "No", "Not quite" };
      int random_idx = (int)(rand() % 6);

      std::string response = responses[random_idx];
      std::cout << "\n" << response << ".\n";

      std::cout << "Lives left: " << this->lives << "\n";
      std::cout << "Try again: ";

      std::cin >> this->userInput;
    }

    inline void playGame()
    {
      while (!(this->userInput > targetValue - 10 && this->userInput < targetValue + 10))
      {
        // play the game
        this->lives--;
        if (this->lives == 0)
        {
          defeat();
          return;
        }
        else
        {
          getNextUserInput();
        }
      }
      victory();
    }

    inline void defeat()
    {
      std::cout << "\nSorry, You lost!\n";
      std::cout << "The number was: " << targetValue << "\n";
    }

    inline void victory()
    {
      std::cout << "\nVictory!\n";
      std::cout << "The number was: " << targetValue << "\n";
    }
};
