package Config;

import factorys.GUIFabrica;
import buttons.BotaoInt;
import checkBoxes.CheckboxInt;

public class Application {
    private BotaoInt botao;
    private CheckboxInt checkbox;


    public Application(GUIFabrica factory) {
        botao = factory.criarBotao();
        checkbox = factory.criarCheckbox();
    }


    public void pintar() {
        botao.pintar();
        checkbox.pintar();
    }
}
