package factorys;
import checkBoxes.CheckboxInt;
import buttons.BotaoInt;

public interface GUIFabrica {
    BotaoInt criarBotao();
    CheckboxInt criarCheckbox();
}
