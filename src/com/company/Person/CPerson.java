package com.company.Person;

public class CPerson {
    private final boolean man;
    private final String name;
    private boolean married;
    private CPerson spouse;

    public boolean Marry(CPerson person) {
        boolean is_married = false;
        //если люди разного пола - пробуем поженить
        if (person.man != this.man) {
            //проверяем что они не супруги
            if (person.spouse != this.spouse) {
                //если у перетендента есть супруг
                if (person.spouse != null) {
                    //разводим мужа и жену
                    person.spouse.divorce();
                    person.divorce();
                }
                //если у текущего человека есть супруга
                if (this.spouse != null) {
                    //разводим мужа и жену
                    this.spouse.divorce();
                    this.divorce();
                }
            }

            //если не имеется супругов - создаем брак
            if (person.spouse == null && this.spouse == null) {
                person.spouse = this;
                this.spouse = person;
                System.out.print("Persons " + name + " and " + spouse.name + " got married!\n");

                is_married = true;
            }
        } else System.out.print("Can`t marry. Persons has the same gender!\n");

        return is_married;
    }

    public boolean divorce() {
        boolean is_change = false;
        if (spouse != null) {
            System.out.print(spouse.name + " got divorce!\n");
            spouse = null;
            is_change = true;
        }

        return is_change;
    }

    public CPerson(boolean men, String name) {
        System.out.print("Create man with name: " + name + " ");

        if (men == true) {
            System.out.print("and gender: Men\n");
        } else System.out.print("and gender: Woman\n");

        this.man = men;
        this.name = name;
        this.married = false;
    }
}
