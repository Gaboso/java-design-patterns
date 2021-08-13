package com.github.gaboso.structure.composite;

import com.github.gaboso.structure.composite.composite.Menu;
import com.github.gaboso.structure.composite.composite.MenuItem;

public class CompositeMain {

    public static void main(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");

        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimsSubMenu);

        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());
    }

}
