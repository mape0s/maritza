package factorys;

import buttons.BotaoInt;
import buttons.botaoEscuro;
import checkBoxes.CheckboxInt;
import checkBoxes.escuroCheckBox;

public class escuroFabrica implements GUIFabrica {


    @Override
    public BotaoInt criarBotao() {
        return new botaoEscuro();
    }


    @Override
    public CheckboxInt criarCheckbox() {
        return new escuroCheckBox();
    }
}