#pragma once
#include <string>

class Film {
protected:
    std::string tytul = "";
    int liczbaWypozyczen = 0;
public:
    void setTytul(std::string tytulFilmu) {
        if (tytulFilmu.length() <= 20) {
            tytul = tytulFilmu;
        }
    }
    
    std::string getTytul() {
        return tytul;
    }
    
    int getLiczbaWypozyczen() {
        return liczbaWypozyczen;
    }
    
    void inkrementujLiczbeWypozyczen() {
        liczbaWypozyczen++;
    }
};
