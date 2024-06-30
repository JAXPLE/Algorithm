#include "map"
#include "Obj.h"
#include <bits/stdc++.h>

int main() {
    std::map<std::string, User> userData;

    int age1 = 27;
    std::string name1 = "JwonLEE";
    User JwonLEE(name1,age1);

    // userData.insert(std::make_pair(JwonLEE.name, JwonLEE));
    userData.insert(std::pair<std::string, User>(JwonLEE.name, JwonLEE));


    User user1 = userData.at(JwonLEE.name);

    std::cout << "name > " << user1.name << "\n";
    std::cout << "age > " << user1.age << "\n";

    return 0;
}