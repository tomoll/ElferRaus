package de.htwg.elferraus;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

import de.htwg.elferraus.controller.IElferRausController;
import de.htwg.elferraus.controller.impl.ElferRausController;
import de.htwg.elferraus.entities.IMainArray;
import de.htwg.elferraus.entities.IMainStack;
import de.htwg.elferraus.entities.impl.MainArray;
import de.htwg.elferraus.entities.impl.MainStack;

/**
 *
 * @author Tobi
 */
public final class ElferRausModule extends AbstractModule {

    /**
     *
     */
    @Override
    protected void configure() {

        bind(IElferRausController.class)
                .to(ElferRausController.class).in(Singleton.class);
//        bind(IMainStack.class).
//                to(MainStack.class).in(Singleton.class);
//        bind(IMainArray.class).
//                to(MainArray.class).in(Singleton.class);

    }

}
