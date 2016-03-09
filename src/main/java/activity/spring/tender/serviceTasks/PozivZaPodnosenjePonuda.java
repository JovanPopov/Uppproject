package activity.spring.tender.serviceTasks;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class PozivZaPodnosenjePonuda implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub	
		Boolean tajmeristekao=false;
		
		execution.setVariable("tajmeristekao", tajmeristekao);
	}

}
