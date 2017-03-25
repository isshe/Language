#include <iostream>
#include <fstream>

using namespace std;
/*
 int main() {
 ofstream output;
 
 //create a file
 output.open("scores.txt");
 
 //write line
 output << "isshe" << " " << "H" << " " << "chudai" << 90 << endl;
 
 output.close();
 
 cout << "Done" << endl;
 
 return 0;
 }
 */

/*
 int main(void)
 {
 ifstream input;
 
 input.open("scores.txt");
 char array[20];
 char ch = 0;
 char chudai[20];
 int score = 0;
 
 input >> array >> ch >> chudai >> score;
 
 cout << array << " " << ch << " " << chudai << " " << score << endl;
 
 return 0;
 }
 */


int main(void)
{
    ifstream input("scores.txt");
    char array[20];
    char ch = 0;
    char chudai[20];
    int score = 0;
    
    if (input.fail())
    {
        cout << "open file fail" << endl;
        exit(-1);
    }
    
    while(!input.eof()) {
        input >> array >> ch >> chudai;
        cout << array << " " << ch << " " << chudai << " " << score << endl;
    }
    
    input.close();
    
    return 0;
}
