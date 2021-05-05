package edu.pingpong.fastbreaktruck.builder;

import edu.pingpong.fastbreaktruck.concrete.Eyeholes;
import edu.pingpong.fastbreaktruck.concrete.FleebJuice;
import edu.pingpong.fastbreaktruck.concrete.Smiggles;
import edu.pingpong.fastbreaktruck.concrete.TurbulentJuice;

public class FastBreakTruckBuilder {

    public Breakfast prepareEyeholesTurbulentJuice() {
        Breakfast breakfast = new Breakfast();
        breakfast.addItem(new Eyeholes());
        breakfast.addItem(new TurbulentJuice());
        return breakfast;
    }

    public Breakfast prepareSmigglesFleebJuice() {
        Breakfast breakfast = new Breakfast();
        breakfast.addItem(new Smiggles());
        breakfast.addItem(new FleebJuice());
        return breakfast;
    }
}
