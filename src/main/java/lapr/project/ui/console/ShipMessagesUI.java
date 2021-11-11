package lapr.project.ui.console;

import lapr.project.controller.DetailsShipController;
import lapr.project.controller.ImportShipsController;
import lapr.project.controller.PositionalMessagesController;
import lapr.project.model.Position;
import lapr.project.utils.CommonMethods;

import java.io.IOException;
import java.util.Scanner;

public class ShipMessagesUI {

    PositionalMessagesController ctrl = new PositionalMessagesController();
    DetailsShipController ctrl1 = new DetailsShipController();
    ImportShipsController ctrl2= new ImportShipsController();

    public void shipMessagesUi() throws IOException {
        Scanner scan = new Scanner(System.in);
        String code;
        String data1;
        String data2;
        Position position;

        System.out.println("\nDigite o MMSI/IMO/Call Sign do navio que pretende obter mensagem de posição:");
        code = scan.nextLine();
        System.out.println("Defina o intervalo de datas, usando o seguinte formato 'dd/mm/aaaa hh:mm':");
        System.out.print("Início:");
        data1 = scan.nextLine();
        System.out.println("Fim:");
        data2 = scan.nextLine();
        System.out.println("\nMensagem de posição:\n");
        if (CommonMethods.imoVerification(code)) {
            ctrl.getPositionalMessages(ctrl1.searchByIMO(code),ctrl.associatePositions(ctrl.getPositionTree(),ctrl2.getShipTree()),ctrl.convertStringToDate(data1),ctrl.convertStringToDate(data2));
        } else if (CommonMethods.checkIfStringJustHaveNumbers(code) && code.length() == 9) {
            ctrl.getPositionalMessages(ctrl1.searchByMMSI(Integer.parseInt(code)),ctrl.associatePositions(ctrl.getPositionTree(),ctrl2.getShipTree()),ctrl.convertStringToDate(data1),ctrl.convertStringToDate(data2));
        } else {
            ctrl.getPositionalMessages(ctrl1.searchByCallSign(code),ctrl.associatePositions(ctrl.getPositionTree(),ctrl2.getShipTree()),ctrl.convertStringToDate(data1),ctrl.convertStringToDate(data2));
        }
    }
}
