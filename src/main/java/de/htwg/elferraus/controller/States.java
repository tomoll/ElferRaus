/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.htwg.elferraus.controller;

/**
 *
 * @author Tobi
 */
public class States {

    public interface GameStates {

        public void next(PlayerController player[], int i);

        public class ready implements GameStates {

            public void next(PlayerController player[], int i) {
            //if als nächstes an der Reihe
                //  player.setState(new play());
                //else 
                //  player.setState(new ready());
                //maybe schlange als zirkulares feld ??
            }
        }

        public class play implements GameStates {

            public void next(PlayerController player[], int i) {
                //player[i].setPermission(false);
            //if keine Karten mehr 
                //  player.setState(new win());
                //if spieler fertig 
                //  player.setState(new ready());
            }

        }

        public class win implements GameStates {

            public void next(PlayerController player[], int i) {
                //finish Glückwunsch

            }
        }

        public class lose implements GameStates {

            public void next(PlayerController player[], int i) {
                //leider als letzter übrig verloren!!!
            }
        }

    }

}
