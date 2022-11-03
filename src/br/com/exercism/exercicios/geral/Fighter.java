package br.com.exercism.exercicios.geral;

abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);
}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable()? 10 : 6;
    }
}

class Wizard extends Fighter {

    boolean preparado = false;

    @Override
    boolean isVulnerable() {
        return !preparado;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return preparado? 12 : 3;
    }

    void prepareSpell() {
        preparado = true;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

}
