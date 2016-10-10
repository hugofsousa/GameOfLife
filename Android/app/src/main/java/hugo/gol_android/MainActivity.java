package hugo.gol_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import hugo.gol_android.src.br.unb.cic.lp.gol.GameController;
import hugo.gol_android.src.br.unb.cic.lp.gol.GameEngine;
import hugo.gol_android.src.br.unb.cic.lp.gol.GameViewConsole;
import hugo.gol_android.src.br.unb.cic.lp.gol.Statistics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GameController controller = new GameController();

        Statistics statistics = new Statistics();

        GameEngine engine = new GameEngine(10, 10, statistics);

        GameViewConsole board = new GameViewConsole(controller, engine);

        controller.setBoard(board);
        controller.setEngine(engine);
        controller.setStatistics(statistics);

        controller.start();
    }

}
