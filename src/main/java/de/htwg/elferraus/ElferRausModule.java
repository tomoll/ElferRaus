package de.htwg.elferraus;

import com.google.inject.AbstractModule;

import de.htwg.elferraus.controller.IElferRausController;
import de.htwg.elferraus.entities.IMainArray;
import de.htwg.elferraus.entities.IMainStack;


public final class ElferRausModule extends AbstractModule {


    /**
     *
     */
    @Override
    protected void configure() {

        bind(IElferRausController.class)
                .to(de.htwg.elferraus.controller.impl.ElferRausController.class);
        bind(IMainStack.class).
                to(de.htwg.elferraus.entities.impl.MainStack.class);
        bind(IMainArray.class).
                to(de.htwg.elferraus.entities.impl.MainArray.class);
        
    }

}
