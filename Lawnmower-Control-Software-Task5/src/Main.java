public   class  Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().executeApp();
		


	}

	
	
	
	 private void  executeApp__wrappee__Base  () {
		LawnmowerApp First = new LawnmowerApp();
		//System.out.print("This App is supposed to be functioning");
	}

	
	
	 private void  executeApp__wrappee__Web  () {
		executeApp__wrappee__Base();
	}

	
	
	 private void  executeApp__wrappee__AP  () {
		executeApp__wrappee__Web();
	}

	
	
	 private void  executeApp__wrappee__2Task  () {
		executeApp__wrappee__AP();
	}

	
	
	 private void  executeApp__wrappee__BR  () {
		executeApp__wrappee__2Task();
	}

	
	
	protected void executeApp() {
		executeApp__wrappee__BR();
	}


}
