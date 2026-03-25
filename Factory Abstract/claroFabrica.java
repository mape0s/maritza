package factorys;

import checkBoxes.CheckboxInt;
import buttons.BotaoInt;

import checkBoxes.claroCheckBox;
import buttons.botaoClaro;

public class claroFabrica implements GUIFabrica {


    @Override
    public BotaoInt criarBotao() {
        return new botaoClaro();
    }


    @Override
    public CheckboxInt criarCheckbox() {
        return new claroCheckBox();
    }
}