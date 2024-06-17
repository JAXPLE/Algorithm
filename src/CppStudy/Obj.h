#include <bits/stdc++.h>

struct User {
    std::string name;
    int age;
    
    User(std::string name, int age)
    :name(name), age(age) {};
    
    User() {
        name = "Null";
        age = 0;
    };
};