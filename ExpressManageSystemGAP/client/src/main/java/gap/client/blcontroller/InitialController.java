package gap.client.blcontroller;

import java.util.List;

import javax.naming.ldap.ControlFactory;

import gap.client.blservice.initialblservice.InitialBlService;
import gap.client.datacontroller.ControllerFactory;
import gap.client.datacontroller.InitialDataController;
import gap.common.po.InitialHistoryPO;
import gap.common.util.ResultMessage;

public class InitialController implements InitialBlService{

	static InitialController initialController;
	
	private InitialDataController dataController;
	
	public InitialController getInstance(){
		if(initialController == null){
			initialController = new InitialController();
		}
		return initialController;
	}
	
	private InitialController() {
		dataController = ControllerFactory.getInitialDataController();
	}
	
	@Override
	public InitialHistoryPO getCurrentInitial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage submitInitialList(InitialHistoryPO initialPO) {
		return dataController.addInitial(initialPO);
	}

	@Override
	public List<InitialHistoryPO> getInitialHistory() {
		return dataController.getHistory();
	}

}