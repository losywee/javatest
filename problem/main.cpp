#include <iostream>
#include <string>
using namespace::std;
class Base{
    const static string myname;

public:
    void printStrmn(){
    cout<<myname<<"\n";
    }
    Base(){
        cout << myname<<"\n";
    }
};


const string Base::myname = "base";
int main(int argc, char*argv[]){
Base mybase;
mybase.printStrmn();
}
