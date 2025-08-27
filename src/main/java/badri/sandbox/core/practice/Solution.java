package badri.sandbox.core.practice;

import badri.sandbox.core.practice.ui.Player;
import badri.sandbox.core.practice.ui.UI;

public class Solution {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
